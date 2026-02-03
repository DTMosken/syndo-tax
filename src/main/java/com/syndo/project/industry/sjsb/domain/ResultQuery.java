package com.syndo.project.industry.sjsb.domain;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 结果查询
 *
 * @author ykc
 * @date 2020年7月24日
 */
public class ResultQuery extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String tyshxydm; // 统一社会信用代码
	private String qymc; // 企业名称
	private String pjnd; // 评价年度
	private String tbrq; // 填报日期
	private String sbzt; // 上报状态
	private String shzt; // 审核状态
	private String csdf; // 初始得分
	private String zzdf; // 最终得分
	private String yspjdj; // 原始评价等级
	private String zzpjdj; // 最终评价等级
	private String tsqxlx; // 特殊情形类型
	private String tsqxsm; // 特殊情形说明
	
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
	public String getQymc() {
		return qymc;
	}
	public void setQymc(String qymc) {
		this.qymc = qymc;
	}
	public String getPjnd() {
		return pjnd;
	}
	public void setPjnd(String pjnd) {
		this.pjnd = pjnd;
	}
	public String getTbrq() {
		return tbrq;
	}
	public void setTbrq(String tbrq) {
		this.tbrq = tbrq;
	}
	public String getSbzt() {
		return sbzt;
	}
	public void setSbzt(String sbzt) {
		this.sbzt = sbzt;
	}
	public String getShzt() {
		return shzt;
	}
	public void setShzt(String shzt) {
		this.shzt = shzt;
	}
	public String getCsdf() {
		return csdf;
	}
	public void setCsdf(String csdf) {
		this.csdf = csdf;
	}
	public String getZzdf() {
		return zzdf;
	}
	public void setZzdf(String zzdf) {
		this.zzdf = zzdf;
	}
	public String getYspjdj() {
		return yspjdj;
	}
	public void setYspjdj(String yspjdj) {
		this.yspjdj = yspjdj;
	}
	public String getZzpjdj() {
		return zzpjdj;
	}
	public void setZzpjdj(String zzpjdj) {
		this.zzpjdj = zzpjdj;
	}
	public String getTsqxlx() {
		return tsqxlx;
	}
	public void setTsqxlx(String tsqxlx) {
		this.tsqxlx = tsqxlx;
	}
	public String getTsqxsm() {
		return tsqxsm;
	}
	public void setTsqxsm(String tsqxsm) {
		this.tsqxsm = tsqxsm;
	}
	

}
