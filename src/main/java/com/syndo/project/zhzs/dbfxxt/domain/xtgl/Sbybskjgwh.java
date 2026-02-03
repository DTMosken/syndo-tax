package com.syndo.project.zhzs.dbfxxt.domain.xtgl;

import java.io.Serializable;
/**
 * @author gxg
 * 社保医保刷卡中间表维护Entity
 */
public class Sbybskjgwh implements Serializable{
	private static final long serialVersionUID = 1L;
	private String objId;//主键
	
	private String ydmc;//药店名称
	private String nsrmc;//纳税人名称
	private String zjr;
	private String zjsj;
	private String xgr;
	private String xgsj;
	public String getObjId() {
		return objId;
	}
	public void setObjId(String objId) {
		this.objId = objId;
	}
	public String getYdmc() {
		return ydmc;
	}
	public void setYdmc(String ydmc) {
		this.ydmc = ydmc;
	}
	public String getNsrmc() {
		return nsrmc;
	}
	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}
	public String getZjr() {
		return zjr;
	}
	public void setZjr(String zjr) {
		this.zjr = zjr;
	}
	public String getZjsj() {
		return zjsj;
	}
	public void setZjsj(String zjsj) {
		this.zjsj = zjsj;
	}
	public String getXgr() {
		return xgr;
	}
	public void setXgr(String xgr) {
		this.xgr = xgr;
	}
	public String getXgsj() {
		return xgsj;
	}
	public void setXgsj(String xgsj) {
		this.xgsj = xgsj;
	}
	
}
