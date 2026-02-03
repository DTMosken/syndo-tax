package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Tdsysyztz;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.TdsysyztzMapper;

/**
 * 土地使用税应征台账
 * 
 * @author xrc
 *
 */
@Service
public class TdsysyztzServiceImpl extends BaseService implements ITdsysyztzService {

	@Autowired
	private TdsysyztzMapper mapper;

	@Override
	public List<Tdsysyztz> selectList(Tdsysyztz cond) {
		return mapper.selectList(cond);
	}

	@Override
	public Tdsysyztz selectById(String id) {
		return mapper.selectById(id);
	}

	@Override
	public int update(Tdsysyztz cond) {
		return mapper.update(cond);
	}

}
