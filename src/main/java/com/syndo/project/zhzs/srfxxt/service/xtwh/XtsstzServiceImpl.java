package com.syndo.project.zhzs.srfxxt.service.xtwh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Xtsstz;
import com.syndo.project.zhzs.srfxxt.mapper.xtwh.XtsstzMapper;

/**
 * 协调税收调整
 *
 */
@Service
public class XtsstzServiceImpl extends BaseService implements IXtsstzService {

	@Autowired
	private XtsstzMapper mapper;

	@Override
	public Xtsstz selectById(String id) {
	    return mapper.selectById(id);
	}
	
	@Override
	public List<Xtsstz> selectList(Xtsstz entity) {
	    return mapper.selectList(entity);
	}
	
	@Override
	public int insert(Xtsstz entity) {
		entity.beforeInsert();
	    return mapper.insert(entity);
	}
	
	@Override
	public int update(Xtsstz entity) {
		entity.beforeUpdate();
	    return mapper.update(entity);
	}

	@Override
	public int deleteByIds(String ids) {
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}


}
