package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Jyzjgwh;
import com.syndo.project.zhzs.dbfxxt.mapper.xtgl.JyzjgwhMapper;
/**
 * @author gxg
 * 加油站价格维护  服务层实现
 */
@Service
public class JyzjgwhServiceImpl extends BaseService implements IJyzjgwhService{
	
	@Autowired
	private JyzjgwhMapper mapper;

	/**
     * 查询加油站价格信息
     * 
     * @param id 加油站价格ID
     * @return 加油站价格信息
     */
    @Override
	public Jyzjgwh selectById(String id) {
	    return mapper.selectById(id);
	}
	
	/**
     * 查询加油站价格列表
     * 
     * @param Jyzjgwh 加油站价格信息
     * @return 加油站价格集合
     */
	@Override
	public List<Jyzjgwh> selectList(Jyzjgwh entity) {
	    return mapper.selectList(entity);
	}
	
    /**
     * 新增加油站价格
     * 
     * @param Jyzjgwh 加油站价格信息
     * @return 结果
     */
	@Override
	public int insert(Jyzjgwh entity) {
	    return mapper.insert(entity);
	}
	
	/**
     * 修改加油站价格
     * 
     * @param Jyzjgwh 加油站价格信息
     * @return 结果
     */
	@Override
	public int update(Jyzjgwh entity) {
	    return mapper.update(entity);
	}

	/**
     * 删除加油站价格对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteByIds(String ids) {
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}
}
