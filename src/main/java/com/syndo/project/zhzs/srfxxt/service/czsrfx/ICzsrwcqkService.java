package com.syndo.project.zhzs.srfxxt.service.czsrfx;

import java.util.List;
import java.util.Map;

import com.syndo.project.zhzs.srfxxt.domain.czsrfx.Czsrwcqk;


/**
 * 财政收入完成情况
 * 
 * @author mdz
 *
 */
public interface ICzsrwcqkService {
	/**
	 * 财政收入完成情况
	 * @param cond
	 * @return
	 */
	List<Czsrwcqk> selectList(Czsrwcqk cond);

    List<Map<String,Object>> selectYskm();
}
