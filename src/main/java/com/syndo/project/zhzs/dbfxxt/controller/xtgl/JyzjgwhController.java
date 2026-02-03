package com.syndo.project.zhzs.dbfxxt.controller.xtgl;

import java.text.ParseException;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Jyzjgwh;
import com.syndo.project.zhzs.dbfxxt.service.xtgl.IJyzjgwhService;

/**
 * 加油站价格维护
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/xtgl/jyzjgwh")
public class JyzjgwhController extends BaseController {

	@Autowired
	private IJyzjgwhService service;	
	
	private String prefix = "zhzs/dbfxxt/xtgl/jyzjgwh";

	@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzjgwh:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		return prefix + "/view";
	}
	
	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzjgwh:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Jyzjgwh entity) {
		startPage();
        List<Jyzjgwh> list = service.selectList(entity);
		return getDataTable(list);
	}
	
	@Log(title = "", businessType = BusinessType.EXPORT)
    /*@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzjgwh:export")*/
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Jyzjgwh entity) throws Exception
    {
        try
        {
            List<Jyzjgwh> list = service.selectList(entity);
            ExcelUtil<Jyzjgwh> util = new ExcelUtil<Jyzjgwh>(Jyzjgwh.class);
            return util.exportExcel(list, "Jyzjgwh");
        }
        catch (Exception e)
        {
            return error("导出Excel失败，请联系网站管理员！");
        }
    }
	
	/**
	 * 新增
	 */
	@GetMapping("/add")
	public String add() {
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzjgwh:add")*/
	@Log(title = "", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Jyzjgwh entity) {	
		return toAjax(service.insert(entity));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Jyzjgwh entity = service.selectById(id);
		mmap.put("entity", entity);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzjgwh:edit")*/
	@Log(title = "", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Jyzjgwh entity) {		
		return toAjax(service.update(entity));
	}
	
	/**
	 * 删除
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:jyzjgwh:remove")*/
	@Log(title = "", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {		
		return toAjax(service.deleteByIds(ids));
	}

}
