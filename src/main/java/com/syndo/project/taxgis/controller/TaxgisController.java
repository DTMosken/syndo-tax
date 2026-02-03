package com.syndo.project.taxgis.controller;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.domain.entity.User;
import com.syndo.common.core.page.TableDataInfo;
import com.syndo.project.taxgis.domain.QyglTreeData;
import com.syndo.project.taxgis.domain.GisGlqy;
import com.syndo.project.taxgis.domain.HyTreeData;
import com.syndo.project.taxgis.domain.TaxgisNsrxx;
import com.syndo.project.taxgis.domain.TaxgisXmxx;
import com.syndo.project.taxgis.service.TaxgisService;
import com.syndo.system.service.IConfigService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/module/taxgis")
public class TaxgisController extends BaseController {
	private String prefix = "taxgis";

	@GetMapping("/{module}")
	public String view(@PathVariable("module") String module, ModelMap model) {
		model.put("module", module);
		String useOnlineTdt = configService.selectConfigByKey("sys.taxgis.useOnlineTdt");
		if (useOnlineTdt != null) {
			if (useOnlineTdt.trim().equalsIgnoreCase("true"))
				model.put("useOnlineTdt", true);
			else if (useOnlineTdt.trim().equalsIgnoreCase("false"))
				model.put("useOnlineTdt", false);

		}
		String limitBound = configService.selectConfigByKey("sys.taxgis.limitBound");
		if (limitBound != null) {
			if (limitBound.trim().equalsIgnoreCase("true"))
				model.put("limitBound", true);
			else if (limitBound.trim().equalsIgnoreCase("false"))
				model.put("limitBound", false);
		}
		return prefix + "/map";
	}

	// @GetMapping(value = "/vue/{file}", produces = "application/x-javascript")
	// public String view(@PathVariable String file) {
	// return prefix + "/vue/" + file;
	// }

	@Autowired
	TaxgisService service;
	@Autowired
	private IConfigService configService;

	/**
	 * 查询纳税人标注信息
	 * 
	 * @return
	 */
	@PostMapping("/GetNsrxxBz")
	@ResponseBody
	public TableDataInfo getNsrxxBz(TaxgisNsrxx nsrxx) {
		User user = this.getSysUser();
		startPage();
		List<TaxgisNsrxx> list = service.getNsrxxBz(nsrxx, user);
		TableDataInfo info = getDataTable(list);

		return info;
	}
//    public String getNsrxxBz(TaxgisNsrxx nsrxx) {
//        User user = this.getSysUser();
//        pageTable();
//        List<TaxgisNsrxx> list = service.getNsrxxBz(nsrxx, user);
//        return getJsonTable(list);
//    }

	@PostMapping("/GetNsrxxBzByNsrmcs")
	@ResponseBody
	public List<TaxgisNsrxx> getNsrxxBzByNsrmcs(String nsrmcs) {
		return service.getNsrxxBzByNsrmcs(nsrmcs);
	}

	@PostMapping("/SaveQybz")
	@ResponseBody
	public AjaxResult saveQybz(TaxgisNsrxx vo) {
		return toAjax(service.saveQybz(vo, this.getSysUser()));
	}

	@PostMapping("/DelQybz")
	@ResponseBody
	public AjaxResult delQybz(TaxgisNsrxx vo) {
		return toAjax(service.delQybz(vo));
	}

	/**
	 * 查询项目标注信息
	 * 
	 * @return
	 */
	@PostMapping("/GetXmxxBz")
	@ResponseBody
	public TableDataInfo getXmxxBz(TaxgisXmxx xmxx) {
		startPage();
		User user = this.getSysUser();
		List<TaxgisXmxx> list = service.getXmxxBz(xmxx, user);

		return getDataTable(list);
	}

	@PostMapping("/SaveXmxx")
	@ResponseBody
	public AjaxResult saveXmxx(TaxgisXmxx vo) {
		return toAjax(service.saveXmxxBz(vo, this.getSysUser()));
	}

