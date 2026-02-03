package com.syndo.project.zhzs.gcxmxt.controller.xmzhcx;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.gcxmxt.domain.jzsgqygl.Jzsgqygl;
import com.syndo.project.zhzs.gcxmxt.domain.xmgl.Xmgl;
import com.syndo.project.zhzs.gcxmxt.domain.xmzhcx.Xmzhcx;
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
 * 项目综合查询
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/zhzs/gcxmxt/xmzhcx")
public class XmzhcxController extends BaseController {

	private String prefix = "zhzs/gcxmxt/xmzhcx";

	@Autowired
	private IXmzhcxService service;
	@Autowired
	private BomExcelUtils excelUtils;

	@RequiresPermissions("zhzs:gcxmxt:xmzhcx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {

		return prefix + "/xmzhcxView";
	}

    /**
     * 项目管理查询列表
     *
     * @param xmzhcx
     * @return
     */
    /*@RequiresPermissions("zhzs:gcxmxt:xmzhcx:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Xmzhcx xmzhcx) {
        pageTable();
        List<Xmzhcx> list = service.selectList(xmzhcx);
        return getJsonTable(list);
    }


	/**
	 * 导出
	 */
	@Log(title = "项目综合查询", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Xmzhcx cond) {

		try {
			List<Xmzhcx> list = service.selectList(cond);
			if (list.size() > 0) {
				ExcelUtil<Xmzhcx> util = new ExcelUtil<Xmzhcx>(Xmzhcx.class);
				return util.exportExcel(list, "Xmzhcx");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}

}
