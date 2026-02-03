package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qyssgsqwh;


/**
 * 企业税收归属权维护
 *
 */
public interface IQyssgsqwhService {

	public Qyssgsqwh selectById(String id);

	public List<Qyssgsqwh> selectList(Qyssgsqwh entity);

	public int insert(Qyssgsqwh entity);

	public int update(Qyssgsqwh entity);

	public int deleteByIds(String ids, String userId);

}
