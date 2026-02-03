package com.syndo.project.industry.sjsb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.project.industry.sjsb.domain.ResultQuery;
import com.syndo.project.industry.sjsb.service.ResultQueryService;

/**
 * 结果查询
 *
 * @author ykc
 * @date 2020年7月24日
 */
@Controller
@RequestMapping("/module/industry/resultQuery")
public class ResultQueryController extends BaseController {

	private String prefix = "/module/industry/resultQuery";
	
	@Autowired
	private ResultQueryService service;
	
	/**
	 * 初始化页面
	 *
	 * @param modelMap
	 * @return
	 */
	// @RequiresPermissions("module:industyr:resultQuery:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("msg", "success");
		return prefix + "/view";
	}
	
	/**
	 * 查询
	 *
	 * @param entity
	 * @return
	 */
	@PostMapping("/list")
	@ResponseBody
	public String list(ResultQuery entity) {
		pageTable();
		List<ResultQuery> list = service.selectList(entity);
		return getJsonTable(list);
	}
	
	/**
	 * 加载需求调整表
	 *
	 * @param modelMap
	 * @return
	 */
	// @RequiresPermissions("module:industyr:resultQuery:info")
	@GetMapping("/info")
	public String info(ResultQuery entity, ModelMap modelMap) {
		modelMap.put("msg", "success");
		return prefix + "/info";
	}
	
	/**
	 * 加载评价结果
	 *
	 * @param modelMap
	 * @return
	 */
	// @RequiresPermissions("module:industyr:resultQuery:result")
	@GetMapping("/result")
	public String result(ResultQuery entity, ModelMap modelMap) {
		modelMap.put("msg", "success");
		return prefix + "/result";
	}
}
