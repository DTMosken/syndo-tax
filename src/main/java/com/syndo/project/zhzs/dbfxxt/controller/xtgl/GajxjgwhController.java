package com.syndo.project.zhzs.dbfxxt.controller.xtgl;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.enums.BusinessType;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Gajxjgwh;
import com.syndo.project.zhzs.dbfxxt.service.xtgl.IGajxjgwhService;

/**
 * 驾校价格维护
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/xtgl/gajxjgwh")
public class GajxjgwhController extends BaseController {

	private String prefix = "zhzs/dbfxxt/xtgl/gajxjgwh";

	@Autowired
	private IGajxjgwhService gajxjgwhService;

	@RequiresPermissions("zhzs:dbfxxt:xtgl:gajxjgwh:view")
	@GetMapping()
	public String view() {
		return prefix + "/gajxjgwh";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:gajxjgwh:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Gajxjgwh cond) {
		startPage();
		List<Gajxjgwh> list = gajxjgwhService.selectList(cond);
		return getDataTable(list);
	}

	/**
	 * 新增
	 */
	@GetMapping("/add")
	public String add() {
		return prefix + "/add";
	}

	/**
	 * 新增保存
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:gajxjgwh:add")*/
	@Log(title = "保存驾校价格", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Gajxjgwh cond) {
		return toAjax(gajxjgwhService.insert(cond));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Gajxjgwh entity = gajxjgwhService.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:gajxjgwh:edit")*/
	@Log(title = "修改驾校价格", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Gajxjgwh cond) {
		return toAjax(gajxjgwhService.update(cond));
	}

	/**
	 * 删除
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:gajxjgwh:remove")*/
	@Log(title = "删除驾校价格", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(gajxjgwhService.deleteByIds(ids));
	}

	/**
	 * 价格维护
	 * 
	 * @return
	 */
	@GetMapping("jgwh")
	public String jgwh() {
		return prefix + "/jgwh";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:gajxjgwh:edit")*/
	@Log(title = "修改驾校价格", businessType = BusinessType.UPDATE)
	@PostMapping("/editPrice")
	@ResponseBody
	public AjaxResult editPrice(Gajxjgwh cond) {
		return toAjax(gajxjgwhService.updatePrice(cond));
	}
}
