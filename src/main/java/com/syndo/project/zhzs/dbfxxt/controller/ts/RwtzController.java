package com.syndo.project.zhzs.dbfxxt.controller.ts;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.project.zhzs.dbfxxt.domain.ts.FkxzFz;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Rwtz;
import com.syndo.project.zhzs.dbfxxt.service.ts.FkxzService;
import com.syndo.project.zhzs.dbfxxt.service.ts.RwtzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 任务调整
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ts/rwtz")
public class RwtzController extends BaseController {
    private String prefix = "zhzs/dbfxxt/ts/rwtz";

    @Autowired
    private RwtzService service;
    @Autowired
    private FkxzService fkxzService;

    @GetMapping()
    public String view() {
        return prefix + "/view";
    }

    @PostMapping("/list")
    @ResponseBody
    public String list(Rwtz entity) {
        FkxzFz fz = fkxzService.selectFkxzFzByUserid(getUserId());
        if(fz != null) {
            entity.setFzid(fz.getFzid());
        }
        pageTable();
        List<Rwtz> list = service.selectList(entity);
        return getJsonTable(list);
    }

    /**
     * 调整反馈人
     */
    @GetMapping("/tzfkr/{ids}/{fkr}")
    public String tzfkr(@PathVariable("ids") String ids, @PathVariable("fkr") String fkr, ModelMap model) {
        model.put("fkr", fkr);
        model.put("ids", ids);
        return prefix + "/tzfkr";
    }

    /**
     * 调整反馈人保存
     */
    @PostMapping("/tzfkr")
    @ResponseBody
    public AjaxResult tzfkr(Rwtz rwtz) {
        return toAjax(service.tzfkr(rwtz));
    }

    /**
     * 调整反馈时限
     */
    @GetMapping("/tzfksx/{ids}")
    public String tzfksx(@PathVariable("ids") String ids, ModelMap model) {
        model.put("ids", ids);
        return prefix + "/tzfksx";
    }
    /**
     * 调整反馈时限保存
     */
    @PostMapping("/tzfksx")
    @ResponseBody
    public AjaxResult tzfksx(Rwtz rwtz) {
        return toAjax(service.tzfksx(rwtz));
    }

    /**
     * 取消推送
     */
    @PostMapping("/qxts/{ids}")
    @ResponseBody
    public AjaxResult qxts(@PathVariable("ids") String ids) {
        return toAjax(service.qxts(ids));
    }
}
