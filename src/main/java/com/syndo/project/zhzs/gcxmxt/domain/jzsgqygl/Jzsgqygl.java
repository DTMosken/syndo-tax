package com.syndo.project.zhzs.gcxmxt.domain.jzsgqygl;

import com.syndo.common.core.domain.BaseEntity;

/*
* 建筑施工企业管理
* */
public class Jzsgqygl extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String xmmc;
    private String xmzt;
    private String xmdz;
    private String jsdw;
    private String zbdx;
    private String fgsmc;
    private String xmje;
    private String lxr;
    private String lxdh;
    private String sjyf;
    private String kgzbsj;
    private String sjly;
    private String sfrk;

    public Jzsgqygl(String xmmc, String xmzt, String xmdz, String jsdw, String zbdx, String fgsmc, String xmje, String lxr, String lxdh, String sjyf, String kgzbsj, String sjly, String sfrk) {
        this.xmmc = xmmc;
        this.xmzt = xmzt;
        this.xmdz = xmdz;
        this.jsdw = jsdw;
        this.zbdx = zbdx;
        this.fgsmc = fgsmc;
        this.xmje = xmje;
        this.lxr = lxr;
        this.lxdh = lxdh;
        this.sjyf = sjyf;
        this.kgzbsj = kgzbsj;
        this.sjly = sjly;
        this.sfrk = sfrk;
    }

    public Jzsgqygl() {
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getXmzt() {
        return xmzt;
    }

    public void setXmzt(String xmzt) {
        this.xmzt = xmzt;
    }

    public String getXmdz() {
        return xmdz;
    }

    public void setXmdz(String xmdz) {
        this.xmdz = xmdz;
    }

    public String getJsdw() {
        return jsdw;
    }

    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    public String getZbdx() {
        return zbdx;
    }

    public void setZbdx(String zbdx) {
        this.zbdx = zbdx;
    }

    public String getFgsmc() {
        return fgsmc;
    }

    public void setFgsmc(String fgsmc) {
        this.fgsmc = fgsmc;
    }

    public String getXmje() {
        return xmje;
    }

    public void setXmje(String xmje) {
        this.xmje = xmje;
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getSjyf() {
        return sjyf;
    }

    public void setSjyf(String sjyf) {
        this.sjyf = sjyf;
    }

    public String getKgzbsj() {
        return kgzbsj;
    }

    public void setKgzbsj(String kgzbsj) {
        this.kgzbsj = kgzbsj;
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly;
    }

    public String getSfrk() {
        return sfrk;
    }

    public void setSfrk(String sfrk) {
        this.sfrk = sfrk;
    }

    @Override
    public String toString() {
        return "Jzsgqygl{" +
                "xmmc='" + xmmc + '\'' +
                ", xmzt='" + xmzt + '\'' +
                ", xmdz='" + xmdz + '\'' +
                ", jsdw='" + jsdw + '\'' +
                ", zbdx='" + zbdx + '\'' +
                ", fgsmc='" + fgsmc + '\'' +
                ", xmje='" + xmje + '\'' +
                ", lxr='" + lxr + '\'' +
                ", lxdh='" + lxdh + '\'' +
                ", sjyf='" + sjyf + '\'' +
                ", kgzbsj='" + kgzbsj + '\'' +
                ", sjly='" + sjly + '\'' +
                ", sfrk='" + sfrk + '\'' +
                '}';
    }
}
