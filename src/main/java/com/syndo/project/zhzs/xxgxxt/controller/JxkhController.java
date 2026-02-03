package com.syndo.project.zhzs.xxgxxt.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.xxgxxt.domain.Fenshu;
import com.syndo.project.zhzs.xxgxxt.domain.Zhibiao;
import com.syndo.project.zhzs.xxgxxt.service.IJxglService;

/**
 * 绩效考核
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/xxgxxt/jxkh")
public class JxkhController extends BaseController {

	private String prefix = "zhzs/xxgxxt/jxkh";

	@Autowired
	private IJxglService jxglService;

	@RequiresPermissions("moudle:jxkh:view")
	@GetMapping()
	public String Jxkh(ModelMap modelMap) throws ParseException {
		modelMap.put("khrq", DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		return prefix + "/jxkh";
	}

	/**
	 * 查询列表
	 * 
	 * @param cond
	 * @return
	 */
	@RequiresPermissions("moudle:jxkh:view")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo List(Zhibiao cond) {
		startPage();
		if (cond.getKhrq() != null && !"".equals(cond.getKhrq())) {
			cond.setYscsj(cond.getKhrq());
		} else {
			cond.setYscsj(new SimpleDateFormat("yyyy-MM").format(new Date()));
		}
		if (cond.getDept() != null && !"".equals(cond.getDept())) {
			cond.setDept(cond.getDept());
		} else {
			cond.setDept("101");
		}
		List<Zhibiao> list = jxglService.query(cond);
		return getDataTable(list);
	}

	/**
	 * 获取分数
	 * 
	 * @return
	 */
	@PostMapping("/getfscount")
	@ResponseBody
	public Map<String, Integer> getfsCount() {
		Map<String, Integer> map = jxglService.getjsfs();
		return map;
	}

	/**
	 * 保存分数
	 * 
	 * @param f
	 * @return
	 */
	@PostMapping("/save")
	@ResponseBody
	public AjaxResult savefs(Fenshu f) {
		if (f.getKhrq() == null || "".equals(f.getKhrq())) {
			f.setKhrq(new SimpleDateFormat("yyyy-MM").format(new Date()));
		}
		if (f.getDept() != null && !"".equals(f.getDept())) {
			f.setDept(f.getDept());
		} else {
			f.setDept("101");
		}
		return toAjax(jxglService.save(f));
	}
}
