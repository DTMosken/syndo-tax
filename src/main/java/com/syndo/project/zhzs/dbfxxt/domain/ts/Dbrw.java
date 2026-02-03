package com.syndo.project.zhzs.dbfxxt.domain.ts;


import com.syndo.common.core.domain.BaseEntity;

public class Dbrw extends BaseEntity {
    private String id;
    private String ywid;
    private String lx;
    private String zbdm;
    private String zbmc;
    private String nsrmc;
    private String tsr;
    private String tsyj;
    private String tssj;
    private String fkrId;
    private String fkr;
    private String fksx;
    private String fksj;
    private String shr;
    private String shsj;

    private String qsrq;
    private String zzrq;
    private String shrmc;
    private String fkrmc;
    private String tsrmc;
    

    
    public String getLxmc() {
        return Lczt.getName(lx);
    }

    public String getFkrId() {
        return fkrId;
    }

    public void setFkrId(String fkrId) {
        this.fkrId = fkrId;
    }

    public String getTsyj() {
		return tsyj;
	}
	public void setTsyj(String tsyj) {
		this.tsyj = tsyj;
	}
	
	public String getShr() {
		return shr;
	}

	public void setShr(String shr) {
		this.shr = shr;
	}

	public String getShsj() {
		return shsj;
	}

	public void setShsj(String shsj) {
		this.shsj = shsj;
	}

	public String getShrmc() {
		return shrmc;
	}

	public void setShrmc(String shrmc) {
		this.shrmc = shrmc;
	}

	public String getFkrmc() {
        return fkrmc;
    }

    public void setFkrmc(String fkrmc) {
        this.fkrmc = fkrmc;
    }

    public String getTsrmc() {
        return tsrmc;
    }

    public void setTsrmc(String tsrmc) {
        this.tsrmc = tsrmc;
    }

    public String getQsrq() {
        return qsrq;
    }

    public void setQsrq(String qsrq) {
        this.qsrq = qsrq;
    }

    public String getZzrq() {
        return zzrq;
    }

    public void setZzrq(String zzrq) {
        this.zzrq = zzrq;
    }

    public String getYwid() {
        return ywid;
    }

    public void setYwid(String ywid) {
        this.ywid = ywid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getZbdm() {
        return zbdm;
    }

    public void setZbdm(String zbdm) {
        this.zbdm = zbdm;
    }

    public String getZbmc() {
        return zbmc;
    }

    public void setZbmc(String zbmc) {
        this.zbmc = zbmc;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getTsr() {
        return tsr;
    }

    public void setTsr(String tsr) {
        this.tsr = tsr;
    }

    public String getTssj() {
        return tssj;
    }

    public void setTssj(String tssj) {
        this.tssj = tssj;
    }

    public String getFkr() {
        return fkr;
    }

    public void setFkr(String fkr) {
        this.fkr = fkr;
    }

    public String getFksx() {
        return fksx;
    }

    public void setFksx(String fksx) {
        this.fksx = fksx;
    }

    public String getFksj() {
        return fksj;
    }

    public void setFksj(String fksj) {
        this.fksj = fksj;
    }
}
