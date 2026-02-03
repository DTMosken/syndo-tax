package com.syndo.project.industry.sjsb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syndo.project.industry.zbgzjs.service.IZbkwhService;

/**
 * 企业经济运行监测
 * @author 46406
 *
 */
@Controller
@RequestMapping("/module/industry/Qyjjyxjc")
public class QyjjyxjcController {
	private String prefix = "module/industry/Qyjjyxjc";
	@Autowired
	IZbkwhService service;
	/**
	 * 初始化页面
	 *
	 * @param modelMap
	 * @return
	 */
	@GetMapping()
	public String view() {
		int i =0;
		i++;
		return prefix + "/view";
	}
	
}
