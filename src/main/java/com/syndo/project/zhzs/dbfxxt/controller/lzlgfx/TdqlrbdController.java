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
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Tdqlrbd;
import com.syndo.project.zhzs.dbfxxt.service.lzlgfx.TdqlrbdService;

/**
 * @date 2021-03-31 15:44
 * @Description  土地权利人比对
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/lzlgfx/tdqlrbd")
public class TdqlrbdController extends BaseController {

    private String prefix = "zhzs/dbfxxt/lzlgfx/tdqlrbd";

    @Autowired
    private TdqlrbdService service;

    @RequiresPermissions("zhzs:dbfxxt:lzlgfx:tdqlrbd:view")
    @GetMapping
    public String view() {
        return prefix + "/view";
    }

    /**
     * 查询列表
     */
    /*@RequiresPermissions("zhzs:dbfxxt:lzlgfx:tdqlrbd:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Tdqlrbd entity) {
        pageTable();
        List<Tdqlrbd> list = service.selectList(entity);
        return getJsonTable(list);
    }

    @PostMapping("/expExcel")
    @ResponseBody
    public AjaxResult export(Tdqlrbd cond) {
        List<Tdqlrbd> list = service.selectList(cond);
        ExcelUtil<Tdqlrbd> util = new ExcelUtil<Tdqlrbd>(Tdqlrbd.class);
        return util.exportExcel(list, "cond");
    }
}
