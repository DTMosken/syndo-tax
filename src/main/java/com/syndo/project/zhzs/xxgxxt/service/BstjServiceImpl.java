package com.syndo.project.zhzs.xxgxxt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.xxgxxt.domain.Bstj;
import com.syndo.project.zhzs.xxgxxt.mapper.BstjMapper;

/**
 * 报送统计
 *
 */
@Service
public class BstjServiceImpl extends BaseService implements IBstjService {

	@Autowired
	private BstjMapper mapper;

	/**
	 * 获取统计数据
	 */
	@Override
	public Bstj getTjsj(Bstj bstj) {
		//数据部门数
		int sjbm = mapper.getSjbm();
		//数据资源数
		int sjzy = mapper.getSjzy();
		//数据总量
		mapper.getSjzl(bstj);
		bstj.setSjbm(sjbm);
		bstj.setSjzy(sjzy);
		return bstj;
	}

	/**
	 * 获取图表数据
	 */
	@Override
	public JSONObject getChartData(Bstj bstj) {
		bstj = mapper.getChartData(bstj);
		JSONObject json = new JSONObject();
		json.put("rq", bstj.getRq());
		json.put("bssl", bstj.getBssl());
		return json;
	}

	/**
	 * 获取报送详情数据
	 */
	@Override
	public List<Bstj> getBsrz(Bstj bstj) {
		List<Bstj> rzList = mapper.getBsrz();
		return rzList;
	}
}
