package com.syndo.project.zhzs.srfxxt.service.zjsrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjzdqyfx;


/**
 * 镇街重点企业分析
 */
public interface IZjzdqyfxService {

	/**
	 * 镇街重点企业分析
	 * @param cond
	 * @return
	 */
	List<Zjzdqyfx> selectList(Zjzdqyfx cond);

}
