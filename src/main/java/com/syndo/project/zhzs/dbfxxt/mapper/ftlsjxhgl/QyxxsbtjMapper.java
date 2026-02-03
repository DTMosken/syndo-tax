package com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyxxsbtj;

/**
 * @author gxg
 * 企业信息上报信息  数据层
 */
public interface QyxxsbtjMapper{
	/**
	 * 查询列表
	 * @param entity
	 * @return
	 */
	public List<Qyxxsbtj> selectList(Qyxxsbtj entity);	
}