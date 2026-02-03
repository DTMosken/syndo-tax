package com.syndo.project.zhzs.srfxxt.controller.czsrfx;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.srfxxt.domain.czsrfx.Fjcsssr;
import com.syndo.project.zhzs.srfxxt.service.czsrfx.IFjcsssrService;

/**
 * 分级次税收收入
 * @author mdz
 */
@Controller
@RequestMapping("/zhzs/srfxxt/czsrfx/fjcsssr")
public class FjcsssrController extends BaseController {

	private String prefix = "zhzs/srfxxt/czsrfx/fjcsssr";

	@Autowired
	private IFjcsssrService service;

	@RequiresPermissions("zhzs:srfxxt:czsrfx:fjcsssr:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("rkrq", DateUtils.getMonth());
		return prefix + "/fjcsssr";
	}
	
	/**
	 * 查询列表
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:czsrfx:fjcsssr:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Fjcsssr cond) {
		pageTable();
		List<Fjcsssr> list = service.selectList(cond);
		return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "分级次税收收入", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Fjcsssr cond) {
		List<Fjcsssr> list = service.selectList(cond);
		ExcelUtil<Fjcsssr> util = new ExcelUtil<Fjcsssr>(Fjcsssr.class);
		return util.exportExcel(list, "分级次税收收入");
	}
}
