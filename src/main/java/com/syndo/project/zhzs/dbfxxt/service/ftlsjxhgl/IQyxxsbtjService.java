package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyxxsbtj;
/**
 * 企业信息上报信息 服务层
 * @author gxg
 *
 */
public interface IQyxxsbtjService {
	
	/**
     * 查询企业信息上报信息列表
     * 
     * @param Qyxxsbtj 企业信息上报信息信息
     * @return 企业信息上报信息集合
     */
	public List<Qyxxsbtj> selectList(Qyxxsbtj entity);
}
