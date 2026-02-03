package com.syndo.project.industry.wstb.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.industry.wstb.domain.Wstb_pizj;
import com.syndo.project.industry.wstb.domain.Wstb_tdxx;
import com.syndo.project.industry.wstb.domain.Wstb_ydhhxx;
import com.syndo.project.industry.wstb.domain.Wstb_yshhxx;
import com.syndo.project.industry.wstb.domain.Wstb_zhxx;
import com.syndo.project.industry.wstb.mapper.WstbMapper;


/**
 * 网上填报
 * 
 * @author hry
 *
 */
@Service
public class WstbService extends BaseService implements IWstbService {
	@Autowired
	private WstbMapper mapper;

	@Override
	public void updateSave(Wstb_zhxx entity) {
		// TODO Auto-generated method stub
		mapper.updateSave(entity);
	}

	@Override
	public Wstb_zhxx GetWstb(Wstb_zhxx jbxx) {
		// TODO Auto-generated method stub
		return mapper.GetWstb(jbxx);
	}

	@Override
	public Wstb_pizj Getpjxx(Wstb_pizj pjzb) {
		// TODO Auto-generated method stub
		mapper.Getpizj(pjzb);
		return null;
	}

	@Override
	public void updateSavePjzb(Wstb_zhxx entity) {
		// TODO Auto-generated method stub
		mapper.updateSavePjzb(entity);
	}

	@Override
	public void deleteByIds(Map map) {
		// TODO Auto-generated method stub
		mapper.deleteByIds(map);
	}

	@Override
	public void insertTdxx(Wstb_tdxx tdxx) {
		// TODO Auto-generated method stub
		mapper.insertTdxx(tdxx);
	}

	@Override
	public void insertYdhhxx(Wstb_ydhhxx ydxx) {
		// TODO Auto-generated method stub
		mapper.insertYdhhxx(ydxx);
	}

	@Override
	public void insertYshhxx(Wstb_yshhxx ysxx) {
		// TODO Auto-generated method stub
		mapper.insertYshhxx(ysxx);
	}

	@Override
	public List<Wstb_tdxx> GetWstbChuzu(String PID) {
		// TODO Auto-generated method stub
		return mapper.GetWstbChuzu(PID);
	}

	@Override
	public List<Wstb_tdxx> GetWstbChengzu(String PID) {
		// TODO Auto-generated method stub
		return mapper.GetWstbChengzu(PID);
	}

	@Override
	public List<Wstb_yshhxx> GetWstbYshhxx(String PID) {
		// TODO Auto-generated method stub
		return mapper.GetWstbYshhxx(PID);
	}

	@Override
	public List<Wstb_ydhhxx> GetWstbYdhhxx(String PID) {
		// TODO Auto-generated method stub
		return mapper.GetWstbYdhhxx(PID);
	}

}
