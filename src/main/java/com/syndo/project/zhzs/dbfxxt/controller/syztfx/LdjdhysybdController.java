package com.syndo.project.zhzs.dbfxxt.controller.syztfx;

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
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Ldjdhy;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.ILdjdhysybdService;

/**
 * 对比分析系统 - 税源比对 - 酒店行业税源比对
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/ldjdhysybd")
public class LdjdhysybdController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/ldjdhysybd";
	
	@Autowired
	private ILdjdhysybdService service;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:ldjdhysyztfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("skssqq", DateUtils.getYear() + "-01");
		modelMap.put("skssqz", DateUtils.getMonth());
		return prefix + "/ldjdhysybd";
	}
	
	/**
	 * 获取查询列表
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:ldjdhysyztfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Ldjdhy entity) {
		pageTable();
	    if (null == entity.getSkssqq() || null == entity.getSkssqz()) {
	        entity.setSkssqq("2017-01");
	        entity.setSkssqz("2017-03");
	    }
	    List<Ldjdhy> list = service.selectList(entity);
	    return getJsonTable(list);
	}
	/**
	 * 导出
	 */
	@Log(title = "酒店行业分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Ldjdhy cond) {
		List<Ldjdhy> list = service.selectList(cond);
		ExcelUtil<Ldjdhy> util = new ExcelUtil<Ldjdhy>(Ldjdhy.class);
		return util.exportExcel(list, "Ldjdhy");
	}

	@GetMapping("/twoList")
	public String twoList(Ldjdhy entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/twoList";
	}
	
	/**
	 * 二级页面
	 * @param entity
	 * @return
	 */
	@PostMapping("/getTwoList")
	@ResponseBody
	public String getTwoList(Ldjdhy entity) {
		pageTable();
	    List<Ldjdhy> list = service.getTowList(entity);
	    return getJsonTable(list);
	}
	
	@GetMapping("/threeList")
	public String threeList(Ldjdhy entity, ModelMap map) {
	    map.put("entity", entity);
	    return prefix + "/threelist";
	}
	
	/**
	 * 三级页面
	 * @param entity
	 * @return
	 */
	@PostMapping("/getThreeList")
	@ResponseBody
	public String getThreeList(Ldjdhy entity) {
		pageTable();
	    List<Ldjdhy> list = service.getThreeList(entity);
	    return getJsonTable(list);
	}
}
