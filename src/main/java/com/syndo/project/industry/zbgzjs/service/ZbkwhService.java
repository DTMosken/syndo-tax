package com.syndo.project.industry.zbgzjs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.industry.zbgzjs.domain.Zbkwh;
import com.syndo.project.industry.zbgzjs.mapper.ZbkwhMapper;

/**
 * 指标库维护
 * @author 46406
 *
 */
@Service
public class ZbkwhService extends BaseService implements IZbkwhService{
	@Autowired
	private ZbkwhMapper mapper;
	/**
	 * 查
	 */
	@Override
	public List<Zbkwh> GetZbkLST(Zbkwh zb) {
		// TODO Auto-generated method stub
		return mapper.GetZbkLST(zb);
	}
 

	/*
	 * 删
	 */
	@Override
	public void remove(String []id) {
		// TODO Auto-generated method stub
		mapper.remove(id);
	}


	@Override
	public void newaddZbk(Zbkwh zb) {
		// TODO Auto-generated method stub
		mapper.newaddZbk(zb);
	}


	@Override
	public void updateZbk(Zbkwh zb) {
		// TODO Auto-generated method stub
		mapper.updateZbk(zb);
	}


	@Override
	public Zbkwh GetZbkLSTBYID(String id) {
		// TODO Auto-generated method stub
		return mapper.GetZbkLSTBYID(id);
	}

}
