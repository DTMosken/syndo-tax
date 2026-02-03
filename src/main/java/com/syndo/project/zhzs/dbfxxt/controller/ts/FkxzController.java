package com.syndo.project.zhzs.dbfxxt.controller.ts;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.domain.Ztree;
import com.syndo.common.core.domain.entity.Dept;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Fkxz;
import com.syndo.project.zhzs.dbfxxt.domain.ts.FkxzFz;
import com.syndo.project.zhzs.dbfxxt.service.ts.FkxzService;
import com.syndo.system.service.IUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("/zhzs/dbfxxt/ts/fkxz")
public class FkxzController extends BaseController {
    private String prefix = "zhzs/dbfxxt/ts/fkxz";

    @Autowired
    private FkxzService service;
    @Autowired
    private IUserService userService;

    @RequiresPermissions("dbfxxt:ts:fkxz:view")
	@GetMapping()
	public String view() {
		return prefix + "/view";
	}

    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @PostMapping("/list")
	@ResponseBody
    public String list(Fkxz entity) {
        pageTable();
        List<Fkxz> list = service.selectList(entity);
        return getJsonTable(list);
    }

    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Fkxz fkxz) {
        String userName = fkxz.getUserName();
        if(userName != null && userName.trim().length()>0) {
            int isUnique = service.checkUserName(fkxz);
            if(isUnique==1) return error("风控小组设置中已存在该登录名称，请重新指定一个！");
            if(isUnique==2) return error("系统用户表已存在该登录名，请重新指定一个或者通过选择系统用户方式添加！");
        }
        return toAjax(service.insertFkxz(fkxz));
    }

    /**
     * 选择用户
     */
    @GetMapping("/selectUser")
    public String selectUser() {
        return prefix + "/selectUser";
    }

    @PostMapping("/selectUserById/{userId}")
    @ResponseBody
    public AjaxResult selectUserById(@PathVariable("userId") String userId) {
        return AjaxResult.success(userService.selectUserById(userId));
    }

    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @GetMapping("/edit/{id}")
    public String edit(ModelMap model, @PathVariable("id") String id) {
        Fkxz fkxz = service.selectFkxzById(id);
        model.put("entity", fkxz);
        return prefix + "/edit";
    }

    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Fkxz fkxz) {
        String userName = fkxz.getUserName();
//        if(userName != null && userName.trim().length()>0) {
//            int isUnique = service.checkUserName(fkxz);
//            if(isUnique==1) return error("风控小组设置中已存在该登录名称，请重新指定一个！");
//            if(isUnique==2) return error("系统用户表已存在该登录名，请重新指定一个或者通过选择系统用户方式添加！");
//        }
        return toAjax(service.updateFkxz(fkxz));
    }

    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @PostMapping("/delete")
    @ResponseBody
    public AjaxResult delete(String ids) {
        return toAjax(service.delete(ids));
    }

    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception {
        ExcelUtil<Fkxz> util = new ExcelUtil<Fkxz>(Fkxz.class);
        List<Fkxz> fkxzList = util.importExcel(file.getInputStream());
        String message = service.importData(fkxzList, updateSupport);
        return AjaxResult.success(message);
    }

    /**
     * 选择分组树
     */
    @GetMapping(value = { "/selectFzTree" })
    public String selectFzTree() {
        return prefix + "/fztree";
    }

    @GetMapping("/fzTreeData")
    @ResponseBody
    public List<Ztree> fzTreeData() {
        List<Ztree> ztrees = service.selectFzTree();
        return ztrees;
    }

    /**
     * 新增分组
     */
    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @GetMapping("/addFz")
    public String addFz() {
        return prefix + "/addFz";
    }

    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @PostMapping("/addFz")
    @ResponseBody
    public AjaxResult addSaveFz(FkxzFz fz) {
        return toAjax(service.insertFkxzFz(fz));
    }

    /**
     * 修改分组
     */
    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @GetMapping("/editFz/{fzid}")
    public String editFz(@PathVariable("fzid") String fzid, ModelMap model) {
        FkxzFz fz = service.selectFkxzFzByFzid(fzid);
        model.put("entity", fz);
        return prefix + "/editFz";
    }

    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @PostMapping("/editFz")
    @ResponseBody
    public AjaxResult editSaveFz(FkxzFz fz) {
        return toAjax(service.updateFkxzFz(fz));
    }

    /**
     * 删除分组
     */
    @RequiresPermissions("dbfxxt:ts:fkxz:view")
    @PostMapping("/deleteFz")
    @ResponseBody
    public AjaxResult deleteFz(String fzid) {
        return service.deleteFz(fzid);
    }
}
