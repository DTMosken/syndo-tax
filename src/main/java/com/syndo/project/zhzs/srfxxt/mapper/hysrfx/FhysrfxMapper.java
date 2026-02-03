package com.syndo.project.zhzs.srfxxt.mapper.hysrfx;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.hysrfx.Fhysrfx;

/**
 *分行业收入分析
 *
 */
public interface FhysrfxMapper extends BaseMapper<Fhysrfx> {

	/**
	 * 全口径
	 * @param cond
	 * @return
	 */
	List<Fhysrfx> selectHyQkj(Fhysrfx cond);
	/**
	 * 一般预算
	 * @param cond
	 * @return
	 */
	List<Fhysrfx> selectHyYbys(Fhysrfx cond);
    List<Fhysrfx> selectHyQkj2(Fhysrfx cond);
}
