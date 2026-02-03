package com.syndo.web.domain.system;

import com.syndo.common.core.domain.BaseEntity;


public class Hymap{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String createtime;

	private String jdxz;

	private String hy;

	private String bntotalsjje;

	private String qntotalsjje;

	public Hymap(Integer id, String createtime, String jdxz, String hy, String bntotalsjje, String qntotalsjje) {
		this.id = id;
		this.createtime = createtime;
		this.jdxz = jdxz;
		this.hy = hy;
		this.bntotalsjje = bntotalsjje;
		this.qntotalsjje = qntotalsjje;
	}

	public Hymap() {
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

	public String getHy() {
		return hy;
	}

	public void setHy(String hy) {
		this.hy = hy;
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
