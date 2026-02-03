package com.syndo.project.zhzs.dbfxxt.controller.ftlsjxhgl;

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
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyftxxwhs;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.IQyftxxwhsService;

/**
 * 房土两税精细化管理-企业房土信息未核实
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/qyftxxwhs")
public class QyftxxwhsController extends BaseController {

	private String prefix = "zhzs/dbfxxt/ftlsjxhgl/qyftxxwhs";

	@Autowired
	private IQyftxxwhsService service;

	@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyftxxwhs:view")
	@GetMapping
	public String view() {
		return prefix + "/qyftxxwhs";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyftxxwhs:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Qyftxxwhs cond) {
		startPage();
		List<Qyftxxwhs> list = service.selectList(cond);
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
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyftxxwhs:add")*/
	@Log(title = "保存企业房土信息", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Qyftxxwhs cond) {
		return toAjax(service.insert(cond));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Qyftxxwhs entity = service.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/edit";
	}

	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyftxxwhs:edit")*/
	@Log(title = "修改企业房土信息", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Qyftxxwhs cond) {
		return toAjax(service.update(cond));
	}

	/**
	 * 详细信息
	 */
	@GetMapping("/lookup/{id}")
	public String lookup(@PathVariable("id") String id, ModelMap mmap) {
		Qyftxxwhs entity = service.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/lookup";
	}

	/**
	 * 删除
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyftxxwhs:remove")*/
	@Log(title = "删除企业房土信息", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(service.deleteByIds(ids));
	}

	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyftxxwhs:list")*/
	@GetMapping("/getgsj")
	@ResponseBody
	public Qyftxxwhs getGSJ(Qyftxxwhs cond) {
		return service.getGSJ(cond);
	}

	/**
	 * 查询产权数据
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyftxxwhs:list")*/
	@GetMapping("/getcqsj")
	@ResponseBody
	public Qyftxxwhs getCQSJ(Qyftxxwhs cond) {
		return service.getCQSJ(cond);
	}

	/**
	 * 查询纳税人入库数据
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyftxxwhs:list")*/
	@GetMapping("/getnsrk")
	@ResponseBody
	public Qyftxxwhs getNSRK(Qyftxxwhs cond) {
		return service.getNSRK(cond);
	}
}
