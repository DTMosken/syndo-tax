package com.syndo.project.zhzs.dbfxxt.domain.ztzhfx;

import java.io.Serializable;

/**
 * 按行业用电分析
 * @author gxg
 *
 */
public class Ahyydfx implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String ssqq;
    private String ssqz;
    private String nsrmc;
    private String sshy;
    private String qyydl;
    private String qynse;
    private Double dlcse;
    private String objId;
    private String hyml;
    private String nf;
    private String nsrsbh;
    
    private String ydlq;
    private String ydlz;
    
    private String detail;

    public String getYdlq() {
		return ydlq;
	}

	public void setYdlq(String ydlq) {
		this.ydlq = ydlq;
	}

	public String getYdlz() {
		return ydlz;
	}

	public void setYdlz(String ydlz) {
		this.ydlz = ydlz;
	}

	public String getHyml() {
		return hyml;
	}

	public void setHyml(String hyml) {
		this.hyml = hyml;
	}

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public String getSsqq() {
        return ssqq;
    }

    public void setSsqq(String ssqq) {
        this.ssqq = ssqq;
    }

    public String getSsqz() {
        return ssqz;
    }

    public void setSsqz(String ssqz) {
        this.ssqz = ssqz;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getSshy() {
        return sshy;
    }

    public void setSshy(String sshy) {
        this.sshy = sshy;
    }

    public String getQyydl() {
        return qyydl;
    }

    public void setQyydl(String qyydl) {
        this.qyydl = qyydl;
    }

    public String getQynse() {
        return qynse;
    }

    public void setQynse(String qynse) {
        this.qynse = qynse;
    }

	public Double getDlcse() {
		return dlcse;
	}

	public void setDlcse(Double dlcse) {
		this.dlcse = dlcse;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getNsrsbh() {
		return nsrsbh;
	}

	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}
}