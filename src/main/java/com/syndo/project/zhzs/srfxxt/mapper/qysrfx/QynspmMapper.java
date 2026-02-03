package com.syndo.project.zhzs.srfxxt.mapper.qysrfx;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qynspm;

/**
 * 企业纳税排名
 * 
 * @author xrc
 *
 */
public interface QynspmMapper extends BaseMapper<Qynspm> {

    List<Qynspm> selectList2(Qynspm entity);

}