	@PostMapping("/DelXmxx")
	@ResponseBody
	public AjaxResult delXmxx(TaxgisXmxx vo) {
		return toAjax(service.delXmxxBz(vo));
	}

	@PostMapping("/GlqywhTreeData")
	@ResponseBody
	public List<QyglTreeData> xlqywhTreeData() {
		User user = this.getSysUser();
		return service.glqywhTreeData(user);
	}

	@PostMapping("/glqyTreeData")
	@ResponseBody
	public List<QyglTreeData> glqyTreeData() {
		User user = this.getSysUser();
		return service.glqyTreeData(user);
	}

	@PostMapping(value = { "/SaveGlqywh", "/SaveXzqhwh" })
	@ResponseBody
	public AjaxResult saveGlqywh(GisGlqy vo) {
		return AjaxResult.success("", service.saveGlqywh(vo, this.getSysUser()));
	}

	@PostMapping(value = { "/DelGlqywh", "/DelXzqhwh" })
	@ResponseBody
	public AjaxResult delGlqywh(String id) {
		return service.delGlqywh(id);
	}

	@PostMapping("/XzqhwhTreeData")
	@ResponseBody
	public List<QyglTreeData> xzqhwhTreeData() {
		User user = this.getSysUser();
		return service.xzqhwhTreeData(user);
	}

	@PostMapping("/GetSwdjxxIds")
	@ResponseBody
	public List<String> getSwdjxxIds(String shxydm) {
		return service.getSwdjxxIds(shxydm);
	}

	@PostMapping("/GetGsdjxxIds")
	@ResponseBody
	public List<String> getGsdjxxIds(String shxydm) {
		return service.getGsdjxxIds(shxydm);
	}

	@PostMapping("/getTableCols")
	@ResponseBody
	public List<Map<String, String>> getTableCols(String gucode) {
		return service.getTableCols(gucode);
	}

	@PostMapping("/getGcxmxx")
	@ResponseBody
	public TableDataInfo getGcxmxx(String dwmc) {
		startPage();
		List<Map<String, String>> list = service.getGcxmxx(dwmc);
		return getDataTable(list);
	}

	@PostMapping("/hyTreeData")
	@ResponseBody
	public List<HyTreeData> hyTreeData() {
		return service.hyTreeData();
	}

	@PostMapping("/hyAnalyze")
	@ResponseBody
	public List<TaxgisNsrxx> hyAnalyze(String hyDm) {
		return service.hyAnalyze(hyDm);
	}

	@PostMapping("/glqyAnalyze")
	@ResponseBody
	public TableDataInfo glqyAnalyze(String polygon) {
		startPage();
		List<Map<String, String>> list = service.glqyAnalyze(polygon);
		return getDataTable(list);
	}

	@PostMapping("/qyAnalyzeColumns")
	@ResponseBody
	public List<String> qyAnalyzeColumns() {
		List<String> list = new ArrayList<>(12);
		Calendar begin = Calendar.getInstance();
		begin.setTime(new Date());

		DateFormat df = new SimpleDateFormat("yyyy-MM");
		for (int i = 0; i < 12; i++) {
			begin.add(Calendar.MONTH, -1);
			list.add(df.format(begin.getTime()));
		}
		Collections.reverse(list);
		return list;
	}

	@PostMapping("/zhcxNd")
	@ResponseBody
	public String zhcxNd() {
		Calendar begin = Calendar.getInstance();
		begin.setTime(new Date());
		begin.add(Calendar.YEAR, -1);
		DateFormat df = new SimpleDateFormat("yyyy");
		return df.format(begin.getTime());
	}

	@PostMapping("/hyfx")
	@ResponseBody
	public TableDataInfo hyfx(String polygon, String cols) {
		// startPage();
		List<Map<String, String>> list = service.hyfx(polygon, cols);
		return getDataTable(list);
	}

	@PostMapping("/szfx")
	@ResponseBody
	public TableDataInfo szfx(String polygon, String cols) {
		// startPage();
		List<Map<String, String>> list = service.szfx(polygon, cols);
		return getDataTable(list);
	}
}
