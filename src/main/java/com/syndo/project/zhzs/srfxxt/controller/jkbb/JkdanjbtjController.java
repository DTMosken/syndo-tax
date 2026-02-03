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
import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkdjb;
import com.syndo.project.zhzs.srfxxt.service.jkbb.IJkdanjbtjService;

/**
 * 金库单级表统计
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/srfxxt/jkbb/jkdanjbtj")
public class JkdanjbtjController extends BaseController {
	
	private String prefix = "zhzs/srfxxt/jkbb/jkdanjbtj";
	
	@Autowired
	private IJkdanjbtjService service;
	
	@RequiresPermissions("zhzs:srfxxt:jkbb:jkdanjbtj:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		modelMap.put("jkdanjbtj",DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		return prefix + "/view";
	}
	
	/**
	 * 获取列表
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:srfxxt:jkbb:jkdanjbtj:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Jkdjb entity) {
	    startPage();
	    if(null == entity.getFlag()) {
	        entity.setFlag("1");
	    }
	    List<Jkdjb> list = service.selectList(entity);
	    return getDataTable(list);
	}
	
}
