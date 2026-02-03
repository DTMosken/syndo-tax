package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Cztdsysfx;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-06 11:18
 * @Description 城镇土地使用税比对分析
 */
public interface CztdsysfxService {

    public List<Cztdsysfx> selectList(Cztdsysfx entity);
}
