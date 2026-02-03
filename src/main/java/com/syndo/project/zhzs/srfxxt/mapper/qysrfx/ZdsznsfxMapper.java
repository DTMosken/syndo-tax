package com.syndo.project.zhzs.srfxxt.mapper.qysrfx;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Zdsznsfx;

/**
 *重点税种纳税分析
 *
 */
public interface ZdsznsfxMapper extends BaseMapper<Zdsznsfx> {

    List<Zdsznsfx> selectList2(Zdsznsfx entity);

	/**
	 * 地方财政收入汇总
	 * 
	 * @param cond
	 * @return
	 */
	//List<Czsrhz> selectDfcz(Zdsznsfb cond);
}
