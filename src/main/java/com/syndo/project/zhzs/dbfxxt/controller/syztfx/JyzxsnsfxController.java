package com.syndo.project.zhzs.dbfxxt.controller.syztfx;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Jyzxsnsfx;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.IJyzxsnsfxService;

/**
 * 加油站行业 加油站销售纳税分析
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/jyzxsnsfx")
public class JyzxsnsfxController extends BaseController {
	
	@Autowired
    private IJyzxsnsfxService service;
	/**
	 * 页面跳转地址
	 */
	private String prefix = "zhzs/dbfxxt/syztfx/jyzxsnsfx";

	/**
	 * 初始化页面
	 * @param modelMap
	 * @return
	 * @throws ParseException
	 */
	@RequiresPermissions("zhzs:dbfxxt:syztfx:jyzxsnsfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("ssyfq", DateUtils.getYear() + "-01");
		modelMap.put("ssyfz", DateUtils.getMonth());
		return prefix + "/jyzxsnsfx";
	}
	/**
	 * 查询数据
	 * @param entity
	 * @return
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Jyzxsnsfx entity) {
		startPage();
        List<Jyzxsnsfx> list = service.selectList(entity);
		return getDataTable(list);
	}
	/**
	 * 二级页面
	 * @param vo
	 * @param model
	 * @return
	 * @throws UnsupportedEncodingException
	 */

	@GetMapping("/twoList")
	public String twoList(Jyzxsnsfx vo, ModelMap model) throws UnsupportedEncodingException{
		model.put("param", vo);
		return prefix + "/twoList";
	}
	
	@PostMapping("/getTwoList")
	@ResponseBody
	public TableDataInfo getTwoList(Jyzxsnsfx entity){
		startPage();
        List<Jyzxsnsfx> list = service.getTwoList(entity);
		return getDataTable(list);
	}
}
