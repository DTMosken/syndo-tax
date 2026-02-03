package com.syndo.project.zhzs.dbfxxt.domain.ts;

import com.syndo.common.core.domain.BaseEntity;

public class Lzxx extends BaseEntity {
	private String id;
	private String fkbid;
	// 流程节点
    private String lcjd;
    // 流程走向
    private String zx;
    private String yj;
    private String lrry;
    private String lrsj;
    
    private String lrrymc;
    
    public String getLcjdmc() {
		return Lcjd.getName(lcjd);
    }
    public String getZxmc() {
    	return Lczx.getName(zx);
    }
    public String getLrrymc() {
		return lrrymc;
	}
	public void setLrrymc(String lrrymc) {
		this.lrrymc = lrrymc;
	}
	public String getZx() {
		return zx;
	}
	public void setZx(String zx) {
		this.zx = zx;
	}
	public String getLcjd() {
		return lcjd;
	}
	public void setLcjd(String lcjd) {
		this.lcjd = lcjd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFkbid() {
		return fkbid;
	}
	public void setFkbid(String fkbid) {
		this.fkbid = fkbid;
	}
	public String getYj() {
		return yj;
	}
	public void setYj(String yj) {
		this.yj = yj;
	}
	public String getLrry() {
		return lrry;
	}
	public void setLrry(String lrry) {
		this.lrry = lrry;
	}
	public String getLrsj() {
		return lrsj;
	}
	public void setLrsj(String lrsj) {
		this.lrsj = lrsj;
	}
}
