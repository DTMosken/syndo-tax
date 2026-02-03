package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Jyzjgwh;
/**
 * 加油站价格 服务层
 * @author gxg
 *
 */
public interface IJyzjgwhService {
	/**
     * 查询加油站价格信息
     * 
     * @param id 加油站价格ID
     * @return 加油站价格信息
     */
	public Jyzjgwh selectById(String id);
	
	/**
     * 查询加油站价格列表
     * 
     * @param Jyzjgwh 加油站价格信息
     * @return 加油站价格集合
     */
	public List<Jyzjgwh> selectList(Jyzjgwh entity);
	
	/**
     * 新增加油站价格
     * 
     * @param Jyzjgwh 加油站价格信息
     * @return 结果
     */
	public int insert(Jyzjgwh entity);
	
	/**
     * 修改加油站价格
     * 
     * @param Jyzjgwh 加油站价格信息
     * @return 结果
     */
	public int update(Jyzjgwh entity);
		
	/**
     * 删除加油站价格信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteByIds(String ids);
}
