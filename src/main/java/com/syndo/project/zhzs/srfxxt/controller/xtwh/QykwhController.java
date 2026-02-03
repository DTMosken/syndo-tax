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
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qykwh;
import com.syndo.project.zhzs.srfxxt.service.xtwh.QykwhService;
import com.syndo.etl.excel.util.*;



/**
 * 企业库维护
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/xtwh/qykwh")
public class QykwhController extends BaseController {

	@Autowired
	private QykwhService service;
	@Autowired
	private BomExcelUtils excelUtils;

	/**
	 * 页面跳转地址
	 */
	private String prefix = "zhzs/srfxxt/xtwh/qykwh";

	/**
	 * 初始化页面
	 * 
	 * @return
	 */
	@RequiresPermissions("zhzs:srfxxt:xtwh:qykwh:view")
	@GetMapping()
	public String view() {
		return prefix + "/view";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	@RequiresPermissions("zhzs:srfxxt:xtwh:qykwh:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Qykwh entity) {
		startPage();
		List<Qykwh> list = service.selectList(entity);
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
	@RequiresPermissions("zhzs:srfxxt:xtwh:qykwh:add")
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Qykwh entity) {
		return toAjax(service.insert(entity));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Qykwh entity = service.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	@RequiresPermissions("zhzs:srfxxt:xtwh:qykwh:edit")
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Qykwh entity) {
		return toAjax(service.update(entity));
	}

	/**
	 * 删除
	 */
	@RequiresPermissions("zhzs:srfxxt:xtwh:qykwh:remove")
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(service.deleteByIds(ids, this.getUserId()));
	}
	
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult expExcel(Qykwh entity) {
		try {
			List<Qykwh> list = service.selectList(entity);
			return excelUtils.expExcel("qyk", list);
		} catch (Exception e) {
			e.printStackTrace();
			return error("导出发生未知错误！");
		}
	}
}
