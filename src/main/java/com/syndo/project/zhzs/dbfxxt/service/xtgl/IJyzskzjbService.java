package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Jyzskzjb;

/**
 * 加油站税控中间表
 * 
 * @author hry
 *
 */
public interface IJyzskzjbService {
	List<Jyzskzjb> selectList(Jyzskzjb entity);

	int insert(Jyzskzjb entity);

	int update(Jyzskzjb entity);

	int deleteByIds(String ids);

	Jyzskzjb selectById(String id);

}
