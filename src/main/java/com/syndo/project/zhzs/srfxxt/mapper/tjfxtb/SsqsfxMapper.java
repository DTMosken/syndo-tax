package com.syndo.project.zhzs.srfxxt.mapper.tjfxtb;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.tjfxtb.Ssqsfx;

/**
 * 税收趋势分析
 * @author mdz
 * @date 2020年4月20日
 */
public interface SsqsfxMapper extends BaseMapper<Ssqsfx> {

	Ssqsfx selectData(Ssqsfx cond);
}
