package com.syndo.project.zhzs.dbfxxt.controller.syztfx;

import java.io.UnsupportedEncodingException;
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
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Sbybsybd;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.ISbybsybdService;

/**
 * 药店行业 社保医保刷卡税源比对  药店行业分析
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/sbybsybd")
public class SbybsybdController extends BaseController {
	@Autowired
    private ISbybsybdService service;
	/**
	 * 页面跳转地址
	 */
	private String prefix = "zhzs/dbfxxt/syztfx/sbybsybd";

	/**
	 * 初始化页面
	 * @return
	 */
	@RequiresPermissions("zhzs:dbfxxt:syztfx:sbybsyztfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("ssqq", DateUtils.getYear() + "-01");
		modelMap.put("ssqz", DateUtils.getMonth());
		modelMap.put("skjecj", "1");
		return prefix + "/sbybsybd";
	}

	/**
	 * 查询数据
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:sbybsyztfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Sbybsybd entity) {
		pageTable();
        List<Sbybsybd> list = service.selectList(entity);
		return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "药店行业分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Sbybsybd cond) {
		List<Sbybsybd> list = service.selectList(cond);
		ExcelUtil<Sbybsybd> util = new ExcelUtil<Sbybsybd>(Sbybsybd.class);
		return util.exportExcel(list, "Sbybsybd");
	}
	/**
	 * 二级页面
	 * @param vo
	 * @param model
	 * @return
	 * @throws UnsupportedEncodingException
	 */

	@GetMapping("/twoList")
	public String twoList(Sbybsybd vo, ModelMap model) throws UnsupportedEncodingException{
		// 因二次传入导致后台接收乱码  所以先将数据转换为字符串
		model.put("ydmc", vo.getYdmc());
		model.put("skssqq", vo.getSkssqq());
		model.put("skssqz", vo.getSkssqz());
		model.put("xsje", vo.getXsje());
		model.put("type", vo.getType());
		model.put("cedy", vo.getCedy());
		model.put("cexy", vo.getCexy());
		return prefix + "/twoList";
	}
	
	@PostMapping("/getTwoList")
	@ResponseBody
	public String getTwoList(Sbybsybd entity){
		pageTable();
        List<Sbybsybd> list = service.getTwoList(entity);
		return getJsonTable(list);
	}

	@GetMapping("/threeList")
	public String threeList(Sbybsybd vo, ModelMap model) throws UnsupportedEncodingException{
		model.put("ydmc", vo.getYdmc());
		model.put("sj", vo.getSj());
		return prefix + "/threeList";
	}
	

	@PostMapping("/getThreeList")
	@ResponseBody
	public String getThreeList(Sbybsybd entity){
		pageTable();
        List<Sbybsybd> list = service.getThreeList(entity);
		return getJsonTable(list);
	}
}
