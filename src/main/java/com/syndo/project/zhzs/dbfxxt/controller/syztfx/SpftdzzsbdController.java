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
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Spftdzzsbd;
import com.syndo.project.zhzs.dbfxxt.service.syztfx.ISpftdzzsbdService;
/**
 * 商品房土地增值税比对
 *
 * @author ykc
 * @date 2019年7月22日
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/syztfx/spftdzzsbd")
public class SpftdzzsbdController extends BaseController {

	private String prefix = "zhzs/dbfxxt/syztfx/spftdzzsbd";
	
	@Autowired
	private ISpftdzzsbdService service;
	
	@RequiresPermissions("zhzs:dbfxxt:syztfx:spfxxsyztfx:view")
	@GetMapping()
	public String view(ModelMap modelMap) {
		modelMap.put("skssqq", DateUtils.getYear() + "-01");
		modelMap.put("skssqz", DateUtils.getMonth());
		return prefix + "/view";
	}

	/**
	 * 查询列表
	 */
	/*@RequiresPermissions("zhzs:dbfxxt:syztfx:spftdzzsbd:list")*/
	@PostMapping("/list")
	@ResponseBody
	public String list(Spftdzzsbd entity) {
		pageTable();
		if (null == entity.getSkssqq() || null == entity.getSkssqz()) {
			entity.setSkssqq(DateUtils.getYear() + "-01");
			entity.setSkssqz(DateUtils.getMonth());
		}
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.MONTH, -3);
		entity.setDjsj(sdf.format(c.getTime()));*/
		List<Spftdzzsbd> list = service.selectList(entity);
		return getJsonTable(list);
	}

	/**
	 * 导出
	 */
	@Log(title = "房开商增值税分析", businessType = BusinessType.EXPORT)
	@PostMapping("/expExcel")
	@ResponseBody
	public AjaxResult export(Spftdzzsbd cond) {
		List<Spftdzzsbd> list = service.selectList(cond);
		ExcelUtil<Spftdzzsbd> util = new ExcelUtil<Spftdzzsbd>(Spftdzzsbd.class);
		return util.exportExcel(list, "Spftdzzsbd");
	}
	
	/**
	 * 二级页面
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@GetMapping("/twoList")
	public String twoList(ModelMap mapp, Spftdzzsbd cond) throws UnsupportedEncodingException {
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

	/**
	 * 二级页面查询
	 *
	 * @param cond
	 * @return
	 */
	@PostMapping("/getTwoList")
	@ResponseBody
	public String getTwoList(Spftdzzsbd cond) {
		pageTable();
		List<Spftdzzsbd> list = service.getTwoList(cond);
		return getJsonTable(list);
	}
	
	/**
	 * 三级页面
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@GetMapping("/threeList")
	public String threeList(ModelMap mapp, Spftdzzsbd cond) throws UnsupportedEncodingException {
		mapp.put("qymc", URLEncoder.encode(cond.getQymc(), "utf-8"));
		mapp.put("qysj", cond.getQysj());
		return prefix + "/threeList";
	}

	@PostMapping("/getThreeList")
	@ResponseBody
	public String getThreeList(Spftdzzsbd cond) {
		pageTable();
		List<Spftdzzsbd> list = service.getThreeList(cond);
		return getJsonTable(list);
	}
}
