package com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl;

import java.io.Serializable;
import java.util.List;

/**  房产税差额分析  实体类
 * @author gxg
 */
public class Fcscefx implements Serializable{
	private static final long serialVersionUID = 1L;
	private String jd;
	private String yjfcs;
	private String sjfcs;
	private String ce;
	
	private String yjfcsmax;
	private String yjfcsmin;
	
	private String sjfcsmax;
	private String sjfcsmin;
	private String cemax;
	private String nf;
	
	private List<String> jdlist;

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getYjfcs() {
		return yjfcs;
	}

	public void setYjfcs(String yjfcs) {
		this.yjfcs = yjfcs;
	}

	public String getSjfcs() {
		return sjfcs;
	}

	public void setSjfcs(String sjfcs) {
		this.sjfcs = sjfcs;
	}

	public String getCe() {
		return ce;
	}

	public void setCe(String ce) {
		this.ce = ce;
	}

	public String getYjfcsmax() {
		return yjfcsmax;
	}

	public void setYjfcsmax(String yjfcsmax) {
		this.yjfcsmax = yjfcsmax;
	}

	public String getYjfcsmin() {
		return yjfcsmin;
	}

	public void setYjfcsmin(String yjfcsmin) {
		this.yjfcsmin = yjfcsmin;
	}

	public String getSjfcsmax() {
		return sjfcsmax;
	}

	public void setSjfcsmax(String sjfcsmax) {
		this.sjfcsmax = sjfcsmax;
	}

	public String getSjfcsmin() {
		return sjfcsmin;
	}

	public void setSjfcsmin(String sjfcsmin) {
		this.sjfcsmin = sjfcsmin;
	}

	public String getCemax() {
		return cemax;
	}

	public void setCemax(String cemax) {
		this.cemax = cemax;
	}

	public String getNf() {
		return nf;
	}

	public void setNf(String nf) {
		this.nf = nf;
	}

	public List<String> getJdlist() {
		return jdlist;
	}

	public void setJdlist(List<String> jdlist) {
		this.jdlist = jdlist;
	}
}
