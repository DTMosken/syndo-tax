package com.syndo.project.zhzs.srfxxt.service.zjsrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjsrszfx;
import com.syndo.project.zhzs.srfxxt.mapper.zjsrfx.ZjsrszfxMapper;

/**
 * 镇街收入税种分析
 */
@Service
public class ZjsrszfxServiceImpl extends BaseService implements IZjsrszfxService {

	@Autowired
	private ZjsrszfxMapper mapper;

	/**
	 * 镇街收入税种分析
	 */
	@Override
	public List<Zjsrszfx> selectList(Zjsrszfx cond) {
		return mapper.selectList(cond);
	}


}
