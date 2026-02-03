package com.syndo.project.zhzs.dbfxxt.controller.ftlsjxhgl;

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
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Qyxxsbtj;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.IQyxxsbtjService;

/**
 * 房土两税精细化管理-企业信息上报信息
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/qyxxsbtj")
public class QyxxsbtjController extends BaseController {
	@Autowired
	private IQyxxsbtjService service;
	/**
	 * 页面跳转地址
	 */
    private String prefix = "zhzs/dbfxxt/ftlsjxhgl/qyxxsbtj";
    
    /**
     * 初始化页面
     * @param modelMap
     * @return
     * @throws ParseException
     */
    @RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:qyxxsbtj:view")
    @GetMapping
    public String view() {
        return prefix + "/view";
    }

	/**
	 * 查询数据
	 * @param entity
	 * @return
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Qyxxsbtj entity) {
		startPage();
        List<Qyxxsbtj> list = service.selectList(entity);
		return getDataTable(list);
	}
}
