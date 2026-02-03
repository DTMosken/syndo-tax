package com.syndo.project.zhzs.srfxxt.controller.jkbb;

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
import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkbb;
import com.syndo.project.zhzs.srfxxt.service.jkbb.IJkbbService;

/**
 * 金库报表
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/jkbb")
public class JkbbController extends BaseController {

	private String prefix = "zhzs/srfxxt/jkbb";

	@Autowired
	private IJkbbService service;

	/**
	 * 金库日报
	 * 
	 * @param modelMap
	 * @return
	 * @throws ParseException
	 */
	@RequiresPermissions("zhzs:srfxxt:jkbb:jkrb:view")
	@GetMapping("/jkrb")
	public String jkrbView() {
		return prefix + "/jkrb/jkrb";
	}

	/*@RequiresPermissions("zhzs:srfxxt:jkbb:jkrb:list")*/
	@PostMapping("/jkrbList")
	@ResponseBody
	public TableDataInfo jkrbList(Jkbb cond) {
		startPage();
		List<Jkbb> list = service.selectRb(cond);
		return getDataTable(list);
	}

	/**
	 * 金库月报
	 * 
	 * @param modelMap
	 * @return
	 * @throws ParseException
	 */
	@RequiresPermissions("zhzs:srfxxt:jkbb:jkyb:view")
	@GetMapping("/jkyb")
	public String jkybView() {
		return prefix + "/jkyb/jkyb";
	}

	/*@RequiresPermissions("zhzs:srfxxt:jkbb:jkyb:list")*/
	@PostMapping("/jkybList")
	@ResponseBody
	public TableDataInfo jkybList(Jkbb cond) {
		startPage();
		List<Jkbb> list = service.selectYb(cond);
		return getDataTable(list);
	}

	/**
	 * 金库年报
	 * 
	 * @param modelMap
	 * @return
	 * @throws ParseException
	 */
	@RequiresPermissions("zhzs:srfxxt:jkbb:jknb:view")
	@GetMapping("/jknb")
	public String jknbView() {
		return prefix + "/jknb/jknb";
	}

	/*@RequiresPermissions("zhzs:srfxxt:jkbb:jknb:list")*/
	@PostMapping("/jknbList")
	@ResponseBody
	public TableDataInfo jknbList(Jkbb cond) {
		startPage();
		List<Jkbb> list = service.selectNb(cond);
		return getDataTable(list);
	}
}
