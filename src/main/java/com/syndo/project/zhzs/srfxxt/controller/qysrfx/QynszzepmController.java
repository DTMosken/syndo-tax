package com.syndo.project.zhzs.srfxxt.controller.qysrfx;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.EasyExcelUtil;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qynsqk;
import com.syndo.project.zhzs.srfxxt.service.qysrfx.IQynsqkService;

/**
 * 企业纳税增长额排名
 * 
 * @author admin
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/qysrfx/qynszzepm")
public class QynszzepmController extends BaseController {

	private String prefix = "zhzs/srfxxt/qysrfx/qynszzepm";

	@Autowired
	private IQynsqkService service;

	@RequiresPermissions("zhzs:srfxxt:qysrfx:qynszzepm:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("qsrq", DateUtils.getYear() + "-01");
		modelMap.put("zzrq", DateUtils.getMonth());
		return prefix + "/qynszzepm";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:qysrfx:qynszzepm:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Qynsqk entity) {
		pageTable();
		List<Qynsqk> list = service.selectZze(entity);
		return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "财政收入完成情况", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Qynsqk cond) {
		try {
			List<Qynsqk> list = service.selectZze(cond);
			EasyExcelUtil<Qynsqk> easyExcelUtil = new EasyExcelUtil<Qynsqk>(Qynsqk.class);
			AjaxResult result = easyExcelUtil.export("企业纳税排名", list);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return error("导出发生未知错误！");
		}
	}

}
