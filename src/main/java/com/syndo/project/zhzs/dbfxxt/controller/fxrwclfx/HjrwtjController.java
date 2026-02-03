package com.syndo.project.zhzs.dbfxxt.controller.fxrwclfx;

import java.text.ParseException;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.utils.DateUtils;

/**
 * 户籍任务统计
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/fxrwclfx/hjrwtj")
public class HjrwtjController extends BaseController {
	
	private String prefix = "zhzs/dbfxxt/fxrwclfx/hjrwtj";

	@RequiresPermissions("zhzs:dbfxxt:fxrwclfx:hjrwtj:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		modelMap.put("hjrwtj",DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		return prefix + "/view";
	}

}
