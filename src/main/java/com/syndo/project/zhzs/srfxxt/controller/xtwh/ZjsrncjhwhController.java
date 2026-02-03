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
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Zjsrncjhwh;
import com.syndo.project.zhzs.srfxxt.service.xtwh.IZjsrncjhwhService;

/**
 * 镇街收入年初计划维护
 * 
 * @author ykc
 * @date 2020年4月21日
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/xtwh/zjsrncjhwh")
public class ZjsrncjhwhController extends BaseController {

	@Autowired
	private IZjsrncjhwhService service;
	/**
	 * 页面跳转地址
	 */
	private String prefix = "zhzs/srfxxt/xtwh/zjsrncjhwh";

	/**
	 * 初始化页面
	 * 
	 * @return
	 */
	@RequiresPermissions("zhzs:srfxxt:xtwh:zjsrncjhwh:view")
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
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:zjsrncjhwh:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Zjsrncjhwh entity) {
		startPage();
		List<Zjsrncjhwh> list = service.selectList(entity);
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
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:zjsrncjhwh:add")*/
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Zjsrncjhwh entity) {
		return toAjax(service.insert(entity));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Zjsrncjhwh entity = service.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:zjsrncjhwh:edit")*/
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Zjsrncjhwh entity) {
		return toAjax(service.update(entity));
	}

	/**
	 * 删除
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:zjsrncjhwh:remove")*/
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(service.deleteByIds(ids));
	}
}
