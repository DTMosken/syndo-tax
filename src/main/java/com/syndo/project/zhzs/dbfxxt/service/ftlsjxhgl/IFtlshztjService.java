package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Ftlshztj;
/**
 * 房土两税汇总统计 服务层
 * @author gxg
 *
 */
public interface IFtlshztjService {
	/**
     * 查询房土两税汇总统计列表
     * 
     * @param Ftlshztj 房土两税汇总统计信息
     * @return 房土两税汇总统计集合
     */
	public List<Ftlshztj> selectList(Ftlshztj entity);
}
