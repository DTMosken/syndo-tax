package com.syndo.project.zhzs.srfxxt.service.jkbb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkbb;
import com.syndo.project.zhzs.srfxxt.mapper.jkbb.JkbbMapper;

/**
 * 金库报表
 * 
 * @author xrc
 *
 */
@Service
public class JkbbServiceImpl extends BaseService implements IJkbbService {

	@Autowired
	private JkbbMapper mapper;

	/** 金库日报 */
	@Override
	public List<Jkbb> selectRb(Jkbb cond) {
		return mapper.selectRb(cond);
	}

	/** 金库月报 */
	@Override
	public List<Jkbb> selectYb(Jkbb cond) {
		return mapper.selectYb(cond);
	}

	/** 金库年报 */
	@Override
	public List<Jkbb> selectNb(Jkbb cond) {
		return mapper.selectNb(cond);
	}

}
