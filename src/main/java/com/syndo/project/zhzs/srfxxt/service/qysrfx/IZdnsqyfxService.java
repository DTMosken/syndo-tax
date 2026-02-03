package com.syndo.project.zhzs.srfxxt.service.qysrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Zdnsqyfx;


/**
 * 重点纳税企业分析
 *
 */
public interface IZdnsqyfxService {

	/**
	 * 重点纳税企业分析
	 * @param cond
	 * @return
	 */
	List<Zdnsqyfx> selectList(Zdnsqyfx cond);
	
}
