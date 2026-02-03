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
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdcrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdcrnsfx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdcrsysfx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdsyxx;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.TdcrsysfxService;

/**
 * 土地出让使用税分析
 * 
 * @author wym
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/tdcrsysfx")
public class TdcrsysfxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/tdcrsysfx";

	@Autowired
	private TdcrsysfxService service;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:tdcrsysfx:view")
	@GetMapping()
	public String view(ModelMap model) {
		model.put("qdrq", DateUtils.getYear());
		return prefix + "/tdcrsysfx";
	}

	/**
	 * 获取列表
	 * 
	 * @param entity
	 * @return
	 */
	/* @RequiresPermissions("zhzs:dbfxxt:syztfx:tdcrsysfx:list") */
	@PostMapping("/list")
	@ResponseBody
	public String list(Tdcrsysfx entity) {
		pageTable();
		List<Tdcrsysfx> list = service.selectList(entity);
		return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "土地出让纳税分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Tdcrsysfx cond) {
		List<Tdcrsysfx> list = service.selectList(cond);
		ExcelUtil<Tdcrsysfx> util = new ExcelUtil<Tdcrsysfx>(Tdcrsysfx.class);
		return util.exportExcel(list, "Tdcrsysfx");
	}

	@GetMapping("/tdxxList")
	public String tdxxList(Tdcrsysfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/tdxxList";
	}
	@PostMapping("/getTdxxList")
	@ResponseBody
	public String getTdxxList(Tdcrsysfx entity) {
		pageTable();
	    List<TdcrTdxx> list = service.getTdxxList(entity);
	    return getJsonTable(list);
	}

	
	@GetMapping("/syxxList")
	public String sysxxList(Tdcrsysfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/syxxList";
	}
	@PostMapping("/getSyxxList")
	@ResponseBody
	public String getSyxxList(Tdcrsysfx entity) {
		pageTable();
	    List<Tdsyxx> list = service.getSyxxList(entity);
	    return getJsonTable(list);
	}

	@GetMapping("/rkxxList")
	public String rkxxList(Tdcrsysfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/rkxxList";
	}
	@PostMapping("/getRkxxList")
	@ResponseBody
	public String getRkxxList(Tdcrsysfx entity) {
		pageTable();
	    List<Rkxx> list = service.getRkxxList(entity);
	    return getJsonTable(list);
	}
}
