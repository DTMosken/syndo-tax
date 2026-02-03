package com.syndo.project.zhzs.xxgxxt.controller;

import java.text.ParseException;
import java.util.List;

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
import com.syndo.project.zhzs.xxgxxt.domain.Bstj;
import com.syndo.project.zhzs.xxgxxt.service.IBstjService;

/**
 * 报送统计
 *
 */
@Controller
@RequestMapping("/zhzs/xxgxxt/bstj")
public class BstjController extends BaseController {

	private String prefix = "zhzs/xxgxxt/bstj";

	@Autowired
	private IBstjService bstjService;

	@RequiresPermissions("zhzs:bstj:view")
	@GetMapping()
	public String Bstj(ModelMap modelMap, Bstj bstj) throws ParseException {
		Bstj tjjg = bstjService.getTjsj(bstj);
		List<Bstj> rzList = bstjService.getBsrz(bstj);
		modelMap.put("tjjg", tjjg);
		modelMap.put("rzList", rzList);
		return prefix + "/bstj";
	}

	//@RequiresPermissions("zhzs:bstj:list")
	@PostMapping("/getChartData")
	@ResponseBody
	public String getChartData(Bstj bstj) {
		JSONObject result = new JSONObject();
		try {
			JSONObject json = bstjService.getChartData(bstj);
			result.put("data", json);
			result.put("code", "0");
			result.put("msg", "成功");
		} catch (Exception e) {
			result.put("code", "500");
			result.put("msg", e.getMessage());
		}
		return result.toJSONString();
	}

}
