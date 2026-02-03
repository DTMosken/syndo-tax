package com.syndo.project.industry.sjys.mapper;

import java.util.List;
import java.util.Map;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.industry.sjys.domain.Qydfjs;
import com.syndo.project.industry.wstb.domain.Wstb_zhxx;
import com.syndo.project.industry.zbgzjs.domain.Zbkwh;

/**
 * 企业综合得分
 * 
 * @author hry
 *
 */
public interface QyjsdfMapper extends BaseMapper<Qydfjs> {
	// 查询列表
	List<Qydfjs> GetQyjsdf();

	// 查询指标
	List<Zbkwh> GetZbkzbmc();

	// 查询所有网上填报信息
	List<Wstb_zhxx> GetMcxys();

	// 插入企业得分计算
	void insertQydfjs(Qydfjs qydf);

	/**
	 * 
	 * 根据年份查询企业得分计算
	 * @param m
	 * @return
	 */
	List<Qydfjs> GetQyjsdfYear(String pjnf);
	
	/**
	 * 修改评价等级
	 * @param TYSHXYBM
	 * @param PJDJ
	 */
	void UpdaePjdj(Map m);
	
}
