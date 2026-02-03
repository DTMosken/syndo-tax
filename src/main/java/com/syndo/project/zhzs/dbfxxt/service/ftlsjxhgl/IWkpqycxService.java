package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Wkpqycx;

/**
 * 未开票企业查询
 * 
 * @author xrc
 *
 */
public interface IWkpqycxService {

	List<Wkpqycx> selectList(Wkpqycx cond);

}
