package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Spftdzzsbd;


/**
 * 商品房销售土地增值税税源比对
 * 
 * @author 
 *
 */
public interface SpftdzzsbdMapper extends BaseMapper<Spftdzzsbd> {
	
	/**
	 * 查看详情三级页面
	 * 
	 * @param entity
	 * @return
	 */
	List<Spftdzzsbd> getTwoList(Spftdzzsbd entity);
	
	/**
	 * 查看详情三级页面
	 * 
	 * @param entity
	 * @return
	 */
	List<Spftdzzsbd> getThreeList(Spftdzzsbd entity);

}
