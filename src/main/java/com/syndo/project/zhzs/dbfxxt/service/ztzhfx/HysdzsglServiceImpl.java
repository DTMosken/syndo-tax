package com.syndo.project.zhzs.dbfxxt.service.ztzhfx;

import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Hysdzsgl;
import com.syndo.project.zhzs.dbfxxt.mapper.ztzhfx.HysdzsglMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-14 10:12
 * @Description 行业税电指数管理
 */
@Service
public class HysdzsglServiceImpl implements HysdzsglService {
    @Autowired
    private HysdzsglMapper mapper;

    @Override
    public Hysdzsgl selectById(String id) {
        String[] ids = id.split("_");
        Hysdzsgl h = new Hysdzsgl();
        h.setSshy(ids[0]);
        h.setSdzs(ids[1]);
        return h;
        //return mapper.selectById(ids[0], ids[1]);
    }

    @Override
    public List<Hysdzsgl> selectList(Hysdzsgl entity) {
        return mapper.selectList(entity);
    }

    @Override
    public int setSave(Hysdzsgl entity) {
        int cnt = mapper.beforeSetSave(entity);
        if(cnt == 0)
            return mapper.setSave(entity);
        else
            return mapper.setSaveUpdate(entity);
    }

}
