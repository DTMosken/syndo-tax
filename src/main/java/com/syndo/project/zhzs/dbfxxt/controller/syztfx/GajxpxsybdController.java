package com.syndo.project.zhzs.dbfxxt.controller.syztfx;

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
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Gajxpxsybd;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.IGajxpxsybdService;

/**
 * 驾培行业 公安驾校培训税源比对
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/gajxpxsybd")
public class GajxpxsybdController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/gajxpxsybd";

	@Autowired
	private IGajxpxsybdService gajxpxsybdservice;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:gajxpxsyztfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("cxsjq", DateUtils.getYear() + "-01");
		modelMap.put("cxsjz", DateUtils.getMonth());
		return prefix + "/gajxpxsybd";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:gajxpxsyztfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Gajxpxsybd gajxpxsybd) {
		pageTable();
		List<Gajxpxsybd> list = gajxpxsybdservice.selectList(gajxpxsybd);
		return   getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "驾培行业分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Gajxpxsybd cond) {
		List<Gajxpxsybd> list = gajxpxsybdservice.selectList(cond);
		ExcelUtil<Gajxpxsybd> util = new ExcelUtil<Gajxpxsybd>(Gajxpxsybd.class);
		return util.exportExcel(list, "Gajxpxsybd");
	}

	/**
	 * 二级页面
	 * 
	 * @return
	 */
	@GetMapping("/twoList")
	public String twoList(ModelMap map, Gajxpxsybd cond) {
		map.put("jxmc", cond.getJxmc());
		map.put("cxsjq", cond.getCxsjq());
		map.put("cxsjz", cond.getCxsjz());
		return prefix + "/twoList";
	}

	@PostMapping("/getTwoList")
	@ResponseBody
	public String getTwoList(Gajxpxsybd cond) {
		pageTable();
		List<Gajxpxsybd> list = gajxpxsybdservice.getTwoList(cond);
		return   getJsonTable(list);
	}

	/**
	 * 三级页面
	 * 
	 * @return
	 */
	@GetMapping("/threeList")
	public String threeList(ModelMap map, Gajxpxsybd entity) {
		map.put("entity", entity);
		return prefix + "/threeList";
	}

	@PostMapping("/getThreeList")
	@ResponseBody
	public String getThreeList(Gajxpxsybd cond) {
		pageTable();
		List<Gajxpxsybd> list = gajxpxsybdservice.getThreeList(cond);
		return   getJsonTable(list);
	}
}
