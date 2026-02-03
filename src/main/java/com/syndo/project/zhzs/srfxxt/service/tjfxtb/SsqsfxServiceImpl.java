package com.syndo.project.zhzs.srfxxt.service.tjfxtb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.tjfxtb.Ssqsfx;
import com.syndo.project.zhzs.srfxxt.mapper.tjfxtb.SsqsfxMapper;

/**
 * 税收趋势分析
 * 
 * @author mdz
 *
 */
@Service
public class SsqsfxServiceImpl extends BaseService implements ISsqsfxService {

	@Autowired
	private SsqsfxMapper mapper;

	/**
	 * 税收趋势分析
	 */
	@Override
	public JSONObject selectList(Ssqsfx cond) {
		Ssqsfx ssqsfx = mapper.selectData(cond);
		JSONObject json = new JSONObject();
		json.put("zsr", ssqsfx.getZsr());
		json.put("dfsr", ssqsfx.getDfsr());
		json.put("rq", ssqsfx.getRq());
		return json;
	}
}
