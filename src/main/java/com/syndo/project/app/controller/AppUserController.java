package com.syndo.project.app.controller;

import java.util.List;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.enums.BusinessType;
import com.syndo.project.app.domain.AppUser;
import com.syndo.project.app.service.AppUser2Service;

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
@RequestMapping("/app/appuser")
public class AppUserController extends BaseController {
    private String prefix = "app/appuser";

    @Autowired
	private AppUser2Service service;

    @RequiresPermissions("app:appuser:list")
	@GetMapping()
	public String notice() {
		return prefix + "/view";
	}

    @RequiresPermissions("app:appuser:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(AppUser appuser) {
		startPage();
		List<AppUser> list = service.selectList(appuser);
		return getDataTable(list);
	}

    @GetMapping("/add")
	public String add() {
		return prefix + "/add";
	}

    @RequiresPermissions("app:appuser:add")
	@Log(title = "APP通知", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(AppUser appuser) {
		return toAjax(service.insert(appuser));
	}

    @GetMapping("/edit/{objId}")
	public String edit(@PathVariable("objId") String objId, ModelMap mmap) {
		mmap.put("notice", service.selectById(objId));
		return prefix + "/edit";
	}

    @RequiresPermissions("app:appuser:edit")
	@Log(title = "APP通知", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(AppUser appuser) {
		return toAjax(service.update(appuser));
	}

    @RequiresPermissions("app:appuser:remove")
	@Log(title = "APP通知", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(service.deleteByIds(ids));
	}
    
    @RequiresPermissions("app:appuser:edit")
	@Log(title = "APP通知", businessType = BusinessType.UPDATE)
	@PostMapping("/resetPwd")
	@ResponseBody
	public AjaxResult resetPwd(String userId) {
		return toAjax(service.resetPwd(userId));
	}
}
