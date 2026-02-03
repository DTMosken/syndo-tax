package com.syndo.project.zhzs.xxgxxt.controller;

import java.text.ParseException;
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
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.xxgxxt.domain.Fenshu;
import com.syndo.project.zhzs.xxgxxt.service.IJxglService;

/**
 * 绩效排名
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/xxgxxt/jxpm")
public class JxpmController extends BaseController {

	private String prefix = "zhzs/xxgxxt/jxpm";

	@Autowired
	private IJxglService jxglService;
	
	@RequiresPermissions("zhzs:jxpm:view")
	@GetMapping()
	public String Jxpm(ModelMap modelMap) throws ParseException {
		modelMap.put("khrq", DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		return prefix + "/jxpm";
	}
	
	@RequiresPermissions("zhzs:jxpm:view")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo List(Fenshu f) {
		startPage();
		if(null == f.getKhrq()) {
			f.setKhrq(DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		}
		List<Fenshu> list = jxglService.getpmFenshu(f);
		return getDataTable(list);
	}
}
