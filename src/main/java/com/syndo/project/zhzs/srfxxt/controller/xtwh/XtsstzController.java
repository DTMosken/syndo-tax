package com.syndo.project.zhzs.srfxxt.controller.xtwh;

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

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Xtsstz;
import com.syndo.project.zhzs.srfxxt.service.xtwh.IXtsstzService;

/**
 * 协调税收调整
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/xtwh/xtsstz")
public class XtsstzController extends BaseController {

	private String prefix = "zhzs/srfxxt/xtwh/xtsstz";

	@Autowired
	private IXtsstzService service;

	@RequiresPermissions("zhzs:srfxxt:xtwh:xtsstz:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		return prefix + "/xtsstz";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:xtsstz:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Xtsstz entity) {
		startPage();
		List<Xtsstz> list = service.selectList(entity);
		return getDataTable(list);
	}

	/**
	 * 新增
	 */
	@GetMapping("/add")
	public String add(ModelMap mmap) {
		mmap.put("tzyf", DateUtils.getMonth());
		return prefix + "/add";
	}

	/**
	 * 新增保存
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:xtsstz:add")*/
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Xtsstz entity) {
		return toAjax(service.insert(entity));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Xtsstz entity = service.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:xtsstz:edit")*/
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Xtsstz entity) {
		return toAjax(service.update(entity));
	}

	/**
	 * 删除
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:xtsstz:remove")*/
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(service.deleteByIds(ids));
	}
}
