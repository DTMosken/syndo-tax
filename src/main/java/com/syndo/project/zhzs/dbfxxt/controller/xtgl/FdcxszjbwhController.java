package com.syndo.project.zhzs.dbfxxt.controller.xtgl;

import java.text.ParseException;
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

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Fdcxszjb;
import com.syndo.project.zhzs.dbfxxt.service.xtgl.IFdcxszjbService;

/**
 * 房地产销售中间表维护
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/xtgl/fdcxszjbwh")
public class FdcxszjbwhController extends BaseController {

	private String prefix = "zhzs/dbfxxt/xtgl/fdcxszjbwh";

	@Autowired
	private IFdcxszjbService fdcxszjbService;

	@RequiresPermissions("zhzs:dbfxxt:xtgl:fdcxszjbwh:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		modelMap.put("fdcxszjbwh", DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		return prefix + "/fdcxszjbwh";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:fdcxszjbwh:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Fdcxszjb cond) {
		startPage();
		List<Fdcxszjb> list = fdcxszjbService.selectList(cond);
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
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:fdcxszjbwh:add")*/
	@Log(title = "保存房地产销售中间表", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Fdcxszjb cond) {
		return toAjax(fdcxszjbService.insert(cond));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Fdcxszjb entity = fdcxszjbService.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:fdcxszjbwh:edit")*/
	@Log(title = "修改房地产销售中间表", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Fdcxszjb cond) {
		return toAjax(fdcxszjbService.update(cond));
	}

	/**
	 * 删除示例
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:fdcxszjbwh:remove")*/
	@Log(title = "删除房地产销售中间表", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(fdcxszjbService.deleteByIds(ids));
	}
}
