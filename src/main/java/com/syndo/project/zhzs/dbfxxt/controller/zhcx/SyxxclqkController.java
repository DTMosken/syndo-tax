package com.syndo.project.zhzs.dbfxxt.controller.zhcx;

import java.text.ParseException;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syndo.common.core.controller.BaseController;

/**
 * 税源信息处理情况
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/zhcx/syxxclqk")
public class SyxxclqkController extends BaseController {

	private String prefix = "zhzs/dbfxxt/zhcx/syxxclqk";

	@RequiresPermissions("zhzs:dbfxxt:zhcx:syxxclqk:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		return prefix + "/view";
	}

}
