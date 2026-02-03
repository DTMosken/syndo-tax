package com.syndo.project.zhzs.xxgxxt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.xxgxxt.domain.Bsxq;
import com.syndo.project.zhzs.xxgxxt.mapper.BsxqMapper;


/**
 * 报送详情
 *
 */
@Service
public class BsxqServiceImpl extends BaseService implements IBsxqService {

	@Autowired
	private BsxqMapper mapper;

	@Override
	public List<Bsxq> selectBsxqList(Bsxq bsxq) {
		return mapper.selectBsxqList(bsxq);
	}

}
