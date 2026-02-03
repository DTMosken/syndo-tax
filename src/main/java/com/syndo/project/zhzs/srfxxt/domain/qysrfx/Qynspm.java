package com.syndo.project.zhzs.srfxxt.domain.qysrfx;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 企业纳税排名
 * 
 */
@SuppressWarnings("serial")
@ExcelIgnoreUnannotated
public class Qynspm extends BaseEntity {

	private String tjkj;
	private String dw;
	private String qsrq;
	private String zzrq;

	@ExcelProperty(value= {"排名","排名"},index = 0)
	private String pm;
	// @Excel(name = "纳税人识别号")
	private String nsrsbh;
	@ExcelProperty(value= {"企业名称","企业名称"},index = 1)
	private String nsrmc;
	@ExcelProperty(value= {"地方税收","本期"},index = 2)
	private String dfssbn;
	@ExcelProperty(value= {"地方税收","同期"},index = 3)
	private String dfsssn;
	@ExcelProperty(value= {"地方税收","增减额"},index = 4)
	private String dfsszje;
	@ExcelProperty(value= {"地方税收","增减率"},index = 5)
	private String dfsszjl;
	@ExcelProperty(value= {"全口径税收","本期"},index = 6)
	private String qkjbn;
	@ExcelProperty(value= {"全口径税收","同期"},index = 7)
	private String qkjsn;
	@ExcelProperty(value= {"全口径税收","增减额"},index = 8)
	private String qkjzje;
	@ExcelProperty(value= {"全口径税收","增减率"},index = 9)
	private String qkjzjl;
	public String getTjkj() {
		return tjkj;
	}
	public void setTjkj(String tjkj) {
		this.tjkj = tjkj;
	}
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
	public String getPm() {
		return pm;
	}
	public void setPm(String pm) {
		this.pm = pm;
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
	public String getDfssbn() {
		return dfssbn;
	}
	public void setDfssbn(String dfssbn) {
		this.dfssbn = dfssbn;
	}
	public String getDfsssn() {
		return dfsssn;
	}
	public void setDfsssn(String dfsssn) {
		this.dfsssn = dfsssn;
	}
	public String getDfsszje() {
		return dfsszje;
	}
	public void setDfsszje(String dfsszje) {
		this.dfsszje = dfsszje;
	}
	public String getDfsszjl() {
		return dfsszjl;
	}
	public void setDfsszjl(String dfsszjl) {
		this.dfsszjl = dfsszjl;
	}
	public String getQkjbn() {
		return qkjbn;
	}
	public void setQkjbn(String qkjbn) {
		this.qkjbn = qkjbn;
	}
	public String getQkjsn() {
		return qkjsn;
	}
	public void setQkjsn(String qkjsn) {
		this.qkjsn = qkjsn;
	}
	public String getQkjzje() {
		return qkjzje;
	}
	public void setQkjzje(String qkjzje) {
		this.qkjzje = qkjzje;
	}
	public String getQkjzjl() {
		return qkjzjl;
	}
	public void setQkjzjl(String qkjzjl) {
		this.qkjzjl = qkjzjl;
	}


}