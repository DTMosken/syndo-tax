package com.syndo.project.zhzs.dbfxxt.controller.ftlsjxhgl;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Gsgthlgfx;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.IGsgthlgfxService;

/**
 * 房土两税精细化管理-工商个体户漏管分析
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/gsgthlgfx")
public class GsgthlgfxController extends BaseController{

	@Autowired
	private IGsgthlgfxService service;
	/**
	 * 页面跳转地址
	 */
	private String prefix = "zhzs/dbfxxt/ftlsjxhgl/gsgthlgfx";

	/**
	 * 初始化页面
	 * @return
	 */
	@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:gsgthlgfx:view")
	@GetMapping()
	public String view() {
		return prefix + "/gsgthlgfx";
	}

	/**
	 * 查询数据
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:gsgthlgfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Gsgthlgfx entity) {
		startPage();
        List<Gsgthlgfx> list = service.selectList(entity);
		return getDataTable(list);
	}

	/**
	 * 查看详细信息
	 */
	@GetMapping("/lookup/{id}")
	public String lookup(@PathVariable("id") String id, ModelMap mmap) {
		Gsgthlgfx entity = service.selectById(id);
		mmap.put("entity", entity);
	    return prefix + "/lookup";
	}	

}
