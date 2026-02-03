package com.syndo.project.zhzs.dbfxxt.controller.syztfx;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syndo.common.core.controller.BaseController;

/**
 * 土地增值税清算提醒
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/tdzzsqstx")
public class TdzzsqstxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/tdzzsqstx";

	@RequiresPermissions("zhzs:dbfxxt:syztfx:tdzzsqstx:view")
	@GetMapping()
	public String view() {
		return prefix + "/tdzzsqstx";
	}
}
