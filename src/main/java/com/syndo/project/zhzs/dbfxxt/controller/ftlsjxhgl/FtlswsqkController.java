package com.syndo.project.zhzs.dbfxxt.controller.ftlsjxhgl;

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
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Ftlswsqk;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.IFtlswsqkService;

/**
 * 房土两税精细化管理-房土两税完税情况
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/ftlswsqk")
public class FtlswsqkController extends BaseController{

	private String prefix = "zhzs/dbfxxt/ftlsjxhgl/ftlswsqk";
	
	@Autowired
	private IFtlswsqkService service;

	@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:ftlswsqk:view")
	@GetMapping()
	public String view() {
		return prefix + "/ftlswsqk";
	}
	
	/**
	 * 获取列表
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:ftlswsqk:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Ftlswsqk entity) {
	    startPage();
	    if(null == entity.getNf()) {
	        entity.setNf("2016");
	    }
	    List<Ftlswsqk> list = service.selectList(entity);
	    return getDataTable(list);
	}
}
