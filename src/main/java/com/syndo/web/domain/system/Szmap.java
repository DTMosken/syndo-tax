package com.syndo.web.domain.system;

import com.syndo.common.core.domain.BaseEntity;


public class Szmap{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String createtime;

	private String jdxz;

	private String zsxm;

	private String bntotalsjje;

	private String qntotalsjje;

	public Szmap(Integer id, String createtime, String jdxz, String zsxm, String bntotalsjje, String qntotalsjje) {
		this.id = id;
		this.createtime = createtime;
		this.jdxz = jdxz;
		this.zsxm = zsxm;
		this.bntotalsjje = bntotalsjje;
		this.qntotalsjje = qntotalsjje;
	}

	public Szmap() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getJdxz() {
		return jdxz;
	}

	public void setJdxz(String jdxz) {
		this.jdxz = jdxz;
	}

	public String getZsxm() {
		return zsxm;
	}

	public void setZsxm(String zsxm) {
		this.zsxm = zsxm;
	}

	public String getBntotalsjje() {
		return bntotalsjje;
	}

	public void setBntotalsjje(String bntotalsjje) {
		this.bntotalsjje = bntotalsjje;
	}

	public String getQntotalsjje() {
		return qntotalsjje;
	}

	public void setQntotalsjje(String qntotalsjje) {
		this.qntotalsjje = qntotalsjje;
	}
}
