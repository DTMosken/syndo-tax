package com.syndo.project.zhzs.sjkshxt.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Ssfxqk extends BaseEntity {

    private static final long serialVersionUID = 1L;

    public Ssfxqk() {
    }

    private String pm;
    private String nsrmc;
    private String zsr;
    private String rq;
    private String zb;
    private String yjce;


    public Ssfxqk(String pm, String nsrmc, String zsr, String rq, String zb, String yjce) {
        this.pm = pm;
        this.nsrmc = nsrmc;
        this.zsr = zsr;
        this.rq = rq;
        this.zb = zb;
        this.yjce = yjce;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getZsr() {
        return zsr;
    }

    public void setZsr(String zsr) {
        this.zsr = zsr;
    }

    public String getRq() {
        return rq;
    }

    public void setRq(String rq) {
        this.rq = rq;
    }

    public String getZb() {
        return zb;
    }

    public void setZb(String zb) {
        this.zb = zb;
    }

    public String getYjce() {
        return yjce;
    }

    public void setYjce(String yjce) {
        this.yjce = yjce;
    }

    @Override
    public String toString() {
        return "Ssfxqk{" +
                "pm='" + pm + '\'' +
                ", nsrmc='" + nsrmc + '\'' +
                ", zsr='" + zsr + '\'' +
                ", rq='" + rq + '\'' +
                ", zb='" + zb + '\'' +
                ", yjce='" + yjce + '\'' +
                '}';
    }
}
