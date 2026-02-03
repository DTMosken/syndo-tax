package com.syndo.project.industry.sjys.service;

import java.util.List;
import java.util.Map;

import com.syndo.project.industry.sjys.domain.Qydfjs;
import com.syndo.project.industry.wstb.domain.Wstb_zhxx;
import com.syndo.project.industry.zbgzjs.domain.Zbkwh;

/**
 * 企业得分计算 
 * @author hry
 *
 */
public interface IQyjsdfService {
	//查询列表
	List<Qydfjs> GetQyjsdf();
	//查询指标
	List<Zbkwh> GetZbkzbmc();
	//查询所有网上填报信息
	List<Wstb_zhxx> GetMcxys();
	
	//重新计算
	void calculation();
	
	void insertQydfjs(Qydfjs qydf);
	
	/**
	 * 修改评价等级
	 * @param TYSHXYBM
	 * @param PJDJ
	 */
	void UpdaePjdj(Map m );
}
