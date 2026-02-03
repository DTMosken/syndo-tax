package com.syndo.project.zhzs.srfxxt.service.szqkfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.szqkfx.Xzsssrzxqk;
import com.syndo.project.zhzs.srfxxt.mapper.szqkfx.XzsssrzxqkMapper;

/**
 * 乡镇税收收入执行情况
 * 
 * @author mdz
 *
 */
@Service
public class XzsssrzxqkServiceImpl extends BaseService implements IXzsssrzxqkService {

	@Autowired
	private XzsssrzxqkMapper mapper;

	@Override
	public List<Xzsssrzxqk> selectList(Xzsssrzxqk entity) {
		return mapper.selectList(entity);
	}

}
