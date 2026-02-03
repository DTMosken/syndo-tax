package com.syndo.project.zhzs.srfxxt.controller.xtwh;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Wrqyknsr;
import com.syndo.project.zhzs.srfxxt.service.xtwh.WrqyknsrService;


/**
 * 未入企业库纳税人
 *
 * @author ykc
 * @date 2020年6月17日
 */
@Controller
@RequestMapping("/zhzs/srfxxt/xtwh/wrqyknsr")
public class WrqyknsrController extends BaseController {

	private String prefix = "zhzs/srfxxt/xtwh//wrqyknsr";
	
	@Autowired
	private WrqyknsrService service;
	@Autowired
	private BomExcelUtils excelUtils;
	
	@RequiresPermissions("zhzs:srfxxt:xtwh:wrqyknsr:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("dateTimeStart", DateUtils.getYear() + "-01-01");
		modelMap.put("dateTimeEnd", DateUtils.getDate());
		return prefix + "/view";
	}

	/**
	 * 查询列表
	 * @param entity
	 * @return
	 */
	@RequiresPermissions("zhzs:srfxxt:xtwh:wrqyknsr:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Wrqyknsr entity) {
		startPage();
		List<Wrqyknsr> list = service.selectList(entity);
		return getDataTable(list);
	}
	
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult expExcel(Wrqyknsr entity) {
		try {
			List<Wrqyknsr> list = service.selectList(entity);
			return excelUtils.expExcel("wrqyknsr", list);
		} catch (Exception e) {
			e.printStackTrace();
			return error("导出发生未知错误！");
		}
	}
}
