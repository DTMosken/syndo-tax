package com.syndo.project.zhzs.dbfxxt.controller.ztzhfx;

import java.text.ParseException;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Ahyydfx;
import com.syndo.project.zhzs.dbfxxt.service.ztzhfx.AhyydfxServiceImpl;

/**
 * 按行业用电分析
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ztzhfx/ahyydfx")
public class AhyydfxController extends BaseController {

	@Autowired
    private AhyydfxServiceImpl service;
	/**
	 * 页面跳转地址
	 */
	private String prefix = "zhzs/dbfxxt/ztzhfx/ahyydfx";

	/**
	 * 初始化页面
	 * @param modelMap
	 * @return
	 * @throws ParseException
	 */
	@RequiresPermissions("zhzs:dbfxxt:ztzhfx:ahyydfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		modelMap.put("ssqq", DateUtils.getYear() + "-01");
		modelMap.put("ssqz", DateUtils.getMonth());
		return prefix + "/view";
	}
	/**
	 * 查询数据
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ztzhfx:ahyydfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Ahyydfx entity) {
		startPage();
        List<Ahyydfx> list = service.selectList(entity);
		return getDataTable(list);
	}
	/**
	 * 查看图表页面跳转
	 * @param y
	 * @param map
	 * @return
	 */
	@RequestMapping("getChart")
	public String getChart(Ahyydfx y,ModelMap map){
		map.put("model", y);
		return prefix + "/chart";
	}
	/**
	 * 获取图表数据
	 * @param y
	 * @return
	 */
	@RequestMapping(value="getChartData",method = RequestMethod.GET)
	@ResponseBody
	public Object getChartData(Ahyydfx y){
		return service.getChartData(y);
	}

}
