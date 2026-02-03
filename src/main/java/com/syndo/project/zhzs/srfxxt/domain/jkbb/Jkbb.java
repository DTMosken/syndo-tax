package com.syndo.project.zhzs.srfxxt.domain.jkbb;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 金库报表
 * 
 * @author xrc
 *
 */
public class Jkbb extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String jkrbId;
	private String kmdm;
	private String kmmc;
	private String brfse;
	private String bszqq;
	private String bszqz;
	private String zjr;
	private String zjsj;
	private String xgr;
	private String xgsj;

	public String getJkrbId() {
		return jkrbId;
	}

	public void setJkrbId(String jkrbId) {
		this.jkrbId = jkrbId == null ? null : jkrbId.trim();
	}

	public String getKmdm() {
		return kmdm;
	}

	public void setKmdm(String kmdm) {
		this.kmdm = kmdm == null ? null : kmdm.trim();
	}

	public String getKmmc() {
		return kmmc;
	}

	public void setKmmc(String kmmc) {
		this.kmmc = kmmc == null ? null : kmmc.trim();
	}

	public String getBrfse() {
		return brfse;
	}

	public void setBrfse(String brfse) {
		this.brfse = brfse == null ? null : brfse.trim();
	}

	public String getBszqq() {
		return bszqq;
	}

	public void setBszqq(String bszqq) {
		this.bszqq = bszqq;
	}

	public String getBszqz() {
		return bszqz;
	}

	public void setBszqz(String bszqz) {
		this.bszqz = bszqz;
	}

	public String getZjr() {
		return zjr;
	}

	public void setZjr(String zjr) {
		this.zjr = zjr == null ? null : zjr.trim();
	}

	public String getZjsj() {
		return zjsj;
	}

	public void setZjsj(String zjsj) {
		this.zjsj = zjsj == null ? null : zjsj.trim();
	}

	public String getXgr() {
		return xgr;
	}

	public void setXgr(String xgr) {
		this.xgr = xgr == null ? null : xgr.trim();
	}

	public String getXgsj() {
		return xgsj;
	}

	public void setXgsj(String xgsj) {
		this.xgsj = xgsj == null ? null : xgsj.trim();
	}
}