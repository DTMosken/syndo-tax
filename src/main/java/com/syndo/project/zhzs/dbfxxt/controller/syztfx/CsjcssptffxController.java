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
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Csjcssptffx;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.ICsjcssptffxService;

/**
 * 城市基础设施配套费分析
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/csjcssptffx")
public class CsjcssptffxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/csjcssptffx";
	
	@Autowired
	public ICsjcssptffxService service;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:csjcssptffx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("ssnd", DateUtils.getYear());
		return prefix + "/csjcssptffx";
	}
	
	/**
	 * 获取列表
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:csjcssptffx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Csjcssptffx entity) {
	    pageTable();
	    List<Csjcssptffx> list = service.selectList(entity);
	    return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "城市配套费纳税分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Csjcssptffx cond) {
		List<Csjcssptffx> list = service.selectList(cond);
		ExcelUtil<Csjcssptffx> util = new ExcelUtil<Csjcssptffx>(Csjcssptffx.class);
		return util.exportExcel(list, "Csjcssptffx");
	}
}
