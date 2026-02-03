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
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Czsrncjhwh;
import com.syndo.project.zhzs.srfxxt.service.xtwh.ICzsrncjhwhService;

/**
 * 财政收入年初计划维护
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/xtwh/czsrncjhwh")
public class CzsrncjhwhController extends BaseController {

	@Autowired
	private ICzsrncjhwhService service;
	
	/**
	 * 页面跳转地址
	 */
	private String prefix = "zhzs/srfxxt/xtwh/czsrncjhwh";

	/**
	 * 初始化页面
	 * 
	 * @return
	 */
	@RequiresPermissions("zhzs:srfxxt:xtwh:czsrncjhwh:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("ssnd", DateUtils.getYear());
		return prefix + "/view";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:czsrncjhwh:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Czsrncjhwh entity) {
		startPage();
		List<Czsrncjhwh> list = service.selectList(entity);
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
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:czsrncjhwh:add")*/
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Czsrncjhwh entity) {
		return toAjax(service.insert(entity));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Czsrncjhwh entity = service.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:czsrncjhwh:edit")*/
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Czsrncjhwh entity) {
		return toAjax(service.update(entity));
	}

	/**
	 * 删除
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:czsrncjhwh:remove")*/
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(service.deleteByIds(ids));
	}
}
