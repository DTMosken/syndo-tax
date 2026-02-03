package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Fdcxszjb;
import com.syndo.project.zhzs.dbfxxt.mapper.xtgl.FdcxszjbMapper;

/**
 * 房地产销售中间表维护
 * 
 * @author xrc
 *
 */
@Service
public class FdcxszjbServiceImpl extends BaseService implements IFdcxszjbService {

	@Autowired
	private FdcxszjbMapper mapper;

	@Override
	public List<Fdcxszjb> selectList(Fdcxszjb cond) {
		return mapper.selectList(cond);
	}

	@Override
	public int insert(Fdcxszjb cond) {
		// //获取当前登陆用户
		// User user = ShiroUtils.getSysUser();
		// cond.setZjr(user.getUserName());
		return mapper.insert(cond);
	}

	@Override
	public int update(Fdcxszjb cond) {
		// //获取当前登陆用户
		// User user = ShiroUtils.getSysUser();
		// cond.setXgr(user.getUserName());
		// cond.setXgsj(DateUtils.getDate());
		return mapper.update(cond);
	}

	@Override
	public int deleteByIds(String ids) {
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}

	@Override
	public Fdcxszjb selectById(String id) {
		return mapper.selectById(id);
	}

}
