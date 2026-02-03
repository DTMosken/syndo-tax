package com.syndo.project.zhzs.xxgxxt.mapper;

import java.util.List;

import com.syndo.project.zhzs.xxgxxt.domain.Fenshu;
import com.syndo.project.zhzs.xxgxxt.domain.Zhibiao;

/**
 * 绩效管理
 * 
 * @author wq
 *
 */
public interface JxglMapper {

	int insertfenshu(Fenshu f);

	List<Fenshu> getFenshu(Fenshu f);

	int updatefenshu(Fenshu f);

	List<Fenshu> getpmFenshu(Fenshu f);

	Fenshu getfen(Zhibiao z);

	List<Zhibiao> query(Zhibiao cond);
}
