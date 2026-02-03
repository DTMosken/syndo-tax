package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Kpsjahcx;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.KpsjahcxMapper;

/**
 * 开票数据按户查询
 * 
 * @author xrc
 *
 */
@Service
public class KpsjahcxServiceImpl extends BaseService implements IKpsjahcxService {

	@Autowired
	private KpsjahcxMapper mapper;

	@Override
	public List<Kpsjahcx> selectList(Kpsjahcx cond) {
		return mapper.selectList(cond);
	}

	/**
	 * 查询统计
	 */
	@Override
	public List<Kpsjahcx> getTotal() {
		return mapper.getTotal();
	}

}
