package com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Fcscefx;

/**
 * @author gxg
 * 房产税差额分析  数据层
 */
public interface FcscefxMapper{
	/**
	 * 查询列表
	 * @param entity
	 * @return
	 */
	public List<Fcscefx> selectList(Fcscefx entity);	
}