package com.syndo.project.zhzs.srfxxt.domain.xtwh;

import com.syndo.common.core.domain.BaseEntity;

public class Qykwh extends BaseEntity {

	/**
	 *企业库
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String tyshxydm;
	private String nsrmc;
	private String jdxz;
	private String nsrzt;
	private String djrq;
	private String zcdz;
	private String jydz;
	private String gsrq;
	private String fcbl;
	
	private String dt; // 数据类型
	
	
	
	public String getFcbl() {
		return fcbl;
	}
	public void setFcbl(String fcbl) {
		this.fcbl = fcbl;
	}
	public String getTyshxydm() {
		return tyshxydm;
	}
	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}
	public String getGsrq() {
		return gsrq;
	}
	public void setGsrq(String gsrq) {
		this.gsrq = gsrq;
	}
	public String getNsrzt() {
		return nsrzt;
	}
	public void setNsrzt(String nsrzt) {
		this.nsrzt = nsrzt;
	}
	
	public String getDjrq() {
		return djrq;
	}
	public void setDjrq(String djrq) {
		this.djrq = djrq;
	}
	public String getZcdz() {
		return zcdz;
	}
	public void setZcdz(String zcdz) {
		this.zcdz = zcdz;
	}
	public String getJydz() {
		return jydz;
	}
	public void setJydz(String jydz) {
		this.jydz = jydz;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	
}
