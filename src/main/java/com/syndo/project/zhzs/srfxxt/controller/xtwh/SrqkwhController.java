package com.syndo.project.zhzs.srfxxt.controller.xtwh;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Srqkwh;
import com.syndo.project.zhzs.srfxxt.service.xtwh.SrqkwhService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/zhzs/srfxxt/xtwh/srqkwh")
public class SrqkwhController extends BaseController {
    private String prefix = "zhzs/srfxxt/xtwh/srqkwh";

    @Autowired
    private SrqkwhService service;

    @RequiresPermissions("srfxxt:xtwh:srqkwh:view")
    @GetMapping()
    public String view(ModelMap modelMap) {
        modelMap.put("sjy", service.getSy_ss_sjy());
        return prefix + "/view";
    }

    @RequiresPermissions("srfxxt:xtwh:srqkwh:view")
    @PostMapping("/list")
    @ResponseBody
    public String list(Srqkwh entity) {
        pageTable();
        List<Srqkwh> list = service.selectList(entity);
        return getJsonTable(list);
    }

    @RequiresPermissions("srfxxt:xtwh:srqkwh:view")
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    @RequiresPermissions("srfxxt:xtwh:srqkwh:view")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Srqkwh srqkwh) {
        return toAjax(service.insert(srqkwh));
    }

    @RequiresPermissions("srfxxt:xtwh:srqkwh:view")
    @PostMapping("/setSjy")
    @ResponseBody
    public AjaxResult setSjy(String sjy) {
        return toAjax(service.setSjy(sjy));
    }

    @RequiresPermissions("srfxxt:xtwh:srqkwh:view")
    @GetMapping("/edit/{id}")
    public String edit(ModelMap model, @PathVariable("id") String id) {
        Srqkwh srqkwh = service.selectSrqkwhById(id);
        model.put("entity", srqkwh);
        return prefix + "/edit";
    }

    @RequiresPermissions("srfxxt:xtwh:srqkwh:view")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Srqkwh srqkwh) {
        return toAjax(service.update(srqkwh));
    }

    @RequiresPermissions("srfxxt:xtwh:srqkwh:view")
    @PostMapping("/delete")
    @ResponseBody
    public AjaxResult delete(String ids) {
        return toAjax(service.delete(ids));
    }

    @RequiresPermissions("srfxxt:xtwh:srqkwh:view")
    @PostMapping("/getBySsq")
    @ResponseBody
    public AjaxResult getBySsq(Srqkwh srqkwh) {
        Srqkwh res = service.getBySsq(srqkwh);
        int result = (res == null ? 0 : 1);
        if(res == null) {
            return AjaxResult.error("未找到同期数据！");
        } else {
            return AjaxResult.success(res);
        }
    }
}
