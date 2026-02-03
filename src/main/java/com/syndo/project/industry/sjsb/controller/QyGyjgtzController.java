package com.syndo.project.industry.sjsb.controller;

import java.util.Calendar;
import java.util.List;

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
import com.syndo.common.enums.BusinessType;
import com.syndo.project.industry.sjsb.domain.QyGyjgtz;
import com.syndo.project.industry.sjsb.service.QyGyjgtzService;

/**
 * 工业技改投资Controller
 *
 * @author admin
 * @date 2021-01-22
 */
@Controller
@RequestMapping("/module/industry/gyjgtz")
public class QyGyjgtzController extends BaseController {
	private String prefix = "module/industry/gyjgtz";

	@Autowired
	private QyGyjgtzService tQyGyjgtzService;

//	@RequiresPermissions("module:industyr:gyjgtz:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("msg", "success");
		return prefix + "/view";
	}

	/**
	 * 查询工业技改投资列表
	 */
//	@RequiresPermissions("module:industyr:gyjgtz:list")
	@PostMapping("/list")
	@ResponseBody
	public String list(QyGyjgtz tQyGyjgtz) {
		pageTable();
		System.out.println(getSysUser().getUserId());
		tQyGyjgtz.setShxydm(getSysUser().getLoginName());
		List<QyGyjgtz> list = tQyGyjgtzService.selectQyGyjgtzList(tQyGyjgtz);
		return getJsonTable(list);
	}
	/**
	 * 新增工业技改投资
	 */
	@GetMapping("/add")
	public String add() {
		return prefix + "/add";
	}

	/**
	 * 新增保存工业技改投资
	 */
//	@RequiresPermissions("module:industyr:gyjgtz:add")
	@Log(title = "工业技改投资", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(QyGyjgtz tQyGyjgtz) {
		Calendar cal = Calendar.getInstance();
		tQyGyjgtz.setNf(cal.get(Calendar.YEAR)+"");
		tQyGyjgtz.setShxydm(getSysUser().getLoginName());
		return toAjax(tQyGyjgtzService.insertQyGyjgtz(tQyGyjgtz));
	}

	/**
	 * 修改工业技改投资
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		QyGyjgtz qyGyjgtz = tQyGyjgtzService.selectQyGyjgtzById(id);
		mmap.put("qyGyjgtz", qyGyjgtz);
		return prefix + "/edit";
	}

	/**
	 * 修改保存工业技改投资
	 */
//	@RequiresPermissions("module:industyr:gyjgtz:edit")
	@Log(title = "工业技改投资", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(QyGyjgtz tQyGyjgtz) {
		return toAjax(tQyGyjgtzService.updateQyGyjgtz(tQyGyjgtz));
	}

	/**
	 * 删除工业技改投资
	 */
//	@RequiresPermissions("module:industyr:gyjgtz:remove")
	@Log(title = "工业技改投资", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(tQyGyjgtzService.deleteQyGyjgtzByIds(ids));
	}
}
