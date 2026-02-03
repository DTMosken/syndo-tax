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
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Tdsysyztz;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.ITdsysyztzService;

/**
 * 房土两税精细化管理-土地使用税应征台账
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/tdsysyztz")
public class TdsysyztzController extends BaseController {

	private String prefix = "zhzs/dbfxxt/ftlsjxhgl/tdsysyztz";

	@Autowired
	private ITdsysyztzService service;

	@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:tdsysyztz:view")
	@GetMapping()
	public String view() {
		return prefix + "/tdsysyztz";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:tdsysyztz:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Tdsysyztz cond) {
		startPage();
		List<Tdsysyztz> list = service.selectList(cond);
		return getDataTable(list);
	}

	/**
	 * 查看详情
	 */
	@GetMapping("/lookup/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Tdsysyztz entity = service.selectById(id);
		mmap.put("entity", entity);
		return prefix + "/lookup";
	}
}
