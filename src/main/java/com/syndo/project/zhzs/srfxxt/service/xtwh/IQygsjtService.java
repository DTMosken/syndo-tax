package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qygsjt;

/**
 * 企业归属集团
 *
 */
public interface IQygsjtService {

	public Qygsjt selectById(String id);

	public List<Qygsjt> selectList(Qygsjt entity);

	public int insert(Qygsjt entity);

	public int update(Qygsjt entity);

	public int deleteByIds(String ids, String userId);

}
