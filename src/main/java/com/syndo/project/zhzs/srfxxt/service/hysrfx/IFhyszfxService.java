package com.syndo.project.zhzs.srfxxt.service.hysrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.hysrfx.Fhyszfx;


/**
 * 分行业税种分析
 *
 */
public interface IFhyszfxService {

	/**
	 * 分行业税种分析（全口径）
	 * @return
	 */
	List<Fhyszfx> selectHyQkj(Fhyszfx cond);
	/**
	 * 分行业税种分析（一般预算）
	 * @return
	 */
	List<Fhyszfx> selectHyYbys(Fhyszfx cond);
	
}
