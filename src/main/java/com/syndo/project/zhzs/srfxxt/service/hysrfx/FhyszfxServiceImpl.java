package com.syndo.project.zhzs.srfxxt.service.hysrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.hysrfx.Fhyszfx;
import com.syndo.project.zhzs.srfxxt.mapper.hysrfx.FhyszfxMapper;

/**
 * 分行业税种分析
 *
 */
@Service
public class FhyszfxServiceImpl extends BaseService implements IFhyszfxService {

	@Autowired
	private FhyszfxMapper mapper;

	/**
	 * 分行业税种分析（全口径）
	 */
	@Override
	public List<Fhyszfx> selectHyQkj(Fhyszfx cond) {
		return mapper.selectHyQkj(cond);
	}
	/**
	 * 分行业税种分析（一般预算）
	 */
	@Override
	public List<Fhyszfx> selectHyYbys(Fhyszfx cond) {
		return mapper.selectHyYbys(cond);
	}

}
