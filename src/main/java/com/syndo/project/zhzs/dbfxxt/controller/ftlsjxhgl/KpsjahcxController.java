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
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Kpsjahcx;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.IKpsjahcxService;

/**
 * 房土两税精细化管理-开票数据按户查询
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/kpsjahcx")
public class KpsjahcxController extends BaseController {

	private String prefix = "zhzs/dbfxxt/ftlsjxhgl/kpsjahcx";

	@Autowired
	private IKpsjahcxService service;

	@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:kpsjahcx:view")
	@GetMapping()
	public String view() {
		return prefix + "/kpsjahcx";
	}

	/**
	 * 获取列表
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:kpsjahcx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Kpsjahcx cond) {
		startPage();
		List<Kpsjahcx> list = service.selectList(cond);
		return getDataTable(list);
	}

	/**
	 * 查询统计
	 * 
	 * @param cond
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:kpsjtj:list")*/
	@PostMapping("/gettotal")
	@ResponseBody
	public TableDataInfo getTotal() {
		startPage();
		List<Kpsjahcx> list = service.getTotal();
		return getDataTable(list);
	}
}
