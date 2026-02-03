package com.syndo.project.zhzs.gcxmxt.controller.ajsfcx;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.gcxmxt.domain.ajsfcx.Ajsfcx;
import com.syndo.project.zhzs.gcxmxt.domain.asgfcx.Asgfcx;
import com.syndo.project.zhzs.gcxmxt.domain.jzsgqygl.Jzsgqygl;
import com.syndo.project.zhzs.gcxmxt.domain.xmzhcx.Xmzhcx;
import com.syndo.project.zhzs.gcxmxt.service.ajsfcx.IAjsfcxService;
import com.syndo.project.zhzs.gcxmxt.service.jzsgqygl.IJzsgqyglService;
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
 * 按建设方查询
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/zhzs/gcxmxt/ajsfcx")
public class AjsfcxController extends BaseController {

	private String prefix = "zhzs/gcxmxt/ajsfcx";

	@Autowired
	private IAjsfcxService service;
	@Autowired
	private BomExcelUtils excelUtils;

	@RequiresPermissions("zhzs:gcxmxt:ajsfcx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {

		return prefix + "/ajsfcxView";
	}

    /**
     * 按建设方查询列表
     *
     * @param ajsfcx
     * @return
     */
    /*@RequiresPermissions("zhzs:gcxmxt:ajsfcx:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Ajsfcx ajsfcx) {
        pageTable();
        List<Ajsfcx> list = service.selectList(ajsfcx);
        return getJsonTable(list);
    }


	/**
	 * 导出
	 */
	@Log(title = "按建设方查询", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Ajsfcx cond) {

		try {
			List<Ajsfcx> list = service.selectList(cond);
			if (list.size() > 0) {
				ExcelUtil<Ajsfcx> util = new ExcelUtil<Ajsfcx>(Ajsfcx.class);
				return util.exportExcel(list, "Ajsfcx");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}
}
