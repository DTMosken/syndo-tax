package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Jyzxsnsfx;


public interface JyzxsnsfxMapper{
	/**
	 * 查询列表
	 * @param entity
	 * @return
	 */
	public List<Jyzxsnsfx> selectList(Jyzxsnsfx entity);	
	public List<Jyzxsnsfx> getTwoList(Jyzxsnsfx entity);		
}