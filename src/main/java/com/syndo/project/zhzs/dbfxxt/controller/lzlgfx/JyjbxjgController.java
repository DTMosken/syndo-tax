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
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Jyjbxjg;
import com.syndo.project.zhzs.dbfxxt.service.lzlgfx.IJyjbxjgService;

/**
 * 户籍对比-教育局办学机构未在税务注册    办学机构未办理登记
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/lzlgfx/jyjbxjg")
public class JyjbxjgController extends BaseController {

    private String prefix = "zhzs/dbfxxt/lzlgfx/jyjbxjg";
    
    @Autowired
    private IJyjbxjgService service;

    @RequiresPermissions("zhzs:dbfxxt:lzlgfx:jyjbxjg:view")
    @GetMapping
    public String view() {
        return prefix + "/view";
    }
    
    /**
     * 获取列表
     */
    /*@RequiresPermissions("zhzs:dbfxxt:lzlgfx:jyjbxjg:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Jyjbxjg entity) {
        pageTable();
        List<Jyjbxjg> list = service.selectList(entity);
        return getJsonTable(list);
    }

    @PostMapping("/expExcel")
    @ResponseBody
    public AjaxResult export(Jyjbxjg cond) {
        List<Jyjbxjg> list = service.selectList(cond);
        ExcelUtil<Jyjbxjg> util = new ExcelUtil<Jyjbxjg>(Jyjbxjg.class);
        return util.exportExcel(list, "cond");
    }

}
