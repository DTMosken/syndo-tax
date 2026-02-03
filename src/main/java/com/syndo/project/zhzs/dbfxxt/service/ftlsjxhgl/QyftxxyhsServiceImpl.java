package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyftxxyhs;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.QyftxxyhsMapper;

/**
 * 企业房土信息已核实
 * 
 * @author xrc
 *
 */
@Service
public class QyftxxyhsServiceImpl extends BaseService implements IQyftxxyhsService {

	@Autowired
	private QyftxxyhsMapper mapper;

	@Override
	public List<Qyftxxyhs> selectList(Qyftxxyhs cond) {
		return mapper.selectList(cond);
	}

	@Override
	public int update(Qyftxxyhs cond) {
		return mapper.update(cond);
	}

	@Override
	public Qyftxxyhs selectById(String id) {
		return mapper.selectById(id);
	}

}
