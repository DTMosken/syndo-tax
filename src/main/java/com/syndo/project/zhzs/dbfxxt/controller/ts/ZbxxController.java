package com.syndo.project.zhzs.dbfxxt.controller.ts;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Zbxx;
import com.syndo.project.zhzs.dbfxxt.service.ts.ZbxxService;
/**
* 指标信息
*/
@Controller
@RequestMapping("/zhzs/dbfxxt/ts/zbxx")
public class ZbxxController extends BaseController {
    private String prefix = "zhzs/dbfxxt/ts/zbxx";

    @Autowired
    private ZbxxService service;
    
    @RequiresPermissions("dbfxxt:ts:zbxx:view")
	@GetMapping()
	public String view() {
		return prefix + "/view";
	}

    @RequiresPermissions("dbfxxt:ts:zbxx:view")
    @PostMapping("/list")
	@ResponseBody
    public String list(Zbxx entity) {
        pageTable();
        List<Zbxx> list = service.selectList(entity);
        return getJsonTable(list);
    }
    
    @RequiresPermissions("dbfxxt:ts:zbxx:edit")
    @GetMapping("/edit/{zbdm}")
    public String edit(ModelMap model, @PathVariable("zbdm") String zbdm) {
    	Zbxx zbxx = service.selectByZbdm(zbdm);
        model.put("entity", zbxx);
        return prefix + "/edit";
    }

    @RequiresPermissions("dbfxxt:ts:zbxx:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Zbxx zbxx) {
        return toAjax(service.updateZbxx(zbxx));
    }

    @GetMapping("/info/{zbdm}")
    public String rwfk(@PathVariable("zbdm") String zbdm, ModelMap model) {
        Zbxx zbxx = service.selectByZbdm(zbdm);
        model.put("entity", zbxx);
        return prefix + "/info";
    }

}
