package com.syndo.project.zhzs.srfxxt.service.jkbb;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkzyzftj;
/**
 * 金库转移支付统计 服务层
 * @author gxg
 *
 */
public interface IJkzyzftjService {
	/**
     * 查询金库转移支付统计列表
     * 
     * @param Jkzyzftj 金库转移支付统计信息
     * @return 金库转移支付统计集合
     */
	public List<Jkzyzftj> selectList(Jkzyzftj entity);
}
