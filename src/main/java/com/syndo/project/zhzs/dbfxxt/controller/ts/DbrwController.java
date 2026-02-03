package com.syndo.project.zhzs.dbfxxt.controller.ts;

import com.syndo.common.config.MainConfig;
import com.syndo.common.config.ServerConfig;
import com.syndo.common.constant.Constants;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.file.FileUploadUtils;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Dbrw;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Lzxx;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Rwfk;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Rwsh;
import com.syndo.project.zhzs.dbfxxt.service.ts.DbrwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * 待办任务
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ts/dbrw")
public class DbrwController extends BaseController {
    private String prefix = "zhzs/dbfxxt/ts/dbrw";

    @Autowired
    private DbrwService service;

	/**
	 * 待办任务页面
	 */
    @GetMapping()
    public String view(ModelMap model) {
        // 是否有风控小组成员角色
        boolean isFkry = false;
        boolean isFkzz = false;
        String userId = getUserId();
        List<String> roles = service.getRoles(userId);
        for (String r : roles) {
            if("fkxz0".equals(r)) {
                isFkry = true;
            } else if("fkxz1".equals(r)) {
            	isFkzz = true;
            }
        }
        model.put("userId", userId);
        model.put("isFkry", isFkry);
        model.put("isFkzz", isFkzz);
        return prefix + "/view";
    }

    /**
     * 待办任务页面查询列表内容
     */
    @PostMapping("/list")
    @ResponseBody
    public String list(Dbrw entity) {
        pageTable();
        List<Dbrw> list = service.selectList(entity);
        return getJsonTable(list);
    }
    
    /**
     * 任务流转列表内容
     */
    @PostMapping("/rwlzList")
    @ResponseBody
    public String rwlzList(String id) {
//        pageTable();
        List<Lzxx> list = service.selectRwlzList(id);
        return getJsonTable(list);
    }

    /**
     * 任务反馈页面
     */
    @GetMapping("/rwfk/{id}/{lx}")
    public String rwfk(@PathVariable("id") String id, @PathVariable("lx") String lx, ModelMap model) {
        Rwfk rwfk = service.initRwfk(id);
        model.put("entity", rwfk);
        model.put("currentUser", getUserId());
        return prefix + "/rwfk";
    }
    
    /**
     * 批量任务反馈页面
     */
    @GetMapping("/rwfkpl/{ids}/{lx}")
    public String rwfkpl(@PathVariable("ids") String ids, @PathVariable("lx") String lx, ModelMap model) {
        Rwfk rwfk = service.initPlrwfk(ids);
        model.put("entity", rwfk);
        model.put("currentUser", getUserId());
        return prefix + "/rwfkpl";
    }
    
    /**
     * 任务审核页面
     */
    @GetMapping("/rwsh/{id}/{lx}")
    public String rwsh(@PathVariable("id") String id, @PathVariable("lx") String lx, ModelMap model) {
        Rwsh rwsh = service.initRwsh(id);
        model.put("entity", rwsh);
        boolean isFkzz = false;
        List<String> roles = service.getRoles(getUserId());
        for (String r : roles) {
            if("fkxz1".equals(r)) {
            	isFkzz = true;
            	break;
            }
        }
        model.put("isFkzz", isFkzz);
        return prefix + "/rwsh";
    }

    @Autowired
    private ServerConfig serverConfig;

    /**
     * 上传文件
     */
    @PostMapping("/upload")
    @ResponseBody
    public AjaxResult upload(MultipartFile file) {
        try {
            // 上传文件路径
            String filePath = MainConfig.getUploadPath();
            // 上传并返回新文件名称
            String fileName = FileUploadUtils.upload(filePath, file);
            String url = serverConfig.getUrl() + fileName;
            AjaxResult ajax = AjaxResult.success();
            ajax.put("fileName", fileName);
            ajax.put("url", url);
            return ajax;
        } catch (Exception e) {
            return AjaxResult.error(e.getMessage());
        }
    }
    /**
     * 删除上传的文件
     */
    @PostMapping("/delUpload")
    @ResponseBody
    public AjaxResult delUpload(String fileName) {
        String filePath = MainConfig.getUploadPath();
        //去掉/profile
        fileName = fileName.replaceFirst(Constants.RESOURCE_PREFIX, "");
        //去掉/upload
        fileName = fileName.replaceFirst("upload", "");
        File file = new File(filePath+fileName);
        if (file.exists()) {
            file.delete();
        }

        return AjaxResult.success();
    }
    /**
     * 提交任务反馈
     */
    @PostMapping("/rwfk")
    @ResponseBody
    public AjaxResult rwfk(Rwfk rwfk) {
        return service.rwfk(rwfk);
    }
    /**
     * 撤回任务反馈
     */
    @PostMapping("/rwfk2")
    @ResponseBody
    public AjaxResult rwfk2(Rwfk rwfk) {
        return service.rwfk2(rwfk);
    }
    /**
     * 批量提交任务反馈
     */
    @PostMapping("/rwfkpl")
    @ResponseBody
    public AjaxResult rwfkpl(Rwfk rwfk) {
        return service.rwfkpl(rwfk);
    }
    /**
     * 批量撤回任务反馈
     */
    @PostMapping("/rwfkpl2")
    @ResponseBody
    public AjaxResult rwfkpl2(Rwfk rwfk) {
        return service.rwfkpl2(rwfk);
    }
    
    /**
     * 任务审核-归档
     */
    @PostMapping("/rwsh")
    @ResponseBody
    public AjaxResult rwsh(Rwsh rwsh) {
        rwsh.setZt("3");
        return service.rwsh(rwsh);
    }
    
    /**
     * 任务审核退回
     */
    @PostMapping("/rwsh2")
    @ResponseBody
    public AjaxResult rwsh2(Rwsh rwsh) {
        return service.rwsh2(rwsh);
    }

    /**
     * 任务审核-消除
     */
    @PostMapping("/rwsh3")
    @ResponseBody
    public AjaxResult rwsh3(Rwsh rwsh) {
        rwsh.setZt("3.2");
        return service.rwsh(rwsh);
    }

    /**
     * 任务审核-转稽查
     */
    @PostMapping("/rwsh4")
    @ResponseBody
    public AjaxResult rwsh4(Rwsh rwsh) {
        rwsh.setZt("3.3");
        return service.rwsh(rwsh);
    }
    
    /**
     * 查看明细
     */
    @GetMapping("/ckmx/{id}")
    public String ckmx(@PathVariable("id") String id) {
        String url = null;
        try {
            url = service.getCkmxUrl(id);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "redirect:"+url;
    }
    
    /**
     * 查看反馈
     */
    @GetMapping("/ckfk/{id}")
    public String ckfk(@PathVariable("id") String id, ModelMap model) {
        Rwfk rwfk = service.initRwfk(id);
        model.put("entity", rwfk);
        return prefix + "/ckfk";
    }

}
