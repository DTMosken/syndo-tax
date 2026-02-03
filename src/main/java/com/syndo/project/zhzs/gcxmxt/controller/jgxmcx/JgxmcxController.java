package com.syndo.project.zhzs.gcxmxt.controller.jgxmcx;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.gcxmxt.domain.jgxmcx.Jgxmcx;
import com.syndo.project.zhzs.gcxmxt.domain.jzsgqygl.Jzsgqygl;
import com.syndo.project.zhzs.gcxmxt.domain.shtzxmcx.Shtzxmcx;
import com.syndo.project.zhzs.gcxmxt.service.jgxmcx.IJgxmcxService;
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
 * 竣工项目查询
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/zhzs/gcxmxt/jgxmcx")
public class JgxmcxController extends BaseController {

	private String prefix = "zhzs/gcxmxt/jgxmcx";

	@Autowired
	private IJgxmcxService service;
	@Autowired
	private BomExcelUtils excelUtils;

	@RequiresPermissions("zhzs:gcxmxt:jgxmcx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {

		return prefix + "/jgxmcxView";
	}

    /**
     * 竣工项目查询列表
     *
     * @param jgxmcx
     * @return
     */
    /*@RequiresPermissions("zhzs:gcxmxt:jgxmcx:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Jgxmcx jgxmcx) {
        pageTable();
        List<Jgxmcx> list = service.selectList(jgxmcx);
        return getJsonTable(list);
    }

	/**
	 * 导出
	 */
	@Log(title = "竣工项目查询", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Jgxmcx cond) {

		try {
			List<Jgxmcx> list = service.selectList(cond);
			if (list.size() > 0) {
				ExcelUtil<Jgxmcx> util = new ExcelUtil<Jgxmcx>(Jgxmcx.class);
				return util.exportExcel(list, "Jgxmcx");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}
}
