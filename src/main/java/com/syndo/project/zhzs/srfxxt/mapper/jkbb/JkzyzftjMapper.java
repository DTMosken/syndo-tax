package com.syndo.project.zhzs.srfxxt.mapper.jkbb;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkzyzftj;

/**
 * @author gxg
 * 金库转移支付统计  数据层
 */
public interface JkzyzftjMapper{
	/**
	 * 查询列表
	 * @param entity
	 * @return
	 */
	public List<Jkzyzftj> selectList(Jkzyzftj entity);	
}