package com.syndo.project.zhzs.srfxxt.controller.xtwh;

import java.util.List;

import org.apache.commons.lang.StringUtils;
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
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qyssgsqwh;
import com.syndo.project.zhzs.srfxxt.service.xtwh.IQyssgsqwhService;

/**
 * 企业税收归属权维护
 */
@Controller
@RequestMapping("/zhzs/srfxxt/xtwh/qyssgsqwh")
public class QyssgsqwhController extends BaseController {

	private String prefix = "zhzs/srfxxt/xtwh/qyssgsqwh";

	@Autowired
	private IQyssgsqwhService service;

	@RequiresPermissions("zhzs:srfxxt:xtwh:qyssgsqwh:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		return prefix + "/qyssgsqwh";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:qyssgsqwh:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Qyssgsqwh entity) {
		startPage();
		List<Qyssgsqwh> list = service.selectList(entity);
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
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:qyssgsqwh:add")*/
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Qyssgsqwh entity) {
		if(StringUtils.isNotEmpty(entity.getRq())){
			String[] dateTime = entity.getRq().split(" 至 ");
			entity.setKsrq(dateTime[0]);
			entity.setJsrq(dateTime[1]);
		}
		return toAjax(service.insert(entity));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Qyssgsqwh entity = service.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:qyssgsqwh:edit")*/
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Qyssgsqwh entity) {
		if(StringUtils.isNotEmpty(entity.getRq())){
			String[] dateTime = entity.getRq().split(" 至 ");
			entity.setKsrq(dateTime[0]);
			entity.setJsrq(dateTime[1]);
		}
		return toAjax(service.update(entity));
	}

	/**
	 * 删除
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:qyssgsqwh:remove")*/
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(service.deleteByIds(ids, this.getUserId()));
	}
}
