package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qygsjt;
import com.syndo.project.zhzs.srfxxt.mapper.xtwh.QygsjtMapper;

/**
 * 企业归属集团
 *
 */
@Service
public class QygsjtServiceImpl extends BaseService implements IQygsjtService {

	@Autowired
	private QygsjtMapper mapper;

	@Override
	public Qygsjt selectById(String id) {
	    return mapper.selectById(id);
	}
	
	@Override
	public List<Qygsjt> selectList(Qygsjt entity) {
	    return mapper.selectList(entity);
	}
	
	@Override
	public int insert(Qygsjt entity) {
		entity.beforeInsert();
	    return mapper.insert(entity);
	}
	
	@Override
	public int update(Qygsjt entity) {		
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
