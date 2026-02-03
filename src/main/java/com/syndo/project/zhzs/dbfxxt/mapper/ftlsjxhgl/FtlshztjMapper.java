package com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Ftlshztj;

/**
 * @author gxg
 * 房土两税汇总统计  数据层
 */
public interface FtlshztjMapper{
	/**
	 * 查询列表
	 * @param entity
	 * @return
	 */
	public List<Ftlshztj> selectList(Ftlshztj entity);	
}