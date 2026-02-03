package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Kpsjahcx;

/**
 * 开票数据按户查询
 * 
 * @author xrc
 *
 */
public interface IKpsjahcxService {

	List<Kpsjahcx> selectList(Kpsjahcx cond);

	/** 查询统计 */
	List<Kpsjahcx> getTotal();
}
