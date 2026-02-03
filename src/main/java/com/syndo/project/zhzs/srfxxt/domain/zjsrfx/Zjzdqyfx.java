package com.syndo.project.zhzs.srfxxt.domain.zjsrfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 镇街重点企业分析
 *
 */
public class Zjzdqyfx extends BaseEntity {

	private static final long serialVersionUID = 1L;
	@Excel(name = "街道乡镇")
	private String jdxz;
	@Excel(name = "企业名称")
	private String qymc;
	@Excel(name = "本期数")
	private String bqs;
	@Excel(name = "同期数")
	private String tqs;
	@Excel(name = "增减额")
	private String zje;
	@Excel(name = "增减率%")
	private String zjl;

	private String qsrq;
	private String zzrq;
	
	private String dw;

	public String getJdxz() {
		return jdxz;
	}

	public void setJdxz(String jdxz) {
		this.jdxz = jdxz;
	}

	public String getQymc() {
		return qymc;
	}

	public void setQymc(String qymc) {
		this.qymc = qymc;
	}

	public String getBqs() {
		return bqs;
	}

	public void setBqs(String bqs) {
		this.bqs = bqs;
	}

	public String getTqs() {
		return tqs;
	}

	public void setTqs(String tqs) {
		this.tqs = tqs;
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

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

}