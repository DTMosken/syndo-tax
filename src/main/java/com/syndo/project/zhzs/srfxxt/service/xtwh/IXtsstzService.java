package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.xtwh.Xtsstz;


/**
 * 协调税收调整
 *
 */
public interface IXtsstzService {

	public Xtsstz selectById(String id);

	public List<Xtsstz> selectList(Xtsstz entity);

	public int insert(Xtsstz entity);

	public int update(Xtsstz entity);

	public int deleteByIds(String ids);

}
