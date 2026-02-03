package com.syndo.project.zhzs.srfxxt.controller.jkbb;

import java.text.ParseException;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkzyzftj;
import com.syndo.project.zhzs.srfxxt.service.jkbb.IJkzyzftjService;

/**
 * 金库转移支付统计
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/jkbb/jkzyzftj")
public class JkzyzftjController extends BaseController {
	
	@Autowired
	private IJkzyzftjService service;
	/**
	 * 页面跳转地址
	 */
	private String prefix = "zhzs/srfxxt/jkbb/jkzyzftj";

	/**
	 * 初始化页面
	 * @return
	 */
	@RequiresPermissions("zhzs:srfxxt:jkbb:jkzyzftj:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		modelMap.put("jkzyzftj",DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		return prefix + "/view";
	}

	/**
	 * 查询数据
	 * @param entity
	 * @return
	 */
	@RequiresPermissions("zhzs:srfxxt:jkbb:jkzyzftj:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Jkzyzftj entity) {
		startPage();
        List<Jkzyzftj> list = service.selectList(entity);
		return getDataTable(list);
	}
}
