package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyftxxwhs;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.QyftxxwhsMapper;

/**
 * 企业房土信息
 * 
 * @author xrc
 *
 */
@Service
public class QyftxxwhsServiceImpl extends BaseService implements IQyftxxwhsService {

	@Autowired
	private QyftxxwhsMapper mapper;

	@Override
	public List<Qyftxxwhs> selectList(Qyftxxwhs cond) {
		return mapper.selectList(cond);
	}

	@Override
	public int insert(Qyftxxwhs cond) {
		return mapper.insert(cond);
	}

	@Override
	public int update(Qyftxxwhs cond) {
		return mapper.update(cond);
	}

	@Override
	public int deleteByIds(String ids) {
		return mapper.deleteByIds(Convert.toStrArray(ids));
	}

	@Override
	public Qyftxxwhs selectById(String id) {
		return mapper.selectById(id);
	}

	@Override
	public Qyftxxwhs getGSJ(Qyftxxwhs cond) {
		return mapper.getGSJ(cond);
	}

	/**
	 * 查询产权数据
	 */
	@Override
	public Qyftxxwhs getCQSJ(Qyftxxwhs cond) {
		return mapper.getCQSJ(cond);
	}

	/**
	 * 查询纳税人入库数据
	 */
	@Override
	public Qyftxxwhs getNSRK(Qyftxxwhs cond) {
		return mapper.getNSRK(cond);
	}

}
