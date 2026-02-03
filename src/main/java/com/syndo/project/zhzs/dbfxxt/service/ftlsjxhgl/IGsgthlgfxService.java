package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Gsgthlgfx;
/**
 * 个体工商户漏管分析 服务层
 * @author gxg
 *
 */
public interface IGsgthlgfxService {
	/**
     * 查询个体工商户漏管分析信息
     * 
     * @param id 个体工商户漏管分析ID
     * @return 个体工商户漏管分析信息
     */
	public Gsgthlgfx selectById(String id);
	
	/**
     * 查询个体工商户漏管分析列表
     * 
     * @param Gsgthlgfx 个体工商户漏管分析信息
     * @return 个体工商户漏管分析集合
     */
	public List<Gsgthlgfx> selectList(Gsgthlgfx entity);

}
