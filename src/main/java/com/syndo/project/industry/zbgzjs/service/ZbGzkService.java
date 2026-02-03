package com.syndo.project.industry.zbgzjs.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.domain.Ztree;
import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.project.industry.sjsb.domain.Flml;
import com.syndo.project.industry.sjsb.domain.Hy;
import com.syndo.project.industry.zbgzjs.domain.ZbGzk;
import com.syndo.project.industry.zbgzjs.domain.Zbk;
import com.syndo.project.industry.zbgzjs.domain.ZtreeImpl;
import com.syndo.project.industry.zbgzjs.mapper.ZbGzkMapper;

@Service
public class ZbGzkService extends BaseService {
	@Autowired
	private ZbGzkMapper mapper;

	public List<Ztree> selectFlmlTree(String lx) {
		List<Flml> list = mapper.selectFlmlList(lx);
		List<Ztree> ztrees = initZtree(list);
		return ztrees;
	}

	private List<Ztree> initZtree(List<Flml> list) {
		List<Ztree> ztrees = new ArrayList<Ztree>();
		Ztree ztree;
		if (list != null && !list.isEmpty() && !"0".equals(list.get(0).getPid())) {
			ztree = new Ztree();
			ztree.setId("100");
			ztree.setpId("0");
			ztree.setName("分类目录");
			ztree.setTitle("分类目录");
			ztrees.add(ztree);
		}
		for (Flml flml : list) {
			ztree = new Ztree();
			ztree.setId(flml.getId());
			ztree.setpId(flml.getPid());
			ztree.setName(flml.getMlmc());
			ztree.setTitle(flml.getMlmc());
			ztrees.add(ztree);
		}
		return ztrees;
	}

	public List<ZtreeImpl> selectHyTree() {
		List<Hy> list = mapper.selectHyList();
		List<ZtreeImpl> ztrees = initHyZtree(list);
		return ztrees;
	}

	public List<ZtreeImpl> selectHyDynamicTree(String id) {
		List<Hy> list = mapper.selectHyDynamicList(id);
		return initHyZtree(list);
	}

	private List<ZtreeImpl> initHyZtree(List<Hy> list) {
		List<ZtreeImpl> ztrees = new ArrayList<>();
		// Ztree ztree = new Ztree();
		// ztree.setId("100");
		// ztree.setpId("0");
		// ztree.setName("分类目录");
		// ztree.setTitle("分类目录");
		// ztrees.add(ztree);
		for (Hy hy : list) {
			ZtreeImpl ztree = new ZtreeImpl();
			ztree.setId(hy.getHyDm());
			ztree.setpId(hy.getSjhyDm());
			ztree.setName(hy.getHyMc());
			ztree.setTitle(hy.getHyMc());
			if (hy.getChildrenHyCnt() != null)
				ztree.setIsParent(hy.getChildrenHyCnt() > 0);
			ztrees.add(ztree);
		}
		return ztrees;
	}

	public List<ZtreeImpl> selectZbDynamicTree(String id) {
		List<Zbk> list = mapper.selectZbkDynamicList(id);
		return initZbZtree(list);
	}

	private List<ZtreeImpl> initZbZtree(List<Zbk> list) {
		List<ZtreeImpl> ztrees = new ArrayList<>();
		for (Zbk zb : list) {
			ZtreeImpl ztree = new ZtreeImpl();
			ztree.setId(zb.getId());
			ztree.setpId(zb.getPid());
			ztree.setName(zb.getZbmc());
			ztree.setTitle(zb.getZbmc());
			ztree.setLx(zb.getLx());
			ztree.setFzsx(zb.getFzsx());
			ztree.setFzxx(zb.getFzxx());
			if (zb.getChildrenZbCnt() != null)
				ztree.setIsParent(zb.getChildrenZbCnt() > 0);
			ztrees.add(ztree);
		}
		return ztrees;
	}

	public AjaxResult insertFlml(Flml vo) {
		// 检查同级是否有重名的目录
		if (mapper.checkInsertFlml(vo) > 0)
			return AjaxResult.error("同级目录存在重名！");
		return mapper.insertFlml(vo) > 0 ? AjaxResult.success() : AjaxResult.error();
	}

	public Flml selectFlmlById(String id) {
		return mapper.selectFlmlById(id);
	}

	public AjaxResult editFlml(Flml vo) {
		// 检查同级是否有重名的目录
		if (mapper.checkInsertFlml(vo) > 0)
			return AjaxResult.error("同级目录存在重名！");
		return mapper.editFlml(vo) > 0 ? AjaxResult.success() : AjaxResult.error();
	}

	public AjaxResult deleteFlmlById(String id) {
		int cnt = mapper.selectFlmlidCnt(id);
		if (cnt > 0)
			return AjaxResult.error("该分类下有数据无法删除！");
		mapper.deleteFlmlById(id);
		return AjaxResult.success("删除成功！");
	}

	public List<ZbGzk> selectList(ZbGzk entity) {
		return mapper.selectList(entity);
	}

	public int insertZbGzk(ZbGzk vo) {
		vo.setLrr(ShiroUtils.getUserId());
		vo.setYxbz("Y");
		return mapper.insert(vo);
	}

	public int editZbGzk(ZbGzk vo) {
		vo.setXgr(ShiroUtils.getUserId());
		return mapper.update(vo);
	}

	public int deleteZbgzkByIds(String id) {
		return mapper.deleteByIds(id.split(","));
	}

	public ZbGzk selectZbGzkById(String id) {
		return mapper.selectById(id);
	}

