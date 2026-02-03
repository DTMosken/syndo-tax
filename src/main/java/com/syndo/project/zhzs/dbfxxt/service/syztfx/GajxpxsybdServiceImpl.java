package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Gajxpxsybd;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.GajxpxsybdMapper;

/**
 * 公安驾校培训税源比对
 * 
 * @author xrc
 *
 */
@Service
public class GajxpxsybdServiceImpl extends BaseService implements IGajxpxsybdService {

	@Autowired
	private GajxpxsybdMapper mapper;

	/**
	 * 查询列表
	 */
	@Override
	public List<Gajxpxsybd> selectList(Gajxpxsybd cond) {
		return mapper.selectList(cond);
	}

	/**
	 * 查看详情二级页面
	 */
	@Override
	public List<Gajxpxsybd> getTwoList(Gajxpxsybd cond) {
		return mapper.getTwoList(cond);
	}

	/**
	 * 查看详情三级页面
	 */
	@Override
	public List<Gajxpxsybd> getThreeList(Gajxpxsybd cond) {
		return mapper.getThreeList(cond);
	}

}
