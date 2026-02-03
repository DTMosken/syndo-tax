package com.syndo.project.zhzs.dbfxxt.controller.ftlsjxhgl;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Tdsyscefx;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.ITdsyscefxService;

/**
 * 房土两税精细化管理-土地使用税差额分析
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/tdsyscefx")
public class TdsyscefxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/ftlsjxhgl/tdsyscefx";

	@Autowired
	private ITdsyscefxService service;

	@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:tdsyscefx:view")
	@GetMapping()
	public String view() {
		return prefix + "/tdsyscefx";
	}

	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:tdsyscefx:list")*/
	@RequestMapping("/list")
	@ResponseBody
	public TableDataInfo list(Tdsyscefx cond) {
		startPage();
		List<Tdsyscefx> list = service.selectList(cond);
		return getDataTable(list);
	}
}
