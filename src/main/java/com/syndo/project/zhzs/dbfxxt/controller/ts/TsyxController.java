package com.syndo.project.zhzs.dbfxxt.controller.ts;

import com.syndo.common.core.controller.BaseController;
import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.utils.uuid.UUID;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Tsyx;
import com.syndo.project.zhzs.dbfxxt.service.ts.TsyxService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 推送运行
 * @author wym
 */
@Controller
@RequestMapping("/zhzs/dbfxxt/ts/tsyx")
public class TsyxController extends BaseController {
	private String prefix = "zhzs/dbfxxt/ts/tsyx";

	@Autowired
	private TsyxService service;

	@RequiresPermissions("dbfxxt:ts:tsyx:view")
	@GetMapping()
	public String view() {
		return prefix + "/view2";
	}

	@RequiresPermissions("dbfxxt:ts:tsyx:view")
	@PostMapping("/list")
	@ResponseBody
	public String list(Tsyx entity) {
		service.selectListPre(entity);
		pageTable();
		List<Tsyx> list = service.selectList(entity);
		return getJsonTable(list);
	}

	@RequiresPermissions("dbfxxt:ts:tsyx:view")
	@PostMapping("/getSid")
	@ResponseBody
	public AjaxResult getSid() {
		return AjaxResult.success("", UUID.fastUUID().toString(true));
	}
	

	@RequiresPermissions("dbfxxt:ts:tsyx:view")
	@PostMapping("/ts")
	@ResponseBody
	public AjaxResult ts(String sid, String lx, String fs, String fkids) {
		return service.ts(sid, lx, fs, fkids);
	}

}
