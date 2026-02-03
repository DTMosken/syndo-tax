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
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Lgjdzjb;
import com.syndo.project.zhzs.dbfxxt.service.xtgl.ILgjdzjbService;

/**
 * 旅馆酒店中间表维护
 * 
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/xtgl/lgjdzjbwh")
public class LgjdzjbwhController extends BaseController {

	private String prefix = "zhzs/dbfxxt/xtgl/lgjdzjbwh";

	@Autowired
	private ILgjdzjbService lgjdzjbService;

	@RequiresPermissions("zhzs:dbfxxt:xtgl:lgjdzjbwh:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		return prefix + "/lgjdzjbwh";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:lgjdzjbwh:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Lgjdzjb cond) {
		startPage();
		List<Lgjdzjb> list = lgjdzjbService.selectList(cond);
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
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:lgjdzjbwh:add")*/
	@Log(title = "保存旅馆酒店中间表", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Lgjdzjb cond) {
		return toAjax(lgjdzjbService.insert(cond));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Lgjdzjb entity = lgjdzjbService.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:lgjdzjbwh:edit")*/
	@Log(title = "修改旅馆酒店中间表", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Lgjdzjb cond) {
		return toAjax(lgjdzjbService.update(cond));
	}

	/**
	 * 删除示例
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:lgjdzjbwh:remove")*/
	@Log(title = "删除旅馆酒店中间表", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(lgjdzjbService.deleteByIds(ids));
	}
}
