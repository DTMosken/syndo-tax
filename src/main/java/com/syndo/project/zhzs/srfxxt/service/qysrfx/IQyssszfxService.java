package com.syndo.project.zhzs.srfxxt.service.qysrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qyssszfx;

/**
 * 企业税收税种分析
 *
 */
public interface IQyssszfxService {

	/**
	 * 企业税收税种
	 * 
	 * @param cond
	 * @return
	 */
	List<Qyssszfx> selectList(Qyssszfx cond);
	

}
