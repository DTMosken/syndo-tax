package com.syndo.project.industry.zbgzjs.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.util.StringUtil;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.project.industry.zbgzjs.domain.Zbkwh;
import com.syndo.project.industry.zbgzjs.service.IZbkwhService;

/**
 * 指标库管理
 * @author hry
 *
 */
@Controller
@RequestMapping("/module/industry/zbkgl")
public class ZbkwhController extends BaseController {
	private String prefix = "industry/zbgzjs/zbkgl";
	@Autowired
	IZbkwhService service;

	/**
	 * 新增指标
	 */
	@PostMapping("/newaddZbk")
	@ResponseBody
	public AjaxResult AddZbk(Zbkwh mmap) {
		UUID uuid = UUID.randomUUID();
		mmap.setID(uuid.toString().replace("-", "").toUpperCase());
		service.newaddZbk(mmap);
		return toAjax(1);
	}

	/**
	 * 修改指标页面 updateZbk
	 */
	@GetMapping("/updateZbk/{id}")
	public String updateZbk(@PathVariable("id") String id, ModelMap mmap) {
		Zbkwh getZbkLSTBYID = service.GetZbkLSTBYID(id);
		if(null == getZbkLSTBYID) {
			return "";
		}
		mmap.put("Zbkwh", getZbkLSTBYID);
		return prefix + "/edit";
	}

	/**
	 * 查询列表
	 */
	@PostMapping("/GetZbkLST")
	@ResponseBody
	public TableDataInfo ListZbk(Zbkwh zb) {
		//指标分类查询全部
		if(zb.getFLMLID().equals("6")) {
			zb.setFLMLID("");
		}
		startPage();
		List<Zbkwh> list =service.GetZbkLST(zb);
	
		return getDataTable(list);
	}

	/**
	 * 新增指标
	 */
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String  ids) {
		if(StringUtil.isEmpty(ids)) {
			return toAjax(0);
		}
		service.remove(ids.split(","));
		return toAjax(1);
	}
	
	/**
	 * 修改指标保存
	 */
	@PostMapping("/updateZbk")
	@ResponseBody
	public AjaxResult updateZbk(Zbkwh zb) {
		service.updateZbk(zb);
		return  toAjax(1);
	}
}
