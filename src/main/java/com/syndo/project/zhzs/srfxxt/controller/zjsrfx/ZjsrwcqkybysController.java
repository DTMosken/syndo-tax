package com.syndo.project.zhzs.srfxxt.controller.zjsrfx;

import java.util.List;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.poi.ExcelUtil;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjsrwcqkybys;
import com.syndo.project.zhzs.srfxxt.service.zjsrfx.IZjsrwcqkService;
import com.syndo.project.zhzs.srfxxt.service.zjsrfx.IZjsrwcqkybysService;

/**
 * 镇街收入完成情况（一般预算）
 */
@Controller
@RequestMapping("/zhzs/srfxxt/zjsrfx/zjsrwcqkybys")
public class ZjsrwcqkybysController extends BaseController {

	private String prefix = "zhzs/srfxxt/zjsrfx/zjsrwcqkybys";

	@Autowired
	private IZjsrwcqkybysService service;
	@Autowired
	private IZjsrwcqkService zjsrwcqkService;

	@RequiresPermissions("zhzs:srfxxt:zjsrfx:zjsrwcqkybys:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("rkrq", DateUtils.getMonth());
		modelMap.put("zsxm", zjsrwcqkService.selectZsxm());
		return prefix + "/zjsrwcqkybys";
	}

	/**
	 * 查询列表
	 * （一般预算）
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:zjsrfx:zjsrwcqkybys:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(@Validated Zjsrwcqkybys cond) {
		// pageTable();
		if(StringUtils.isNotEmpty(cond.getZsxm())){
			cond.setZsxmList(cond.getZsxm().split(","));
		}
		List<Zjsrwcqkybys> list = service.selectList(cond);
		return getJsonTable(list);
	}


	/**
	 * 导出镇街收入完成情况(一般预算)列表
	 */
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Zjsrwcqkybys cond) {
		List<Zjsrwcqkybys> list = service.selectList(cond);
		ExcelUtil<Zjsrwcqkybys> util = new ExcelUtil<Zjsrwcqkybys>(Zjsrwcqkybys.class);
		return util.exportExcel(list, "镇街收入完成情况（一般预算）");
	}
}
