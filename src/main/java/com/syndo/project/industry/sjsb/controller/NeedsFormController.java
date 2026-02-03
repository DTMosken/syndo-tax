package com.syndo.project.industry.sjsb.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
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
import com.syndo.project.industry.sjsb.domain.NeedsForm;
import com.syndo.project.industry.sjsb.service.NeedsFormService;

/**
 * 需求调查表
 *
 * @author ykc
 * @date 2020年7月22日
 */
@Controller
@RequestMapping("/module/industry/needsForm")
public class NeedsFormController extends BaseController {

	private String prefix = "/module/industry/needsForm";
	
	@Autowired
	private NeedsFormService service;
	
	/**
	 * 初始化页面并带入表单值
	 *
	 * @param modelMap
	 * @return
	 */
	@RequiresPermissions("module:industyr:needsForm:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		NeedsForm nf = service.getNeedsForm();
		modelMap.put("entity", nf);
		return prefix + "/view";
	}

	/**
	 * 保存需求表信息
	 *
	 * @param entity
	 * @return
	 */
	@PostMapping("/save")
	@ResponseBody
	public AjaxResult save(@Validated NeedsForm entity) {
		try {
			return toAjax(service.save(entity));
		} catch (Exception e) {
			return AjaxResult.error(e.getMessage());
		}
	}
	
}
