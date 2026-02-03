package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyftxxyhs;

/**
 * 企业房土信息已核实
 * 
 * @author xrc
 *
 */
public interface IQyftxxyhsService {

	List<Qyftxxyhs> selectList(Qyftxxyhs cond);

	int update(Qyftxxyhs cond);
	
	Qyftxxyhs selectById(String id);
}
