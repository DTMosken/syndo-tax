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
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Jyzskzjb;
import com.syndo.project.zhzs.dbfxxt.service.xtgl.IJyzskzjbService;
 

/**
 * 加油站税控中间表
 * 
 * @author hry
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/xtgl/jyzskzjbwh")
public class JyzskzjbController extends BaseController {
	private String prefix = "zhzs/dbfxxt/xtgl/jyzskzjbwh";

	@Autowired
	private IJyzskzjbService jyskzjbService;

	@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzskzjb:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		modelMap.put("jyzskzjbwh", DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		return prefix + "/jyzskzjbwh";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzskzjbwh:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Jyzskzjb cond) {
		startPage();
		List<Jyzskzjb> list = jyskzjbService.selectList(cond);
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
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzskzjbwh:add")*/
	@Log(title = "保存房地产销售中间表", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Jyzskzjb cond) {
		return toAjax(jyskzjbService.insert(cond));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Jyzskzjb entity = jyskzjbService.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzskzjbwh:edit")*/
	@Log(title = "修改房地产销售中间表", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Jyzskzjb cond) {
		return toAjax(jyskzjbService.update(cond));
	}

	/**
	 * 删除示例
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzskzjbwh:remove")*/
	@Log(title = "删除房地产销售中间表", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(jyskzjbService.deleteByIds(ids));
	}
}
