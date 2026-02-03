package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Spftdzzsbd;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.SpftdzzsbdMapper;
/**
 * 商品房土地增值税比对
 *
 * @author ykc
 * @date 2019年7月22日
 */
@Service
public class SpftdzzsbdServiceImpl implements ISpftdzzsbdService {

	@Autowired
	private SpftdzzsbdMapper mapper;
	
	@Override
	public List<Spftdzzsbd> selectList(Spftdzzsbd entity) {
		return mapper.selectList(entity);
	}

	/**
	 * 查看详情二级页面
	 */
	@Override
	public List<Spftdzzsbd> getTwoList(Spftdzzsbd entity) {
		return mapper.getTwoList(entity);
	}
	
	/**
	 * 查看详情三级页面
	 */
	@Override
	public List<Spftdzzsbd> getThreeList(Spftdzzsbd cond) {
		return mapper.getThreeList(cond);
	}

}
