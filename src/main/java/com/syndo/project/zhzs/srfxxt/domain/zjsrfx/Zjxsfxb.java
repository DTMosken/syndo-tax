package com.syndo.project.zhzs.srfxxt.domain.zjsrfx;

import java.lang.String;

import javax.validation.constraints.NotBlank;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 镇街协税分析表
 * 
 */
public class Zjxsfxb extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Excel(name = "镇街乡镇")
	private String jdxz;
	@Excel(name = "本年累计")
	private String bnlj;
	@Excel(name = "协调税收")
	private String xtss;
	@Excel(name = "实际税收")
	private String sjss;

	private String rkrq;
	private String dw;
	
	public String getJdxz() {
		return jdxz;
	}

	public void setJdxz(String jdxz) {
		this.jdxz = jdxz;
	}

	public String getBnlj() {
		return bnlj;
	}

	public void setBnlj(String bnlj) {
		this.bnlj = bnlj;
	}

	public String getXtss() {
		return xtss;
	}

	public void setXtss(String xtss) {
		this.xtss = xtss;
	}

	public String getSjss() {
		return sjss;
	}

	public void setSjss(String sjss) {
		this.sjss = sjss;
	}

	@NotBlank(message = "入库日期不能为空")
	public String getRkrq() {
		return rkrq;
	}

	public void setRkrq(String rkrq) {
		this.rkrq = rkrq;
	}

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

}