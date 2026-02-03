package com.syndo.project.zhzs.xxgxxt.controller;

import java.io.*;
import java.util.Iterator;
import java.util.List;



import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.EasyExcelUtil;
import com.syndo.project.zhzs.xxgxxt.domain.Bsjk;
import com.syndo.project.zhzs.xxgxxt.service.IBsjkService;



/**
 * 报送监控
 * 
 *
 */
@Controller
@RequestMapping("/zhzs/xxgxxt/bsjk")
public class BsjkController<main> extends BaseController {

	private String prefix = "zhzs/xxgxxt/bsjk";

	@Autowired
	private IBsjkService bsjkService;

	@RequiresPermissions("zhzs:bsjk:view")
	@GetMapping()
	public String Bsjk(ModelMap modelMap) {
		modelMap.put("dateTime", DateUtils.getMonth());
		return prefix + "/bsjk";
	}

	/**
	 * 查询列表
	 */
	@RequiresPermissions("zhzs:bsjk:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Bsjk bsjk) {
		startPage();
		if(bsjk != null && StringUtils.isNotEmpty(bsjk.getBsTime())) {
			String[] dateTime = bsjk.getBsTime().split(" 至 ");
			bsjk.setBsTimeStart(dateTime[0]);
			bsjk.setBsTimeEnd(dateTime[1]);
		}
		List<Bsjk> list = bsjkService.selectList(bsjk);
		return getDataTable(list);
	}

	/**
	 * 导出excel
	 * @param
	 * @return
	 */
	@RequiresPermissions("zhzs:bsjk:list")
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult expExcel(Bsjk bsjk) {
		try {
			if(bsjk != null && StringUtils.isNotEmpty(bsjk.getBsTime())) {
				String[] dateTime = bsjk.getBsTime().split(" 至 ");
				bsjk.setBsTimeStart(dateTime[0]);
				bsjk.setBsTimeEnd(dateTime[1]);
			}
			List<Bsjk> list = bsjkService.selectList(bsjk);
			
			// ExcelUtil<S50qynsqk> util = new ExcelUtil<S50qynsqk>(S50qynsqk.class);
			EasyExcelUtil<Bsjk> util = new EasyExcelUtil<>(Bsjk.class);
			return util.export("bsjk", list);
		} catch (Exception e) {
			e.printStackTrace();
			return error("导出发生未知错误！");
		}
	}


}
