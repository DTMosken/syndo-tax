package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Lgjdzjb;
import com.syndo.project.zhzs.dbfxxt.mapper.xtgl.LgjdzjbMapper;

/**
 * 旅馆酒店中间表维护
 * 
 *
 */
@Service
public class LgjdzjbServiceImpl extends BaseService implements ILgjdzjbService {

	@Autowired
	private LgjdzjbMapper mapper;

	@Override
	public List<Lgjdzjb> selectList(Lgjdzjb cond) {
		return mapper.selectList(cond);
	}

	@Override
	public int insert(Lgjdzjb cond) {
		return mapper.insert(cond);
	}

	@Override
	public int update(Lgjdzjb cond) {
		return mapper.update(cond);
	}

	@Override
	public int deleteByIds(String ids) {
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}

	@Override
	public Lgjdzjb selectById(String id) {
		return mapper.selectById(id);
	}

}
