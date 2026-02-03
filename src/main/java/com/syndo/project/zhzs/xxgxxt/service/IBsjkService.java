package com.syndo.project.zhzs.xxgxxt.service;

import java.util.List;

import com.syndo.project.zhzs.xxgxxt.domain.Bsjk;

/**
 * 报送监控
 * 
 */
public interface IBsjkService {

	List<Bsjk> selectList(Bsjk cond);
}
