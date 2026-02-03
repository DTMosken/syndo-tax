package com.syndo.project.zhzs.dbfxxt.controller.xtgl;

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
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Lgyjgwh;
import com.syndo.project.zhzs.dbfxxt.service.xtgl.ILgyjgwhService;

/**
 * 对比分析系统-系统管理-旅馆业价格维护
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/xtgl/lgyjgwh")
public class LgyjgwhController extends BaseController {
	
	private String prefix = "zhzs/dbfxxt/xtgl/lgyjgwh";
	
	@Autowired
	private ILgyjgwhService service;

	@RequiresPermissions("zhzs:dbfxxt:xtgl:lgyjgwh:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		modelMap.put("lgyjgwh",DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		return prefix + "/view";
	}
	
	/**
	 * 获取列表
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:lgyjgwh:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Lgyjgwh entity) {
	    startPage();
	    List<Lgyjgwh> list = service.selectList(entity);
	    return getDataTable(list);
	}
	
	@GetMapping("jgwh")
	public String jgwh(ModelMap modelMap) {
		modelMap.put("nd", DateUtils.getYear());
		if(Integer.parseInt(DateUtils.getMonth().substring(5)) > 6) {
			modelMap.put("flag", '1');
		} else {
			modelMap.put("flag", '0');
		}
	    return prefix + "/jgwh";
	}
	
	/**
	 * 修改价格
	 * @param entity
	 * @return
	 */
	@PostMapping("/updateJg")
    @ResponseBody
	public AjaxResult edit(Lgyjgwh entity) {
	    return toAjax(service.update(entity));
	}
	

}
