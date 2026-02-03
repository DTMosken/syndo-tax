package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdsyxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdzrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdzrsysfx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.TdzrsysfxMapper;

/**
 * 土地出让使用税税分析
 */
@Service
public class TdzrsysfxService extends BaseService {

    @Autowired
    private TdzrsysfxMapper mapper;

    public List<Tdzrsysfx> selectList(Tdzrsysfx entity) {
        return mapper.selectList(entity);
    }

    public List<TdzrTdxx> getTdxxList(Tdzrsysfx entity) {
        return mapper.getTdxxList(entity);
    }

    public List<Tdsyxx> getSyxxList(Tdzrsysfx entity) {
        return mapper.getSyxxList(entity);
    }

    public List<Rkxx> getRkxxList(Tdzrsysfx entity) {
        return mapper.getRkxxList(entity);
    }

}
