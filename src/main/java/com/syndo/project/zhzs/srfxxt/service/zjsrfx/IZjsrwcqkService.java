package com.syndo.project.zhzs.srfxxt.service.zjsrfx;

import java.util.List;
import java.util.Map;

import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjsrwcqk;

/**
 * 镇街收入完成情况(全口径)
 */
public interface IZjsrwcqkService {

	/**
	 * 镇街收入完成情况(全口径)
	 * @param cond
	 * @return
	 */
	List<Zjsrwcqk> selectList(Zjsrwcqk cond);

    List<Map<String,Object>> selectZsxm();

}
