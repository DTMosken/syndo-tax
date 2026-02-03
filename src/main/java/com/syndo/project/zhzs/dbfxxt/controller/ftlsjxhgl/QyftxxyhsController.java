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
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyftxxyhs;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.IQyftxxyhsService;

/**
 * 房土两税精细化管理-企业房土信息已核实
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/qyftxxyhs")
public class QyftxxyhsController extends BaseController {

	private String prefix = "zhzs/dbfxxt/ftlsjxhgl/qyftxxyhs";

	@Autowired
	private IQyftxxyhsService service;

	@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyftxxyhs:view")
	@GetMapping
	public String view() {
		return prefix + "/qyftxxyhs";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyftxxyhs:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Qyftxxyhs cond) {
		startPage();
		List<Qyftxxyhs> list = service.selectList(cond);
		return getDataTable(list);
	}

	/**
	 * 详细信息
	 */
	@GetMapping("/lookup/{id}")
	public String lookup(@PathVariable("id") String id, ModelMap mmap) {
		Qyftxxyhs entity = service.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/lookup";
	}

}
