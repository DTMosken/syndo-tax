package com.syndo.project.zhzs.dbfxxt.controller.syztfx;

import java.util.List;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.common.annotation.Log;
import com.syndo.common.enums.BusinessType;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdzrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdzrnsfx;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.ITdzrnsfxService;

/**
 * 土地转让契税分析
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/tdzrnsfx")
public class TdzrnsfxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/tdzrnsfx";

	@Autowired
	private ITdzrnsfxService service;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:tdzrnsfx:view")
	@GetMapping()
	public String view(ModelMap model) {
		model.put("qdrq", DateUtils.getYear());
		return prefix + "/tdzrnsfx";
	}

	/**
	 * 获取列表
	 * 
	 * @param entity
	 * @return
	 */
	/* @RequiresPermissions("zhzs:dbfxxt:syztfx:tdzrnsfx:list") */
	@PostMapping("/list")
	@ResponseBody
	public String list(Tdzrnsfx entity) {
		pageTable();
		List<Tdzrnsfx> list = service.selectList(entity);
		return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "土地转让纳税分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Tdzrnsfx cond) {
		List<Tdzrnsfx> list = service.selectList(cond);
		ExcelUtil<Tdzrnsfx> util = new ExcelUtil<Tdzrnsfx>(Tdzrnsfx.class);
		return util.exportExcel(list, "Tdzrnsfx");
	}

	@GetMapping("/tdxxList")
	public String tdxxList(Tdzrnsfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/tdxxList";
	}
	@PostMapping("/getTdxxList")
	@ResponseBody
	public String getTdxxList(Tdzrnsfx entity) {
		pageTable();
	    List<TdzrTdxx> list = service.getTdxxList(entity);
	    return getJsonTable(list);
	}

	@GetMapping("/rkxxList")
	public String rkxxList(Tdzrnsfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/rkxxList";
	}
	@PostMapping("/getRkxxList")
	@ResponseBody
	public String getRkxxList(Tdzrnsfx entity) {
		pageTable();
	    List<Rkxx> list = service.getRkxxList(entity);
	    return getJsonTable(list);
	}
}
