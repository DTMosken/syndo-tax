package com.syndo.project.zhzs.dbfxxt.controller.lzlgfx;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Galg;
import com.syndo.project.zhzs.dbfxxt.service.lzlgfx.IGalgybaService;

/**
 * 户籍对比-公安旅馆业备案未在税务注册     旅馆酒店未办理登记
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/lzlgfx/galgyba")
public class GalgybaController extends BaseController {

	private String prefix = "zhzs/dbfxxt/lzlgfx/galgyba";

	@Autowired
	private IGalgybaService service;

	@RequiresPermissions("zhzs:dbfxxt:lzlgfx:galgyba:view")
	@GetMapping
	public String view() {
		return prefix + "/view";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:lzlgfx:galgyba:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Galg entity) {
		pageTable();
		List<Galg> list = service.selectList(entity);
		return getJsonTable(list);
	}


	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult expExcel(Galg entity) {
		List<Galg> list = service.selectList(entity);
		ExcelUtil<Galg> util = new ExcelUtil<Galg>(Galg.class);
		return util.exportExcel(list, "entity");
	}
}
