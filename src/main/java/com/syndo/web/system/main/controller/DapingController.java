package com.syndo.web.system.main.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.StringUtils;
import com.syndo.web.common.BaiDuLocationUtil;
import com.syndo.web.common.PingYinUtil;
import com.syndo.web.domain.system.*;
import com.syndo.web.system.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 外部接口 map
 * 
 * @author ykc
 * @date 2021-12-29
 */
@RequestMapping("/magic-api")
@Controller
public class DapingController extends BaseController {


	@Autowired
	private MainService mainService;


	@RequestMapping("/getSzmap")
	@ResponseBody
	public String getSzmap(ModelMap mmap) {
		List<Szmap> list = mainService.selectSzmap();
		Map<String, List<Szmap>> map = new HashMap<>();
		Set<String> setJdxz = new HashSet();
		for (Szmap i : list
		) {
			setJdxz.add(i.getJdxz());
		}
		for (String s : setJdxz
		) {
			List<Szmap> listInfo = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (s.equals(list.get(i).getJdxz())) {
					listInfo.add(list.get(i));
				}
			}
			map.put(s, listInfo);
		}

		String string = JSONObject.toJSONString(map);
		return string;

	}


	@RequestMapping("/getHymap")
	@ResponseBody
	public String getHymap(ModelMap mmap) {
		List<Hymap> list = mainService.selectHymap();
		Map<String, List<Hymap>> map = new HashMap<>();
		Set<String> setJdxz = new HashSet();
		for (Hymap i : list
		) {
			setJdxz.add(i.getJdxz());
		}
		for (String s : setJdxz
		) {
			List<Hymap> listInfo = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (s.equals(list.get(i).getJdxz())) {
					listInfo.add(list.get(i));
				}
			}
			map.put(s, listInfo);
		}

		String string = JSONObject.toJSONString(map);
		return string;

	}

	/*获取主要税源企业基础信息*/
	@RequestMapping("/zysyqyjcxx")
	@ResponseBody
	public String getZysyqyjcxx(ModelMap mmap) {
		List<Zysyqyjcxx> list = mainService.getZysyqyjcxx();
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (StringUtils.isNotBlank(list.get(i).getZs()) && (StringUtils.isBlank(list.get(i).getLat()) || StringUtils.isBlank(list.get(i).getLng()))) {
					String zs = list.get(i).getZs();
					String rs = replaceAllBlank(zs);
					Map<String, Object> map = BaiDuLocationUtil.getJwd(rs);
					String lng = String.valueOf(map.get("lng"));
					String lat = String.valueOf(map.get("lat"));
					String id = list.get(i).getId();
					mainService.updateLngLat(lng, lat, id);
				}
			}
		}
		List<Zysyqyjcxx> list2 = mainService.getZysyqyjcxx();
		String string = JSONObject.toJSONString(list2,SerializerFeature.WriteMapNullValue);
		return string;
	}


	/*获取纳税大户企业基础信息*/
	@RequestMapping("/nsdhqsqyjcxx")
	@ResponseBody
	public String getNsdhqsqyjcxx(ModelMap mmap) {
		List<Nsdhqsqyjcxx> list = mainService.getNsdhqsqyjcxx();
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (StringUtils.isNotBlank(list.get(i).getZs()) && (StringUtils.isBlank(list.get(i).getLat()) || StringUtils.isBlank(list.get(i).getLng()))) {
					String zs = list.get(i).getZs();
					String rs = replaceAllBlank(zs);
					Map<String, Object> map = BaiDuLocationUtil.getJwd(rs);
					String lng = String.valueOf(map.get("lng"));
					String lat = String.valueOf(map.get("lat"));
					String id = list.get(i).getId();
					mainService.updateLngLatNsdh(lng, lat, id);
				}
			}
		}
		List<Nsdhqsqyjcxx> list2 = mainService.getNsdhqsqyjcxx();
		String string = JSONObject.toJSONString(list2, SerializerFeature.WriteMapNullValue);

		return string;
	}

	/*获取纳税大户前十企业纳税信息月度*/
	@PostMapping("/nsdhqsqynsxxyd")
	@ResponseBody
	public AjaxResult getNsdhqsqynsxxyd(@RequestBody(required = false) JSONObject params) {
		if(null == params|| params.isEmpty()){
			return AjaxResult.error("未找到入参参数");
		}
		String qymc = params.getString("qymc");
		String nsrsbh = params.getString("nsrsbh");
		List<Nsdhqsqynsxxyd> list = mainService.getNsdhqsqynsxxyd(qymc,nsrsbh);
		if(null == list||list.size()==0){
			return AjaxResult.error("未获取到月度信息");
		}
		return AjaxResult.success(list);
	}


	/*获取主要税源企业纳税信息月度*/
	@PostMapping("/zysyqynsxxyd")
	@ResponseBody
	public AjaxResult Zysyqynsxxyd(@RequestBody(required = false) JSONObject params) {
		if(null == params|| params.isEmpty()){
			return AjaxResult.error("未找到入参参数");
		}
		String qymc = params.getString("qymc");
		String nsrsbh = params.getString("nsrsbh");
		List<Nsdhqsqynsxxyd> list = mainService.getZysyqynsxxyd(qymc,nsrsbh);
		if(null == list||list.size()==0){
			return AjaxResult.error("未获取到月度信息");
		}
		return AjaxResult.success(list);
	}


	/*获取预缴信息*/
	/*@PostMapping("/getYjxx")
	@ResponseBody
	public AjaxResult getYjxx() {
		List<Nsdhqsqynsxxyd> list = mainService.getYjxx();
		if(null == list||list.size()==0){
			return AjaxResult.error("未获取到月度信息");
		}
		return AjaxResult.success(list);
	}*/



	//去除所有空格
	public static String replaceAllBlank(String str) {
		String s = "";
		if (str!=null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
		/*\n 回车(\u000a)
            \t ⽔平制表符(\u0009)
            \s 空格(\u0008)
            \r 换⾏(\u000d)*/
			Matcher m = p.matcher(str);
			s = m.replaceAll("");
		}
		return s;
	}

	@RequestMapping("/getPy")
	public static void getPy(){

		try{
			File fileReader = new File("C:\\Users\\Zyc\\Desktop\\123.txt");
			File fileWrite = new File("C:\\Users\\Zyc\\Desktop\\1234.txt");
			BufferedReader reader = null;
			OutputStream writer = null;
			reader = new BufferedReader(new FileReader(fileReader));
			writer = new FileOutputStream(fileWrite);
			String tempString = null;
			int line = 1;
			while((tempString = reader.readLine()) != null ){
				String firstSpell = PingYinUtil.getFirstSpell(tempString);
				tempString = firstSpell+"\r\n";
				byte[] utf8s = tempString.getBytes("UTF8");

				writer.write(utf8s);

				line++;
			}
			reader.close();
			writer.close();
			System.out.println("结束");
		}catch (Exception e){
			e.printStackTrace();
		}
	}


}
