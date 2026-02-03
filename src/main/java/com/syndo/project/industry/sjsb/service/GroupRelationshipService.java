package com.syndo.project.industry.sjsb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.industry.sjsb.domain.GroupRelationship;
import com.syndo.project.industry.sjsb.mapper.GroupRelationshipMapper;

/**
 * 集团关系
 *
 * @author ykc
 * @date 2020年7月24日
 */
@Service
public class GroupRelationshipService extends BaseService {
	
	@Autowired
	private GroupRelationshipMapper mapper;
	
	/**
	 * 查询
	 *
	 * @param entity
	 * @return
	 */
	public List<GroupRelationship> selectList(GroupRelationship entity) {
		return mapper.selectList(entity);
	}

	/**
	 * 主键查询
	 *
	 * @param id
	 * @return
	 */
	public GroupRelationship selectById(String id) {
		return mapper.selectById(id);
	}
	
	/**
	 * 新增
	 *
	 * @param entity
	 * @return
	 */
	public int insert(GroupRelationship entity) {
		entity.beforeInsert();
		entity.setTyshxydm(ShiroUtils.getLoginName());
		entity.setQymc(ShiroUtils.getUserName());
		return mapper.insert(entity);
	}

	/**
	 * 修改
	 *
	 * @param entity
	 * @return
	 */
	public int update(GroupRelationship entity) {
		entity.beforeUpdate();
		return mapper.update(entity);
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
