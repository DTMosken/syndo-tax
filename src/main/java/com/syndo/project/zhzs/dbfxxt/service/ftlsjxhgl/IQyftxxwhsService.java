package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyftxxwhs;

/**
 * 企业房土信息
 * 
 * @author xrc
 *
 */
public interface IQyftxxwhsService {

	List<Qyftxxwhs> selectList(Qyftxxwhs cond);

	int insert(Qyftxxwhs cond);

	int update(Qyftxxwhs cond);

	int deleteByIds(String ids);

	Qyftxxwhs selectById(String id);

	Qyftxxwhs getGSJ(Qyftxxwhs cond);

	/** 查询产权数据 */
	Qyftxxwhs getCQSJ(Qyftxxwhs cond);

	/** 查询纳税人入库数据 */
	Qyftxxwhs getNSRK(Qyftxxwhs cond);
}
