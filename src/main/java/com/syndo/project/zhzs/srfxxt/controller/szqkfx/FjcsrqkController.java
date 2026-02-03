package com.syndo.project.zhzs.srfxxt.controller.szqkfx;

import java.util.List;

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
import com.syndo.project.zhzs.srfxxt.domain.szqkfx.Fjcsrqk;
import com.syndo.project.zhzs.srfxxt.service.szqkfx.IFjcsrqkService;

/**
 * 分级次收入情况
 * 
 * @author admin
 * @date 2019-4-23
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/szqkfx/fjcsrqk")
public class FjcsrqkController extends BaseController {

	private String prefix = "zhzs/srfxxt/szqkfx/fjcsrqk";

	@Autowired
	private IFjcsrqkService service;

	@RequiresPermissions("zhzs:srfxxt:szqkfx:fjcsrqk:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("cxsj", DateUtils.getMonth());
		return prefix + "/fjcsrqk";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:szqkfx:fjcsrqk:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Fjcsrqk entity) {
		startPage();
		List<Fjcsrqk> list = service.selectList(entity);
		return getDataTable(list);
	}
}
