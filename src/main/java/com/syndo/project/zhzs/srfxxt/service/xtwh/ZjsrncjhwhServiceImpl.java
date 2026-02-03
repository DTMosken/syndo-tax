package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Zjsrncjhwh;
import com.syndo.project.zhzs.srfxxt.mapper.xtwh.ZjsrncjhwhMapper;
/**
 * 镇街收入年初计划维护
 * 
 * @author ykc
 * @date 2020年4月21日
 *
 */
@Service
public class ZjsrncjhwhServiceImpl extends BaseService implements IZjsrncjhwhService{
	
	@Autowired
	private ZjsrncjhwhMapper mapper;

    @Override
	public Zjsrncjhwh selectById(String id) {
	    return mapper.selectById(id);
	}
	
	@Override
	public List<Zjsrncjhwh> selectList(Zjsrncjhwh entity) {
	    return mapper.selectList(entity);
	}
	
	@Override
	public int insert(Zjsrncjhwh entity) {
		entity.beforeInsert();
	    return mapper.insert(entity);
	}
	
	@Override
	public int update(Zjsrncjhwh entity) {
		entity.beforeUpdate();
	    return mapper.update(entity);
	}

	@Override
	public int deleteByIds(String ids) {
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}
}
