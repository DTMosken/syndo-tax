package com.syndo.project.zhzs.srfxxt.domain.czsrfx;

import java.math.BigDecimal;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 财政收入完成情况
 * @author mdz
 *
 */
@ExcelIgnoreUnannotated
public class Czsrwcqk extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@ExcelProperty(value= {"征收项目","征收项目"},index = 0)
	private String zsxm;
	@ExcelProperty(value= {"年初计划","年初计划"},index = 1)
	private BigDecimal ncjh;
	@ExcelProperty(value= {"完成数","本月"},index = 2)
	private BigDecimal bywcs;
	@ExcelProperty(value= {"完成数","累计"},index = 3)
	private BigDecimal ljwcs;
	@ExcelProperty(value= {"占计划%","占计划%"},index = 4)
	private String zjh;
	@ExcelProperty(value= {"上年同期","上年同期"},index = 5)
	private BigDecimal sntq;
	@ExcelProperty(value= {"增长额","增长额"},index = 6)
	private BigDecimal bsnzjs;
	@ExcelProperty(value= {"比上年%","比上年%"},index = 7)
	private String bsn;
	private String rkrq;
	private String dw;
	private String tjkj;
	
	public String getRkrq() {
		return rkrq;
	}
	public void setRkrq(String rkrq) {
		this.rkrq = rkrq;
	}
	public String getZsxm() {
		return zsxm;
	}
	public void setZsxm(String zsxm) {
		this.zsxm = zsxm;
	}


	public BigDecimal getBywcs() {
		return bywcs;
	}

	public void setBywcs(BigDecimal bywcs) {
		this.bywcs = bywcs;
	}

	public BigDecimal getLjwcs() {
		return ljwcs;
	}

	public void setLjwcs(BigDecimal ljwcs) {
		this.ljwcs = ljwcs;
	}

	public String getZjh() {
		return zjh;
	}
	public void setZjh(String zjh) {
		this.zjh = zjh;
	}

	public BigDecimal getNcjh() {
		return ncjh;
	}

	public void setNcjh(BigDecimal ncjh) {
		this.ncjh = ncjh;
	}

	public BigDecimal getSntq() {
		return sntq;
	}

	public void setSntq(BigDecimal sntq) {
		this.sntq = sntq;
	}

	public BigDecimal getBsnzjs() {
		return bsnzjs;
	}

	public void setBsnzjs(BigDecimal bsnzjs) {
		this.bsnzjs = bsnzjs;
	}

	public String getBsn() {
		return bsn;
	}
	public void setBsn(String bsn) {
		this.bsn = bsn;
	}

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

}