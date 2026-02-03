package com.syndo.project.zhzs.dbfxxt.controller.syztfx;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Cztdsysfx;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.CztdsysfxService;
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

/**
 * 城镇土地使用税比对分析
 * 
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/cztdsysfx")
public class CztdsysfxController extends BaseController {
	private String prefix = "zhzs/dbfxxt/syztfx/cztdsysfx";

	@Autowired
	private CztdsysfxService service;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:cztdsysfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("skssqq", DateUtils.getYear() + "-01");
		modelMap.put("skssqz", DateUtils.getMonth());
		return prefix + "/cztdsysfx";
	}

	/**
	 * 查询列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public String list(Cztdsysfx entity) {
		pageTable();
		List<Cztdsysfx> list = service.selectList(entity);
		return getJsonTable(list);
	}

	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Cztdsysfx cond) {
		List<Cztdsysfx> list = service.selectList(cond);
		ExcelUtil<Cztdsysfx> util = new ExcelUtil<Cztdsysfx>(Cztdsysfx.class);
		return util.exportExcel(list, "cond");
	}

}
