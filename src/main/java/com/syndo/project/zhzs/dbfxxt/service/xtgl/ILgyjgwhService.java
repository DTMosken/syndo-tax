package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Lgyjgwh;

public interface ILgyjgwhService {

    public List<Lgyjgwh> selectList(Lgyjgwh entity);
    
    public int update(Lgyjgwh entity);
}
