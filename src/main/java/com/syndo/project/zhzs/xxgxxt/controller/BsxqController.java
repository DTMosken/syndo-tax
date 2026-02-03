package com.syndo.project.zhzs.xxgxxt.controller;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
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
import com.syndo.project.zhzs.xxgxxt.domain.Bsxq;
import com.syndo.project.zhzs.xxgxxt.service.IBsxqService;

/**
 * 报送详情
 *
 */
@Controller
@RequestMapping("/zhzs/xxgxxt/bsxq")
public class BsxqController extends BaseController {

	private String prefix = "zhzs/xxgxxt/bsxq";

	@Autowired
	private IBsxqService bsxqService;

	@RequiresPermissions("zhzs:bsxq:view")
	@GetMapping()
	public String Bsxq(ModelMap modelMap) throws ParseException {
		// Calendar begin = Calendar.getInstance();
		// begin.setTime(new Date());
		// begin.add(Calendar.MONTH, -1);
		// DateFormat df = new SimpleDateFormat("yyyy-MM");
		
		modelMap.put("dateTime", DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		// modelMap.put("dateTime", df.format(begin.getTime()));
		return prefix + "/bsxq";
	}

	/**
	 * 查询列表
	 */
	@RequiresPermissions("zhzs:bsxq:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Bsxq bsxq) {
		startPage();
		// if (null == bsxq.getDateTime()) {
		// 	bsxq.setDateTime(DateUtils.parseDateToStr("yyyy-MM", DateUtils.getNowDate()));
		// }
		if(bsxq != null && StringUtils.isNotEmpty(bsxq.getBsTime())) {
			String[] dateTime = bsxq.getBsTime().split(" 至 ");
			bsxq.setBsTimeStart(dateTime[0]);
			bsxq.setBsTimeEnd(dateTime[1]);
		}
		List<Bsxq> list = bsxqService.selectBsxqList(bsxq);
		return getDataTable(list);
	}
}
