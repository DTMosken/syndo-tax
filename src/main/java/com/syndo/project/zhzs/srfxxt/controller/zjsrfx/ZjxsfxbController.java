package com.syndo.project.zhzs.srfxxt.controller.zjsrfx;

import java.util.List;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.poi.ExcelUtil;
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
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjxsfxb;
import com.syndo.project.zhzs.srfxxt.service.zjsrfx.IZjxsfxbService;

/**
 * 镇街协税分析表
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/zjsrfx/zjxsfxb")
public class ZjxsfxbController extends BaseController {

	private String prefix = "zhzs/srfxxt/zjsrfx/zjxsfxb";

	@Autowired
	private IZjxsfxbService service;

	@RequiresPermissions("zhzs:srfxxt:zjsrfx:zjxsfxb:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("rkrq", DateUtils.getMonth());
		return prefix + "/zjxsfxb";
	}

	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:zjsrfx:zjxsfxb:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(@Validated Zjxsfxb cond) {
		pageTable();
		List<Zjxsfxb> list = service.selectList(cond);
		return getJsonTable(list);
	}

	/**
	 * 导出镇街协税分析列表
	 */
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Zjxsfxb cond) {
		List<Zjxsfxb> list = service.selectList(cond);
		ExcelUtil<Zjxsfxb> util = new ExcelUtil<Zjxsfxb>(Zjxsfxb.class);
		return util.exportExcel(list, "镇街协税分析表");
	}
}
