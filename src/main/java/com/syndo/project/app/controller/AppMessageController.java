package com.syndo.project.app.controller;

import java.util.List;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.enums.BusinessType;
import com.syndo.project.app.domain.AppMessage;
import com.syndo.project.app.service.AppMessageService;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app/appmessage")
public class AppMessageController extends BaseController {
    private String prefix = "app/appmessage";

    @Autowired
	private AppMessageService service;

    @RequiresPermissions("app:appmessage:list")
	@GetMapping()
	public String notice() {
		return prefix + "/view";
	}

    @RequiresPermissions("app:appmessage:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(AppMessage appmessage) {
		startPage();
		List<AppMessage> list = service.selectList(appmessage);
		return getDataTable(list);
	}

    @GetMapping("/add")
	public String add() {
		return prefix + "/add";
	}

    @RequiresPermissions("app:appmessage:add")
	@Log(title = "APP通知", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(AppMessage appmessage) {
		return toAjax(service.insert(appmessage));
	}

    @GetMapping("/edit/{objId}")
	public String edit(@PathVariable("objId") String objId, ModelMap mmap) {
		mmap.put("notice", service.selectById(objId));
		return prefix + "/edit";
	}

    @RequiresPermissions("app:appmessage:edit")
	@Log(title = "APP通知", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(AppMessage appmessage) {
		return toAjax(service.update(appmessage));
	}

    @RequiresPermissions("app:appmessage:remove")
	@Log(title = "APP通知", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(service.deleteByIds(ids));
	}

}
