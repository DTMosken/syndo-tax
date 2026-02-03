package com.syndo.project.zhzs.srfxxt.controller.czsrfx;

import java.util.Calendar;
import java.util.Date;
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
// import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.EasyExcelUtil;
import com.syndo.project.zhzs.srfxxt.domain.czsrfx.Czsrwcqk;
import com.syndo.project.zhzs.srfxxt.service.czsrfx.ICzsrwcqkService;

/**
 * 财政收入完成情况
 * 
 * @author mdz
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/czsrfx/czsrwcqk")
public class CzsrwcqkController extends BaseController {

	private String prefix = "zhzs/srfxxt/czsrfx/czsrwcqk";

	@Autowired
	private ICzsrwcqkService service;

	@RequiresPermissions("zhzs:srfxxt:czsrfx:czsrwcqk:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		Date date = DateUtils.offset(Calendar.MONTH, -1);
		String dateTime = DateUtils.parseDateToMonth(date);
		modelMap.put("rkrq", dateTime);
		/*modelMap.put("yskm", service.selectYskm());*/
		return prefix + "/czsrwcqk";
	}
	
	/**
	 * 查询列表
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:czsrfx:czsrwcqk:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Czsrwcqk cond) {
		pageTable();
		List<Czsrwcqk> list = service.selectList(cond);
		return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "财政收入完成情况", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Czsrwcqk cond) {
		try {
			List<Czsrwcqk> list = service.selectList(cond);
			EasyExcelUtil<Czsrwcqk> easyExcelUtil = new EasyExcelUtil<Czsrwcqk>(Czsrwcqk.class);
			AjaxResult result = easyExcelUtil.export("财政收入完成情况", list);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return error("导出发生未知错误！");
		}
	}
}
