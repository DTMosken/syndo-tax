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
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.QynsqkxjlExcel;
import com.syndo.project.zhzs.srfxxt.service.qysrfx.IQynsqkService;

/**
 * 企业纳税下降额排名
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/qysrfx/qynsxjepm")
public class QynsxjepmController extends BaseController {

	private String prefix = "zhzs/srfxxt/qysrfx/qynsxjepm";

	@Autowired
	private IQynsqkService service;

	@RequiresPermissions("zhzs:srfxxt:qysrfx:qynsxjepm:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("qsrq", DateUtils.getYear() + "-01");
		modelMap.put("zzrq", DateUtils.getMonth());
		return prefix + "/qynsxjepm";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:qysrfx:qynsxjepm:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(QynsqkxjlExcel entity) {
		pageTable();
		List<QynsqkxjlExcel> list = service.selectXje(entity);
		return getJsonTable(list);
	}


	/**
	 * 导出
	 */
	@Log(title = "财政收入完成情况", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(QynsqkxjlExcel cond) {
		try {
			List<QynsqkxjlExcel> list = service.selectXje(cond);
			EasyExcelUtil<QynsqkxjlExcel> easyExcelUtil = new EasyExcelUtil<QynsqkxjlExcel>(QynsqkxjlExcel.class);
			AjaxResult result = easyExcelUtil.export("企业纳税排名", list);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return error("导出发生未知错误！");
		}
	}
}
