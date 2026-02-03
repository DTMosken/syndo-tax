package com.syndo.project.industry.zbgzjs.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.domain.Ztree;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.project.industry.sjsb.domain.Flml;
import com.syndo.project.industry.zbgzjs.domain.ZbGzk;
import com.syndo.project.industry.zbgzjs.domain.ZtreeImpl;
import com.syndo.project.industry.zbgzjs.service.ZbGzkService;

/**
 * 指标规则库
 *
 */
@Controller
@RequestMapping("/module/industry/zbGzk")
public class ZbGzkController extends BaseController {
	private String prefix = "industry/zbgzjs/zbGzk";

	@Autowired
	private ZbGzkService service;

	@RequiresPermissions("module:industry:zbGzk:view")
	@GetMapping()
	public String view() {
		return prefix + "/view";
	}

	/**
	 * 规则分类树
	 * 
	 * @return
	 */
	@GetMapping("/treeData")
	@ResponseBody
	public List<Ztree> treeData(String lx) {
		return service.selectFlmlTree(lx);
	}

	/**
	 * 行业树
	 * 
	 * @return
	 */
	@GetMapping("/hyTreeData")
	@ResponseBody
	public List<ZtreeImpl> hyTreeData() {
		return service.selectHyTree();
	}

	@PostMapping("/hyDynamicTreeData")
	@ResponseBody
	public List<ZtreeImpl> hyDynamicTreeData(String id) {
		return service.selectHyDynamicTree(id);
	}

	/**
	 * 指标树
	 */
	@PostMapping("/zbDynamicTreeData")
	@ResponseBody
	public List<ZtreeImpl> zbDynamicTreeData(String id) {
		return service.selectZbDynamicTree(id);
	}

	/**
	 * 规则分类新增
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/flmlAdd")
	public String flmlAdd(ModelMap model) {
		model.put("id", service.getUUID());
		return prefix + "/flmlAdd";
	}

	/**
	 * 规则分类新增保存
	 * 
	 * @param vo
	 * @return
	 */
	@PostMapping("/flmlAdd")
	@ResponseBody
	public AjaxResult flmlAddSave(Flml vo) {
		return service.insertFlml(vo);
	}

	/**
	 * 规则分类修改
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@GetMapping("/flmlEdit")
	public String flmlEdit(ModelMap model, String id) {
		model.put("model", service.selectFlmlById(id));
		return prefix + "/flmlEdit";
	}

	/**
	 * 规则分类修改保存
	 * 
	 * @param vo
	 * @return
	 */
	@PostMapping("/flmlEdit")
	@ResponseBody
	public AjaxResult flmlEditSave(Flml vo) {
		return service.editFlml(vo);
	}

	/**
	 * 规则分类删除
	 * 
	 * @param id
	 * @return
	 */
	@PostMapping("/flmlDelete")
	@ResponseBody
	public AjaxResult flmlDelete(String id) {
		return service.deleteFlmlById(id);
	}

	/**
	 * 查询规则库列表
	 * 
	 * @param entity
	 * @return
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(ZbGzk entity) {
		startPage();
		List<ZbGzk> list = service.selectList(entity);
		return getDataTable(list);
	}

	/**
	 * 新增规则库
	 * 
	 * @param mmap
	 * @return
	 */
	@GetMapping("/zbgzkAdd")
	public String zbgzkAdd(ModelMap model, String flmlid) {
		model.put("id", service.getUUID());
		model.put("flmlid", flmlid);
		Flml flml = service.selectFlmlById(flmlid);
		model.put("flmc", flml != null ? flml.getMlmc() : "");
		return prefix + "/zbgzkAdd";
	}

	/**
	 * 新增规则库保存
	 * 
	 * @param vo
	 * @return
	 */
	@PostMapping("/zbgzkAdd")
	@ResponseBody
	public AjaxResult zbgzkAddSave(ZbGzk vo) {
		return toAjax(service.insertZbGzk(vo));
	}

	/**
	 * 修改规则库
	 * 
	 * @param mmap
	 * @return
	 */
	@GetMapping("/zbgzkEdit/{id}")
	public String zbgzkEdit(ModelMap model, @PathVariable("id") String id) {
		model.put("model", service.selectZbGzkById(id));
		return prefix + "/zbgzkEdit";
	}

	/**
	 * 新增规则库保存
	 * 
	 * @param vo
	 * @return
	 */
	@PostMapping("/zbgzkEdit")
	@ResponseBody
	public AjaxResult zbgzkEditSave(ZbGzk vo) {
		return toAjax(service.editZbGzk(vo));
	}

	@PostMapping("/zbgzkRemove")
	@ResponseBody
	public AjaxResult zbgzkRemove(String ids) {
		return toAjax(service.deleteZbgzkByIds(ids));
	}

