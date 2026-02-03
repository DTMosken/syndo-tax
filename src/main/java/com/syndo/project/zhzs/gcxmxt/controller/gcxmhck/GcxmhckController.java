package com.syndo.project.zhzs.gcxmxt.controller.gcxmhck;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.gcxmxt.domain.gcxmhck.Gcxmhck;
import com.syndo.project.zhzs.gcxmxt.service.gcxmhck.IGcxmhckService;
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
 * 工程项目核查库
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/zhzs/gcxmxt/gcxmhck")
public class GcxmhckController extends BaseController {

	private String prefix = "zhzs/gcxmxt/gcxmhck";

	@Autowired
	private IGcxmhckService service;
	@Autowired
	private BomExcelUtils excelUtils;

	@RequiresPermissions("zhzs:gcxmxt:gcxmhck:view")
	@GetMapping()
	public String view(ModelMap modelMap) {

		return prefix + "/gcxmhckView";
	}

    /**
     * 工程项目核查库查询列表
     *
     * @param gcxmhck
     * @return
     */
    /*@RequiresPermissions("zhzs:gcxmxt:gcxmhck:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Gcxmhck gcxmhck) {
        pageTable();
        List<Gcxmhck> list = service.selectList(gcxmhck);
        return getJsonTable(list);
    }

	/**
	 * 导出
	 */
	@Log(title = "工程项目核查库", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Gcxmhck cond) {

		try {
			List<Gcxmhck> list = service.selectList(cond);
			if (list.size() > 0) {
				ExcelUtil<Gcxmhck> util = new ExcelUtil<Gcxmhck>(Gcxmhck.class);
				return util.exportExcel(list, "Gcxmhck");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}
}
