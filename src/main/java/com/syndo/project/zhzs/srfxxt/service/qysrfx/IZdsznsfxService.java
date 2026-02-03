package com.syndo.project.zhzs.srfxxt.service.qysrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Zdsznsfx;


/**
 * 重点税种纳税分析
 *
 */
public interface IZdsznsfxService {

	/**
	 * 重点税种纳税分析
	 * @param cond
	 * @return
	 */
	List<Zdsznsfx> selectList(Zdsznsfx cond);

}
