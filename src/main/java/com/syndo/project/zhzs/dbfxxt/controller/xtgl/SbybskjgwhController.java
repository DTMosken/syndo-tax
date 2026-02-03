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
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Sbybskjgwh;
import com.syndo.project.zhzs.dbfxxt.service.xtgl.ISbybskjgwhService;

/**
 * 社保医保刷卡中间表维护
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/xtgl/sbybskjgwh")
public class SbybskjgwhController extends BaseController {

	@Autowired
	private ISbybskjgwhService service;	
	
	private String prefix = "zhzs/dbfxxt/xtgl/sbybskjgwh";

	@RequiresPermissions("zhzs:dbfxxt:xtgl:sbybskjgwh:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		return prefix + "/view";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:sbybskjgwh:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Sbybskjgwh entity) {
		startPage();
        List<Sbybskjgwh> list = service.selectList(entity);
		return getDataTable(list);
	}
	
	@Log(title = "", businessType = BusinessType.EXPORT)
    /*@RequiresPermissions("zhzs:dbfxxt:xtgl:sbybskjgwh:export")*/
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Sbybskjgwh entity) throws Exception
    {
        try
        {
            List<Sbybskjgwh> list = service.selectList(entity);
            ExcelUtil<Sbybskjgwh> util = new ExcelUtil<Sbybskjgwh>(Sbybskjgwh.class);
            return util.exportExcel(list, "Sbybskjgwh");
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
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:sbybskjgwh:add")*/
	@Log(title = "", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Sbybskjgwh entity) {	
//		User user = getSysUser();
//		entity.setZjr(user == null ? "":user.getUserName());	
//		entity.setZjsj(DateUtils.getTime());
		return toAjax(service.insert(entity));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap) {
		Sbybskjgwh entity = service.selectById(id);
//		User user = getSysUser();
//		entity.setXgr(user == null ? "":user.getUserName());
//		entity.setXgsj(DateUtils.getTime());
		mmap.put("entity", entity);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:sbybskjgwh:edit")*/
	@Log(title = "", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Sbybskjgwh entity) {		
		return toAjax(service.update(entity));
	}
	
	/**
	 * 删除
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:xtgl:sbybskjgwh:remove")*/
	@Log(title = "", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {		
		return toAjax(service.deleteByIds(ids));
	}
}
