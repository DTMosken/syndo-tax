package com.syndo.project.zhzs.dbfxxt.controller.ztzhfx;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Qyydfx;
import com.syndo.project.zhzs.dbfxxt.service.ztzhfx.QyydfxService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;

/**
 * @author lvd
 * @date 2021-04-15 14:00
 * @Description 企业用电分析
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ztzhfx/qyydfx")
public class QyydfxController extends BaseController {
    
    @Autowired
    private QyydfxService service;

    /**
     * 页面跳转地址
     */
    private String prefix = "zhzs/dbfxxt/ztzhfx/qyydfx";
    /**
     * @param modelMap
     * @return
     * @throws ParseException
     */
    @RequiresPermissions("zhzs:dbfxxt:ztzhfx:qyydfx:view")
    @GetMapping()
    public String view(ModelMap modelMap) throws ParseException {
        modelMap.put("ssqq", DateUtils.getYear() + "-01");
        modelMap.put("ssqz", DateUtils.getMonth());
        return prefix + "/view";
    }
    /**
     * 查询数据
     * @param entity
     * @return
     */
    /*@RequiresPermissions("zhzs:dbfxxt:ztzhfx:qyydfx:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Qyydfx entity) {
        pageTable();
        List<Qyydfx> list = service.selectList(entity);
        return getJsonTable(list);
    }

    /**
     * 导出
     */
    @Log(title = "企业用电分析", businessType = BusinessType.EXPORT)
    @PostMapping("/expExcel")
    @ResponseBody
    public AjaxResult export(Qyydfx cond) {
        List<Qyydfx> list = service.selectList(cond);
        ExcelUtil<Qyydfx> util = new ExcelUtil<Qyydfx>(Qyydfx.class);
        return util.exportExcel(list, "Qyydfx");
    }

}
