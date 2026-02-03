package com.syndo.project.zhzs.srfxxt.service.tjfxtb;

import com.alibaba.fastjson.JSONObject;
import com.syndo.project.zhzs.srfxxt.domain.tjfxtb.Ssqsfx;

/**
 * 税收趋势分析
 * @author mdz
 * @date 2020年4月20日
 */
public interface ISsqsfxService {
	JSONObject selectList(Ssqsfx cond);
}
