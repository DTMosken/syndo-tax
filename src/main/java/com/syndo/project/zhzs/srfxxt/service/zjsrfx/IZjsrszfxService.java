package com.syndo.project.zhzs.srfxxt.service.zjsrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjsrszfx;


/**
 * 镇街收入税种分析
 *
 */
public interface IZjsrszfxService {

	/**
	 * 镇街收入税种分析
	 * @param cond
	 * @return
	 */
	List<Zjsrszfx> selectList(Zjsrszfx cond);

}
