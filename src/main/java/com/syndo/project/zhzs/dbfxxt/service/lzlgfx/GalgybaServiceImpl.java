package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Galg;
import com.syndo.project.zhzs.dbfxxt.mapper.lzlgfx.GalgybaMapper;

/**
 * 户籍比对 - 公安旅馆业备案未在税务注册
 */
@Service
public class GalgybaServiceImpl extends BaseService implements IGalgybaService {

	@Autowired
	private GalgybaMapper mapper;

	/**
	 * 查询列表
	 */
	@Override
	public List<Galg> selectList(Galg entity) {
		return mapper.selectList(entity);
	}

}
