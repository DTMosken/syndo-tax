package com.syndo.project.zhzs.srfxxt.service.qysrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Zdsznsfx;
import com.syndo.project.zhzs.srfxxt.mapper.qysrfx.ZdsznsfxMapper;

/**
 * 重点税种纳税分析
 */
@Service
public class ZdsznsfxServiceImpl extends BaseService implements IZdsznsfxService {

	@Autowired
	private ZdsznsfxMapper mapper;

	/**
	 * 重点税种纳税分析
	 */
	@Override
	public List<Zdsznsfx> selectList(Zdsznsfx entity) {
		return mapper.selectList(entity);
	}

}
