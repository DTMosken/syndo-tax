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
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjzdqyfx;
import com.syndo.project.zhzs.srfxxt.service.zjsrfx.IZjzdqyfxService;

/**
 * 镇街重点企业分析
 */
@Controller
@RequestMapping("/zhzs/srfxxt/zjsrfx/zjzdqyfx")
public class ZjzdqyfxController extends BaseController {

	private String prefix = "zhzs/srfxxt/zjsrfx/zjzdqyfx";

	@Autowired
	private IZjzdqyfxService service;

	@RequiresPermissions("zhzs:srfxxt:zjsrfx:zjzdqyfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("qsrq", DateUtils.getYear() + "-01");
		modelMap.put("zzrq", DateUtils.getMonth());
		return prefix + "/zjzdqyfx";
	}

	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:zjsrfx:zjzdqyfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(@Validated Zjzdqyfx cond) {
		pageTable();
		List<Zjzdqyfx> list = service.selectList(cond);
		return getJsonTable(list);
	}

	/**
	 * 导出镇街重点企业分析列表
	 */
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Zjzdqyfx cond) {
		List<Zjzdqyfx> list = service.selectList(cond);
		ExcelUtil<Zjzdqyfx> util = new ExcelUtil<Zjzdqyfx>(Zjzdqyfx.class);
		return util.exportExcel(list, "镇街重点企业分析");
	}
}
