package com.syndo.project.zhzs.dbfxxt.controller.lzlgfx;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Jnqswjnfcstdsys;
import com.syndo.project.zhzs.dbfxxt.service.lzlgfx.IJnqswjnfcstdsysService;

/**
 * 缴纳契税未缴纳房产税与土地使用税
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/lzlgfx/jnqswjnfcstdsys")
public class JnqswjnfcstdsysController extends BaseController {

    private String prefix = "zhzs/dbfxxt/lzlgfx/jnqswjnfcstdsys";
    @Autowired
    private IJnqswjnfcstdsysService service;

    @RequiresPermissions("zhzs:dbfxxt:lzlgfx:jnqswjnfcstdsys:view")
    @GetMapping()
    public String view(ModelMap model) {
        model.put("qdrq", DateUtils.getYear());
        return prefix + "/jnqswjnfcstdsys";
    }

    /**
     * 获取列表。
     * @param entity
     * @return
     */
    @RequiresPermissions("zhzs:dbfxxt:lzlgfx:jnqswjnfcstdsys:view")
    @PostMapping("/list")
    @ResponseBody
    public String list(Jnqswjnfcstdsys entity) {
         pageTable();
        List<Jnqswjnfcstdsys> list = service.selectList(entity);
        return getJsonTable(list);
    }

    /**
     * 导出
     */
    @RequiresPermissions("zhzs:dbfxxt:lzlgfx:jnqswjnfcstdsys:view")
    @Log(title = "缴纳契税未缴纳房产税与土地使用税", businessType = BusinessType.EXPORT)
    @PostMapping("/expExcel")
    @ResponseBody
    public AjaxResult export(Jnqswjnfcstdsys cond) {
        List<Jnqswjnfcstdsys> list = service.selectList(cond);
        ExcelUtil<Jnqswjnfcstdsys> util = new ExcelUtil<Jnqswjnfcstdsys>(Jnqswjnfcstdsys.class);
        return util.exportExcel(list, "Jnqswjnfcstdsys");
    }
}
