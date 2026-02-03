package com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyftxxwhs;

/**
 * 企业房土信息
 * 
 * @author xrc
 *
 */
public interface QyftxxwhsMapper extends BaseMapper<Qyftxxwhs> {

	Qyftxxwhs getGSJ(Qyftxxwhs cond);

	/** 查询产权数据 */
	Qyftxxwhs getCQSJ(Qyftxxwhs cond);

	/** 查询纳税人入库数据 */
	Qyftxxwhs getNSRK(Qyftxxwhs cond);
}
