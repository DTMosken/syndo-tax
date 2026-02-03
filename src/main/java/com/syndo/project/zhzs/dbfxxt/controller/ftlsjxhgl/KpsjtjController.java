package com.syndo.project.zhzs.dbfxxt.controller.ftlsjxhgl;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syndo.common.core.controller.BaseController;

/**
 * 房土两税精细化管理-开票数据统计
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/kpsjtj")
public class KpsjtjController extends BaseController{

	private String prefix = "zhzs/dbfxxt/ftlsjxhgl/kpsjtj";

	@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:kpsjtj:view")
	@GetMapping()
	public String view() {
		return prefix + "/kpsjtj";
	}
}
