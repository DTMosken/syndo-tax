package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrPtfxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdcrnsfx;

public interface ITdcrnsfxService {

    public List<Tdcrnsfx> selectList(Tdcrnsfx entity);

    public List<TdcrTdxx> getTdxxList(Tdcrnsfx entity);

    public List<TdcrPtfxx> getPtfxxList(Tdcrnsfx entity);

    public List<Rkxx> getRkxxList(Tdcrnsfx entity);
}
