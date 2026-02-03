package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdzrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdzrnsfx;

public interface ITdzrnsfxService {

    public List<Tdzrnsfx> selectList(Tdzrnsfx entity);

    public List<TdzrTdxx> getTdxxList(Tdzrnsfx entity);

    public List<Rkxx> getRkxxList(Tdzrnsfx entity);
}
