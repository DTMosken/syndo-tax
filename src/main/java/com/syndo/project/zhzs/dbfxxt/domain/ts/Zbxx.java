package com.syndo.project.zhzs.dbfxxt.domain.ts;

import com.syndo.common.core.domain.BaseEntity;

public class Zbxx extends BaseEntity {
    private String zbdm;
    private String zbmc;
    private String zblx;
    private String zbms;
    // 是否反馈 0否，1是
    private String sffk;
    private String cols;
    private String url;

    public String getZblxmc(){
        // 指标类型，1漏征漏管分析；2税源专题分析；3专题综合分析
        if(zblx==null) {
            return null;
        } else if("1".equals(zblx)){
            return "漏征漏管分析";
        } else if("2".equals(zblx)){
            return "税源专题分析";
        } else if("3".equals(zblx)){
            return "专题综合分析";
        } else {
            return zblx;
        }
    }
    
    public String getSffkmc() {
    	if(sffk == null) {
    		return null;
    	} else if("0".equals(sffk)) {
    		return "否";
    	} else if("1".equals(sffk)) {
    		return "是";
    	} else {
    		return sffk;
    	}
    }

    public String getSffk() {
        return sffk;
    }

    public void setSffk(String sffk) {
        this.sffk = sffk;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    public String getZblx() {
        return zblx;
    }
    public void setZblx(String zblx) {
        this.zblx = zblx;
    }
    public String getZbms() {
        return zbms;
    }
    public void setZbms(String zbms) {
        this.zbms = zbms;
    }
    public String getCols() {
        return cols;
    }
    public void setCols(String cols) {
        this.cols = cols;
    }
}
