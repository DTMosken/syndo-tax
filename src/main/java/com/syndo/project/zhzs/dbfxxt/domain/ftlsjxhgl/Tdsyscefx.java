package com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl;

import java.util.List;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 土地使用税差额分析
 * 
 * @author xrc
 *
 */
public class Tdsyscefx extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String yjtdsys;
	private String sjtdsys;
	private String ce;
	private String nf;
	private String jd;

	private String yjtdsysmax;
	private String yjtdsysmin;
	private String sjtdsysmax;
	private String sjtdsysmin;
	private String cemax;
	private List<String> jdlist;

	public List<String> getJdlist() {
		return jdlist;
	}

	public void setJdlist(List<String> jdlist) {
		this.jdlist = jdlist;
	}

	public String getYjtdsys() {
		return yjtdsys;
	}

	public void setYjtdsys(String yjtdsys) {
		this.yjtdsys = yjtdsys;
	}

	public String getSjtdsys() {
		return sjtdsys;
	}

	public void setSjtdsys(String sjtdsys) {
		this.sjtdsys = sjtdsys;
	}

	public String getCe() {
		return ce;
	}

	public void setCe(String ce) {
		this.ce = ce;
	}

	public String getNf() {
		return nf;
	}

	public void setNf(String nf) {
		this.nf = nf;
	}

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getYjtdsysmax() {
		return yjtdsysmax;
	}

	public void setYjtdsysmax(String yjtdsysmax) {
		this.yjtdsysmax = yjtdsysmax;
	}

	public String getYjtdsysmin() {
		return yjtdsysmin;
	}

	public void setYjtdsysmin(String yjtdsysmin) {
		this.yjtdsysmin = yjtdsysmin;
	}

	public String getSjtdsysmax() {
		return sjtdsysmax;
	}

	public void setSjtdsysmax(String sjtdsysmax) {
		this.sjtdsysmax = sjtdsysmax;
	}

	public String getSjtdsysmin() {
		return sjtdsysmin;
	}

	public void setSjtdsysmin(String sjtdsysmin) {
		this.sjtdsysmin = sjtdsysmin;
	}

	public String getCemax() {
		return cemax;
	}

	public void setCemax(String cemax) {
		this.cemax = cemax;
	}

}
