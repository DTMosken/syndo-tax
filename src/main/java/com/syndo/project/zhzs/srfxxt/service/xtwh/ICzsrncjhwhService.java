package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.xtwh.Czsrncjhwh;
/**
 * 财政收入年初计划维护 服务层
 * @author gxg
 *
 */
public interface ICzsrncjhwhService {
	
	public Czsrncjhwh selectById(String id);
	
	public List<Czsrncjhwh> selectList(Czsrncjhwh entity);
	
	public int insert(Czsrncjhwh entity);
	
	public int update(Czsrncjhwh entity);
		
	public int deleteByIds(String ids);
}
