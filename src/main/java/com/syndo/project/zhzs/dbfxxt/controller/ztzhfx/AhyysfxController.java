package com.syndo.project.zhzs.dbfxxt.controller.ztzhfx;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.syndo.common.utils.StringUtils;
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
import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Ahyysfx;
import com.syndo.project.zhzs.dbfxxt.service.ztzhfx.IAhyysfxService;

/**
 *按行业用水分析
 * 
 * @author gxg
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ztzhfx/ahyysfx")
public class AhyysfxController extends BaseController {
	@Autowired
    private IAhyysfxService service;
	/**
	 * 页面跳转地址
	 */
	private String prefix = "zhzs/dbfxxt/ztzhfx/ahyysfx";
	/**
	 * 初始化页面
	 * @param modelMap
	 * @return
	 * @throws ParseException
	 */
	@RequiresPermissions("zhzs:dbfxxt:ztzhfx:ahyysfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) throws ParseException {
		modelMap.put("cxsjq", DateUtils.getYear() + "-01");
		modelMap.put("cxsjz", DateUtils.getMonth());
		return prefix + "/view";
	}

	/**
	 * 查询数据
	 * @param entity
	 * @return
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:ztzhfx:ahyysfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Ahyysfx entity) {
		startPage();
        List<Ahyysfx> list = service.selectList(entity);
		return getDataTable(list);
	}
	/**
	 * 查看图表页面跳转
	 * @param y
	 * @param map
	 * @return
	 */
	@RequestMapping("getChart")
	public String getChart(Ahyysfx y,ModelMap map){
		map.put("nsrmc", y.getNsrmc());
		if(StringUtils.isNotBlank(y.getYf())){
			map.put("yf",y.getYf().substring(0, 4));
		}else{
			map.put("yf","");
		}

		return prefix + "/chart";
	}
	/**
	 * 获取图表数据
	 * @param y
	 * @return
	 */
	@RequestMapping(value="getChartData",method = RequestMethod.GET)
	@ResponseBody
	public  Map<String,Ahyysfx> getChartData(Ahyysfx y){
		return service.getChartData(y);
	}
}
