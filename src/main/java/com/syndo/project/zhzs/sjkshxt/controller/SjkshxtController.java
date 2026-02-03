package com.syndo.project.zhzs.sjkshxt.controller;

import com.alibaba.fastjson.JSONObject;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.utils.DictUtils;
import com.syndo.common.utils.http.HttpUtils;
import com.syndo.project.zhzs.sjkshxt.domain.*;
import com.syndo.project.zhzs.sjkshxt.service.ISjkshxtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据可视化系统
 * 
 * @author zyc
 * @date 2020-12-18
 *
 */
@Controller
@RequestMapping("/api1/zhzs/sjkshxt")
@CrossOrigin
public class SjkshxtController extends BaseController {


	@Autowired
	private ISjkshxtService service;

    /**
     * 获取各级次收入占比
     *
     * @return
     */
    @RequestMapping("/getLeftChart1")
	@ResponseBody
	public ModelMap getLeftChart1() {
		ModelMap map = new ModelMap();
		List<Jcsr> list = service.getLeftChart1();
		map.addAttribute("list", list);
		return map;
	}


	/**
	 * 获取收入趋势地方收入与总收入数据
	 *
	 * @return
	 */
	@RequestMapping("/getLeftChart2")
	@ResponseBody
	public ModelMap getLeftChart2() {
		ModelMap map = new ModelMap();
		Map<String,Object> mapData = service.getLeftChart2();
		map.addAttribute("map", mapData);
		return map;
	}


	/**
	 * 获取重点行业税收数据
	 *
	 * @return
	 */
	@RequestMapping("/getLeftChart3")
	@ResponseBody
	public ModelMap getLeftChart3() {
		ModelMap map = new ModelMap();
		Map<String,Object> mapData = service.getLeftChart3();
		map.addAttribute("map", mapData);
		return map;
	}


	/**
	 * 获取企业街道收入---centerTop1数据
	 *
	 * @return
	 */
	@RequestMapping("/getCenterTop1")
	@ResponseBody
	public ModelMap getCenterTop1() {
		ModelMap map = new ModelMap();
		Map<String,Object> mapData = service.getCenterTop1();
		map.addAttribute("map", mapData);
		return map;
	}

	/**
	 * 获取企业街道收入增速---centerBottom1数据
	 *
	 * @return
	 */
	@RequestMapping("/getCenterBottom1")
	@ResponseBody
	public ModelMap getCenterBottom1() {
		ModelMap map = new ModelMap();
		Map<String,Object> mapData = service.getCenterBottom1();
		map.addAttribute("map", mapData);
		return map;
	}


	/**
	 * 获取centerMap数据
	 * @return
	 */
	@RequestMapping("/getCenterMapData")
	@ResponseBody
	public ModelMap getCenterMapData() {
		ModelMap map = new ModelMap();
		Map<String,Object> mapData = service.getCenterMapData();
		map.addAttribute("map", mapData);
		return map;
	}


	/**
	 * 获取数据采集数据
	 * @return
	 */
	@RequestMapping("/getSjcjqkData")
	@ResponseBody
	public ModelMap getSjcjqkData() {
		ModelMap map = new ModelMap();
		List<Sjcjqk> list = service.getSjcjqkData();
		map.addAttribute("list", list);
		return map;
	}



	/**
	 * 获取税收风险情况数据
	 * @return
	 */
	@RequestMapping("/getSsfxqkData")
	@ResponseBody
	public ModelMap getSsfxqkData() {
		ModelMap map = new ModelMap();
		List<Ssfxqk> list = service.getSsfxqkData();
		map.addAttribute("list", list);
		return map;
	}


	/**
	 * 获取税收前十企业数据
	 * @return
	 */
	@RequestMapping("/getSsqsqyData")
	@ResponseBody
	public ModelMap getSsqsqyData() {
		ModelMap map = new ModelMap();
		List<Ssqsqy> list = service.getSsqsqyData();
		map.addAttribute("list", list);
		return map;
	}


	/**
	 * 数据可视化首页
	 */
	@RequestMapping("/gotoSjkshIndex")
	public void  gotoSjkshIndex(HttpServletResponse httpServletResponse) {
		String url = DictUtils.getDictValue("url_vue", "url_index");
		try{
			//httpServletResponse.setHeader("Access-Control-Allow-Origin", url);
			httpServletResponse.sendRedirect(url);
		}catch (Exception e){
			e.printStackTrace();
			logger.error("跳转到数据可视化首页异常：：：：：："+e.getMessage());
		}

	}

}
