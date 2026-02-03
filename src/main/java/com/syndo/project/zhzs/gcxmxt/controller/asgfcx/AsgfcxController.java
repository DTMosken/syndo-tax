package com.syndo.project.zhzs.gcxmxt.controller.asgfcx;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.gcxmxt.domain.asgfcx.Asgfcx;
import com.syndo.project.zhzs.gcxmxt.service.asgfcx.IAsgfcxService;
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
 * 按施工方查询
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/zhzs/gcxmxt/asgfcx")
public class AsgfcxController extends BaseController {

	private String prefix = "zhzs/gcxmxt/asgfcx";

	@Autowired
	private IAsgfcxService service;
	@Autowired
	private BomExcelUtils excelUtils;

	@RequiresPermissions("zhzs:gcxmxt:asgfcx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {

		return prefix + "/asgfcxView";
	}

    /**
     * 施工方查询列表
     *
     * @param asgfcx
     * @return
     */
    /*@RequiresPermissions("zhzs:gcxmxt:asgfcx:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Asgfcx asgfcx) {
        pageTable();
        List<Asgfcx> list = service.selectList(asgfcx);
        return getJsonTable(list);
    }


	/**
	 * 导出
	 */
	@Log(title = "按施工方查询", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Asgfcx cond) {

		try {
			List<Asgfcx> list = service.selectList(cond);
			if (list.size() > 0) {
				ExcelUtil<Asgfcx> util = new ExcelUtil<Asgfcx>(Asgfcx.class);
				return util.exportExcel(list, "Asgfcx");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}
}
