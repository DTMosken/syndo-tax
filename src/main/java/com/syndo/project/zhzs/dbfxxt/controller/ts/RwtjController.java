package com.syndo.project.zhzs.dbfxxt.controller.ts;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.poi.EasyExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Dbrw;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Rwtj;
import com.syndo.project.zhzs.dbfxxt.service.ts.RwtjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 任务统计
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ts/rwtj")
public class RwtjController extends BaseController {
    private String prefix = "zhzs/dbfxxt/ts/rwtj";

    @Autowired
    private RwtjService service;

    @GetMapping()
    public String view() {
        return prefix + "/view";
    }

    @PostMapping("/list")
    @ResponseBody
    public String list(Rwtj entity) {
//        pageTable();
        List<Rwtj> list = service.selectList(entity);
        return getJsonTable(list);
    }

    /**
     * 导出excel
     * @param entity
     * @return
     */
    @PostMapping("/expExcel")
    @ResponseBody
    public AjaxResult expExcel(Rwtj entity) {
        try {
            List<Rwtj> list = service.selectList(entity);
            EasyExcelUtil<Rwtj> util = new EasyExcelUtil<>(Rwtj.class);
            return util.export("任务统计", list);
        } catch (Exception e) {
            e.printStackTrace();
            return error("导出发生未知错误！");
        }
    }

    @GetMapping(value = {"/rws/{fkr}","/rws"})
    public String rws(@PathVariable(value = "fkr",required = false) String fkr, ModelMap model) {
        model.put("fkr", fkr);
        return prefix + "/rws";
    }

    @PostMapping("/rws")
    @ResponseBody
    public String rwsList(String fkr) {
        pageTable();
        List<Dbrw> list = service.selectRws(fkr);
        return getJsonTable(list);
    }

    @GetMapping(value = {"/dfk2/{lx}/{fkr}", "/dfk2/{lx}"})
    public String dfk2(@PathVariable("lx") String lx, @PathVariable(value = "fkr",required = false) String fkr, ModelMap model) {
        model.put("fkr", fkr);
        model.put("lx", lx);
        return prefix + "/dfk2";
    }

    @PostMapping("/dfk2")
    @ResponseBody
    public String dfk2List(String lx, String fkr) {
        pageTable();
        List<Dbrw> list = service.selectDfk2(lx, fkr);
        return getJsonTable(list);
    }

    @GetMapping(value = {"/yfk2/{lx}/{fkr}", "/yfk2/{lx}"})
    public String yfk2(@PathVariable("lx") String lx, @PathVariable(value = "fkr",required = false) String fkr, ModelMap model) {
        model.put("fkr", fkr);
        model.put("lx", lx);
        return prefix + "/yfk2";
    }

    @PostMapping("/yfk2")
    @ResponseBody
    public String yfk2List(String lx, String fkr) {
        pageTable();
        List<Dbrw> list = service.selectYfk2(lx, fkr);
        return getJsonTable(list);
    }

    @GetMapping(value = {"/yfk/{lx}/{fkr}", "/yfk/{lx}"})
    public String yfk(@PathVariable("lx") String lx, @PathVariable(value = "fkr",required = false) String fkr, ModelMap model) {
        model.put("fkr", fkr);
        model.put("lx", lx);
        return prefix + "/yfk";
    }

    @PostMapping("/yfk")
    @ResponseBody
    public String yfkList(String lx, String fkr) {
        pageTable();
        List<Dbrw> list = service.selectYfk(lx, fkr);
        return getJsonTable(list);
    }

    @GetMapping(value = {"/splx/{lx}/{fkr}", "/splx/{lx}"})
    public String splx(@PathVariable("lx") String lx, @PathVariable(value = "fkr",required = false) String fkr, ModelMap model) {
        model.put("fkr", fkr);
        model.put("lx", lx);
        return prefix + "/splx";
    }
    @PostMapping("/splx")
    @ResponseBody
    public String splxList(String lx, String fkr) {
        pageTable();
        List<Dbrw> list = service.selectSplx(lx, fkr);
        return getJsonTable(list);
    }
}
