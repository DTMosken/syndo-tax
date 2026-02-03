package com.syndo.project.industry.sjsb.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Flml extends BaseEntity {
	private String id; //编码
	private String pid; //父编码
	private String mlmc; //目录名称
	private String mlsm; //分类目录名称
	private String lx; //类型
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getMlmc() {
		return mlmc;
	}
	public void setMlmc(String mlmc) {
		this.mlmc = mlmc;
	}
	public String getMlsm() {
		return mlsm;
	}
	public void setMlsm(String mlsm) {
		this.mlsm = mlsm;
	}
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}
}
