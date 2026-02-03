package com.syndo.project.zhzs.dbfxxt.mapper.ztzhfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Ahyydfx;

public interface AhyydfxMapper {	
	
	/**
	 * 查询列表
	 * @param entity
	 * @return
	 */
	public List<Ahyydfx> selectList(Ahyydfx entity);	
	List<Ahyydfx> find(Ahyydfx y);
}
