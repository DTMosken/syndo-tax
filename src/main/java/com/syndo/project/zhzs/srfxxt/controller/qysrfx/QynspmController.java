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

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.EasyExcelUtil;
import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qynspm;
import com.syndo.project.zhzs.srfxxt.service.qysrfx.IQynspmService;

/**
 * 企业纳税排名
 * 
 * @author admin
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/qysrfx/qynspm")
public class QynspmController extends BaseController {

	private String prefix = "zhzs/srfxxt/qysrfx/qynspm";

	@Autowired
	private IQynspmService service;
	
	@RequiresPermissions("zhzs:srfxxt:qysrfx:qynspm:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("qsrq", DateUtils.getYear() + "-01");
		modelMap.put("zzrq", DateUtils.getMonth());
		return prefix + "/qynspm";
	}

	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:qysrfx:qynspm:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Qynspm entity) {
		pageTable();
		List<Qynspm> list = service.selectList(entity);
		return getJsonTable(list);
	}
	
	/**
	 * 导出excel
	 * @param entity
	 * @return
	 */
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult expExcel(Qynspm entity) {
		try {
			List<Qynspm> list = service.selectList(entity);
			EasyExcelUtil<Qynspm> easyExcelUtil = new EasyExcelUtil<Qynspm>(Qynspm.class);
			AjaxResult result = easyExcelUtil.export("企业纳税排名", list);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return error("导出发生未知错误！");
		}
	}
}
