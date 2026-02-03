package com.syndo.project.industry.sjsb.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.project.industry.sjsb.domain.PolicyAdvice;
import com.syndo.project.industry.sjsb.service.PolicyAdviceService;

/**
 * 政策建议
 *
 * @author ykc
 * @date 2020年7月24日
 */
@Controller
@RequestMapping("/module/industry/policyAdvice")
public class PolicyAdviceController extends BaseController {

	private String prefix = "/module/industry/policyAdvice";
	
	@Autowired
	private PolicyAdviceService service;
	
	/**
	 * 初始化页面并带入表单值
	 *
	 * @param modelMap
	 * @return
	 */
	@RequiresPermissions("module:industyr:policyAdvice:view")
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
	public String list(PolicyAdvice entity) {
		pageTable();
		List<PolicyAdvice> list = service.selectList(entity);
		return getJsonTable(list);
	}
	
	/**
	 * 下载
	 * @param id
	 * @return
	 */
	@GetMapping("/download")
	@ResponseBody
	public AjaxResult download(String id) {
		return service.download(id);
	}
}
