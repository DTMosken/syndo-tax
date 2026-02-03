package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Xzspbldj;
import com.syndo.project.zhzs.dbfxxt.mapper.lzlgfx.XzspbldjMapper;

@Service
public class XzspbldjServiceImpl extends BaseService implements IXzspbldjService {

	@Autowired
	private XzspbldjMapper mapper;

	@Override
	public List<Xzspbldj> selectList(Xzspbldj entity) {
		return mapper.selectList(entity);
	}
	
	
}
