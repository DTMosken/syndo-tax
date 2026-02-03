package com.syndo.project.zhzs.gcxmxt.controller.shtzxmcx;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.gcxmxt.domain.shtzxmcx.Shtzxmcx;
import com.syndo.project.zhzs.gcxmxt.domain.zftzxmcx.Zftzxmcx;
import com.syndo.project.zhzs.gcxmxt.service.shtzxmcx.IShtzxmcxService;
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
 * 社会投资项目查询
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/zhzs/gcxmxt/shtzxmcx")
public class ShtzxmcxController extends BaseController {

	private String prefix = "zhzs/gcxmxt/shtzxmcx";

	@Autowired
	private IShtzxmcxService service;
	@Autowired
	private BomExcelUtils excelUtils;

	@RequiresPermissions("zhzs:gcxmxt:shtzxmcx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {

		return prefix + "/shtzxmcxView";
	}

    /**
     * 社会投资项目查询列表
     *
     * @param shtzxmcx
     * @return
     */
    /*@RequiresPermissions("zhzs:gcxmxt:shtzxmcx:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Shtzxmcx shtzxmcx) {
        pageTable();
        List<Shtzxmcx> list = service.selectList(shtzxmcx);
        return getJsonTable(list);
    }


	/**
	 * 导出
	 */
	@Log(title = "社会投资项目查询", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Shtzxmcx cond) {

		try {
			List<Shtzxmcx> list = service.selectList(cond);
			if (list.size() > 0) {
				ExcelUtil<Shtzxmcx> util = new ExcelUtil<Shtzxmcx>(Shtzxmcx.class);
				return util.exportExcel(list, "Shtzxmcx");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}
}
