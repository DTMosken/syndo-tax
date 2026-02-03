package com.syndo.project.zhzs.srfxxt.service.jkbb;

import java.util.List;

/**
 * 金库报表
 */
import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkbb;

public interface IJkbbService {

	/** 金库日报 */
	List<Jkbb> selectRb(Jkbb cond);

	/** 金库月报 */
	List<Jkbb> selectYb(Jkbb cond);

	/** 金库年报 */
	List<Jkbb> selectNb(Jkbb cond);
}