	/**
	 * 修改有效状态
	 * 
	 * @param vo
	 * @return
	 */
	@PostMapping("/changeYxbz")
	@ResponseBody
	public AjaxResult changeYxbz(ZbGzk vo) {
		return toAjax(service.changeYxbz(vo));
	}

	/**
	 * 指标规则库分组列表
	 * 
	 * @param entity
	 * @return
	 */
	@PostMapping("/zbgzkfzList")
	@ResponseBody
	public TableDataInfo zbgzkfzList(ZbGzk entity) {
		startPage();
		List<ZbGzk> list = service.selectZbgzkfzList(entity);
		return getDataTable(list);
	}

	/**
	 * 指标规则库分组新增
	 * 
	 * @param model
	 * @param flmlid
	 * @return
	 */
	@GetMapping("/zbgzkfzAdd")
	public String zbgzkfzAdd(ModelMap model, String gzid) {
		model.put("fzid", service.getUUID());
		model.put("gzid", gzid);
		return prefix + "/zbgzkfzAdd";
	}

	@PostMapping("/zbgzkfzAdd")
	@ResponseBody
	public AjaxResult zbgzkfzAddSave(ZbGzk vo) {
		return toAjax(service.insertZbGzkfz(vo));
	}

	@GetMapping("/zbgzkfzEdit/{fzid}")
	public String zbgzkfzEdit(ModelMap model, @PathVariable("fzid") String fzid) {
		model.put("model", service.selectZbGzkfzByFzid(fzid));
		return prefix + "/zbgzkfzEdit";
	}

	@PostMapping("/zbgzkfzEdit")
	@ResponseBody
	public AjaxResult zbgzkfzEditSave(ZbGzk vo) {
		return toAjax(service.editZbGzkfz(vo));
	}

	@PostMapping("/zbgzkfzRemove")
	@ResponseBody
	public AjaxResult zbgzkfzRemove(String ids) {
		return toAjax(service.deleteZbgzkfzByFzid(ids));
	}

	@PostMapping("/zbgzkfzUp")
	@ResponseBody
	public AjaxResult zbgzkfzUp(String fzid) {
		return toAjax(service.zbgzkfzUp(fzid));
	}

	@PostMapping("/zbgzkfzDown")
	@ResponseBody
	public AjaxResult zbgzkfzDown(String fzid) {
		return toAjax(service.zbgzkfzDown(fzid));
	}

	/**
	 * 指标规则库分组明细列表
	 * 
	 * @param entity
	 * @return
	 */
	@PostMapping("/zbgzkfzmxList")
	@ResponseBody
	public TableDataInfo zbgzkfzmxList(String fzid) {
		startPage();
		List<ZbGzk> list = service.selectZbgzkfzmxList(fzid);
		return getDataTable(list);
	}
	/**
	 * 指标规则库分组明细新增
	 * 
	 * @param model
	 * @param flmlid
	 * @return
	 */
	@GetMapping("/zbgzkfzmxAdd")
	public String zbgzkfzmxAdd(ModelMap model, String fzid, String gzid) {
		model.put("id", service.getUUID());
		model.put("fzid", fzid);
		model.put("gzid", gzid);
		return prefix + "/zbgzkfzmxAdd";
	}

	@PostMapping("/zbgzkfzmxAdd")
	@ResponseBody
	public AjaxResult zbgzkfzmxAddSave(ZbGzk vo) {
		return toAjax(service.insertZbGzkfzmx(vo));
	}

	@GetMapping("/zbgzkfzmxEdit/{id}")
	public String zbgzkfzmxEdit(ModelMap model, @PathVariable("id") String id) {
		model.put("model", service.selectZbGzkfzmxById(id));
		return prefix + "/zbgzkfzmxEdit";
	}

	@PostMapping("/zbgzkfzmxEdit")
	@ResponseBody
	public AjaxResult zbgzkfzmxEditSave(ZbGzk vo) {
		return toAjax(service.editZbGzkfzmx(vo));
	}

	@PostMapping("/zbgzkfzmxRemove")
	@ResponseBody
	public AjaxResult zbgzkfzmxRemove(String ids) {
		return toAjax(service.deleteZbgzkfzmxById(ids));
	}

	@PostMapping("/zbgzkfzmxUp")
	@ResponseBody
	public AjaxResult zbgzkfzmxUp(String id) {
		return toAjax(service.zbgzkfzmxUp(id));
	}

	@PostMapping("/zbgzkfzmxDown")
	@ResponseBody
	public AjaxResult zbgzkfzmxDown(String id) {
		return toAjax(service.zbgzkfzmxDown(id));
	}

	@PostMapping("/checkZbid")
	@ResponseBody
	public AjaxResult checkZbid(@RequestParam("fzid") String fzid, @RequestParam("zbid") String zbid, @RequestParam(value = "id", required = false) String id) {
		return service.checkZbid(fzid, zbid, id);
	}
}
