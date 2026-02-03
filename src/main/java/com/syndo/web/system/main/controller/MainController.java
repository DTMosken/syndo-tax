package com.syndo.web.system.main.controller;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.entity.User;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.StringUtils;
import com.syndo.common.utils.encry.RsaUtils;
import com.syndo.common.utils.http.HttpUtils;
import com.syndo.framework.shiro.service.PasswordService;
import com.syndo.web.common.CASServiceUtil;
import com.syndo.web.common.XmlUtils;
import org.apache.commons.collections4.map.MultiValueMap;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.*;

import com.alibaba.fastjson.JSONObject;
import com.syndo.common.config.MainConfig;
import com.syndo.web.system.main.service.MainService;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.HashMap;

/**
 * 首页
 * 
 * @author ykc
 * @date 2021-12-29
 */
@Controller
public class MainController extends BaseController {

	@Autowired
	private MainConfig mainConfig;
	@Autowired
	private MainService mainService;
	@Autowired
	private PasswordService passwordService;
    @Value("${cas.prefixUrl}")
    private String prefixUrl;
    @Value("${cas.localUrl}")
    private String localUrl;
	@Value("${cas.localBaseUrl}")
	private String localBaseUrl;
	@Value("${cas.httpGetUrl}")
	private String httpGetUrl;
	/**
	 * 首页
	 */
	@GetMapping("/system/main")
	public String main(ModelMap mmap) {
		mmap.put("version", mainConfig.getVersion());
		return "main";
	}

	@GetMapping("/validateLogin/tick")
	public Object validateLogin2(@RequestParam(name="ticket") String ticket,
								HttpServletRequest request,
								HttpServletResponse response,RedirectAttributes redirectAttributes) throws Exception {
		//Result<JSONObject> result = new Result<JSONObject>();
		try {
			logger.info("进入validateLogin方法::::::::::::"+ DateUtils.dateTimeNow());
			String validateUrl = prefixUrl+"/p3/serviceValidate";
			String service = URLEncoder.encode(localUrl,"UTF-8");
			String res = CASServiceUtil.getSTValidate(validateUrl, ticket, service);
			logger.info("res校验返回."+res);
			final String error = XmlUtils.getTextForElement(res, "authenticationFailure");
			if(StringUtils.isNotEmpty(error)) {
				throw new Exception(error);
			}

			//--------------------------------------------------------------------------------------------
			final String principal = XmlUtils.getTextForElement(res, "user");
			if (StringUtils.isEmpty(principal)) {
				throw new Exception("No principal was found in the response from the CAS server.");
			}

            //判断是否存在于本地
            int i = mainService.getUserLocal(principal);
			String password = "";
			Boolean rememberMe = false;
			UsernamePasswordToken token = null;
			if(i == 0){
				password="yxtydlpwd";
				User user = new User();
				user.randomSalt();
				user.setLoginName(principal);
				user.setPassword(password);
				String newPassword = this.passwordService.encryptPassword(user.getLoginName(), user.getPassword(), user.getSalt());
				String salt = user.getSalt();
				//插入到user表中
				mainService.insertIntoUser(principal,newPassword,salt);
				 token = new UsernamePasswordToken(principal, password, rememberMe);
				Subject subject = SecurityUtils.getSubject();
				subject.login(token);
				redirectAttributes.addFlashAttribute("localBaseUrl",localBaseUrl);
				redirectAttributes.addFlashAttribute("prefixUrl",prefixUrl);
				logger.info("新用户校验完成...");
				return "redirect:/index";
			}else{
				password = "NOPASSWORD";
				token = new UsernamePasswordToken(principal, password, rememberMe);
				Subject subject = SecurityUtils.getSubject();
				subject.login(token);
				//attribdatautes.addFlashAttribute("localBaseUrl",localBaseUrl);
				//attribdatautes.addFlashAttribute("prefixUrl",prefixUrl);
				redirectAttributes.addFlashAttribute("localBaseUrl",localBaseUrl);
				redirectAttributes.addFlashAttribute("prefixUrl",prefixUrl);
				logger.info("用户校验完成...");
				return "redirect:/index";
			}

		} catch (Exception e) {
		    logger.info("登录失败：：："+e.getMessage());
		    e.printStackTrace();
            return "redirect:error";
			//e.printStackTrace();
			//result.error500(e.getMessage());
		}
	}


	@GetMapping("/validateLogin")
	public void validateLogin(@RequestParam(name="ticket",required = false) String ticket, HttpServletResponse response )throws Exception {
		if(StringUtils.isBlank(ticket)){
			String u = URLEncoder.encode(localUrl);
			response.sendRedirect(httpGetUrl+u);
			logger.info("回调完毕...");
		}
	}


	/**
	 * 获取首页数据
	 *
	 */
	@PostMapping("/system/getMainData")
	@ResponseBody
	public String getMainData(ModelMap mmap) {
		JSONObject result = new JSONObject();
		try {
			JSONObject json = mainService.getMainData();
			result.put("data", json);
			result.put("code", "0");
			result.put("msg", "成功");
		} catch (Exception e) {
			result.put("code", "500");
			result.put("msg", e.getMessage());
		}
		return result.toJSONString();
	}

	@GetMapping("/404.do")
	public String notFound() {
		// 跳转到404页面：/jsp/404.jsp
		return "redirect:/login";
	}

}
