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
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Zdnsqyfx;
import com.syndo.project.zhzs.srfxxt.service.qysrfx.IZdnsqyfxService;

/**
 * 重点纳税企业分析
 */
@Controller
@RequestMapping("/zhzs/srfxxt/qysrfx/zdnsqyfx")
public class ZdnsqyfxController extends BaseController {

	private String prefix = "zhzs/srfxxt/qysrfx/zdnsqyfx";

	@Autowired
	private IZdnsqyfxService service;

	@RequiresPermissions("zhzs:srfxxt:qysrfx:zdnsqyfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("qsrq", DateUtils.getYear() + "-01"); 
		modelMap.put("zzrq", DateUtils.getMonth());
		return prefix + "/zdnsqyfx";
	}

	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:qysrfx:zdnsqyfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Zdnsqyfx cond) {
		pageTable();
		List<Zdnsqyfx> list = service.selectList(cond);
		return getJsonTable(list);
	}

	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Zdnsqyfx cond) {
		List<Zdnsqyfx> list = service.selectList(cond);
		ExcelUtil<Zdnsqyfx> util = new ExcelUtil<Zdnsqyfx>(Zdnsqyfx.class);
		return util.exportExcel(list, "重点纳税企业分析");
	}
}
