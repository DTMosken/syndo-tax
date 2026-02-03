package com.syndo.project.zhzs.czjbmfg.controller;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.StringUtils;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.etl.common.constant.EtlConstants;
import com.syndo.etl.dataimp.service.DataImpService;
import com.syndo.etl.meta.domain.MetaData;
import com.syndo.etl.meta.utils.MetaCacheUtils;
import com.syndo.project.zhzs.czjbmfg.domain.Czglzxkhzjff;
import com.syndo.project.zhzs.czjbmfg.domain.Czzxzjbf;
import com.syndo.project.zhzs.czjbmfg.service.ICzjbmfgService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 财政局分管部门---------财政专项资金拨付
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/czjbmfg/czzxzjbf")
public class CzzxzjbfController extends BaseController{

	private String prefix = "zhzs/czjbmfg/czzxzjbf";

	@Autowired
	private ICzjbmfgService service;

	@Autowired
	private DataImpService dataImpService;

	@Autowired
	private MetaCacheUtils mateCache;

	public CzzxzjbfController() {
	}


	@RequiresPermissions("czjbmfg:czzxzjbf:view")
	@GetMapping("/{gucode}")
	public String role(@PathVariable("gucode") String gucode, ModelMap map) {
		MetaData meta = mateCache.getMetaCache(gucode);
		map.put("meta", meta);
		return prefix + "/view";
	}

	@RequiresPermissions("czjbmfg:czzxzjbf:list")
	@PostMapping({"/list"})
	@ResponseBody
	public TableDataInfo list(Czzxzjbf czzxzjbf) {
		startPage();
		List<Czzxzjbf> lists = service.selectCzzxzjbfList(czzxzjbf);
		return getDataTable(lists);
	}

	@RequiresPermissions("czjbmfg:czzxzjbf:addView")
	@GetMapping("/add")
	public String add(ModelMap mmap) {
		mmap.addAttribute("userid",ShiroUtils.getSysUser().getUserId());
		mmap.addAttribute("loginName",ShiroUtils.getSysUser().getLoginName());
		return prefix + "/add";
	}

	/**
	 * 新增保存
	 */
	@RequiresPermissions("czjbmfg:czzxzjbf:add")
	@Log(title = "新增保存", businessType = BusinessType.INSERT)
	@PostMapping("/addSave")
	@ResponseBody
	public AjaxResult addSave(@Validated Czzxzjbf czzxzjbf) {
		int i = service.insertCzzxzjbf(czzxzjbf);
		if(i>0){
			return AjaxResult.success("保存成功");
		}else{
			return AjaxResult.error("保存失败");
		}
	}

	/**
	 * 修改
	 */
	@RequiresPermissions("czjbmfg:czzxzjbf:editView")
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String khid, ModelMap mmap) {
		if(StringUtils.isNotBlank(khid)){
			Czzxzjbf cz = service.selectCzzxzjbfById(khid);
			mmap.addAttribute("czzxzjbf",cz);
		}
		return prefix + "/edit";
	}


	/**
	 * 修改保存
	 */
	//@RequiresPermissions("czjbmfg:czzxzjbf:edit")
	@Log(title = "财政专项资金拨付", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(@Validated Czzxzjbf cz) {
		String id = cz.getId();
		Integer i = service.updateCzzxzjbf(cz);
		if(i>0){
			return AjaxResult.success("修改成功");
		}else{
			return AjaxResult.error("修改失败");
		}
	}

	@RequiresPermissions("czjbmfg:czzxzjbf:remove")
	@Log(title = "财政专项资金拨付", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		String[] split = ids.split(",");
		if(StringUtils.isNotBlank(ids)){
			Integer i = service.deleteCzzxzjbfByIds(split);
			if(i>0){
				return AjaxResult.success("删除成功");
			}else{
				return AjaxResult.error("删除失败");
			}
		}else{
			return AjaxResult.error("未获取到参数");
		}

	}

	/**
	 * 鉴权
	 *
	 * @param permission 权限标识
	 * @param gucode 全局标识
	 */
	public void checkPermission(String permission, String gucode) {
		if (StringUtils.isNotEmpty(gucode)) {
			permission = "module:dataImp" + ":" + gucode + ":" + permission;
			SecurityUtils.getSubject().checkPermission(permission);
		}
	}


	/**
	 * 导出
	 */
	@Log(title = "财政专项资金拨付", businessType = BusinessType.EXPORT)
	@PostMapping("/excel")
	@ResponseBody
	public AjaxResult export(Czzxzjbf cond) {

		try {
			List<Czzxzjbf> list = service.selectCzzxzjbfList(cond);
			if (list.size() > 0) {
				ExcelUtil<Czzxzjbf> util = new ExcelUtil<Czzxzjbf>(Czzxzjbf.class);
				return util.exportExcel(list, "Czzxzjbf");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}
}
