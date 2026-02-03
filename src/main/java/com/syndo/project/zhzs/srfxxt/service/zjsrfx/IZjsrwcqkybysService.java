package com.syndo.project.zhzs.srfxxt.service.zjsrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjsrwcqkybys;


/**
 * 镇街收入完成情况
 * （一般预算）
 */
public interface IZjsrwcqkybysService {

	/**
	 * 镇街收入完成情况一般预算
	 * @param cond
	 * @return
	 */
	List<Zjsrwcqkybys> selectList(Zjsrwcqkybys cond);

}
