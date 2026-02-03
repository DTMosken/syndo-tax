package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Spftdzzsbd;

/**
 * 商品房土地增值税比对
 *
 * @author ykc
 * @date 2019年7月22日
 */
public interface ISpftdzzsbdService {

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	List<Spftdzzsbd> selectList(Spftdzzsbd entity);
	
	/**
	 * 查看详情二级页面
	 * 
	 * @param entity
	 * @return
	 */
	List<Spftdzzsbd> getTwoList(Spftdzzsbd entity);
	
	/**
	 * 查看详情三级页面
	 * 
	 * @param cond
	 * @return
	 */
	List<Spftdzzsbd> getThreeList(Spftdzzsbd cond);
}
