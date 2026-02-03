package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qyssgsqwh;
import com.syndo.project.zhzs.srfxxt.mapper.xtwh.QyssgsqwhMapper;

/**
 *企业税收归属权维护
 *
 */
@Service
public class QyssgsqwhServiceImpl extends BaseService implements IQyssgsqwhService {

	@Autowired
	private QyssgsqwhMapper mapper;

	@Override
	public Qyssgsqwh selectById(String id) {
	    return mapper.selectById(id);
	}
	
	@Override
	public List<Qyssgsqwh> selectList(Qyssgsqwh entity) {
	    return mapper.selectList(entity);
	}
	
	@Override
	public int insert(Qyssgsqwh entity) {
		entity.beforeInsert();
	    return mapper.insert(entity);
	}
	
	@Override
	public int update(Qyssgsqwh entity) {
		entity.beforeUpdate();
		mapper.insertUpdateHistory(entity);
	    return mapper.update(entity);
	}

	@Override
	public int deleteByIds(String ids, String userId) {
		mapper.insertDeleteHistory(Convert.toStrArray(ids), userId);
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}

}
