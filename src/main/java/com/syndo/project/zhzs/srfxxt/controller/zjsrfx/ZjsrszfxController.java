package com.syndo.project.zhzs.srfxxt.controller.zjsrfx;

import java.util.List;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjsrszfx;
import com.syndo.project.zhzs.srfxxt.service.zjsrfx.IZjsrszfxService;

/**
 * 镇街收入税种分析
 */
@Controller
@RequestMapping("/zhzs/srfxxt/zjsrfx/zjsrszfx")
public class ZjsrszfxController extends BaseController {

	private String prefix = "zhzs/srfxxt/zjsrfx/zjsrszfx";

	@Autowired
	private IZjsrszfxService service;

	@RequiresPermissions("zhzs:srfxxt:zjsrfx:zjsrszfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("qsrq", DateUtils.getYear() + "-01");
		modelMap.put("zzrq", DateUtils.getMonth());
		return prefix + "/zjsrszfx";
	}

	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:zjsrfx:zjsrszfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Zjsrszfx cond) {
		pageTable();
		List<Zjsrszfx> list = service.selectList(cond);
		return getJsonTable(list);
	}

	/**
	 * 导出镇街收入税种分析列表
	 */
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Zjsrszfx cond) {
		List<Zjsrszfx> list = service.selectList(cond);
		ExcelUtil<Zjsrszfx> util = new ExcelUtil<Zjsrszfx>(Zjsrszfx.class);
		return util.exportExcel(list, "镇街收入税种分析");
	}
}
