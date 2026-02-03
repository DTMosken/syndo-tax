package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Spfxssybd;

/**
 * 商品房销售增值税税源比对
 * 
 * @author 
 *
 */
public interface SpfxssybdMapper extends BaseMapper<Spfxssybd> {

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
