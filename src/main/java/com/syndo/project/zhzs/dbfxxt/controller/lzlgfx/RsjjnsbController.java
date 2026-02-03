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
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Rsjjnsb;
import com.syndo.project.zhzs.dbfxxt.service.lzlgfx.IRsjjnsbService;

/**
 * 户籍对比-人社局缴纳社保企业未在税务注册        缴纳社保企业未办理登记
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/lzlgfx/rsjjnsb")
public class RsjjnsbController extends BaseController {

    private String prefix = "zhzs/dbfxxt/lzlgfx/rsjjnsb";
    
    @Autowired
    private IRsjjnsbService service;

    @RequiresPermissions("zhzs:dbfxxt:lzlgfx:rsjjnsb:view")
    @GetMapping
    public String view() {
        return prefix + "/view";
    }
    
    /**
     * 获取列表
     * @param entity
     * @return
     */
    /*@RequiresPermissions("zhzs:dbfxxt:lzlgfx:rsjjnsb:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Rsjjnsb entity) {
        pageTable();
        List<Rsjjnsb> list = service.selectList(entity);
        return getJsonTable(list);
    }

    @PostMapping("/expExcel")
    @ResponseBody
    public AjaxResult export(Rsjjnsb cond) {
        List<Rsjjnsb> list = service.selectList(cond);
        ExcelUtil<Rsjjnsb> util = new ExcelUtil<Rsjjnsb>(Rsjjnsb.class);
        return util.exportExcel(list, "cond");
    }
}
