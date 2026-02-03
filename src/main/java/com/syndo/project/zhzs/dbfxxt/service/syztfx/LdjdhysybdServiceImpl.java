package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Ldjdhy;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.LdjdhysybdMapper;
/**
 * 对比分析系统 - 税源比对 - 旅店酒店行业税源比对
 */
@Service
public class LdjdhysybdServiceImpl extends BaseService implements ILdjdhysybdService {
    
    @Autowired
    private LdjdhysybdMapper mapper;
    
    @Override
    public List<Ldjdhy> selectList(Ldjdhy entity) {
        return mapper.selectList(entity);
    }

    @Override
    public List<Ldjdhy> getTowList(Ldjdhy entity) {
        return mapper.getTowList(entity);
    }

    @Override
    public List<Ldjdhy> getThreeList(Ldjdhy entity) {
        return mapper.getThreeList(entity);
    }
}
