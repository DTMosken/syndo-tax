package com.syndo.project.zhzs.gcxmxt.controller.zftzxmcx;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.gcxmxt.domain.asgfcx.Asgfcx;
import com.syndo.project.zhzs.gcxmxt.domain.xmzhcx.Xmzhcx;
import com.syndo.project.zhzs.gcxmxt.domain.zftzxmcx.Zftzxmcx;
import com.syndo.project.zhzs.gcxmxt.service.zftzxmcx.IZftzxmcxService;
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
 * 政府投资项目查询
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/zhzs/gcxmxt/zftzxmcx")
public class ZftzxmcxController extends BaseController {

	private String prefix = "zhzs/gcxmxt/zftzxmcx";

	@Autowired
	private IZftzxmcxService service;
	@Autowired
	private BomExcelUtils excelUtils;

	@RequiresPermissions("zhzs:gcxmxt:zftzxmcx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {

		return prefix + "/zftzxmcxView";
	}

    /**
     * 政府投资项目查询列表
     *
     * @param zftzxmcx
     * @return
     */
    /*@RequiresPermissions("zhzs:gcxmxt:zftzxmcx:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Zftzxmcx zftzxmcx) {
        pageTable();
        List<Zftzxmcx> list = service.selectList(zftzxmcx);
        return getJsonTable(list);
    }

	/**
	 * 导出
	 */
	@Log(title = "政府投资项目查询", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Zftzxmcx cond) {

		try {
			List<Zftzxmcx> list = service.selectList(cond);
			if (list.size() > 0) {
				ExcelUtil<Zftzxmcx> util = new ExcelUtil<Zftzxmcx>(Zftzxmcx.class);
				return util.exportExcel(list, "Zftzxmcx");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}

}
