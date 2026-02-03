package com.syndo.project.zhzs.dbfxxt.controller.zhcx;

import java.text.ParseException;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syndo.common.core.controller.BaseController;

/**
 * 户籍信息处理情况
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/zhcx/hjxxclqk")
public class HjxxclqkController extends BaseController {

	private String prefix = "zhzs/dbfxxt/zhcx/hjxxclqk";

	@RequiresPermissions("zhzs:dbfxxt:zhcx:hjxxclqk:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		return prefix + "/view";
	}

}
