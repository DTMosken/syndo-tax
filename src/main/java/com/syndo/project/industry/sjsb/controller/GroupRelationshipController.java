package com.syndo.project.industry.sjsb.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.project.industry.sjsb.domain.GroupRelationship;
import com.syndo.project.industry.sjsb.service.GroupRelationshipService;

/**
 * 集团关系
 *
 * @author ykc
 * @date 2020年7月24日
 */
@Controller
@RequestMapping("/module/industry/groupRelationship")
public class GroupRelationshipController extends BaseController {

	private String prefix = "/module/industry/groupRelationship";
	
	@Autowired
	private GroupRelationshipService service;
	
	/**
	 * 初始化页面
	 *
	 * @param modelMap
	 * @return
	 */
	@RequiresPermissions("module:industyr:groupRelationship:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("msg", "success");
		return prefix + "/view";
	}
	
	/**
	 * 查询
	 *
	 * @param entity
	 * @return
	 */
	@PostMapping("/list")
	@ResponseBody
	public String list(GroupRelationship entity) {
		pageTable();
		List<GroupRelationship> list = service.selectList(entity);
		return getJsonTable(list);
	}
	
	/**
	 * 新增页面
	 *
	 * @return
	 */
	@GetMapping("/add")
	public String add() {
		return prefix + "/add";
	}

	/**
	 * 新增保存
	 *
	 * @param entity
	 * @return
	 */
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(@Validated GroupRelationship entity) {
		try {
			return toAjax(service.insert(entity));
		} catch (Exception e) {
			return AjaxResult.error(e.getMessage());
		}
	}

	/**
	 * 修改页面
	 *
	 * @param id
	 * @param mmap
	 * @return
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap modelMap) {
		GroupRelationship entity = service.selectById(id);
		modelMap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 *
	 * @param entity
	 * @return
	 */
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(@Validated GroupRelationship entity) {
		try {
			return toAjax(service.update(entity));
		} catch (Exception e) {
			return AjaxResult.error(e.getMessage());
		}
	}

	/**
	 * 删除
	 *
	 * @param ids
	 * @return
	 */
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(service.deleteByIds(ids));
	}
}
