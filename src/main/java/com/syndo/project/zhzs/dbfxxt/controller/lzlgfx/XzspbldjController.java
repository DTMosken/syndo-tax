package com.syndo.project.zhzs.dbfxxt.controller.lzlgfx;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Xzspbldj;
import com.syndo.project.zhzs.dbfxxt.service.lzlgfx.IXzspbldjService;

/**
 * 户籍对比-行政审批办理登记未在税务注册    办理营业执照未税务登记
 * 
 * @author admin
 * @date 2020-4-7
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/lzlgfx/xzspbldj")
public class XzspbldjController extends BaseController {

    private String prefix = "zhzs/dbfxxt/lzlgfx/xzspbldj";
    
    @Autowired
    private IXzspbldjService service;
    
    @RequiresPermissions("zhzs:dbfxxt:lzlgfx:xzspbldj:view")
    @GetMapping
    public String view() {
        return prefix + "/view";
    }
    
	/**
	 * 查询列表
	 * 
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:lzlgfx:xzspbldj:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Xzspbldj entity) {
		pageTable();
		List<Xzspbldj> list = service.selectList(entity);
		return getJsonTable(list);
	}

	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Xzspbldj cond) {
		List<Xzspbldj> list = service.selectList(cond);
		ExcelUtil<Xzspbldj> util = new ExcelUtil<Xzspbldj>(Xzspbldj.class);
		return util.exportExcel(list, "cond");
	}
}
