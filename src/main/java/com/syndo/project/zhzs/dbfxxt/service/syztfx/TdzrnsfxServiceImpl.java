package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdzrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdzrnsfx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.TdzrnsfxMapper;

/**
 * 土地出让契税分析
 */
@Service
public class TdzrnsfxServiceImpl extends BaseService implements ITdzrnsfxService {

    @Autowired
    private TdzrnsfxMapper mapper;

    @Override
    public List<Tdzrnsfx> selectList(Tdzrnsfx entity) {
        return mapper.selectList(entity);
    }

	@Override
	public List<TdzrTdxx> getTdxxList(Tdzrnsfx entity) {
		return mapper.getTdxxList(entity);
	}

	@Override
	public List<Rkxx> getRkxxList(Tdzrnsfx entity) {
		return mapper.getRkxxList(entity);
	}

}
