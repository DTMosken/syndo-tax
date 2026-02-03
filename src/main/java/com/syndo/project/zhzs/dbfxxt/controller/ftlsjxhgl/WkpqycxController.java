package com.syndo.project.zhzs.dbfxxt.controller.ftlsjxhgl;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Wkpqycx;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.IWkpqycxService;

/**
 * 房土两税精细化管理-未开票企业查询
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/wkpqycx")
public class WkpqycxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/ftlsjxhgl/wkpqycx";

	@Autowired
	private IWkpqycxService service;

	@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:wkpqycx:view")
	@GetMapping()
	public String view() {
		return prefix + "/wkpqycx";
	}

	/**
	 * 获取列表
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:wkpqycx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Wkpqycx cond) {
		startPage();
		List<Wkpqycx> list = service.selectList(cond);
		return getDataTable(list);
	}
}
