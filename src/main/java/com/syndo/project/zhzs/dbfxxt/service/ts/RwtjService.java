package com.syndo.project.zhzs.dbfxxt.service.ts;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Dbrw;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Rwtj;
import com.syndo.project.zhzs.dbfxxt.mapper.ts.RwtjMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RwtjService extends BaseService {
    @Autowired
    private RwtjMapper mapper;

    public List<Rwtj> selectList(Rwtj entity) {
        return mapper.selectList(entity);
    }

    public List<Dbrw> selectRws(String fkr) {
        return mapper.selectRws(fkr);
    }

    public List<Dbrw> selectDfk2(String lx, String fkr) {
        return mapper.selectDfk2(lx, fkr);
    }

    public List<Dbrw> selectYfk2(String lx, String fkr) {
        return mapper.selectYfk2(lx, fkr);
    }

    public List<Dbrw> selectYfk(String lx, String fkr) {
        return mapper.selectYfk(lx, fkr);
    }

    public List<Dbrw> selectSplx(String lx, String fkr) {
        return mapper.selectSplx(lx, fkr);
    }
}
