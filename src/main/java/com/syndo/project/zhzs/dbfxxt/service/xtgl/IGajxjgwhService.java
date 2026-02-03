package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Gajxjgwh;

/**
 * 公安驾校价格维护
 * 
 * @author xrc
 *
 */
public interface IGajxjgwhService {

	List<Gajxjgwh> selectList(Gajxjgwh cond);

	int insert(Gajxjgwh cond);

	int update(Gajxjgwh cond);

	int deleteByIds(String ids);

	Gajxjgwh selectById(String id);
	
	int updatePrice(Gajxjgwh cond);
}
