package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Fcsqsfx;

public interface IFcsqsfxService {

    public List<Fcsqsfx> selectList(Fcsqsfx entity);
    public List<Fcsqsfx> selectListByJd(Fcsqsfx entity);
}
