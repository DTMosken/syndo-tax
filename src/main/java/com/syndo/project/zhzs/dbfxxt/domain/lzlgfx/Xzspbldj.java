package com.syndo.project.zhzs.dbfxxt.domain.lzlgfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 工商办理登记未在税务注册
 *
 * @author ykc
 * @date 2019年7月23日
 */
public class Xzspbldj extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Excel(name = "社会信用代码")
	private String shxydm;
	@Excel(name = "行业门类")
	private String hyml;
	@Excel(name = "经营范围")
	private String jyfw;
	@Excel(name = "企业中文名")
	private String qyzwm;
	@Excel(name = "住所")
	private String zs;
	@Excel(name = "负责人")
	private String fzr;
	@Excel(name = "处理单位")
	private String cldw;
	@Excel(name = "对比类型")
	private String info;
	public String getShxydm() {
		return shxydm;
	}
	public void setShxydm(String shxydm) {
		this.shxydm = shxydm;
	}
	public String getHyml() {
		return hyml;
	}
	public void setHyml(String hyml) {
		this.hyml = hyml;
	}
	public String getJyfw() {
		return jyfw;
	}
	public void setJyfw(String jyfw) {
		this.jyfw = jyfw;
	}
	public String getQyzwm() {
		return qyzwm;
	}
	public void setQyzwm(String qyzwm) {
		this.qyzwm = qyzwm;
	}
	public String getZs() {
		return zs;
	}
	public void setZs(String zs) {
		this.zs = zs;
	}
	public String getFzr() {
		return fzr;
	}
	public void setFzr(String fzr) {
		this.fzr = fzr;
	}
	public String getCldw() {
		return cldw;
	}
	public void setCldw(String cldw) {
		this.cldw = cldw;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
