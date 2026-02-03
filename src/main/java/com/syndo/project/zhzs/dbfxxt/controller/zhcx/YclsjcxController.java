package com.syndo.project.zhzs.dbfxxt.controller.zhcx;

import java.text.ParseException;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syndo.common.core.controller.BaseController;

/**
 * 已处理数据查询
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/zhcx/yclsjcx")
public class YclsjcxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/zhcx/yclsjcx";

	@RequiresPermissions("zhzs:dbfxxt:zhcx:yclsjcx:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		return prefix + "/view";
	}

}
