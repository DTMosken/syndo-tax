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
 * 税务任务统计
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/fxrwclfx/swrwtj")
public class SwrwtjController extends BaseController {
	
	private String prefix = "zhzs/dbfxxt/fxrwclfx/swrwtj";

	@RequiresPermissions("zhzs:dbfxxt:fxrwclfx:swrwtj:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		modelMap.put("swrwtj",DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		return prefix + "/view";
	}

}
