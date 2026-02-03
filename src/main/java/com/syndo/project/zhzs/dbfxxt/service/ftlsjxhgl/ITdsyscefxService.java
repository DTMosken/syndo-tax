package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Tdsyscefx;

/**
 * 土地使用税差额分析
 * 
 * @author xrc
 *
 */
public interface ITdsyscefxService {

	List<Tdsyscefx> selectList(Tdsyscefx cond);
}
