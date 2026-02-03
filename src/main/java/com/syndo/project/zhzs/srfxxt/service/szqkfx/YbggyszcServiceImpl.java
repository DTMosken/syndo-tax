package com.syndo.project.zhzs.srfxxt.service.szqkfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.szqkfx.Ybggyszc;
import com.syndo.project.zhzs.srfxxt.mapper.szqkfx.YbggyszcMapper;

/**
 * 一般公共预算支出执行情况
 * 
 * @author mdz
 *
 */
@Service
public class YbggyszcServiceImpl extends BaseService implements IYbggyszcService {

	@Autowired
	private YbggyszcMapper mapper;

	@Override
	public List<Ybggyszc> selectList(Ybggyszc entity) {
		return mapper.selectList(entity);
	}

}
