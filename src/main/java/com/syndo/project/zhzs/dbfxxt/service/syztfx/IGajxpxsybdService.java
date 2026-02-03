package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Gajxpxsybd;

/**
 * 公安驾校培训税源比对
 * 
 * @author xrc
 *
 */
public interface IGajxpxsybdService {

	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	List<Gajxpxsybd> selectList(Gajxpxsybd cond);

	/**
	 * 查看详情二级页面
	 * 
	 * @param cond
	 * @return
	 */
	List<Gajxpxsybd> getTwoList(Gajxpxsybd cond);

	/**
	 * 查看详情三级页面
	 * 
	 * @param cond
	 * @return
	 */
	List<Gajxpxsybd> getThreeList(Gajxpxsybd cond);
}
