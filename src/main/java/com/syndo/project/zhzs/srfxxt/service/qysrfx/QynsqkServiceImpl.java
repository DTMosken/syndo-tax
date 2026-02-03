package com.syndo.project.zhzs.srfxxt.service.qysrfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qynsqk;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.QynsqkxjlExcel;
import com.syndo.project.zhzs.srfxxt.mapper.qysrfx.QynsqkMapper;

/**
 * 企业纳税情况
 * 
 */
@Service
public class QynsqkServiceImpl extends BaseService implements IQynsqkService {

	@Autowired
	private QynsqkMapper mapper;

	/**
	 * 企业纳税增长额排名
	 */
	@Override
	public List<Qynsqk> selectZze(Qynsqk entity) {
		return mapper.selectZze(entity);
	}

	/**
	 * 企业纳税下降额排名
	 */
	@Override
	public List<QynsqkxjlExcel> selectXje(QynsqkxjlExcel entity) {
		return mapper.selectXje(entity);
	}

}
