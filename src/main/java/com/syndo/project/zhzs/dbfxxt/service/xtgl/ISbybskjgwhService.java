package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Sbybskjgwh;
/**
 * 社保医保刷卡中间表 服务层
 * @author gxg
 *
 */
public interface ISbybskjgwhService {
	/**
     * 查询社保医保刷卡中间表信息
     * 
     * @param id 社保医保刷卡中间表ID
     * @return 社保医保刷卡中间表信息
     */
	public Sbybskjgwh selectById(String id);
	
	/**
     * 查询社保医保刷卡中间表列表
     * 
     * @param Sbybskjgwh 社保医保刷卡中间表信息
     * @return 社保医保刷卡中间表集合
     */
	public List<Sbybskjgwh> selectList(Sbybskjgwh entity);
	
	/**
     * 新增社保医保刷卡中间表
     * 
     * @param Sbybskjgwh 社保医保刷卡中间表信息
     * @return 结果
     */
	public int insert(Sbybskjgwh entity);
	
	/**
     * 修改社保医保刷卡中间表
     * 
     * @param Sbybskjgwh 社保医保刷卡中间表信息
     * @return 结果
     */
	public int update(Sbybskjgwh entity);
		
	/**
     * 删除社保医保刷卡中间表信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteByIds(String ids);
}
