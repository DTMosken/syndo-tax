package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Tdsysyztz;

/**
 * 土地使用税应征台账
 * 
 * @author xrc
 *
 */
public interface ITdsysyztzService {

	List<Tdsysyztz> selectList(Tdsysyztz cond);

	Tdsysyztz selectById(String id);

	int update(Tdsysyztz cond);
}
