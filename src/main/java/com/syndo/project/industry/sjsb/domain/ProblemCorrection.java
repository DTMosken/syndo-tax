package com.syndo.project.industry.sjsb.domain;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 问题纠偏
 *
 * @author ykc
 * @date 2020年7月24日
 */
public class ProblemCorrection extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String tyshxydm; // 统一社会信用代码
	private String qymc; // 企业名称
	private String jprq; // 纠偏日期
	private String jpsx; // 纠偏事项
	private String zrbm; // 责任部门
	private String jpnr; // 纠偏内容
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
	public String getJprq() {
		return jprq;
	}
	public void setJprq(String jprq) {
		this.jprq = jprq;
	}
	public String getJpsx() {
		return jpsx;
	}
	public void setJpsx(String jpsx) {
		this.jpsx = jpsx;
	}
	public String getZrbm() {
		return zrbm;
	}
	public void setZrbm(String zrbm) {
		this.zrbm = zrbm;
	}
	public String getJpnr() {
		return jpnr;
	}
	public void setJpnr(String jpnr) {
		this.jpnr = jpnr;
	}
	
}
