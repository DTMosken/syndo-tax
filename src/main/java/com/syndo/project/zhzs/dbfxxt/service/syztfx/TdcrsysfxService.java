package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdcrnsfx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdcrsysfx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdsyxx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.TdcrsysfxMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 土地出让使用税分析
 */
@Service
public class TdcrsysfxService extends BaseService {

    @Autowired
    private TdcrsysfxMapper mapper;

    public List<Tdcrsysfx> selectList(Tdcrsysfx entity) {
        return mapper.selectList(entity);
    }

	public List<TdcrTdxx> getTdxxList(Tdcrsysfx entity) {
		return mapper.getTdxxList(entity);
	}

	public List<Tdsyxx> getSyxxList(Tdcrsysfx entity) {
		return mapper.getSyxxList(entity);
	}

    public List<Rkxx> getRkxxList(Tdcrsysfx entity) {
        return mapper.getRkxxList(entity);
    }

}
