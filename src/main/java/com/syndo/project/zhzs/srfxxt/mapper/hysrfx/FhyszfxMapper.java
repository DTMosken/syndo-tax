package com.syndo.project.zhzs.srfxxt.mapper.hysrfx;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.hysrfx.Fhyszfx;

/**
 * 分行业税种分析
 *
 */
public interface FhyszfxMapper extends BaseMapper<Fhyszfx> {

	/**
	 * 分行业税种分析（全口径）
	 */
	List<Fhyszfx> selectHyQkj(Fhyszfx cond);
	/**
	 * 分行业税种分析（一般预算）
	 */
	List<Fhyszfx> selectHyYbys(Fhyszfx cond);
    List<Fhyszfx> selectHyQkj2(Fhyszfx cond);
}
