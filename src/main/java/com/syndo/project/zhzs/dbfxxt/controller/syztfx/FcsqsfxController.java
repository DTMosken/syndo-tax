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
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Fcsqsfx;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.IFcsqsfxService;

/**
 * 房产税趋势分析 纳税分析
 * 
 * @author mdz
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/fcsqsfx")
public class FcsqsfxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/fcsqsfx";
	
	@Autowired
	private IFcsqsfxService service;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:fcsqsfx:view")
	@GetMapping()
	public String view(ModelMap model) {
		model.put("nd", DateUtils.getYear());
		return prefix + "/fcsqsfx";
	}
	
	/**
	 * 获取列表
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:fcsqsfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Fcsqsfx entity) {
	    pageTable();
	    List<Fcsqsfx> list = service.selectList(entity);
	    return getJsonTable(list);
	}


	/**
	 * 导出
	 */
	@Log(title = "房产税税纳税趋势分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Fcsqsfx cond) {
		List<Fcsqsfx> list = service.selectList(cond);
		ExcelUtil<Fcsqsfx> util = new ExcelUtil<Fcsqsfx>(Fcsqsfx.class);
		return util.exportExcel(list, "Fcsqsfx");
	}
	
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:fcsqsfx:viewJd")*/
	@GetMapping("/viewJd")
	public String viewJd(ModelMap model) {
		model.put("nd", DateUtils.getYear());
		return prefix + "/fcsqsfxByJd";
	}
	
	/**
	 * 获取列表
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:fcsqsfx:listByJd")*/
	@PostMapping("/listByJd")
	@ResponseBody
	public TableDataInfo listByJd(Fcsqsfx entity) {
	    startPage();
	    List<Fcsqsfx> list = service.selectListByJd(entity);
	    return getDataTable(list);
	}
}
