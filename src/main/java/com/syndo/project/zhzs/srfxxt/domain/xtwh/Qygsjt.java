package com.syndo.project.zhzs.srfxxt.domain.xtwh;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 企业归属集团
 *
 */
public class Qygsjt extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String id;
	private String tyshxydm;
	private String nsrmc;
	private String gsjtmc;
	private String ksrq;
	private String jsrq;
	
	private String rq;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTyshxydm() {
		return tyshxydm;
	}

	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}

	public String getNsrmc() {
		return nsrmc;
	}

	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}

	public String getGsjtmc() {
		return gsjtmc;
	}

	public void setGsjtmc(String gsjtmc) {
		this.gsjtmc = gsjtmc;
	}

	public String getKsrq() {
		return ksrq;
	}

	public void setKsrq(String ksrq) {
		this.ksrq = ksrq;
	}

	public String getJsrq() {
		return jsrq;
	}

	public void setJsrq(String jsrq) {
		this.jsrq = jsrq;
	}

	public String getRq() {
		return rq;
	}

	public void setRq(String rq) {
		this.rq = rq;
	}


}