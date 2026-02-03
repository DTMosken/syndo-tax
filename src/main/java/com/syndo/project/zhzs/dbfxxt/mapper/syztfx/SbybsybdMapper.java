package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Sbybsybd;


public interface SbybsybdMapper{
	/**
	 * 查询列表
	 * @param entity
	 * @return
	 */
	public List<Sbybsybd> selectList(Sbybsybd entity);	
	public List<Sbybsybd> getTwoList(Sbybsybd entity);	
	public List<Sbybsybd> getThreeList(Sbybsybd entity);	
}