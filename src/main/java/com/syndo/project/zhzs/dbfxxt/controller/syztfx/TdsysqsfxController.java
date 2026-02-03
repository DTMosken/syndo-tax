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
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdsysqsfx;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.ITdsysqsfxService;

/**
 * 土地使用税趋势分析 纳税分析
 * @author mdz
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/tdsysqsfx")
public class TdsysqsfxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/tdsysqsfx";
	
	@Autowired
	private ITdsysqsfxService service;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:tdsysqsfx:view")
	@GetMapping()
	public String view(ModelMap model) {
		model.put("nd", DateUtils.getYear());
		return prefix + "/tdsysqsfx";
	}
	
	/**
	 * 获取列表
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:tdsysqsfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Tdsysqsfx entity) {
		pageTable();
	    List<Tdsysqsfx> list = service.selectList(entity);
	    return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "土地使用税纳税趋势分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Tdsysqsfx cond) {
		List<Tdsysqsfx> list = service.selectList(cond);
		ExcelUtil<Tdsysqsfx> util = new ExcelUtil<Tdsysqsfx>(Tdsysqsfx.class);
		return util.exportExcel(list, "Tdsysqsfx");
	}
	/**
	 * 按年度查询四个季度数据
	 * @param model
	 * @return
	 */
	@RequiresPermissions("zhzs:dbfxxt:syztfx:tdsysqsfx:nianJdView")
	@GetMapping("/nianJdView")
	public String nianJdView(ModelMap model) {
		model.put("nd", DateUtils.getYear());
		return prefix + "/tdsysqsfxNianJd";
	}
	
	/**
	 * 获取列表
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:tdsysqsfx:listNianjd")*/
	@PostMapping("/listNianjd")
	@ResponseBody
	public String listNianjd(Tdsysqsfx entity) {
		pageTable();
	    List<Tdsysqsfx> list = service.selectListNianjd(entity);
	    return getJsonTable(list);
	}
	
}
