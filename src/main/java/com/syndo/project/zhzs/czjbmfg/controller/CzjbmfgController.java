package com.syndo.project.zhzs.czjbmfg.controller;

import com.syndo.common.annotation.Log;
import com.syndo.common.constant.UserConstants;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.domain.entity.User;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.StringUtils;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.common.utils.text.Convert;
import com.syndo.etl.common.constant.EtlConstants;
import com.syndo.etl.dataimp.service.DataImpService;
import com.syndo.etl.meta.domain.MetaData;
import com.syndo.etl.meta.utils.MetaCacheUtils;
import com.syndo.framework.shiro.util.AuthorizationUtils;
import com.syndo.project.zhzs.czjbmfg.domain.Czglzxkhzjff;
import com.syndo.project.zhzs.czjbmfg.service.ICzjbmfgService;
import com.syndo.project.zhzs.gcxmxt.domain.ajsfcx.Ajsfcx;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 财政局分管部门---------财政管理专项考核资金发放
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/czjbmfg/czglzxkhzjff")
public class CzjbmfgController extends BaseController{

	private String prefix = "zhzs/czjbmfg/czglzxkhzjff";

	@Autowired
	private ICzjbmfgService service;

	@Autowired
	private DataImpService dataImpService;

	@Autowired
	private MetaCacheUtils mateCache;

	public CzjbmfgController() {
	}


	@RequiresPermissions("czjbmfg:czglzxkhzjff:view")
	@GetMapping("/{gucode}")
	public String role(@PathVariable("gucode") String gucode, ModelMap map) {
		MetaData meta = mateCache.getMetaCache(gucode);
		map.put("meta", meta);
		return prefix + "/view";
	}

	@RequiresPermissions("czjbmfg:czglzxkhzjff:list")
	@PostMapping({"/list"})
	@ResponseBody
	public TableDataInfo list(Czglzxkhzjff czglzxkhzjff) {
		startPage();
		List<Czglzxkhzjff> lists = service.selectList(czglzxkhzjff);
		return getDataTable(lists);
	}

	@RequiresPermissions("czjbmfg:czglzxkhzjff:addView")
	@GetMapping("/add")
	public String add(ModelMap mmap) {
		mmap.addAttribute("userid",ShiroUtils.getSysUser().getUserId());
		mmap.addAttribute("loginName",ShiroUtils.getSysUser().getLoginName());
		return prefix + "/add";
	}

	/**
	 * 新增保存
	 */
	//@RequiresPermissions("czjbmfg:czglzxkhzjff:add")
	@Log(title = "新增保存", businessType = BusinessType.INSERT)
	@PostMapping("/addSave")
	@ResponseBody
	public AjaxResult addSave(@Validated Czglzxkhzjff czglzxkhzjff) {
		int i = service.insertCzglzxkhzjff(czglzxkhzjff);
		if(i>0){
			return AjaxResult.success("保存成功");
		}else{
			return AjaxResult.error("保存失败");
		}
	}

	/**
	 * 修改
	 */
	@RequiresPermissions("czjbmfg:czglzxkhzjff:editView")
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String khid, ModelMap mmap) {
		if(StringUtils.isNotBlank(khid)){
			Czglzxkhzjff cz = service.selectCzglzxkhzjffById(khid);
			mmap.addAttribute("czglzxkhzjff",cz);
		}
		return prefix + "/edit";
	}


	/**
	 * 修改保存
	 */
	//@RequiresPermissions("czjbmfg:czglzxkhzjff:edit")
	@Log(title = "财政各类专项考核资金发放", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(@Validated Czglzxkhzjff cz) {
		String id = cz.getId();
		Integer i = service.updateCzglzxkhzjff(cz);
		if(i>0){
			return AjaxResult.success("修改成功");
		}else{
			return AjaxResult.error("修改失败");
		}
	}

	@RequiresPermissions("czjbmfg:czglzxkhzjff:remove")
	@Log(title = "财政各类专项考核资金发放", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		String[] split = ids.split(",");
		if(StringUtils.isNotBlank(ids)){
			Integer i = service.deleteKhzjffByIds(split);
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
	@Log(title = "财政各类专项考核资金发放", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Czglzxkhzjff cond) {

		try {
			List<Czglzxkhzjff> list = service.selectList(cond);
			if (list.size() > 0) {
				ExcelUtil<Czglzxkhzjff> util = new ExcelUtil<Czglzxkhzjff>(Czglzxkhzjff.class);
				return util.exportExcel(list, "Czglzxkhzjff");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}
}
