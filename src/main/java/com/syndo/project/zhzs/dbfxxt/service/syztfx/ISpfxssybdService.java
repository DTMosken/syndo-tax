package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Spfxssybd;

/**
 * 商品房销售税源比对
 * 
 * @author xrc
 *
 */
public interface ISpfxssybdService {

	/**
	 * 查询列表
	 * 
	 * @param spfxssybd
	 * @return
	 */
	List<Spfxssybd> selectList(Spfxssybd spfxssybd);

	/**
	 * 查看详情二级页面
	 */
	List<Spfxssybd> getTwoList(Spfxssybd cond);

	/**
	 * 查看详情三级页面
	 * 
	 * @param cond
	 * @return
	 */
	List<Spfxssybd> getThreeList(Spfxssybd cond);
}
