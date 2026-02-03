package com.syndo.project.zhzs.xxgxxt.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.syndo.project.zhzs.xxgxxt.domain.Bstj;

/**
 * 报送统计
 *
 */
public interface IBstjService {

	Bstj getTjsj(Bstj bstj);

	JSONObject getChartData(Bstj bstj);

	List<Bstj> getBsrz(Bstj bstj);
}
