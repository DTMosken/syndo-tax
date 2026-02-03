package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdsysqsfx;

public interface ITdsysqsfxService {

    public List<Tdsysqsfx> selectList(Tdsysqsfx entity);
    public List<Tdsysqsfx> selectListNianjd(Tdsysqsfx entity);
}
