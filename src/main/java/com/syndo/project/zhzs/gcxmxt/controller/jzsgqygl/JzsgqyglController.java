package com.syndo.project.zhzs.gcxmxt.controller.jzsgqygl;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.etl.excel.util.BomExcelUtils;
import com.syndo.project.zhzs.gcxmxt.domain.jzsgqygl.Jzsgqygl;
import com.syndo.project.zhzs.gcxmxt.domain.shtzxmcx.Shtzxmcx;
import com.syndo.project.zhzs.gcxmxt.domain.xmgl.Xmgl;
import com.syndo.project.zhzs.gcxmxt.service.jzsgqygl.IJzsgqyglService;
import com.syndo.project.zhzs.gcxmxt.service.xmgl.IXmglService;
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
 * 建筑施工企业管理
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/zhzs/gcxmxt/jzsgqygl")
public class JzsgqyglController extends BaseController {

	private String prefix = "zhzs/gcxmxt/jzsgqygl";

	@Autowired
	private IJzsgqyglService service;
	@Autowired
	private BomExcelUtils excelUtils;

	@RequiresPermissions("zhzs:gcxmxt:jzsgqygl:view")
	@GetMapping()
	public String view(ModelMap modelMap) {

		return prefix + "/jzsgqyglView";
	}

    /**
     * 建筑施工企业管理查询列表
     *
     * @param jzsgqygl
     * @return
     */
    /*@RequiresPermissions("zhzs:gcxmxt:jzsgqygl:list")*/
    @PostMapping("/list")
    @ResponseBody
    public String list(Jzsgqygl jzsgqygl) {
        pageTable();
        List<Jzsgqygl> list = service.selectList(jzsgqygl);
        return getJsonTable(list);
    }

	/**
	 * 导出
	 */
	@Log(title = "建筑施工企业管理", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Jzsgqygl cond) {

		try {
			List<Jzsgqygl> list = service.selectList(cond);
			if (list.size() > 0) {
				ExcelUtil<Jzsgqygl> util = new ExcelUtil<Jzsgqygl>(Jzsgqygl.class);
				return util.exportExcel(list, "Jzsgqygl");
			} else {
				return new AjaxResult(AjaxResult.Type.ERROR, "未查询到数据");
			}
		}catch (Exception e){
			return new AjaxResult(AjaxResult.Type.ERROR, "导出失败，请联系管理员"+e.getMessage());
		}
	}
}
