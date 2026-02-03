package com.syndo.web.system.main.service;

import java.util.ArrayList;
import java.util.List;

import com.syndo.common.core.domain.entity.User;
import com.syndo.web.domain.system.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.syndo.common.core.service.BaseService;
import com.syndo.web.system.main.domain.MainEntity;
import com.syndo.web.system.main.mapper.MainMapper;

@Service
public class MainService extends BaseService {

	@Autowired
	private MainMapper mainMapper;
	
	public JSONObject getMainData() {
		JSONObject json = new JSONObject();
		MainEntity vo = new MainEntity();
		MainEntity index = mainMapper.getMainInfo(vo);
		
		JSONObject json1 = new JSONObject();
		json1.put("zsr", index.getZsr());
		json1.put("zsrqs", index.getZsrqs());
		json1.put("dfsr", index.getDfsr());
		json1.put("dfsrqs", index.getDfsrqs());
		json1.put("ybs", index.getYbs());
		json1.put("wbs", index.getWbs());
		json1.put("bssl", index.getBssl());
		json1.put("sjzl", index.getSjzl());
		json.put("card", json1);
		
		JSONObject json2 = new JSONObject();
		json2.put("yf", index.geteYf());
		json2.put("bqs", index.geteBqs());
		json2.put("tqs", index.geteTqs());
		json2.put("zjl", index.geteZjl());
		json.put("echart", json2);
		
		JSONObject json3 = new JSONObject();
		List<MainEntity> list = new ArrayList<>();
		String [] arr = {" 临邑镇", "德平镇", " 临南镇", "林子镇", "兴隆镇"};
		for (int i = 0; i < arr.length; i++) {
			MainEntity ind = new MainEntity();
			ind.setChar1(arr[i]);
			ind.setChar2(20*(i+1)/2 + "%");
			list.add(ind);
		}
		
		
		json3.put("list", list);
		json.put("progress", json3);
		
		return json;
	}

	public int getUserLocal(String username) {
		return mainMapper.getUserLocal(username);
	}

	public void insertIntoUser( String username, String password,String salt) {
		mainMapper.insertIntoUser(username,password,salt);
	}

	public void updateZdqynsfx(Zdqynsfx zdqynsfx) {
		mainMapper.updateZdqynsfx(zdqynsfx);
	}

	public List<Zdqynsfx> selectZdqynsfx() {
		return mainMapper.selectZdqynsfx();
	}

	public List<Nsqs> selectNsqs() {
		return mainMapper.selectNsqs();
	}

	public void updateNsqs(Nsqs nsqs) {
		mainMapper.updateNsqs(nsqs);
	}

	public User getSysUser(String principal) {

		return mainMapper.getSysUser(principal);
	}

	public List<Szmap> selectSzmap() {
		return mainMapper.selectSzmap();
	}

	public List<Hymap> selectHymap() {
		return mainMapper.selectHymap();
	}

    public List<Zysyqyjcxx> getZysyqyjcxx() {
		return mainMapper.getZysyqyjcxx();
    }

	public void updateLngLat(String lng, String lat, String id) {
		mainMapper.updateLngLat(lng,lat,id);
	}

	public List<Nsdhqsqyjcxx> getNsdhqsqyjcxx() {

		return mainMapper.getNsdhqsqyjcxx();
	}

	public void updateLngLatNsdh(String lng, String lat, String id) {
		mainMapper.updateLngLatNsdh(lng,lat,id);
	}

	public List<Nsdhqsqynsxxyd> getNsdhqsqynsxxyd(String qymc, String nsrsbh) {
		List<Nsdhqsqynsxxyd> lists = mainMapper.getNsdhqsqynsxxyd(qymc,nsrsbh);
		return lists;
	}

	public List<Nsdhqsqynsxxyd> getZysyqynsxxyd(String qymc, String nsrsbh) {
		List<Nsdhqsqynsxxyd> lists = mainMapper.getZysyqynsxxyd(qymc,nsrsbh);
		return lists;
	}
}
