package com.syndo.project.industry.sjys.controller;

import java.text.ParseException;
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
import com.syndo.project.industry.sjys.domain.Qydfjs;
import com.syndo.project.industry.sjys.service.IQyjsdfService;

/**
 * 企业得分计算
 * 
 * @author hry
 *
 */
@Controller
@RequestMapping("/module/industry/Qydfjs")
public class QydfjsController extends BaseController {
	@Autowired
	private IQyjsdfService service;

	private String prefix = "/industry/sjys/Qydfjs";

	@GetMapping()
	public String view() throws ParseException {
		return prefix + "/view";
	}


	/**
	 * 查询列表
	 */
	@RequiresPermissions("module:industry:Qydfjs:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Qydfjs cond) {
		startPage();
		List<Qydfjs> list = service.GetQyjsdf();
		return null == list ? null : getDataTable(list);
	}

	/**
	 * 重新计算
	 */
	@GetMapping("/calculation")
	@ResponseBody
	public void calculation() {

		service.calculation();

	}

}
