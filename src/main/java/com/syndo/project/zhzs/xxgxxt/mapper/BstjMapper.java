package com.syndo.project.zhzs.xxgxxt.mapper;

import java.util.List;

import com.syndo.project.zhzs.xxgxxt.domain.Bstj;

/**
 * 报送统计
 * 
 */
public interface BstjMapper {

	/**
	 * 获取数据部门数
	 */
	int getSjbm();
	
	/**
	 * 获取数据资源数
	 */
	int getSjzy();
	
	/**
	 * 获取数据总量
	 */
	void getSjzl(Bstj bstj);

	/**
	 * 获取统计图表数据
	 * @param bstj
	 * @return
	 */
	Bstj getChartData(Bstj bstj);
	
	/**
	 * 获取报送日志
	 */
	List<Bstj> getBsrz();

}
