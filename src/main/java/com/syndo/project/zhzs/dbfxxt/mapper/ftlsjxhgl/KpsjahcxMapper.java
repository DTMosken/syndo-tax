package com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Kpsjahcx;

/**
 * 开票数据按户查询
 * 
 * @author xrc
 *
 */
public interface KpsjahcxMapper extends BaseMapper<Kpsjahcx> {
	
	/** 查询统计 */
	List<Kpsjahcx> getTotal();
}
