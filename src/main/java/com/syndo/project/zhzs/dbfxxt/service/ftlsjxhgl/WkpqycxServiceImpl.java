package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Wkpqycx;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.WkpqycxMapper;

/**
 * 未开票企业查询
 * 
 * @author xrc
 *
 */
@Service
public class WkpqycxServiceImpl extends BaseService implements IWkpqycxService {

	@Autowired
	private WkpqycxMapper mapper;

	@Override
	public List<Wkpqycx> selectList(Wkpqycx cond) {
		return mapper.selectList(cond);
	}

}
