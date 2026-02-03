package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Jyzskzjb;
import com.syndo.project.zhzs.dbfxxt.mapper.xtgl.JyzskzjbMapper;

/**
 * 加油站税控中间表
 * 
 * @author hry
 *
 */
@Service
public class JyzskzjbServiceImpl extends BaseService implements IJyzskzjbService {
	
	@Autowired
	private JyzskzjbMapper mapper;

	@Override
	public List<Jyzskzjb> selectList(Jyzskzjb entity) {
		// TODO Auto-generated method stub
		return mapper.selectList(entity);
	}

	@Override
	public int insert(Jyzskzjb entity) {
		// TODO Auto-generated method stub
		return mapper.insert(entity);
	}

	@Override
	public int update(Jyzskzjb entity) {
		// TODO Auto-generated method stub
		return mapper.update(entity);
	}

	@Override
	public int deleteByIds(String ids) {
		// TODO Auto-generated method stub
		return mapper.deleteByIds(Convert.toStrArray( ids));
	}

	@Override
	public Jyzskzjb selectById(String id) {
		// TODO Auto-generated method stub
		return mapper.selectById(id);
	}
	
 

}
