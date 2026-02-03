package com.syndo.project.zhzs.dbfxxt.mapper.ztzhfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Ahyysfx;

public interface AhyysfxMapper {	
	
	/**
	 * 查询列表
	 * @param entity
	 * @return
	 */
	public List<Ahyysfx> selectList(Ahyysfx entity);
	/**
	 * 查询图表数据
	 * @param y
	 * @return
	 */
	List<Ahyysfx> find(Ahyysfx y);
}
