package com.syndo.project.zhzs.srfxxt.service.zjsrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjxsfxb;
import com.syndo.project.zhzs.srfxxt.mapper.zjsrfx.ZjxsfxbMapper;

/**
 * 镇街协税分析表
 *
 */
@Service
public class ZjxsfxbServiceImpl extends BaseService implements IZjxsfxbService {

	@Autowired
	private ZjxsfxbMapper mapper;

	/**
	 * 镇街协税分析表
	 */
	@Override
	public List<Zjxsfxb> selectList(Zjxsfxb cond) {
		return mapper.selectList(cond);
	}

}
