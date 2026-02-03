package com.syndo.project.zhzs.dbfxxt.controller.syztfx;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Ccsjnqsfx;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.CcsjnqsfxService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-08 15:38
 * @Description 车船税缴纳趋势分析
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/ccsjnqsfx")
public class CcsjnqsfxController extends BaseController {
    private String prefix = "zhzs/dbfxxt/syztfx/ccsjnqsfx";

    @Autowired
    private CcsjnqsfxService service;

    @RequiresPermissions("zhzs:dbfxxt:syztfx:ccsjnqsfx:view")
    @GetMapping()
    public String view(ModelMap modelMap) {
        modelMap.put("ssnd", DateUtils.getYear());
        return prefix + "/ccsjnqsfx";
    }

    /**
     * 查询列表
     */
    /*@RequiresPermissions("zhzs:dbfxxt:lzlgfx:ccsjnqsfx:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Ccsjnqsfx entity) {
        pageTable();
        List<Ccsjnqsfx> list = service.selectList(entity);
        return getJsonTable(list);
    }

    @PostMapping("/expExcel")
    @ResponseBody
    public AjaxResult export(Ccsjnqsfx cond) {
        List<Ccsjnqsfx> list = service.selectList(cond);
        ExcelUtil<Ccsjnqsfx> util = new ExcelUtil<Ccsjnqsfx>(Ccsjnqsfx.class);
        return util.exportExcel(list, "cond");
    }

}
