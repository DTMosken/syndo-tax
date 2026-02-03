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
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qyssszfx;
import com.syndo.project.zhzs.srfxxt.service.qysrfx.IQyssszfxService;

/**
 * 企业税种税收分析
 * 
 * @author mdz
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/qysrfx/qyssszfx")
public class QyssszfxController extends BaseController {

	private String prefix = "zhzs/srfxxt/qysrfx/qyssszfx";

	@Autowired
	private IQyssszfxService service;

	@RequiresPermissions("zhzs:srfxxt:qysrfx:qyssszfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("qsrq", DateUtils.getYear() + "-01");
		modelMap.put("zzrq", DateUtils.getMonth());
		return prefix + "/qyssszfx";
	}
	
	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	@PostMapping("/list")
	@ResponseBody
	public String list(Qyssszfx cond) {
		pageTable();
		List<Qyssszfx> list = service.selectList(cond);
		return getJsonTable(list);
	}
	
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult expExcel(Qyssszfx entity) {
		List<Qyssszfx> list = service.selectList(entity);
		ExcelUtil<Qyssszfx> util = new ExcelUtil<Qyssszfx>(Qyssszfx.class);
		return util.exportExcel(list, "企业税收税种分析");
	}
}
