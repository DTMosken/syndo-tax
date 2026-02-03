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
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Fcscefx;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.IFcscefxService;

/**
 * 房土两税精细化管理-房产税差额分析
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/fcscefx")
public class FcscefxController extends BaseController{

	@Autowired
	private IFcscefxService service;
	/**
	 * 页面跳转地址
	 */
	private String prefix = "zhzs/dbfxxt/ftlsjxhgl/fcscefx";

	/**
	 * 初始化页面
	 * @return
	 */
	@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:fcscefx:view")
	@GetMapping()
	public String view() {
		return prefix + "/fcscefx";
	}



	/**
	 * 查询数据
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:fcscefx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Fcscefx entity) {
		startPage();
        List<Fcscefx> list = service.selectList(entity);
		return getDataTable(list);
	}
}
