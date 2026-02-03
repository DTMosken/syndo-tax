package com.syndo.project.zhzs.dbfxxt.controller.syztfx;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syndo.common.annotation.Log;
import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.enums.BusinessType;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.poi.ExcelUtil;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Spfxssybd;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.ISpfxssybdService;

/**
 * 商品房销售税源比对 增值税   房开商土地增值税分析
 * 
 * @author xrc
 *
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/spfxssybd")
public class SpfxssybdController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/spfxssybd";

	@Autowired
	private ISpfxssybdService spfxssybdService;

	@RequiresPermissions("zhzs:dbfxxt:syztfx:spfxssyztfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("skssqq", DateUtils.getYear() + "-01");
		modelMap.put("skssqz", DateUtils.getMonth());
		return prefix + "/spfxssybd";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:spfxssyztfx:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Spfxssybd spfxssybd) {
		pageTable();
		if (null == spfxssybd.getSkssqq() || null == spfxssybd.getSkssqz()) {
			spfxssybd.setSkssqq(DateUtils.getYear() + "-01");
			spfxssybd.setSkssqz(DateUtils.getMonth());
		}
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.MONTH, -3);
		spfxssybd.setDjsj(sdf.format(c.getTime()));*/
		List<Spfxssybd> list = spfxssybdService.selectList(spfxssybd);
		return getJsonTable(list);
	}


	/**
	 * 导出
	 */
	@Log(title = "房开商增值税分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Spfxssybd cond) {
		List<Spfxssybd> list = spfxssybdService.selectList(cond);
		ExcelUtil<Spfxssybd> util = new ExcelUtil<Spfxssybd>(Spfxssybd.class);
		return util.exportExcel(list, "Spfxssybd");
	}

	/**
	 * 二级页面
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@GetMapping("/twoList")
	public String twoList(ModelMap mapp, Spfxssybd cond) throws UnsupportedEncodingException {
		mapp.put("qymc", URLEncoder.encode(cond.getQymc(), "utf-8"));
		mapp.put("skssqq", cond.getSkssqq());
		mapp.put("skssqz", cond.getSkssqz());
		mapp.put("sfqj", URLEncoder.encode(cond.getSfqj(), "utf-8"));
		mapp.put("cedy", cond.getCedy());
		mapp.put("cexy", cond.getCexy());
		mapp.put("zzcedy", cond.getZzcedy());
		mapp.put("zzcexy", cond.getZzcexy());
		return prefix + "/twoList";
	}

	@PostMapping("/getTwoList")
	@ResponseBody
	public String getTwoList(Spfxssybd cond) {
		pageTable();
		List<Spfxssybd> list = spfxssybdService.getTwoList(cond);
		return getJsonTable(list);
	}

	/**
	 * 三级页面
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@GetMapping("/threeList")
	public String threeList(ModelMap mapp, Spfxssybd cond) throws UnsupportedEncodingException {
		mapp.put("qymc", URLEncoder.encode(cond.getQymc(), "utf-8"));
		mapp.put("qysj", cond.getQysj());
		return prefix + "/threeList";
	}

	@PostMapping("/getThreeList")
	@ResponseBody
	public String getThreeList(Spfxssybd cond) {
		pageTable();
		List<Spfxssybd> list = spfxssybdService.getThreeList(cond);
		return getJsonTable(list);
	}
}
