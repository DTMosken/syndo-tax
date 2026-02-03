package com.syndo.project.zhzs.dbfxxt.controller.ts;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Bdrz;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Fxtspz;
import com.syndo.project.zhzs.dbfxxt.service.ts.BdrzService;
import com.syndo.project.zhzs.dbfxxt.service.ts.FxtspzService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 风险推送配置
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ts/fxtspz")
public class FxtspzController extends BaseController {
    private String prefix = "zhzs/dbfxxt/ts/fxtspz";

    @Autowired
    private FxtspzService service;
    @Autowired
    private BdrzService bdrqService;

    @RequiresPermissions("dbfxxt:ts:fxtspz:view")
    @GetMapping()
    public String view(ModelMap model) {
        Fxtspz config = service.getFxtspz();
        model.put("config",config);
        return prefix + "/view";
    }

    @RequiresPermissions("dbfxxt:ts:fxtspz:view")
    @PostMapping("/list")
    @ResponseBody
    public String list(Bdrz entity) {
        pageTable();
        entity.setLx("2");
        List<Bdrz> list = bdrqService.selectList(entity);
        return getJsonTable(list);
    }

    @RequiresPermissions("dbfxxt:ts:fxtspz:view")
    @PostMapping("/save")
    @ResponseBody
    public AjaxResult save(Fxtspz fxtspz) {
        return toAjax(service.save(fxtspz));
    }
}
