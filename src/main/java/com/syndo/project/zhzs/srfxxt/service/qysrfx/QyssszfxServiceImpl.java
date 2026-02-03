package com.syndo.project.zhzs.srfxxt.service.qysrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qyssszfx;
import com.syndo.project.zhzs.srfxxt.mapper.qysrfx.QyssszfxMapper;

/**
 * @author mdz
 * 
 */
@Service
public class QyssszfxServiceImpl extends BaseService implements IQyssszfxService {

	@Autowired
	private QyssszfxMapper mapper;

	/**
	 * 企业税收税种分析
	 */
	@Override
	public List<Qyssszfx> selectList(Qyssszfx entity) {
		return mapper.selectList(entity);
	}
}
