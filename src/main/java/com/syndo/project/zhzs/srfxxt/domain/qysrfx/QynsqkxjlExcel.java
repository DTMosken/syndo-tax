package com.syndo.project.zhzs.srfxxt.domain.qysrfx;

import com.alibaba.excel.annotation.ExcelProperty;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 企业纳税情况
 * 
 */
public class QynsqkxjlExcel extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String objId;
	//起始日期

	private String qsrq;
	private String zzrq;
	private String jdxz;
	// @Excel(name = "纳税识别号",sort = 1)
	private String nsrsbh;
	@ExcelProperty(value= {"纳税人名称","纳税人名称"},index = 0)
	private String nsrmc;
	@ExcelProperty(value= {"本期","总计"},index = 1)
	private String bqhj;
	@ExcelProperty(value= {"本期","主体税(增值税+所得税)"},index = 2)
	private String bqzts;
	@ExcelProperty(value= {"同期","总计"},index = 3)
	private String tqhj;
	@ExcelProperty(value= {"同期","主体税(增值税+所得税)"},index = 4)
	private String tqzts;
	@ExcelProperty(value= {"下降额","下降额"},index = 5)
	private String zze;
	@ExcelProperty(value= {"下降率","下降率"},index = 6)
	private String zs;

	private String tjkj;//统计口径：0 全口径 1一般预算

	private String dw;

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
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

	public String getJdxz() {
		return jdxz;
	}

	public void setJdxz(String jdxz) {
		this.jdxz = jdxz;
	}

	public String getBqhj() {
		return bqhj;
	}

	public void setBqhj(String bqhj) {
		this.bqhj = bqhj;
	}

	public String getBqzts() {
		return bqzts;
	}

	public void setBqzts(String bqzts) {
		this.bqzts = bqzts;
	}

	public String getTqhj() {
		return tqhj;
	}

	public void setTqhj(String tqhj) {
		this.tqhj = tqhj;
	}

	public String getTqzts() {
		return tqzts;
	}

	public void setTqzts(String tqzts) {
		this.tqzts = tqzts;
	}

	public String getZze() {
		return zze;
	}

	public void setZze(String zze) {
		this.zze = zze;
	}

	public String getZs() {
		return zs;
	}

	public void setZs(String zs) {
		this.zs = zs;
	}

	public String getTjkj() {
		return tjkj;
	}

	public void setTjkj(String tjkj) {
		this.tjkj = tjkj;
	}

}
