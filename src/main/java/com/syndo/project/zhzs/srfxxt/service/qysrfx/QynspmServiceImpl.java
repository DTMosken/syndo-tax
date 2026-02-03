package com.syndo.project.zhzs.srfxxt.service.qysrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qynspm;
import com.syndo.project.zhzs.srfxxt.mapper.qysrfx.QynspmMapper;

/**
 * 企业纳税排名
 *
 */
@Service
public class QynspmServiceImpl extends BaseService implements IQynspmService {

	@Autowired
	private QynspmMapper mapper;

	@Override
	public List<Qynspm> selectList(Qynspm entity) {
		return mapper.selectList(entity);
	}

}
