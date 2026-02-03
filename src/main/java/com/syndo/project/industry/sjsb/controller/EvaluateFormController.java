package com.syndo.project.industry.sjsb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.project.industry.sjsb.domain.EvaluateForm;
import com.syndo.project.industry.sjsb.service.EvaluateFormService;

/**
 * 
 * @ClassName: EvaluateFormController
 * @Description： 亩均评价表 
 * @author ykc
 * @date 2020-8-19
 *
 */
@Controller
@RequestMapping("/module/industry/evaluateForm")
public class EvaluateFormController extends BaseController {

	private String prefix = "/module/industry/evaluateForm";
	
	@Autowired
	private EvaluateFormService service;
	
	/**
	 * 
	 * @Title: view
	 * @Description: 初始化页面
	 * @param @param modelMap
	 * @param @return
	 * @return String
	 * @throws
	 */
	// @RequiresPermissions("module:industyr:evaluateForm:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		return service.initView(modelMap, prefix);
	}
	
	/**
	 * 保存评价表信息
	 *
	 * @param entity
	 * @return
	 */
	@PostMapping("/save")
	@ResponseBody
	public AjaxResult save(@Validated EvaluateForm entity) {
		return service.save(entity);
	}
}
