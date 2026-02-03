package com.syndo.project.zhzs.srfxxt.domain.xtwh;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 收入预算年初计划
 * 
 * @author gxg
 *
 */
public class Zjsrncjhwh extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String jhwhId;
	private String jdxz;
	private String qkj;
	private String ybys;
	private String ssnd;
	private String jc;
	private String px;
	
	public String getJc() {
		return jc;
	}
	public void setJc(String jc) {
		this.jc = jc;
	}
	public String getPx() {
		return px;
	}
	public void setPx(String px) {
		this.px = px;
	}
	public String getJhwhId() {
		return jhwhId;
	}
	public void setJhwhId(String jhwhId) {
		this.jhwhId = jhwhId;
	}
	public String getJdxz() {
		return jdxz;
	}
	public void setJdxz(String jdxz) {
		this.jdxz = jdxz;
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
	
}