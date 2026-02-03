package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Spfxssybd;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.SpfxssybdMapper;

/**
 * 商品房销售税源比对
 * 
 * @author xrc
 *
 */
@Service
public class SpfxssybdServiceImpl extends BaseService implements ISpfxssybdService {

	@Autowired
	private SpfxssybdMapper mapper;

	/**
	 * 查询列表
	 */
	@Override
	public List<Spfxssybd> selectList(Spfxssybd cond) {
		List<Spfxssybd> list = new ArrayList<Spfxssybd>();
		list = mapper.selectList(cond);
		return list;
	}

	/**
	 * 查看详情二级页面
	 */
	@Override
	public List<Spfxssybd> getTwoList(Spfxssybd cond) {
		return mapper.getTwoList(cond);
	}

	/**
	 * 查看详情三级页面
	 */
	@Override
	public List<Spfxssybd> getThreeList(Spfxssybd cond) {
		return mapper.getThreeList(cond);
	}

}
