package com.syndo.project.zhzs.dbfxxt.mapper.xtgl;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Gajxjgwh;

/**
 * 公安驾校价格维护
 * 
 * @author xrc
 *
 */
public interface GajxjgwhMapper extends BaseMapper<Gajxjgwh> {

	int updatePrice(Gajxjgwh cond);
}
