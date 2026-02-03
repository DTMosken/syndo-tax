package com.syndo.project.zhzs.srfxxt.service.czsrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.czsrfx.Fjcsssr;


/**
 * 分级次税收收入
 *
 */
public interface IFjcsssrService {

	/**
	 * 分级次税收收入
	 * @param cond
	 * @return
	 */
	List<Fjcsssr> selectList(Fjcsssr cond);

}
