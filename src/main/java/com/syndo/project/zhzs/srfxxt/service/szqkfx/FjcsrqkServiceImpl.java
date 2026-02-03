package com.syndo.project.zhzs.srfxxt.service.szqkfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.szqkfx.Fjcsrqk;
import com.syndo.project.zhzs.srfxxt.mapper.szqkfx.FjcsrqkMapper;

/**
 * 分级次收入情况
 * 
 * @author mdz
 *
 */
@Service
public class FjcsrqkServiceImpl extends BaseService implements IFjcsrqkService {

	@Autowired
	private FjcsrqkMapper mapper;

	@Override
	public List<Fjcsrqk> selectList(Fjcsrqk entity) {
		return mapper.selectList(entity);
	}

}
