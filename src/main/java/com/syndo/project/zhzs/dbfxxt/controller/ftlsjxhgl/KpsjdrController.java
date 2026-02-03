package com.syndo.project.zhzs.dbfxxt.controller.ftlsjxhgl;

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

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Kpsjdr;
import com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl.IKpsjdrService;

/**
 * 房土两税精细化管理-开票数据导入
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ftlsjxhgl/kpsjdr")
public class KpsjdrController extends BaseController {

    private String prefix = "zhzs/dbfxxt/ftlsjxhgl/kpsjdr";
    
    @Autowired
    private IKpsjdrService service;
    
    @RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:kpsjdr:view")
    @GetMapping
    public String view() {
        return prefix + "/view";
    }
    
    /**
     * 获取列表
     * @param entity
     * @return
     */
    /*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:kpsjdr:list")*/
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Kpsjdr entity) {
        startPage();
        List<Kpsjdr> list = service.selectList(entity);
        return getDataTable(list);
    }
    
    /**
     * 新增开票数据导入(跳转页面)
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }
    
    /**
     * 新增开票数据导入保存(保存数据)
     * @param entity
     * @return
     */
    /*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:kpsjdr:add")*/
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Kpsjdr entity) {
        return toAjax(service.inster(entity));
    }
    
    /**
     * 修改开票数据导入
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id")String id, ModelMap mmap) {
        Kpsjdr entity = service.selectById(id);
        mmap.put("entity", entity);
        return prefix + "/edit";
    }
    
    /**
     * 修改保存开票数据导入
     */
    /*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:kpsjdr:edit")*/
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Kpsjdr entity) {
        return toAjax(service.update(entity));
    }
    
    /**
     * 删除开票数据导入
     */
    /*@RequiresPermissions("zhzs:dbfxxt:ftlsjxhgl:kpsjdr:remove")*/
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(service.delete(ids));
    }
}
