package com.syndo.project.industry.sjsb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.industry.sjsb.domain.ResultQuery;
import com.syndo.project.industry.sjsb.mapper.ResultQueryMapper;

/**
 * 结果查询
 *
 * @author ykc
 * @date 2020年7月24日
 */
@Service
public class ResultQueryService extends BaseService {

	@Autowired
	private ResultQueryMapper mapper;
	
	/**
	 * 查询
	 *
	 * @param entity
	 * @return
	 */
	public List<ResultQuery> selectList(ResultQuery entity) {
		return mapper.selectList(entity);
	}

}
