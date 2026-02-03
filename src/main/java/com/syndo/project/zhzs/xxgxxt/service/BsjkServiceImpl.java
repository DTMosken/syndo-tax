package com.syndo.project.zhzs.xxgxxt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.StringUtils;
import com.syndo.project.zhzs.xxgxxt.domain.Bsjk;
import com.syndo.project.zhzs.xxgxxt.mapper.BsjkMapper;

/**
 * 报送监控
 * 
 */
@Service
public class BsjkServiceImpl extends BaseService implements IBsjkService {

	@Autowired
	private BsjkMapper mapper;

	@Override
	public List<Bsjk> selectList(Bsjk cond) {
		return mapper.selectList(cond);
	}

}
