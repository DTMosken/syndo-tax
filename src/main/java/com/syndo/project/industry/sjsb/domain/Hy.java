package com.syndo.project.industry.sjsb.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Hy extends BaseEntity {
	private String hyDm; //行业代码
	private String hyMc; //行业名称
	private String sjhyDm; //上级行业代码
	private String mlbz; //门类标志
	private String dlbz; //大类标志
	private String zlbz; //中类标志
	private String xlbz; //小类标志
	private Integer childrenHyCnt;

	public Integer getChildrenHyCnt() {
		return childrenHyCnt;
	}

	public void setChildrenHyCnt(Integer childrenHyCnt) {
		this.childrenHyCnt = childrenHyCnt;
	}

	public String getHyDm() {
		return hyDm;
	}
	public void setHyDm(String hyDm) {
		this.hyDm = hyDm;
	}
	public String getHyMc() {
		return hyMc;
	}
	public void setHyMc(String hyMc) {
		this.hyMc = hyMc;
	}
	public String getSjhyDm() {
		return sjhyDm;
	}
	public void setSjhyDm(String sjhyDm) {
		this.sjhyDm = sjhyDm;
	}
	public String getMlbz() {
		return mlbz;
	}
	public void setMlbz(String mlbz) {
		this.mlbz = mlbz;
	}
	public String getDlbz() {
		return dlbz;
	}
	public void setDlbz(String dlbz) {
		this.dlbz = dlbz;
	}
	public String getZlbz() {
		return zlbz;
	}
	public void setZlbz(String zlbz) {
		this.zlbz = zlbz;
	}
	public String getXlbz() {
		return xlbz;
	}
	public void setXlbz(String xlbz) {
		this.xlbz = xlbz;
	}
}
