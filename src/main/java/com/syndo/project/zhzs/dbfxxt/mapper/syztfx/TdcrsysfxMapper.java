package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdcrsysfx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdsyxx;

/**
 * 土地出让使用税分析
 */
@Repository
public interface TdcrsysfxMapper extends BaseMapper<Tdcrsysfx> {

    List<TdcrTdxx> getTdxxList(Tdcrsysfx entity);

    List<Tdsyxx> getSyxxList(Tdcrsysfx entity);

    List<Rkxx> getRkxxList(Tdcrsysfx entity);

}
