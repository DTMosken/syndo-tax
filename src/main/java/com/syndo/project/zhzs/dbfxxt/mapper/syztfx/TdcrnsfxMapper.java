package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrPtfxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdcrnsfx;

import org.springframework.stereotype.Repository;
/**
 * 土地出让纳税分析
 */
@Repository
public interface TdcrnsfxMapper extends BaseMapper<Tdcrnsfx> {

    List<TdcrTdxx> getTdxxList(Tdcrnsfx entity);

    List<TdcrPtfxx> getPtfxxList(Tdcrnsfx entity);

    List<Rkxx> getRkxxList(Tdcrnsfx entity);

}
