package com.syndo.web.domain.system;

import com.syndo.common.core.domain.BaseEntity;


public class Nsqs{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String nsqsnd;

	private String nsqsse;

	private String createtime;

	private String zjl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNsqsnd() {
		return nsqsnd;
	}

	public void setNsqsnd(String nsqsnd) {
		this.nsqsnd = nsqsnd;
	}

	public String getNsqsse() {
		return nsqsse;
	}

	public void setNsqsse(String nsqsse) {
		this.nsqsse = nsqsse;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getZjl() {
		return zjl;
	}

	public void setZjl(String zjl) {
		this.zjl = zjl;
	}
}
