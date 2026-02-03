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
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdsyxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdzrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdzrsysfx;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.TdzrsysfxService;

/**
 * 土地转让使用税分析
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/tdzrsysfx")
public class TdzrsysfxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/tdzrsysfx";

	@Autowired
	private TdzrsysfxService service;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:tdzrsysfx:view")
	@GetMapping()
	public String view(ModelMap model) {
		model.put("qdrq", DateUtils.getYear());
		return prefix + "/tdzrsysfx";
	}

	/**
	 * 获取列表
	 * 
	 * @param entity
	 * @return
	 */
	/* @RequiresPermissions("zhzs:dbfxxt:syztfx:tdzrsysfx:list") */
	@PostMapping("/list")
	@ResponseBody
	public String list(Tdzrsysfx entity) {
		pageTable();
		List<Tdzrsysfx> list = service.selectList(entity);
		return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "土地转让纳税分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Tdzrsysfx cond) {
		List<Tdzrsysfx> list = service.selectList(cond);
		ExcelUtil<Tdzrsysfx> util = new ExcelUtil<Tdzrsysfx>(Tdzrsysfx.class);
		return util.exportExcel(list, "Tdzrsysfx");
	}

	@GetMapping("/tdxxList")
	public String tdxxList(Tdzrsysfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/tdxxList";
	}
	@PostMapping("/getTdxxList")
	@ResponseBody
	public String getTdxxList(Tdzrsysfx entity) {
		pageTable();
	    List<TdzrTdxx> list = service.getTdxxList(entity);
	    return getJsonTable(list);
	}

	
	@GetMapping("/syxxList")
	public String sysxxList(Tdzrsysfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/syxxList";
	}
	@PostMapping("/getSyxxList")
	@ResponseBody
	public String getSyxxList(Tdzrsysfx entity) {
		pageTable();
	    List<Tdsyxx> list = service.getSyxxList(entity);
	    return getJsonTable(list);
	}

	@GetMapping("/rkxxList")
	public String rkxxList(Tdzrsysfx entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/rkxxList";
	}
	@PostMapping("/getRkxxList")
	@ResponseBody
	public String getRkxxList(Tdzrsysfx entity) {
		pageTable();
	    List<Rkxx> list = service.getRkxxList(entity);
	    return getJsonTable(list);
	}
}
