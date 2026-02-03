package com.syndo.project.zhzs.srfxxt.mapper.qysrfx;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Zdnsqyfx;

/**
 * 重点纳税企业分析
 *
 */
public interface ZdnsqyfxMapper extends BaseMapper<Zdnsqyfx> {

    List<Zdnsqyfx> selectList2(Zdnsqyfx entity);

	/**
	 * 重点纳税企业分析
	 * 
	 * @param cond
	 * @return
	 */
	//List<Czsrhz> selectDfcz(Czsrhz cond);
}
