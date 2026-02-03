package com.syndo.project.zhzs.dbfxxt.controller.lzlgfx;

import java.util.List;

import com.syndo.common.utils.DateUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Wblkqy;
import com.syndo.project.zhzs.dbfxxt.service.lzlgfx.WblkqyService;

/**
 * @date 2021-04-01 10:17
 * @Description  有施工许可未办理跨区域登记
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/lzlgfx/wblkqy")
public class WblkqyController extends BaseController {

    private String prefix = "zhzs/dbfxxt/lzlgfx/wblkqy";

    @Autowired
    private WblkqyService service;

    @RequiresPermissions("zhzs:dbfxxt:lzlgfx:wblkqy:list")
    @GetMapping
    public String view(ModelMap modelMap) {
        modelMap.put("ssnd", DateUtils.getYear());
        return prefix + "/view";
    }

    /**
     * 查询列表
     */
    /*@RequiresPermissions("zhzs:dbfxxt:lzlgfx:wblkqy:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Wblkqy entity) {
        pageTable();
        List<Wblkqy> list = service.selectList(entity);
        return getJsonTable(list);
    }

    @PostMapping("/expExcel")
    @ResponseBody
    public AjaxResult export(Wblkqy cond) {
        List<Wblkqy> list = service.selectList(cond);
        ExcelUtil<Wblkqy> util = new ExcelUtil<Wblkqy>(Wblkqy.class);
        return util.exportExcel(list, "cond");
    }
}
