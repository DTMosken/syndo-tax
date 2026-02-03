package com.syndo.project.zhzs.srfxxt.domain.hysrfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * 分行业收入分析
 */
public class Fhysrfx extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private String tjkj;//数据类型（全口径qkj，一般预算ybys）
	@Excel(name = "行业门类")
	private String hymc;//行业
	@Excel(name = "本年累积")
	private BigDecimal bnljs;//本年累计
	@Excel(name = "上年同期")
	private BigDecimal sntqs;//上年同期
	@Excel(name = "增减额")
	private String zje;//增减额
	@Excel(name = "增减率")
	private String zjl;//增减率
	
	private String qsrq;
	private String zzrq;
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
	public String getTjkj() {
		return tjkj;
	}
	public void setTjkj(String tjkj) {
		this.tjkj = tjkj;
	}
	public String getHymc() {
		return hymc;
	}
	public void setHymc(String hymc) {
		this.hymc = hymc;
	}

	public BigDecimal getBnljs() {
		return bnljs;
	}

	public void setBnljs(BigDecimal bnljs) {
		this.bnljs = bnljs;
	}

	public BigDecimal getSntqs() {
		return sntqs;
	}

	public void setSntqs(BigDecimal sntqs) {
		this.sntqs = sntqs;
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
	
	
}