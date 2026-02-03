package com.syndo.project.industry.sjsb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.service.BaseService;
import com.syndo.project.industry.sjsb.domain.PolicyAdvice;
import com.syndo.project.industry.sjsb.mapper.PolicyAdviceMapper;

/**
 * 政策建议
 *
 * @author ykc
 * @date 2020年7月24日
 */
@Service
public class PolicyAdviceService extends BaseService {

	@Autowired
	private PolicyAdviceMapper mapper;

	/**
	 * 查询
	 * @param entity
	 * @return
	 */
	public List<PolicyAdvice> selectList(PolicyAdvice entity) {
		return mapper.selectList(entity);
	}
	
	/**
	 * 文件下载
	 * @param id
	 * @return
	 */
	public AjaxResult download(String id) {
		PolicyAdvice entity = mapper.selectById(id);
		if (entity == null) {
			return AjaxResult.warn("该文件不存在！");
		}
		return AjaxResult.success(entity.getFilePath());
	}
	
}
