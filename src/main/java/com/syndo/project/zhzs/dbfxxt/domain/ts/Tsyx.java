package com.syndo.project.zhzs.dbfxxt.domain.ts;

import java.util.List;

import com.syndo.common.core.domain.BaseEntity;
import com.syndo.common.utils.StringUtils;

public class Tsyx extends BaseEntity {
	private String id;
	private String nsrmc;
	private String zbmc;
	private String fxms;
	
	private String sid;
	private String presid;
	private String zbdm;
	private String tsr;
	private String zbdms;
	private List<String> zbdmArray;
	private String fkid;
	private String lx;
	private String fs;
	private int result;
	private String url;
	
	// 服务端排序
	private String field;
	private String order;
	private String px;
	
	public String getPx() {
		return StringUtils.isEmpty(this.field)
				? null
				: StringUtils.toUnderScoreCase(this.field) + " " + this.order;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPresid() {
		return presid;
	}
	public void setPresid(String presid) {
		this.presid = presid;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getFkid() {
		return fkid;
	}
	public void setFkid(String fkid) {
		this.fkid = fkid;
	}
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}
	public String getFs() {
		return fs;
	}
	public void setFs(String fs) {
		this.fs = fs;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
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
	public String getZbmc() {
		return zbmc;
	}
	public void setZbmc(String zbmc) {
		this.zbmc = zbmc;
	}
	public String getFxms() {
		return fxms;
	}
	public void setFxms(String fxms) {
		this.fxms = fxms;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getZbdm() {
		return zbdm;
	}
	public void setZbdm(String zbdm) {
		this.zbdm = zbdm;
	}
	public String getZbdms() {
		return zbdms;
	}
	public void setZbdms(String zbdms) {
		this.zbdms = zbdms;
	}
	public List<String> getZbdmArray() {
		return zbdmArray;
	}
	public void setZbdmArray(List<String> zbdmArray) {
		this.zbdmArray = zbdmArray;
	}
	public String getTsr() {
		return tsr;
	}
	public void setTsr(String tsr) {
		this.tsr = tsr;
	}
	
}
