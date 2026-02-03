package com.syndo.project.zhzs.srfxxt.controller.qysrfx;

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
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.EasyExcelUtil;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Zdsznsfx;
import com.syndo.project.zhzs.srfxxt.service.qysrfx.IZdsznsfxService;

/**
 * 重点税种纳税分析
 */
@Controller
@RequestMapping("/zhzs/srfxxt/qysrfx/zdsznsfx")
public class ZdsznsfxController extends BaseController {

	private String prefix = "zhzs/srfxxt/qysrfx/zdsznsfx";

	@Autowired
	private IZdsznsfxService service;

	@RequiresPermissions("zhzs:srfxxt:qysrfx:zdsznsfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("qsrq", DateUtils.getYear() + "-01"); 
		modelMap.put("zzrq",DateUtils.getMonth());
		return prefix + "/zdsznsfx";
	}

	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:qysrfx:zdsznsfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Zdsznsfx cond) {
		pageTable();
		List<Zdsznsfx> list = service.selectList(cond);
		return getJsonTable(list);
	}


	/**
	 * 导出重点税种纳税分析列表
	 */
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Zdsznsfx cond) {
		List<Zdsznsfx> list = service.selectList(cond);
		// ExcelUtil<Zdsznsfx> util = new ExcelUtil<Zdsznsfx>(Zdsznsfx.class);
		// return util.exportExcel(list, "cond");
		EasyExcelUtil<Zdsznsfx> util = new EasyExcelUtil<>(Zdsznsfx.class);
		return util.export("Zdnsqyfx", list);
	}
}
