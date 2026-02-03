package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrPtfxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdcrnsfx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.TdcrnsfxMapper;

/**
 * 土地出让纳税分析
 */
@Service
public class TdcrnsfxServiceImpl extends BaseService implements ITdcrnsfxService {

    @Autowired
    private TdcrnsfxMapper mapper;
    
    @Override
    public List<Tdcrnsfx> selectList(Tdcrnsfx entity) {
        return mapper.selectList(entity);
    }

    @Override
    public List<TdcrTdxx> getTdxxList(Tdcrnsfx entity) {
        return mapper.getTdxxList(entity);
    }

    @Override
    public List<TdcrPtfxx> getPtfxxList(Tdcrnsfx entity) {
        return mapper.getPtfxxList(entity);
    }

    @Override
    public List<Rkxx> getRkxxList(Tdcrnsfx entity) {
        return mapper.getRkxxList(entity);
    }

}
