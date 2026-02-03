package com.syndo.project.zhzs.srfxxt.controller.xtwh;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.enums.BusinessType;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qygsjt;
import com.syndo.project.zhzs.srfxxt.service.xtwh.IQygsjtService;

/**
 * 企业归属集团
 */
@Controller
@RequestMapping("/zhzs/srfxxt/xtwh/qygsjt")
public class QygsjtController extends BaseController {

	private String prefix = "zhzs/srfxxt/xtwh/qygsjt";

	@Autowired
	private IQygsjtService service;

	@RequiresPermissions("zhzs:srfxxt:xtwh:qygsjt:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		return prefix + "/qygsjt";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:qygsjt:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Qygsjt entity) {
		startPage();
		List<Qygsjt> list = service.selectList(entity);
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
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:qygsjt:add")*/
	@Log(title = "企业归属集团", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Qygsjt entity) {
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
		Qygsjt entity = service.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:qygsjt:edit")*/
	@Log(title = "企业归属集团", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Qygsjt entity) {
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
	/*@RequiresPermissions("zhzs:srfxxt:xtwh:qygsjt:remove")*/
	@Log(title = "企业归属集团", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(service.deleteByIds(ids, this.getUserId()));
	}
}
