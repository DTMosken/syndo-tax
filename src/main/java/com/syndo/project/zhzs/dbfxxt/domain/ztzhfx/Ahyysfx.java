package com.syndo.project.zhzs.dbfxxt.domain.ztzhfx;

import java.io.Serializable;

/**
 * 按行业用水分析
 * @author gxg
 *
 */
public class Ahyysfx implements Serializable{
	private static final long serialVersionUID = 1L;
    private String sshy; // 所属行业
    private String cxsjq;// 查询时间起
    private String cxsjz;// 查询时间止
    private String nsrmc;// 纳税人名称
    private String nsrsbh;// 纳税人识别号
    private String yf;// 月份
    private String objId;
    private String qyysl;// 企业用水量
    private String qynse;// 企业纳税额
    private String slcse;// 水量产税额
    
    private String detail;
    private String dz;
    private String hyml;
    private String ssqq;
    
    private String yslq;
    private String yslz;
    
    public String getYslq() {
		return yslq;
	}

	public void setYslq(String yslq) {
		this.yslq = yslq;
	}

	public String getYslz() {
		return yslz;
	}

	public void setYslz(String yslz) {
		this.yslz = yslz;
	}

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public Ahyysfx(String qynse, String qyysl) {
        this.qynse = qynse;
        this.qyysl = qyysl;
    }

    public Ahyysfx() {
    }

    public String getYf() {
        return yf;
    }

    public void setYf(String yf) {
        this.yf = yf;
    }


    public String getSshy() {
        return sshy;
    }

    public void setSshy(String sshy) {
        this.sshy = sshy;
    }

    public String getCxsjq() {
        return cxsjq;
    }

    public void setCxsjq(String cxsjq) {
        this.cxsjq = cxsjq;
    }

    public String getCxsjz() {
        return cxsjz;
    }

    public void setCxsjz(String cxsjz) {
        this.cxsjz = cxsjz;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getQyysl() {
        return qyysl;
    }

    public void setQyysl(String qyysl) {
        this.qyysl = qyysl;
    }

    public String getQynse() {
        return qynse;
    }

    public void setQynse(String qynse) {
        this.qynse = qynse;
    }

    public String getSlcse() {
        return slcse;
    }

    public void setSlcse(String slcse) {
        this.slcse = slcse;
    }

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public String getHyml() {
		return hyml;
	}

	public void setHyml(String hyml) {
		this.hyml = hyml;
	}


	public String getSsqq() {
		return ssqq;
	}

	public void setSsqq(String ssqq) {
		this.ssqq = ssqq;
	}


	public String getNsrsbh() {
		return nsrsbh;
	}

	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}
}
