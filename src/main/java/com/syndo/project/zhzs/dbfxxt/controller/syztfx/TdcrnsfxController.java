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
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrPtfxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdcrnsfx;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.ITdcrnsfxService;

/**
 * 土地出让契税分析
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/tdcrnsfx")
public class TdcrnsfxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/tdcrnsfx";
	
	@Autowired
	private ITdcrnsfxService service;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:tdcrnsfx:view")
	@GetMapping()
	public String view(ModelMap model) {
		model.put("qdrq", DateUtils.getYear());
		return prefix + "/tdcrnsfx";
	}
	
	/**
	 * 获取列表
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:tdcrnsfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Tdcrnsfx entity) {
		pageTable();
	    List<Tdcrnsfx> list = service.selectList(entity);
	    return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "土地出让契税分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Tdcrnsfx cond) {
		List<Tdcrnsfx> list = service.selectList(cond);
		ExcelUtil<Tdcrnsfx> util = new ExcelUtil<Tdcrnsfx>(Tdcrnsfx.class);
		return util.exportExcel(list, "Tdcrnsfx");
	}

	@GetMapping("/tdxxList")
	public String tdxxList(Tdcrnsfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/tdxxList";
	}
	@PostMapping("/getTdxxList")
	@ResponseBody
	public String getTdxxList(Tdcrnsfx entity) {
		pageTable();
	    List<TdcrTdxx> list = service.getTdxxList(entity);
	    return getJsonTable(list);
	}

	
	@GetMapping("/ptfxxList")
	public String ptfxxList(Tdcrnsfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/ptfxxList";
	}
	@PostMapping("/getPtfxxList")
	@ResponseBody
	public String getPtfxxList(Tdcrnsfx entity) {
		pageTable();
	    List<TdcrPtfxx> list = service.getPtfxxList(entity);
	    return getJsonTable(list);
	}

	@GetMapping("/rkxxList")
	public String rkxxList(Tdcrnsfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/rkxxList";
	}
	@PostMapping("/getRkxxList")
	@ResponseBody
	public String getRkxxList(Tdcrnsfx entity) {
		pageTable();
	    List<Rkxx> list = service.getRkxxList(entity);
	    return getJsonTable(list);
	}
}
