package com.syndo.project.zhzs.srfxxt.controller.zjsrfx;

import java.util.List;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.poi.ExcelUtil;

import org.apache.commons.lang.StringUtils;
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
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjsrwcqk;
import com.syndo.project.zhzs.srfxxt.service.zjsrfx.IZjsrwcqkService;

/**
 * 镇街收入完成情况(全口径)
 */
@Controller
@RequestMapping("/zhzs/srfxxt/zjsrfx/zjsrwcqk")
public class ZjsrwcqkController extends BaseController {

	private String prefix = "zhzs/srfxxt/zjsrfx/zjsrwcqk";

	@Autowired
	private IZjsrwcqkService service;

	@RequiresPermissions("zhzs:srfxxt:zjsrfx:zjsrwcqk:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("rkrq", DateUtils.getMonth());
		modelMap.put("zsxm", service.selectZsxm());
		return prefix + "/zjsrwcqk";
	}

	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:zjsrfx:zjsrwcqk:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(@Validated Zjsrwcqk cond) {
		// pageTable();
		if(StringUtils.isNotEmpty(cond.getZsxm())){
			cond.setZsxmList(cond.getZsxm().split(","));
		}
		List<Zjsrwcqk> list = service.selectList(cond);
		return getJsonTable(list);
	}

	/**
	 * 导出镇街收入完成情况(全口径)列表
	 */
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Zjsrwcqk cond) {
		List<Zjsrwcqk> list = service.selectList(cond);
		ExcelUtil<Zjsrwcqk> util = new ExcelUtil<Zjsrwcqk>(Zjsrwcqk.class);
		return util.exportExcel(list, "镇街收入完成情况（全口径）");
	}
}
