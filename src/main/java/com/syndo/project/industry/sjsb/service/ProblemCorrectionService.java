package com.syndo.project.industry.sjsb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.industry.sjsb.domain.ProblemCorrection;
import com.syndo.project.industry.sjsb.mapper.ProblemCorrectionMapper;

/**
 * 问题纠偏
 *
 * @author ykc
 * @date 2020年7月24日
 */
@Service
public class ProblemCorrectionService extends BaseService {

	@Autowired
	private ProblemCorrectionMapper mapper;
	
	/**
	 * 查询
	 *
	 * @param entity
	 * @return
	 */
	public List<ProblemCorrection> selectList(ProblemCorrection entity) {
		return mapper.selectList(entity);
	}

	/**
	 * 主键查询
	 *
	 * @param id
	 * @return
	 */
	public ProblemCorrection selectById(String id) {
		return mapper.selectById(id);
	}
	
	/**
	 * 新增
	 *
	 * @param entity
	 * @return
	 */
	public int insert(ProblemCorrection entity) {
		entity.beforeInsert();
		entity.setTyshxydm(ShiroUtils.getLoginName());
		entity.setQymc(ShiroUtils.getUserName());
		entity.setJprq(DateUtils.getTime());
		return mapper.insert(entity);
	}

	/**
	 * 删除
	 *
	 * @param ids
	 * @return
	 */
	public int deleteByIds(String ids) {
		String[] idArr = Convert.toStrArray(ids);
		return mapper.deleteByIds(idArr);
	}


}
