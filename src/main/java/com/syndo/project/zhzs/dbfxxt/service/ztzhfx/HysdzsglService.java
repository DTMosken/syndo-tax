package com.syndo.project.zhzs.dbfxxt.service.ztzhfx;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Hysdzsgl;

import java.util.List;
import java.util.Map;

/**
 * @author lvd
 * @date 2021-04-14 10:05
 * @Description 以电控税
 */
public interface HysdzsglService {

    public Hysdzsgl selectById(String id);

    //行业用电指数
    public List<Hysdzsgl> selectList(Hysdzsgl entity);

    int setSave(Hysdzsgl entity);
}
