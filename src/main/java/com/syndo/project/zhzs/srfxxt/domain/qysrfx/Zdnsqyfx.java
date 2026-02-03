package com.syndo.project.zhzs.srfxxt.domain.qysrfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 *重点纳税企业分析
 *
 */
public class Zdnsqyfx extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private String qsrq;
	private String zzrq;
	@Excel(name = "统一社会信用代码")
	private String nsrsbh;
	@Excel(name = "纳税人名称")
	private String nsrmc;
	@Excel(name = "本年完成")
	private String bnwc;
	@Excel(name = "上年同期")
	private String snwc;
	@Excel(name = "增减额")
	private String zje;
	@Excel(name = "增减率")
	private String zjl;
	
	private String tjkj;
	private String sedy;

	private String dw;
	
	public String getDw() {
		return dw;
	}
	public void setDw(String dw) {
		this.dw = dw;
	}
	public String getQsrq() {
		return qsrq;
	}
	public void setQsrq(String qsrq) {
		this.qsrq = qsrq;
	}
	public String getZzrq() {
		return zzrq;
	}
	public void setZzrq(String zzrq) {
		this.zzrq = zzrq;
	}
	public String getNsrsbh() {
		return nsrsbh;
	}
	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}
	public String getNsrmc() {
		return nsrmc;
	}
	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}
	public String getBnwc() {
		return bnwc;
	}
	public void setBnwc(String bnwc) {
		this.bnwc = bnwc;
	}
	public String getSnwc() {
		return snwc;
	}
	public void setSnwc(String snwc) {
		this.snwc = snwc;
	}
	public String getZje() {
		return zje;
	}
	public void setZje(String zje) {
		this.zje = zje;
	}
	public String getZjl() {
		return zjl;
	}
	public void setZjl(String zjl) {
		this.zjl = zjl;
	}
	public String getTjkj() {
		return tjkj;
	}
	public void setTjkj(String tjkj) {
		this.tjkj = tjkj;
	}
	public String getSedy() {
		return sedy;
	}
	public void setSedy(String sedy) {
		this.sedy = sedy;
	}
	
}