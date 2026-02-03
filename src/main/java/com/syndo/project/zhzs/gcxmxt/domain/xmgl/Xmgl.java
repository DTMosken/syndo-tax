package com.syndo.project.zhzs.gcxmxt.domain.xmgl;

import com.syndo.common.core.domain.BaseEntity;

public class Xmgl extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String xmlb;
    private String xmmc;
    private String xmzt;
    private String xmdz;
    private String jsgm;
    private String tze;
    private String jsdw;
    private String cjdw;
    private String lxr;
    private String lxdh;
    private String kgsj;
    private String sjyf;
    private String zjly;

    public Xmgl(String xmlb, String xmmc, String xmzt, String xmdz, String jsgm, String tze, String jsdw, String cjdw, String lxr, String lxdh, String kgsj, String sjyf, String zjly) {
        this.xmlb = xmlb;
        this.xmmc = xmmc;
        this.xmzt = xmzt;
        this.xmdz = xmdz;
        this.jsgm = jsgm;
        this.tze = tze;
        this.jsdw = jsdw;
        this.cjdw = cjdw;
        this.lxr = lxr;
        this.lxdh = lxdh;
        this.kgsj = kgsj;
        this.sjyf = sjyf;
        this.zjly = zjly;
    }

    public Xmgl() {
    }

    public String getXmlb() {
        return xmlb;
    }

    public void setXmlb(String xmlb) {
        this.xmlb = xmlb;
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

    public String getJsgm() {
        return jsgm;
    }

    public void setJsgm(String jsgm) {
        this.jsgm = jsgm;
    }

    public String getTze() {
        return tze;
    }

    public void setTze(String tze) {
        this.tze = tze;
    }

    public String getJsdw() {
        return jsdw;
    }

    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    public String getCjdw() {
        return cjdw;
    }

    public void setCjdw(String cjdw) {
        this.cjdw = cjdw;
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

    public String getKgsj() {
        return kgsj;
    }

    public void setKgsj(String kgsj) {
        this.kgsj = kgsj;
    }

    public String getSjyf() {
        return sjyf;
    }

    public void setSjyf(String sjyf) {
        this.sjyf = sjyf;
    }

    public String getZjly() {
        return zjly;
    }

    public void setZjly(String zjly) {
        this.zjly = zjly;
    }

    @Override
    public String toString() {
        return "Xmgl{" +
                "xmlb='" + xmlb + '\'' +
                ", xmmc='" + xmmc + '\'' +
                ", xmzt='" + xmzt + '\'' +
                ", xmdz='" + xmdz + '\'' +
                ", jsgm='" + jsgm + '\'' +
                ", tze='" + tze + '\'' +
                ", jsdw='" + jsdw + '\'' +
                ", cjdw='" + cjdw + '\'' +
                ", lxr='" + lxr + '\'' +
                ", lxdh='" + lxdh + '\'' +
                ", kgsj='" + kgsj + '\'' +
                ", sjyf='" + sjyf + '\'' +
                ", zjly='" + zjly + '\'' +
                '}';
    }
}