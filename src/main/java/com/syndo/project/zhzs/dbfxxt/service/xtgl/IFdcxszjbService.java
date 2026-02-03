package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Fdcxszjb;

/**
 * 房地产销售中间表维护
 * 
 * @author xrc
 *
 */
public interface IFdcxszjbService {

	List<Fdcxszjb> selectList(Fdcxszjb cond);

	int insert(Fdcxszjb cond);

	int update(Fdcxszjb cond);

	int deleteByIds(String ids);

	Fdcxszjb selectById(String id);

}
