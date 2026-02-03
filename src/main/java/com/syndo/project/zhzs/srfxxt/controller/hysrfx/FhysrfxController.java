package com.syndo.project.zhzs.srfxxt.controller.hysrfx;

import java.util.ArrayList;
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
import com.syndo.project.zhzs.srfxxt.domain.hysrfx.Fhysrfx;
import com.syndo.project.zhzs.srfxxt.service.hysrfx.IFhysrfxService;

/**
 * 分行业收入分析
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/hysrfx/fhysrfx")
public class FhysrfxController extends BaseController {

	private String prefix = "zhzs/srfxxt/hysrfx/fhysrfx";

	@Autowired
	private IFhysrfxService service;

	@RequiresPermissions("zhzs:srfxxt:hysrfx:fhysrfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("qsrq", DateUtils.getYear()+"-01");
		modelMap.put("zzrq", DateUtils.getMonth());
		return prefix + "/fhysrfx";
	}

	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:hysrfx:fhysrfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Fhysrfx cond) {
		pageTable();
		List<Fhysrfx> list = new ArrayList<Fhysrfx>();
		String sjlx = cond.getTjkj();
		if(sjlx.equals("qkj")){
			list = service.selectHyQkj(cond);
		}
		if(sjlx.equals("ybys")){
			list = service.selectHyYbys(cond);
		}
		return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "财政收入完成情况", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Fhysrfx cond) {
		List<Fhysrfx> list = new ArrayList<Fhysrfx>();
		String sjlx = cond.getTjkj();
		if(sjlx.equals("qkj")){
			list = service.selectHyQkj(cond);
		}
		if(sjlx.equals("ybys")){
			list = service.selectHyYbys(cond);
		}
		ExcelUtil<Fhysrfx> util = new ExcelUtil<Fhysrfx>(Fhysrfx.class);
		return util.exportExcel(list, "分行业收入分析");
	}
}
