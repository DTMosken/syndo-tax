package com.syndo.project.zhzs.srfxxt.controller.tjfxtb;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.srfxxt.domain.tjfxtb.Ssqsfx;
import com.syndo.project.zhzs.srfxxt.service.tjfxtb.ISsqsfxService;

/**
 * 税收趋势分析
 * @author mdz
 * @date 2020年4月14日
 */
@Controller
@RequestMapping("/zhzs/srfxxt/tjfxtb/ssqsfx")
public class SsqsfxController extends BaseController {

	private String prefix = "zhzs/srfxxt/tjfxtb";

	@Autowired
	private ISsqsfxService service;

	@RequiresPermissions("zhzs:srfxxt:tjfxtb:ssqsfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		return prefix + "/ssqsfx";
	}

	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:tjfxtb:ssqsfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Ssqsfx cond) {
		JSONObject json = new JSONObject();
		String cxsj = DateUtils.getMonth();
		cond.setCxsj(cxsj);
		json = service.selectList(cond);
		return json.toJSONString();
	}
}
