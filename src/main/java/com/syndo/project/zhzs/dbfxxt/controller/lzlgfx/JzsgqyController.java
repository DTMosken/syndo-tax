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
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.JzsgqySw;
import com.syndo.project.zhzs.dbfxxt.service.lzlgfx.IJzsgqyService;

/**
 * 户籍对比-建筑施工企业未在税务注册
 * 
 * @author admin
 * @date 2019-4-19
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/lzlgfx/jzsgqy")
public class JzsgqyController extends BaseController {

    private String prefix = "zhzs/dbfxxt/lzlgfx/jzsgqy";
    
    @Autowired
    private IJzsgqyService service;

    @RequiresPermissions("zhzs:dbfxxt:lzlgfx:jzsgqy:view")
    @GetMapping
    public String view(ModelMap modelMap) {
        modelMap.put("ssnd", DateUtils.getYear());
        return prefix + "/view";
    }
    
    /**
     * 查询列表
     */
    /*@RequiresPermissions("zhzs:dbfxxt:lzlgfx:jzsgqy:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(JzsgqySw entity) {
//        String tsfs = entity.getTsfs();
//        if(tsfs == null || !tsfs.equals("1"))
        pageTable();
        List<JzsgqySw> list = service.selectList(entity);
        return getJsonTable(list);
    }

    @PostMapping("/expExcel")
    @ResponseBody
    public AjaxResult export(JzsgqySw cond) {
        List<JzsgqySw> list = service.selectList(cond);
        ExcelUtil<JzsgqySw> util = new ExcelUtil<JzsgqySw>(JzsgqySw.class);
        return util.exportExcel(list, "cond");
    }
}
