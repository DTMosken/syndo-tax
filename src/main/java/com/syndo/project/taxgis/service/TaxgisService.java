package com.syndo.project.taxgis.service;

import com.syndo.common.annotation.DataScope;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.domain.entity.User;
import com.syndo.common.core.service.BaseService;
import com.syndo.project.taxgis.domain.QyglTreeData;
import com.syndo.project.taxgis.domain.GisGlqy;
import com.syndo.project.taxgis.domain.HyTreeData;
import com.syndo.project.taxgis.domain.TaxgisNsrxx;
import com.syndo.project.taxgis.domain.TaxgisXmxx;
import com.syndo.project.taxgis.mapper.TaxgisMapper;
import com.syndo.project.taxgis.mapper.YhsMapper;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class TaxgisService extends BaseService {
    @Autowired
    private TaxgisMapper mapper;
    @Autowired
    private YhsMapper yhsMapper;

    public List<TaxgisNsrxx> getNsrxxBz(TaxgisNsrxx nsrxx, User user) {
        return mapper.getNsrxxBz(nsrxx);
    }

    public List<TaxgisNsrxx> getNsrxxBzByNsrmcs(String nsrmcs) {
        return mapper.getNsrxxBzByNsrmcs(nsrmcs.split(","));
    }

    public int saveQybz(TaxgisNsrxx vo, User user) {
        int cnt = mapper.selectNsrxxBzCnt(vo);
        if (cnt == 0) {
            vo.setLrr(user.getUserId());
            vo.setLrrq(new Date());
            vo.setGeo("point(" + vo.getLon() + " " + vo.getLat() + ")");
            return mapper.insertNsrxxBz(vo);
        } else {
            vo.setXgr(user.getUserId());
            vo.setXgrq(new Date());
            vo.setGeo("point(" + vo.getLon() + " " + vo.getLat() + ")");
            return mapper.updateNsrxxBz(vo);
        }
    }

    public int delQybz(TaxgisNsrxx vo) {
        return mapper.deleteNsrxxBz(vo);
    }

    @DataScope(deptAlias = "t")
    public List<QyglTreeData> glqywhTreeData(User user) {
        List<Map<String, String>> list = mapper.glqywhTreeData(user);
        return buildGlqywhTree(list, "0");
    }
    @DataScope(deptAlias = "t")
    public List<QyglTreeData> glqyTreeData(User user) {
        List<Map<String, String>> list = mapper.glqyTreeData(user);
        return buildGlqywhTree(list, "0");
    }

    private List<QyglTreeData> buildGlqywhTree(List<Map<String, String>> list, String treeId) {
        List<QyglTreeData> rootNodes = new LinkedList<>();
        for (Map<String, String> map : list) {
            if (map.get("pid").equals(treeId)) {
                QyglTreeData root = new QyglTreeData();
                root.setId(map.get("id"));
                root.setPid(map.get("pid"));
                root.setLabel(map.get("label"));
                root.setLx(map.get("lx"));
                root.setGeo(map.get("geo"));
                root.setWbz(Integer.parseInt(map.get("wbz")));
                root.setChildren(new LinkedList<>());
                buildTreeBranch(list, root);
                rootNodes.add(root);
            }
        }
        return rootNodes;
    }

    private void buildTreeBranch(List<Map<String, String>> list, QyglTreeData parentNode) {
        List<QyglTreeData> childNodeList = new LinkedList<>();
        for (Map<String, String> map : list) {
            if (StringUtils.isNotEmpty(map.get("pid")) && map.get("pid").equals(parentNode.getId())) {
                QyglTreeData node = new QyglTreeData();
                node.setId(map.get("id"));
                node.setPid(map.get("pid"));
                node.setLabel(map.get("label"));
                node.setLx(map.get("lx"));
                node.setGeo(map.get("geo"));
                node.setWbz(Integer.parseInt(map.get("wbz")));
                node.setChildren(new LinkedList<>());
                childNodeList.add(node);
            }
        }
        if (!childNodeList.isEmpty()) {
            for (QyglTreeData node : childNodeList) {
                buildTreeBranch(list, node);
            }
        }
        parentNode.setChildren(childNodeList);
    }

    public String saveGlqywh(GisGlqy vo, User user) {
        int cnt = 0;
        // 若id以tmp_开头，是新增
        String id = vo.getId();
        if (StringUtils.isNotEmpty(id) && !id.startsWith("tmp_")) {
            cnt = mapper.selectGlqywhCnt(id);
        } else {
            vo.setId(null);
        }
        if (cnt == 0) {
            vo.setLrr(user.getUserId());
            vo.setLrrq(new Date());
            mapper.insertQygl(vo);
            return vo.getId();
        } else {
            vo.setXgr(user.getUserId());
            vo.setXgrq(new Date());
            return mapper.updateQygl(vo) + "";
        }
    }

    public AjaxResult delGlqywh(String id) {
        int cnt = mapper.checkDelGlqywh1(id);
        if (cnt == 0) {
            cnt = mapper.checkDelGlqywh2(id);
            if (cnt > 0) {
                mapper.delGlqywh(id);
                return AjaxResult.success("删除成功");
            } else {
                return AjaxResult.warn("该节点无法删除！该节点为系统内置或已删除，请刷新节点");
            }
        } else {
            return AjaxResult.error("存在子节点，请先删除子节点！");
        }
    }

    public List<QyglTreeData> xzqhwhTreeData(User user) {
        List<Map<String, String>> list = mapper.xzqhwhTreeData();
        return buildXzqhwhTree(list, "1");
    }

    private List<QyglTreeData> buildXzqhwhTree(List<Map<String, String>> list, String treeId) {
        if (list == null || list.isEmpty()) {
            list = new ArrayList<>();
            Map<String, String> m = new HashMap<>();
            // 此表与管理区域共用，管理区域集成机构表，其parentId为0，所以取行政区划的parentId为1
            m.put("id", "10");
            m.put("pid", "1");
            m.put("label", "行政区划");
            m.put("lx", "1");
            m.put("geo", "");
            m.put("wbz", "1");
            list.add(m);
        }
        List<QyglTreeData> rootNodes = new LinkedList<>();
        for (Map<String, String> map : list) {
            if (map.get("pid").equals(treeId)) {
                QyglTreeData root = new QyglTreeData();
                root.setId(map.get("id"));
                root.setPid(map.get("pid"));
                root.setLabel(map.get("label"));
                root.setLx(map.get("lx"));
                root.setGeo(map.get("geo"));
                root.setWbz(Integer.parseInt(map.get("wbz")));
                root.setChildren(new LinkedList<>());
                buildTreeBranch(list, root);
                rootNodes.add(root);
            }
        }
        if (rootNodes.isEmpty()) {
            Map<String, String> m = new HashMap<>();
            // 此表与管理区域共用，管理区域集成机构表，其parentId为0，所以取行政区划的parentId为1
            m.put("id", "10");
            m.put("pid", "1");
            m.put("label", "行政区划");
            m.put("lx", "1");
            m.put("geo", "");
            m.put("wbz", "1");
            list.add(m);
            for (Map<String, String> map : list) {
                if (map.get("pid").equals(treeId)) {
                    QyglTreeData root = new QyglTreeData();
                    root.setId(map.get("id"));
                    root.setPid(map.get("pid"));
                    root.setLabel(map.get("label"));
                    root.setLx(map.get("lx"));
                    root.setGeo(map.get("geo"));
                    root.setWbz(Integer.parseInt(map.get("wbz")));
                    root.setChildren(new LinkedList<>());
                    buildTreeBranch(list, root);
                    rootNodes.add(root);
                }
            }
        }
        return rootNodes;
    }

    public List<TaxgisXmxx> getXmxxBz(TaxgisXmxx xmxx, User user) {
        return mapper.getXmxxBz(xmxx);
    }

    public int saveXmxxBz(TaxgisXmxx vo, User user) {
        int cnt = mapper.selectXmxxBzCnt(vo);
        if (cnt == 0) {
            vo.setLrr(user.getUserId());
            vo.setLrrq(new Date());
            vo.setGeo("point(" + vo.getLon() + " " + vo.getLat() + ")");
            return mapper.insertXmxxBz(vo);
        } else {
            vo.setXgr(user.getUserId());
            vo.setXgrq(new Date());
            vo.setGeo("point(" + vo.getLon() + " " + vo.getLat() + ")");
            return mapper.updateXmxxBz(vo);
        }
    }

    public int delXmxxBz(TaxgisXmxx vo) {
        return mapper.delXmxxBz(vo);
    }

    public List<String> getSwdjxxIds(String shxydm) {
        return yhsMapper.getSwdjxxIds(shxydm);
    }

    public List<String> getGsdjxxIds(String shxydm) {
        return yhsMapper.getGsdjxxIds(shxydm);
    }

    public List<Map<String, String>> getTableCols(String gucode) {
        return yhsMapper.getTableCols(gucode);
    }

    public List<Map<String, String>> getGcxmxx(String dwmc) {
        return yhsMapper.getGcxmxx(dwmc);
    }

    public List<HyTreeData> hyTreeData() {
        List<Map<String, String>> list = mapper.hyTreeData();
        return buildHyTree(list, "");
    }
    private static final String SJHYDM = "sjhyDm";  
    private List<HyTreeData> buildHyTree(List<Map<String, String>> list, String treeId) {
        List<HyTreeData> rootNodes = new LinkedList<>();
        for (Map<String, String> map : list) {
            if (map.get(SJHYDM) == null || map.get(SJHYDM).equals(treeId)) {
                HyTreeData root = new HyTreeData();
                root.setId(map.get("hyDm"));
                root.setPid(map.get(SJHYDM));
                root.setLabel(map.get("hymc"));
                root.setChildren(new LinkedList<>());
                buildHyTreeBranch(list, root);
                rootNodes.add(root);
            }
        }
        return rootNodes;
    }
    private void buildHyTreeBranch(List<Map<String, String>> list, HyTreeData parentNode) {
        List<HyTreeData> childNodeList = new LinkedList<>();
        for (Map<String, String> map : list) {
            if (StringUtils.isNotEmpty(map.get(SJHYDM)) && map.get(SJHYDM).equals(parentNode.getId())) {
                HyTreeData node = new HyTreeData();
                node.setId(map.get("hyDm"));
                node.setPid(map.get(SJHYDM));
                node.setLabel(map.get("hymc"));
                node.setChildren(new LinkedList<>());
                childNodeList.add(node);
            }
        }
        if (!childNodeList.isEmpty()) {
            for (HyTreeData node : childNodeList) {
                buildHyTreeBranch(list, node);
            }
        }
        parentNode.setChildren(childNodeList);
    }

    public List<TaxgisNsrxx> hyAnalyze(String hyDm) {
        return mapper.hyAnalyze(hyDm);
    }

    public List<Map<String, String>> glqyAnalyze(String polygon) {
        return mapper.glqyAnalyze(polygon);
    }

    public List<Map<String, String>> hyfx(String polygon, String cols) {
        return mapper.hyfx(polygon, cols.split(","));
    }

    public List<Map<String, String>> szfx(String polygon, String cols) {
        return mapper.szfx(polygon, cols.split(","));
    }
}
