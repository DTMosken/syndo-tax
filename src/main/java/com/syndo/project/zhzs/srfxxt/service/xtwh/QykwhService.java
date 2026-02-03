package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.annotation.DataScope;
import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qykwh;
import com.syndo.project.zhzs.srfxxt.mapper.xtwh.QykwhMapper;




@Service
public class QykwhService extends BaseService {

	@Autowired
	private QykwhMapper mapper;

	public Qykwh selectById(String id) {
		return mapper.selectById(id);
	}

	@DataScope(deptAlias = "d")
	public List<Qykwh> selectList(Qykwh entity) {
		return mapper.selectList(entity);
	}

	public int insert(Qykwh entity) {
		entity.beforeInsert();
		return mapper.insert(entity);
	}

	public int update(Qykwh entity) {
		entity.beforeUpdate();
		mapper.insertUpdateHistory(entity);
		return mapper.update(entity);
	}

	public int deleteByIds(String ids, String userId) {
		mapper.insertDeleteHistory(Convert.toStrArray(ids), userId);
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}
}
