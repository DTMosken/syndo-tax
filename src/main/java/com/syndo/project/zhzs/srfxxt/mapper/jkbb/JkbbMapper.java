package com.syndo.project.zhzs.srfxxt.mapper.jkbb;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkbb;

/**
 * 金库报表
 * 
 * @author xrc
 *
 */
public interface JkbbMapper extends BaseMapper<Jkbb> {

	/** 金库日报 */
	List<Jkbb> selectRb(Jkbb cond);

	/** 金库月报 */
	List<Jkbb> selectYb(Jkbb cond);

	/** 金库年报 */
	List<Jkbb> selectNb(Jkbb cond);
}
