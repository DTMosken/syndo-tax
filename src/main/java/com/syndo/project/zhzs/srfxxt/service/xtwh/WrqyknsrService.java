package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Wrqyknsr;
import com.syndo.project.zhzs.srfxxt.mapper.xtwh.WrqyknsrMapper;

/**
 * 未入企业库纳税人
 *
 * @author ykc
 * @date 2020年6月17日
 */
@Service
public class WrqyknsrService extends BaseService {

	@Autowired
	private WrqyknsrMapper mapper;
	
	public List<Wrqyknsr> selectList(Wrqyknsr entity) {
		return mapper.selectList(entity);
	}
	
 }
