package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Czsrncjhwh;
import com.syndo.project.zhzs.srfxxt.mapper.xtwh.CzsrncjhwhMapper;
/**
 * @author gxg
 * 收入预算年初计划维护  服务层实现
 */
@Service
public class CzsrncjhwhServiceImpl extends BaseService implements ICzsrncjhwhService{
	
	@Autowired
	private CzsrncjhwhMapper mapper;

    @Override
	public Czsrncjhwh selectById(String id) {
	    return mapper.selectById(id);
	}
	
	@Override
	public List<Czsrncjhwh> selectList(Czsrncjhwh entity) {
	    return mapper.selectList(entity);
	}
	
	@Override
	public int insert(Czsrncjhwh entity) {
		entity.beforeInsert();
	    return mapper.insert(entity);
	}
	
	@Override
	public int update(Czsrncjhwh entity) {
		entity.beforeUpdate();
	    return mapper.update(entity);
	}

	@Override
	public int deleteByIds(String ids) {
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}
}
