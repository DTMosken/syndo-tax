package com.syndo.project.zhzs.gcxmxt.controller.xmgl;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Gajxpxsybd;
import com.syndo.project.zhzs.gcxmxt.domain.xmgl.Xmgl;
import com.syndo.project.zhzs.gcxmxt.domain.xmzhcx.Xmzhcx;
import com.syndo.project.zhzs.gcxmxt.service.xmgl.IXmglService;
import com.syndo.project.zhzs.gcxmxt.service.xmzhcx.IXmzhcxService;
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
 * 项目管理
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/zhzs/gcxmxt/xmgl")
public class XmglController extends BaseController {

	private String prefix = "zhzs/gcxmxt/xmgl";

	@Autowired
	private IXmglService service;
	@Autowired
	private BomExcelUtils excelUtils;

	@RequiresPermissions("zhzs:gcxmxt:xmgl:view")
	@GetMapping()
	public String view(ModelMap modelMap) {

		return prefix + "/xmglView";
	}

    /**
     * 项目管理查询列表
     *
     * @param xmgl
     * @return
     */
    /*@RequiresPermissions("zhzs:gcxmxt:xmgl:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Xmgl xmgl) {
        pageTable();
        List<Xmgl> list = service.selectList(xmgl);
        return getJsonTable(list);
    }

	/**
	 * 导出
	 */
	@Log(title = "项目管理", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Xmgl cond) {

		try {
			List<Xmgl> list = service.selectList(cond);
			if (list.size() > 0) {
				ExcelUtil<Xmgl> util = new ExcelUtil<Xmgl>(Xmgl.class);
				return util.exportExcel(list, "Xmgl");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}

}
