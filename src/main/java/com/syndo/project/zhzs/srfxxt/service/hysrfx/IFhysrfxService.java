package com.syndo.project.zhzs.srfxxt.service.hysrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.hysrfx.Fhysrfx;


/**
 * 分行业收入分析
 *
 */
public interface IFhysrfxService {
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
}
