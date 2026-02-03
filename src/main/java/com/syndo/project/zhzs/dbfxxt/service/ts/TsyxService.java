package com.syndo.project.zhzs.dbfxxt.service.ts;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.StringUtils;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Tsyx;
import com.syndo.project.zhzs.dbfxxt.mapper.ts.TsyxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wym
 */
@Service
public class TsyxService extends BaseService {
	@Autowired
	private TsyxMapper mapper;

	public void selectListPre(Tsyx entity) {
		String sid = entity.getSid();
		// 未传人查询id，不允许执行下面的存储过程
		if(StringUtils.isEmpty(sid)) {
			return;
		}
		String presid = entity.getPresid();
		if(StringUtils.isNotEmpty(presid) && !sid.equals(presid)) {
			mapper.tsyx3(presid);
		}
		String zbdms = entity.getZbdms();
		if (StringUtils.isNotEmpty(zbdms)) {
			entity.setZbdmArray(split2List(zbdms));
		}
		entity.setTsr(ShiroUtils.getUserId());
		Long cnt = mapper.checkTsyx1(entity);
		if (cnt == 0L) {
			mapper.tsyx1(entity);
		}
	}

	public List<Tsyx> selectList(Tsyx entity) {
		return mapper.selectList(entity);
	}

	/** 推送选中 */
	private static final String TS_XZ = "1";
	public AjaxResult ts(String sid, String lx, String fs, String fkids) {
		if(StringUtils.isNotEmpty(lx) && StringUtils.isNotEmpty(fkids) && TS_XZ.equals(lx)) {
			// 选中推送，填充临时表数据
			List<String> fkidList = split2List(fkids);
			for(String fkid : fkidList) {
				Tsyx tsyx = new Tsyx();
				tsyx.setSid(sid);
				tsyx.setFkid(fkid);
				mapper.tsyx2_pre(tsyx);
			}
		}

		Tsyx tsyx = new Tsyx();
		tsyx.setSid(sid);
		tsyx.setLx(lx);
		tsyx.setFs(fs);
		tsyx.setTsr(ShiroUtils.getUserId());
		
		mapper.tsyx2(tsyx);
		int r = tsyx.getResult();
		String msg = FxtsResult.getMsg(r);
		if(r > 0) {
			return AjaxResult.success(msg);
		} else {
			return AjaxResult.error(msg);
		}
	}

	enum FxtsResult {
		/* 风险推送结果 */
		ZHENG_CHANG(1,"推送成功！"),
		ERR_SID(-1, "错误码(-1)，参数异常!"),
		ERR_FKR(-2, "风控小组配置异常，未找到可选反馈人员!");
		int code;
		String msg;
		FxtsResult(int code, String msg){
			this.code = code;
			this.msg = msg;
		}
		static String getMsg(int code) {
			for (FxtsResult r:FxtsResult.values()) {
				if(r.getCode() == code) {
					return r.getMsg();
				}
			}
			return String.valueOf(code);
		}

		public int getCode() {
			return code;
		}

		public String getMsg() {
			return msg;
		}
	}
}
