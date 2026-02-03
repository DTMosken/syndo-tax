package com.syndo.project.zhzs.srfxxt.domain.qysrfx;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
// import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 重点税种纳税分析
 */
@SuppressWarnings("serial")
@ExcelIgnoreUnannotated
public class Zdsznsfx extends BaseEntity {

	private String qsrq;
	private String zzrq;
	// @ExcelProperty(value = {"纳税人名称", "纳税人名称"})
	@ExcelProperty("纳税人名称")
	private String nsrmc;
	// @Excel(name = "纳税人识别号")
	private String nsrsbh;
	
	private String hj;
	private String hjtq;
	private String hjzzl;

	@ExcelProperty(value = {"增值税","本年"})
	private String zzsbn;
	@ExcelProperty(value = {"增值税","上年"})
	private String zzssn;
	@ExcelProperty(value = {"增值税","增减额"})
	private String zzszje;	
	@ExcelProperty(value = {"城镇土地使用时","本年"})
	private String cztdsysbn;
	@ExcelProperty(value = {"城镇土地使用时","上年"})
	private String cztdsyssn;
	@ExcelProperty(value = {"城镇土地使用时","增减额"})
	private String cztdsyszje;
	@ExcelProperty(value = {"房产税","本年"})
	private String fcsbn;
	@ExcelProperty(value = {"房产税","上年"})
	private String fcssn;
	@ExcelProperty(value = {"房产税","增减额"})
	private String fcszje;
	@ExcelProperty(value = {"车船税","本年"})
	private String ccsbn;
	@ExcelProperty(value = {"车船税","上年"})
	private String ccssn;
	@ExcelProperty(value = {"车船税","增减额"})
	private String ccszje;
	private String tjkj;

	private String dw;
	
	public String getDw() {
		return dw;
	}
	public void setDw(String dw) {
		this.dw = dw;
	}
	public String getTjkj() {
		return tjkj;
	}
	public void setTjkj(String tjkj) {
		this.tjkj = tjkj;
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
	public String getHj() {
		return hj;
	}
	public void setHj(String hj) {
		this.hj = hj;
	}
	public String getHjtq() {
		return hjtq;
	}
	public void setHjtq(String hjtq) {
		this.hjtq = hjtq;
	}
	public String getHjzzl() {
		return hjzzl;
	}
	public void setHjzzl(String hjzzl) {
		this.hjzzl = hjzzl;
	}
	public String getZzsbn() {
		return zzsbn;
	}
	public void setZzsbn(String zzsbn) {
		this.zzsbn = zzsbn;
	}
	public String getZzssn() {
		return zzssn;
	}
	public void setZzssn(String zzssn) {
		this.zzssn = zzssn;
	}
	public String getZzszje() {
		return zzszje;
	}
	public void setZzszje(String zzszje) {
		this.zzszje = zzszje;
	}
	public String getFcsbn() {
		return fcsbn;
	}
	public void setFcsbn(String fcsbn) {
		this.fcsbn = fcsbn;
	}
	public String getFcssn() {
		return fcssn;
	}
	public void setFcssn(String fcssn) {
		this.fcssn = fcssn;
	}
	public String getFcszje() {
		return fcszje;
	}
	public void setFcszje(String fcszje) {
		this.fcszje = fcszje;
	}
	public String getCztdsysbn() {
		return cztdsysbn;
	}
	public void setCztdsysbn(String cztdsysbn) {
		this.cztdsysbn = cztdsysbn;
	}
	public String getCztdsyssn() {
		return cztdsyssn;
	}
	public void setCztdsyssn(String cztdsyssn) {
		this.cztdsyssn = cztdsyssn;
	}
	public String getCztdsyszje() {
		return cztdsyszje;
	}
	public void setCztdsyszje(String cztdsyszje) {
		this.cztdsyszje = cztdsyszje;
	}
	public String getCcsbn() {
		return ccsbn;
	}
	public void setCcsbn(String ccsbn) {
		this.ccsbn = ccsbn;
	}
	public String getCcssn() {
		return ccssn;
	}
	public void setCcssn(String ccssn) {
		this.ccssn = ccssn;
	}
	public String getCcszje() {
		return ccszje;
	}
	public void setCcszje(String ccszje) {
		this.ccszje = ccszje;
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
	
	
}