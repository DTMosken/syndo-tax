package com.syndo.project.zhzs.srfxxt.service.qysrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Zdnsqyfx;
import com.syndo.project.zhzs.srfxxt.mapper.qysrfx.ZdnsqyfxMapper;

/**
 * 重点纳税企业分析
 *
 */
@Service
public class ZdnsqyfxServiceImpl extends BaseService implements IZdnsqyfxService {

	@Autowired
	private ZdnsqyfxMapper mapper;

	/**
	 * 重点纳税企业分析
	 */
	@Override
	public List<Zdnsqyfx> selectList(Zdnsqyfx entity) {
		return mapper.selectList(entity);
	}

}
