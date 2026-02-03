package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Ldjdhy;

public interface ILdjdhysybdService {

    public List<Ldjdhy> selectList(Ldjdhy entity);
    
    public List<Ldjdhy> getTowList(Ldjdhy entity);
    
    public List<Ldjdhy> getThreeList(Ldjdhy entity);
}
