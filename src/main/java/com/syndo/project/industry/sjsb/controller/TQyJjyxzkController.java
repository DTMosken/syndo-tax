package com.syndo.project.industry.sjsb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.industry.sjsb.domain.TQyJjyxzk;
import com.syndo.project.industry.sjsb.service.ITQyJjyxzkService;

/**
 * 经济运行状况Controller
 * 
 * @author admin
 * @date 2021-01-22
 */
@Controller
@RequestMapping("/module/industry/jjyxzk")
public class TQyJjyxzkController extends BaseController {

    private String prefix = "module/industry/jjyxzk";

    @Autowired
    private ITQyJjyxzkService tQyJjyxzkService;

    @GetMapping()
    public String jjyxzk(ModelMap modelMap) {
        modelMap.put("msg", "success");
        return prefix + "/jjyxzk";
    }

    /**
     * 查询经济运行状况列表
     */
    @PostMapping("/list")
    @ResponseBody
    public String list(TQyJjyxzk tQyJjyxzk) {
        startPage();
        tQyJjyxzk.setShxydm(getSysUser().getLoginName());
        List<TQyJjyxzk> list = tQyJjyxzkService.selectTQyJjyxzkList(tQyJjyxzk);
//        for (TQyJjyxzk jjyxzk : list) {
//            String rq = jjyxzk.getRq();
//            String qymc = jjyxzk.getQymc();
//            String ssyf = jjyxzk.getSsyf();
//            TQyJjyxzk tQyJjyxzks = tQyJjyxzkService.selectLastTQyJjyxzk(rq,qymc,ssyf);
//            if (tQyJjyxzks != null){
//                jjyxzk.setLastGyzcz(tQyJjyxzks.getLastGyzcz());
//                jjyxzk.setLastXssr(tQyJjyxzks.getLastXssr());
//                jjyxzk.setLastLs(tQyJjyxzks.getLastLs());
//            }else {
//                jjyxzk.setLastGyzcz(null);
//                jjyxzk.setLastXssr(null);
//                jjyxzk.setLastLs(null);
//            }
//        }
        return getJsonTable(list);
    }

    /**
     * 导出经济运行状况列表
     */
    @Log(title = "经济运行状况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TQyJjyxzk tQyJjyxzk) {
        List<TQyJjyxzk> list = tQyJjyxzkService.selectTQyJjyxzkList(tQyJjyxzk);
        ExcelUtil<TQyJjyxzk> util = new ExcelUtil<TQyJjyxzk>(TQyJjyxzk.class);
        return util.exportExcel(list, "jjyxzk");
    }

    /**
     * 新增经济运行状况
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存经济运行状况
     */
    @Log(title = "经济运行状况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TQyJjyxzk tQyJjyxzk) {
        try {
        	tQyJjyxzk.setShxydm(getSysUser().getLoginName());
            return toAjax(tQyJjyxzkService.insertTQyJjyxzk(tQyJjyxzk));
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }

    /**
     * 修改经济运行状况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap) {
        TQyJjyxzk tQyJjyxzk = tQyJjyxzkService.selectTQyJjyxzkById(id);
        mmap.put("tQyJjyxzk", tQyJjyxzk);
        return prefix + "/edit";
    }

    /**
     * 修改保存经济运行状况
     */
    @Log(title = "经济运行状况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TQyJjyxzk tQyJjyxzk) {
        return toAjax(tQyJjyxzkService.updateTQyJjyxzk(tQyJjyxzk));
    }

    /**
     * 删除经济运行状况
     */
    @Log(title = "经济运行状况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tQyJjyxzkService.deleteTQyJjyxzkByIds(ids));
    }
}
