package com.syndo.project.zhzs.srfxxt.service.zjsrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjzdqyfx;
import com.syndo.project.zhzs.srfxxt.mapper.zjsrfx.ZjzdqyfxMapper;

/**
 * 镇街重点企业分析
 *
 */
@Service
public class ZjzdqyfxServiceImpl extends BaseService implements IZjzdqyfxService {

	@Autowired
	private ZjzdqyfxMapper mapper;

	/**
	 * 镇街重点企业分析
	 */
	@Override
	public List<Zjzdqyfx> selectList(Zjzdqyfx cond) {
		return mapper.selectList(cond);
	}

}
