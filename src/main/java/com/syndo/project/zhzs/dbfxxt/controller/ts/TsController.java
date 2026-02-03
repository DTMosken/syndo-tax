package com.syndo.project.zhzs.dbfxxt.controller.ts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.syndo.common.core.controller.BaseController;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsForm;
import com.syndo.project.zhzs.dbfxxt.service.ts.TsService;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/zhzs/dbfxxt/ts")
public class TsController extends BaseController {
    private String prefix = "zhzs/dbfxxt/ts";

    @Autowired
    private TsService service;

	@RequiresPermissions("zhzs:dbfxxt:ts:tsform")
	@GetMapping("/zxtsform")
    public String zxtsform(ModelMap modelMap, String zbdm) {
        TsForm entity = service.getZxtsForm(zbdm);        
        modelMap.put("entity", entity);

        // List<Map<String,String>> cols=new ArrayList<>();
        // Map<String,String> m = new HashMap<>();
        // m.put("column", "col1");
        // m.put("label", "label1");
        // cols.add(m);
        // m = new HashMap<>();
        // m.put("column", "col2");
        // m.put("label", "label2");
        // cols.add(m);
        // modelMap.put("cols", cols);

        // List<Map<String,String>> rows=new ArrayList<>();
        // m = new HashMap<>();
        // m.put("col1", "col1v");
        // m.put("col2", "col2v");
        // rows.add(m);
        // m = new HashMap<>();
        // m.put("col1", "col11v");
        // m.put("col2", "col21v");
        // rows.add(m);
        // modelMap.put("rows", rows);
        
		return prefix + "/zxtsform";
	}
    
    @RequiresPermissions("zhzs:dbfxxt:ts:tsform")
	@GetMapping("/cytsform")
    public String cytsform(ModelMap modelMap, String zbdm) {
        TsForm entity = service.getCytsForm(zbdm);        
        modelMap.put("entity", entity);
        return prefix + "/cytsform";
    }
}
