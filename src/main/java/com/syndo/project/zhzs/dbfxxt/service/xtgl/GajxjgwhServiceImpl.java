package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Gajxjgwh;
import com.syndo.project.zhzs.dbfxxt.mapper.xtgl.GajxjgwhMapper;

/**
 * 公安驾校价格维护
 * 
 * @author xrc
 *
 */
@Service
public class GajxjgwhServiceImpl extends BaseService implements IGajxjgwhService {

	@Autowired
	private GajxjgwhMapper mapper;

	@Override
	public List<Gajxjgwh> selectList(Gajxjgwh cond) {
		if (null != cond.getFlagjgwh()) { // 如果不是null则进行批量插入
			mapper.insert(cond);
		}
		return mapper.selectList(cond);
	}

	@Override
	public int insert(Gajxjgwh cond) {
		return mapper.insert(cond);
	}

	@Override
	public int update(Gajxjgwh cond) {
		return mapper.update(cond);
	}

	@Override
	public int deleteByIds(String ids) {
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}

	@Override
	public Gajxjgwh selectById(String id) {
		return mapper.selectById(id);
	}

	@Override
	public int updatePrice(Gajxjgwh cond) {
		return mapper.updatePrice(cond);
	}

}
