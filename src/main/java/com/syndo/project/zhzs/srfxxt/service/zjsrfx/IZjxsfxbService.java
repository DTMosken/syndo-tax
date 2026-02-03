package com.syndo.project.zhzs.srfxxt.service.zjsrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjxsfxb;


/**
 * 镇街协税分析表
 *
 */
public interface IZjxsfxbService {

	/**
	 * 镇街协税分析表
	 * @param cond
	 * @return
	 */
	List<Zjxsfxb> selectList(Zjxsfxb cond);

}
