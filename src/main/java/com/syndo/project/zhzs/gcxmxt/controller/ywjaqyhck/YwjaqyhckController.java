package com.syndo.project.zhzs.gcxmxt.controller.ywjaqyhck;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.gcxmxt.domain.gcxmhck.Gcxmhck;
import com.syndo.project.zhzs.gcxmxt.domain.ywjaqyhck.Ywjaqyhck;
import com.syndo.project.zhzs.gcxmxt.service.gcxmhck.IGcxmhckService;
import com.syndo.project.zhzs.gcxmxt.service.ywjaqyhck.IYwjaqyhckService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 域外建安企业核查库
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/zhzs/gcxmxt/ywjaqyhck")
public class YwjaqyhckController extends BaseController {

	private String prefix = "zhzs/gcxmxt/ywjaqyhck";

	@Autowired
	private IYwjaqyhckService service;
	@Autowired
	private BomExcelUtils excelUtils;

	@RequiresPermissions("zhzs:gcxmxt:ywjaqyhck:view")
	@GetMapping()
	public String view(ModelMap modelMap) {

		return prefix + "/ywjaqyhckView";
	}

    /**
     * 域外建安企业核查库查询列表
     *
     * @param ywjaqyhck
     * @return
     */
    /*@RequiresPermissions("zhzs:gcxmxt:ywjaqyhck:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Ywjaqyhck ywjaqyhck) {
        pageTable();
        List<Ywjaqyhck> list = service.selectList(ywjaqyhck);
        return getJsonTable(list);
    }

	/**
	 * 导出
	 */
	@Log(title = "域外建安企业核查库", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Ywjaqyhck ywjaqyhck) {

		try {
			List<Ywjaqyhck> list = service.selectList(ywjaqyhck);
			if (list.size() > 0) {
				ExcelUtil<Ywjaqyhck> util = new ExcelUtil<Ywjaqyhck>(Ywjaqyhck.class);
				return util.exportExcel(list, "Ywjaqyhck");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}
}
