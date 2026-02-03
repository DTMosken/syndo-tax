package com.syndo.project.zhzs.srfxxt.service.zjsrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjsrwcqkybys;
import com.syndo.project.zhzs.srfxxt.mapper.zjsrfx.ZjsrwcqkybysMapper;

/**
 * 镇街收入完成情况
 * （一般预算）
 */
@Service
public class ZjsrwcqkybysServiceImpl extends BaseService implements IZjsrwcqkybysService {

	@Autowired
	private ZjsrwcqkybysMapper mapper;

	/**
	 * 镇街收入完成情况一般预算
	 */
	@Override
	public List<Zjsrwcqkybys> selectList(Zjsrwcqkybys cond) {
		return mapper.selectList(cond);
	}

}
