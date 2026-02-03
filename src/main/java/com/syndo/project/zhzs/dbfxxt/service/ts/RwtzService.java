package com.syndo.project.zhzs.dbfxxt.service.ts;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.StringUtils;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Fkxz;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Rwtz;
import com.syndo.project.zhzs.dbfxxt.mapper.ts.RwtzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class RwtzService extends BaseService {
    @Autowired
    private RwtzMapper mapper;
    @Autowired
    private FkxzService fkxzService;

    public List<Rwtz> selectList(Rwtz entity) {
        return mapper.selectList(entity);
    }

    /**
     * 调整反馈人
     *
     * @param rwtz
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int tzfkr(Rwtz rwtz) {
        if (rwtz == null) {
            return 0;
        }
        rwtz.setTzsx("fkr");
        rwtz.setTzq(rwtz.getOldFkr());
        rwtz.setCreator(ShiroUtils.getUserId());
        List<String> idList = split2List(rwtz.getIds(), "a");
        if ("1".equals(rwtz.getTzfs())) {
            // 指定到风控小组成员
            rwtz.setIdList(idList);
            // 写任务调整表
            rwtz.setTzh(rwtz.getFkr());
            mapper.insert(rwtz);
            // 修改反馈表
            return mapper.tzfkr(rwtz);
        } else if ("2".equals(rwtz.getTzfs())) {
            // 均分给其他风控小组成员
            // 获取当前风控小组成员，随机排序
            // 按照风控小组人数将ids拆分成二维数组
            List<Fkxz> fkxzs = fkxzService.selectFkxzWithoutId(rwtz.getOldFkr(), "1");
            int fkxzSize = fkxzs.size();
            int rwSize = idList.size();
            List<List<String>> erList = new ArrayList<>(fkxzSize);
            for (int i = 0; i < rwSize; i++) {
                int ys = i % fkxzSize;
                if (erList.size() <= ys) {
                    List<String> yList = new ArrayList<>();
                    erList.add(yList);
                }
                erList.get(ys).add(idList.get(i));
            }
            int result = 0;
            for (int i = 0; i < erList.size(); i++) {
                List<String> yw = erList.get(i);
                rwtz.setIdList(yw);
                rwtz.setFkr(fkxzs.get(i).getUserId());
                // 写任务调整表
                rwtz.setTzh(rwtz.getFkr());
                mapper.insert(rwtz);
                // 修改反馈表
                result += mapper.tzfkr(rwtz);
            }
            return result;
        } else {
            return 0;
        }
    }

    /**
     * 调整反馈时限
     *
     * @param rwtz
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int tzfksx(Rwtz rwtz) {
        if (rwtz == null) {
            return 0;
        }
        rwtz.setTzsx("fksx");
        rwtz.setCreator(ShiroUtils.getUserId());
        List<String> idList = split2List(rwtz.getIds(), "a");

        rwtz.setIdList(idList);
        // 写任务调整表
        rwtz.setTzh(rwtz.getFksx());
        mapper.insertFksx(rwtz);
        // 修改反馈表
        return mapper.tzfksx(rwtz);
    }

    /**
     * 取消推送
     *
     * @param ids
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int qxts(String ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        String[] idArr = StringUtils.split(ids, "a");
        for (String id : idArr) {
            Rwtz rwtz = new Rwtz();
            rwtz.setFkid(id);
            rwtz.setCreator(ShiroUtils.getUserId());
            // 写入取消表，备查
            mapper.insertQx(rwtz);
            // 删除反馈表记录
            mapper.deleteFk(rwtz);
        }
        return 1;
    }
}
