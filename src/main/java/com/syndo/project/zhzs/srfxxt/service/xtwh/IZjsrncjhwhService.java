package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.xtwh.Zjsrncjhwh;

/**
 * 镇街收入年初计划维护
 * 
 * @author ykc
 * @date 2020年4月21日
 *
 */
public interface IZjsrncjhwhService {
	
	public Zjsrncjhwh selectById(String id);

	public List<Zjsrncjhwh> selectList(Zjsrncjhwh entity);

	public int insert(Zjsrncjhwh entity);

	public int update(Zjsrncjhwh entity);

	public int deleteByIds(String ids);
}
