package com.syndo.project.industry.wstb.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.domain.entity.User;
import com.syndo.common.utils.DateUtils;
import com.syndo.project.industry.wstb.domain.Wstb_tdxx;
import com.syndo.project.industry.wstb.domain.Wstb_ydhhxx;
import com.syndo.project.industry.wstb.domain.Wstb_yshhxx;
import com.syndo.project.industry.wstb.domain.Wstb_zhxx;
import com.syndo.project.industry.wstb.service.IWstbService;

 
/**
 * 网上填报test
 * @author hry
 *
 */
@Controller
@RequestMapping("/module/wstb")
public class WstbController  extends BaseController {
	@Autowired
	private IWstbService service;
	
	private String prefix = "module/wstb";
	@GetMapping()
	public String view(ModelMap modelMap,Wstb_zhxx jbxx) throws ParseException {
		User user = getSysUser();
		jbxx.setQYMC( user.getUserName());//企业名称
		jbxx.setTYSHXYDM(user.getLoginName());//统一社会信用代码
		jbxx.setPJNF(DateUtils.getYear());//评价年份
		Wstb_zhxx getWstb = service.GetWstb(jbxx);
		 if( null == getWstb) {
			 getWstb = new Wstb_zhxx();
		 }
		//获取出租信息
		getWstb.setCHUZULST(service.GetWstbChuzu(getWstb.getID()));
		//获取承租信息
		getWstb.setCHENGZULST(service.GetWstbChengzu(getWstb.getID()));
		//获取用水户号信息
		getWstb.setYSHHXXLST(service.GetWstbYshhxx(getWstb.getID()));
		//获取用电户号信息
		getWstb.setYDHYXXLST(service.GetWstbYdhhxx(getWstb.getID()));
		modelMap.put("Wstb_zhxx", getWstb);
		return prefix + "/add";
	}
	
	
	
	/**
	 * 保存
	 * @param
	 * @return
	 */
	@RequiresPermissions("module:wstb:update")
	@PostMapping("/update")
	@ResponseBody
	public AjaxResult updateSave(Wstb_zhxx entity) {	
		//评价年份
		  entity.setPJNF(DateUtils.getYear());
		 service.updateSave(entity);
		 //保存评价指标	
		 Wstb_zhxx getWstb = service.GetWstb(entity);		 	
		 entity.setID(getWstb.getID());
		 service.updateSavePjzb(entity);
		 
		 // 子表  先删后增		 
	      Map m1 = new HashMap(); 
	      m1.put("WSTBTABLENAME","T_QY_TDXX");
	      m1.put("WSTBPID",entity.getID());
 		 service.deleteByIds(m1);
 		 
	      m1.put("WSTBTABLENAME","T_QY_YDHHXX");
	      m1.put("WSTBPID",entity.getID());
		 service.deleteByIds(m1);
		 	
	      m1.put("WSTBTABLENAME","T_QY_YSHHXX");
	      m1.put("WSTBPID",entity.getID());
		 service.deleteByIds(m1); 
 		 
		 // 保存出租土地信息
			String Cztdxx= entity.getChuzuxxinp();
			if(!StringUtils.isEmpty(Cztdxx)) {
			JSONArray jsonArray = JSONArray.parseArray(Cztdxx);
			List<Wstb_tdxx> czlist = JSONObject.parseArray(jsonArray.toJSONString(), Wstb_tdxx.class);
			for (Wstb_tdxx wstb_tdxx : czlist) {
				service.insertTdxx(wstb_tdxx);
			}			
			}
		 
		 
		// 保存承租土地信息
			String chengzu= entity.getChengzuxxinp();
			if(!StringUtils.isEmpty(chengzu)) {
			JSONArray jsonArrayCz = JSONArray.parseArray(chengzu);
			List<Wstb_tdxx> Chuzulist = JSONObject.parseArray(jsonArrayCz.toJSONString(), Wstb_tdxx.class);
			for (Wstb_tdxx wstb_tdxx : Chuzulist) {
				service.insertTdxx(wstb_tdxx);
			}			
			}
		// 保存用电户号信息
			String ydhhxx= entity.getYdhhxxinp();
			if(!StringUtils.isEmpty(ydhhxx)) {
			JSONArray jsonArrayYd = JSONArray.parseArray(ydhhxx);
			List<Wstb_ydhhxx> Ydlist = JSONObject.parseArray(jsonArrayYd.toJSONString(), Wstb_ydhhxx.class);
			for (Wstb_ydhhxx ydxx : Ydlist) {
				service.insertYdhhxx(ydxx);
			}			
			}
		 
		// 用水户号信息
			String yshhxx= entity.getYshhxxinp();
			if(!StringUtils.isEmpty(yshhxx)) {
			JSONArray jsonArrayYs = JSONArray.parseArray(yshhxx);
			List<Wstb_yshhxx> Yslist = JSONObject.parseArray(jsonArrayYs.toJSONString(), Wstb_yshhxx.class);
			for (Wstb_yshhxx wstb_tdxx : Yslist) {
				service.insertYshhxx(wstb_tdxx);
			}	 
			}
		return toAjax(1);
	}
}