	public int changeYxbz(ZbGzk vo) {
		return mapper.changeYxbz(vo);
	}

	public List<ZbGzk> selectZbgzkfzList(ZbGzk entity) {
		List<ZbGzk> list = mapper.selectZbgzkfzList(entity);
		for (ZbGzk gzk : list) {
			if (gzk != null && StringUtils.isNotEmpty(gzk.getHydm())) {
				String[] hydms = gzk.getHydm().split(",");
				gzk.setHymc(selectHymcByHydms(hydms));
			}
		}
		return list;
	}

	private String selectHymcByHydms(String[] hydms) {
		List<Hy> hyList = mapper.selectHyByHydms(hydms);
		if (hyList != null && !hyList.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (Hy hy : hyList) {
				sb.append(hy.getHyMc()).append("，");
			}
			String hymc = sb.toString();
			if (hymc.endsWith("，"))
				hymc = hymc.substring(0, hymc.length() - 1);
			return hymc;
		}
		return null;
	}

	public int insertZbGzkfz(ZbGzk vo) {
		return mapper.insertZbGzkfz(vo);
	}

	public int editZbGzkfz(ZbGzk vo) {
		return mapper.updateZbGzkfz(vo);
	}

	public ZbGzk selectZbGzkfzByFzid(String fzid) {
		ZbGzk result = mapper.selectZbGzkfzByFzid(fzid);
		if (result != null && StringUtils.isNotEmpty(result.getHydm())) {
			String hydm = result.getHydm();
			String hydms[] = hydm.split(",");
			result.setHymc(selectHymcByHydms(hydms));
		}
		return result;
	}

	public int deleteZbgzkfzByFzid(String fzids) {
		return mapper.deleteZbgzkfzByFzids(fzids.split(","));
	}

	public int zbgzkfzUp(String fzid) {
		ZbGzk fzpxInfo = mapper.selectZbGzkfzpxInfo(fzid);
		if (fzpxInfo != null && StringUtils.isNotEmpty(fzpxInfo.getFzidPre())) {
			ZbGzk z1 = new ZbGzk();
			z1.setFzid(fzpxInfo.getFzid());
			z1.setFzpx(fzpxInfo.getFzpxPre());
			mapper.zbgzkfzUpDown(z1);
			ZbGzk z2 = new ZbGzk();
			z2.setFzid(fzpxInfo.getFzidPre());
			z2.setFzpx(fzpxInfo.getFzpx());
			return mapper.zbgzkfzUpDown(z2);
		}
		return 0;
	}

	public int zbgzkfzDown(String fzid) {
		ZbGzk fzpxInfo = mapper.selectZbGzkfzpxInfo(fzid);
		if (fzpxInfo != null && StringUtils.isNotEmpty(fzpxInfo.getFzidNext())) {
			ZbGzk z1 = new ZbGzk();
			z1.setFzid(fzpxInfo.getFzid());
			z1.setFzpx(fzpxInfo.getFzpxNext());
			mapper.zbgzkfzUpDown(z1);
			ZbGzk z2 = new ZbGzk();
			z2.setFzid(fzpxInfo.getFzidNext());
			z2.setFzpx(fzpxInfo.getFzpx());
			return mapper.zbgzkfzUpDown(z2);
		}
		return 0;
	}

	public List<ZbGzk> selectZbgzkfzmxList(String fzid) {
		return mapper.selectZbgzkfzmxList(fzid);
	}

	public int insertZbGzkfzmx(ZbGzk vo) {
		return mapper.insertZbGzkfzmx(vo);
	}

	public Object selectZbGzkfzmxById(String id) {
		return mapper.selectZbGzkfzmxById(id);
	}

	public int editZbGzkfzmx(ZbGzk vo) {
		return mapper.updateZbGzkfzmx(vo);
	}

	public int deleteZbgzkfzmxById(String ids) {
		return mapper.deleteZbgzkfzmxByIds(ids.split(","));
	}

	public int zbgzkfzmxUp(String id) {
		ZbGzk pxInfo = mapper.selectZbGzkfzmxpxInfo(id);
		if (pxInfo != null && StringUtils.isNotEmpty(pxInfo.getIdPre())) {
			ZbGzk z1 = new ZbGzk();
			z1.setId(pxInfo.getId());
			z1.setZbpx(pxInfo.getZbpxPre());
			mapper.zbgzkfzmxUpDown(z1);
			ZbGzk z2 = new ZbGzk();
			z2.setId(pxInfo.getIdPre());
			z2.setZbpx(pxInfo.getZbpx());
			return mapper.zbgzkfzmxUpDown(z2);
		}
		return 0;
	}

	public int zbgzkfzmxDown(String id) {
		ZbGzk pxInfo = mapper.selectZbGzkfzmxpxInfo(id);
		if (pxInfo != null && StringUtils.isNotEmpty(pxInfo.getIdNext())) {
			ZbGzk z1 = new ZbGzk();
			z1.setId(pxInfo.getId());
			z1.setZbpx(pxInfo.getZbpxNext());
			mapper.zbgzkfzmxUpDown(z1);
			ZbGzk z2 = new ZbGzk();
			z2.setId(pxInfo.getIdNext());
			z2.setZbpx(pxInfo.getZbpx());
			return mapper.zbgzkfzmxUpDown(z2);
		}
		return 0;
	}

	public AjaxResult checkZbid(String fzid, String zbid, String id) {
		int cnt = mapper.checkZbid(fzid, zbid, id);
		if (cnt > 0)
			return AjaxResult.error();
		else
			return AjaxResult.success();
	}

}
