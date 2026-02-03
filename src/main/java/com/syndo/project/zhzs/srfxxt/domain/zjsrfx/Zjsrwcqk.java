package com.syndo.project.zhzs.srfxxt.domain.zjsrfx;

import java.lang.String;

import javax.validation.constraints.NotBlank;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 镇街收入完成情况(全口径)
 */
public class Zjsrwcqk extends BaseEntity {

	private static final long serialVersionUID = 1L;
	@Excel(name = "街道乡镇")
	private String jdxz;
	@Excel(name = "指导数")
	private String ncjh;
	// @Excel(name = "本月完成")
	private String bqs;
	@Excel(name = "累计完成")
	private String bnlj;
	@Excel(name = "完成率%")
	private String wcjh;
	@Excel(name = "去年同期")
	private String sntq;
	@Excel(name = "增长率%")
	private String bsn;

	private String rkrq;
	private String zsxm;
	private String[] zsxmList;
	private String dw;

	public String getZsxm() {
		return zsxm;
	}

	public void setZsxm(String zsxm) {
		this.zsxm = zsxm;
	}

	public String[] getZsxmList() {
		return zsxmList;
	}

	public void setZsxmList(String[] zsxmList) {
		this.zsxmList = zsxmList;
	}

	public String getBnlj() {
		return bnlj;
	}

	public void setBnlj(String bnlj) {
		this.bnlj = bnlj;
	}

	public String getSntq() {
		return sntq;
	}

	public void setSntq(String sntq) {
		this.sntq = sntq;
	}

	public String getJdxz() {
		return jdxz;
	}

	public void setJdxz(String jdxz) {
		this.jdxz = jdxz;
	}

	public String getNcjh() {
		return ncjh;
	}

	public void setNcjh(String ncjh) {
		this.ncjh = ncjh;
	}

	public String getBqs() {
		return bqs;
	}

	public void setBqs(String bqs) {
		this.bqs = bqs;
	}

	public String getWcjh() {
		return wcjh;
	}

	public void setWcjh(String wcjh) {
		this.wcjh = wcjh;
	}

	public String getBsn() {
		return bsn;
	}

	public void setBsn(String bsn) {
		this.bsn = bsn;
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