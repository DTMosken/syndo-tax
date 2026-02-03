package com.syndo.project.zhzs.srfxxt.domain.xtwh;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 财政收入年初计划
 */
public class Czsrncjhwh extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String jhwhId;
	private String zsxm;
	private String qkj;
	private String ybys;
	private String ssnd;
	private String zsxmmc;
	
	public String getJhwhId() {
		return jhwhId;
	}
	public void setJhwhId(String jhwhId) {
		this.jhwhId = jhwhId;
	}
	public String getZsxm() {
		return zsxm;
	}
	public void setZsxm(String zsxm) {
		this.zsxm = zsxm;
	}
	public String getQkj() {
		return qkj;
	}
	public void setQkj(String qkj) {
		this.qkj = qkj;
	}
	public String getYbys() {
		return ybys;
	}
	public void setYbys(String ybys) {
		this.ybys = ybys;
	}
	public String getSsnd() {
		return ssnd;
	}
	public void setSsnd(String ssnd) {
		this.ssnd = ssnd;
	}

	public String getZsxmmc() {
		return zsxmmc;
	}

	public void setZsxmmc(String zsxmmc) {
		this.zsxmmc = zsxmmc;
	}
}