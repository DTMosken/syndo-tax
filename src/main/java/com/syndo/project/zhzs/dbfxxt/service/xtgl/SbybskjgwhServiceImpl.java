package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Sbybskjgwh;
import com.syndo.project.zhzs.dbfxxt.mapper.xtgl.SbybskjgwhMapper;
/**
 * @author gxg
 * 社保医保刷卡中间表维护  服务层实现
 */
@Service
public class SbybskjgwhServiceImpl extends BaseService implements ISbybskjgwhService{
	
	@Autowired
	private SbybskjgwhMapper mapper;

	/**
     * 查询社保医保刷卡中间表信息
     * 
     * @param id 社保医保刷卡中间表ID
     * @return 社保医保刷卡中间表信息
     */
    @Override
	public Sbybskjgwh selectById(String id) {
	    return mapper.selectById(id);
	}
	
	/**
     * 查询社保医保刷卡中间表列表
     * 
     * @param Sbybskjgwh 社保医保刷卡中间表信息
     * @return 社保医保刷卡中间表集合
     */
	@Override
	public List<Sbybskjgwh> selectList(Sbybskjgwh entity) {
	    return mapper.selectList(entity);
	}
	
    /**
     * 新增社保医保刷卡中间表
     * 
     * @param Sbybskjgwh 社保医保刷卡中间表信息
     * @return 结果
     */
	@Override
	public int insert(Sbybskjgwh entity) {
	    return mapper.insert(entity);
	}
	
	/**
     * 修改社保医保刷卡中间表
     * 
     * @param Sbybskjgwh 社保医保刷卡中间表信息
     * @return 结果
     */
	@Override
	public int update(Sbybskjgwh entity) {
	    return mapper.update(entity);
	}

	/**
     * 删除社保医保刷卡中间表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteByIds(String ids) {
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}
}
