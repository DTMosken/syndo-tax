package com.syndo.project.zhzs.dbfxxt.controller.ztzhfx;

import java.text.ParseException;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Hysdzsgl;
import com.syndo.project.zhzs.dbfxxt.service.ztzhfx.HysdzsglService;

/**
 * @author lvd
 * @date 2021-04-14 10:00
 * @Description  行业税电指数管理
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ztzhfx/hysdzsgl")
public class HysdzsglController extends BaseController {
    @Autowired
    private HysdzsglService service;
    /**
     * 页面跳转地址
     */
    private String prefix = "zhzs/dbfxxt/ztzhfx/hysdzsgl";
    /**
     * 初始化页面ztzhfx
     * @param modelMap
     * @return
     * @throws ParseException
     */
    @RequiresPermissions("zhzs:dbfxxt:ztzhfx:hysdzsgl:view")
    @GetMapping()
    public String view(ModelMap modelMap) throws ParseException {
        modelMap.put("skssqq", DateUtils.getYear() + "-01");
        modelMap.put("skssqz", DateUtils.getMonth());
        return prefix + "/view";
    }
    /**
     * 查询数据
     * @param entity
     * @return
     */
    /*@RequiresPermissions("zhzs:dbfxxt:ztzhfx:hysdzsgl:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Hysdzsgl entity) {
        pageTable();
        List<Hysdzsgl> list = service.selectList(entity);
        return getJsonTable(list);
    }

    /**
     * 设置行业税电指数管理
     */
    @GetMapping("/set")
    public String set(String id, ModelMap map) {
        Hysdzsgl hysdzsgl = service.selectById(id);
        map.put("hysdzsgl",hysdzsgl);
        return prefix + "/set";
    }


    /**
     * 设置行业税电指数管理
     */
    @Log(title = "设置行业税电指数管理", businessType = BusinessType.OTHER)
    @PostMapping("/set")
    @ResponseBody
    public AjaxResult setSave(@RequestBody Hysdzsgl entity) {
        return toAjax(service.setSave(entity));
    }
    /**
     * 导出
     */
    @Log(title = "行业税电指数管理", businessType = BusinessType.EXPORT)
    @PostMapping("/expExcel")
    @ResponseBody
    public AjaxResult export(Hysdzsgl cond) {
        List<Hysdzsgl> list = service.selectList(cond);
        ExcelUtil<Hysdzsgl> util = new ExcelUtil<Hysdzsgl>(Hysdzsgl.class);
        return util.exportExcel(list, "Hysdzsgl");
    }
    
}
