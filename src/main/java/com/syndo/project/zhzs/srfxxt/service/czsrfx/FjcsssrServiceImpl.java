package com.syndo.project.zhzs.srfxxt.service.czsrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.czsrfx.Fjcsssr;
import com.syndo.project.zhzs.srfxxt.mapper.czsrfx.FjcsssrMapper;

/**
 * 分级次税收收入
 *
 */
@Service
public class FjcsssrServiceImpl extends BaseService implements IFjcsssrService {

	@Autowired
	private FjcsssrMapper mapper;

	/**
	 * 分级次税收收入
	 */
	@Override
	public List<Fjcsssr> selectList(Fjcsssr cond) {
		return mapper.selectList(cond);
	}

}
