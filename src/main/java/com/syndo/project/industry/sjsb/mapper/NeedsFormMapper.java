package com.syndo.project.industry.sjsb.mapper;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.industry.sjsb.domain.NeedsForm;

/**
 * 需求调查表
 *
 * @author ykc
 * @date 2020年7月22日
 */
public interface NeedsFormMapper extends BaseMapper<NeedsForm> {

	/**
	 * 根据登录名称查询需求表
	 *
	 * @param loginName
	 * @return
	 */
	NeedsForm selectByLoginName(String loginName);

}
