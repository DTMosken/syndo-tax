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
import com.syndo.project.zhzs.srfxxt.domain.szqkfx.Xzsssrzxqk;
import com.syndo.project.zhzs.srfxxt.service.szqkfx.IXzsssrzxqkService;

/**
 * 乡镇税收收入执行情况
 * 
 * @author admin
 * @date 2019-4-23
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/szqkfx/xzsssrzxqk")
public class XzsssrzxqkController extends BaseController {

	private String prefix = "zhzs/srfxxt/szqkfx/xzsssrzxqk";

	@Autowired
	private IXzsssrzxqkService service;

	@RequiresPermissions("zhzs:srfxxt:szqkfx:xzsssrzxqk:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("cxsj", DateUtils.getMonth());
		return prefix + "/xzsssrzxqk";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:szqkfx:xzsssrzxqk:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Xzsssrzxqk entity) {
		startPage();
		List<Xzsssrzxqk> list = service.selectList(entity);
		return getDataTable(list);
	}
}
