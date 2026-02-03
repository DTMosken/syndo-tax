package com.syndo.project.zhzs.xxgxxt.service;

import java.util.List;
import java.util.Map;

import com.syndo.project.zhzs.xxgxxt.domain.Fenshu;
import com.syndo.project.zhzs.xxgxxt.domain.Zhibiao;

/**
 * 绩效管理
 * 
 * @author wq
 *
 */
public interface IJxglService {

	int save(Fenshu f);

	Map<String, Integer> getjsfs();

	List<Fenshu> getFenshu(Fenshu f);

	List<Fenshu> getpmFenshu(Fenshu f);

	List<Zhibiao> query(Zhibiao cond);
}
