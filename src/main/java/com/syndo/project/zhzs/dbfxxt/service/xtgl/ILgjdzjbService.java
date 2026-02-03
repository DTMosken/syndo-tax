package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Lgjdzjb;

/**
 * 旅馆酒店中间表维护
 * 
 *
 */
public interface ILgjdzjbService {

	List<Lgjdzjb> selectList(Lgjdzjb cond);

	int insert(Lgjdzjb cond);

	int update(Lgjdzjb cond);

	int deleteByIds(String ids);

	Lgjdzjb selectById(String id);

}
