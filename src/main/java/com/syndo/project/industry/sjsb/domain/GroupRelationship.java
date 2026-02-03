package com.syndo.project.industry.sjsb.domain;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 集团关系
 *
 * @author ykc
 * @date 2020年7月24日
 */
public class GroupRelationship extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String tyshxydm;
	private String qymc;
	private String zqytyshxydm;
	private String zqymc;
	
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
	public String getZqytyshxydm() {
		return zqytyshxydm;
	}
	public void setZqytyshxydm(String zqytyshxydm) {
		this.zqytyshxydm = zqytyshxydm;
	}
	public String getZqymc() {
		return zqymc;
	}
	public void setZqymc(String zqymc) {
		this.zqymc = zqymc;
	}
}
