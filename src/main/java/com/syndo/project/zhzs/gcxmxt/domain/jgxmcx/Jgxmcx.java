package com.syndo.project.zhzs.gcxmxt.domain.jgxmcx;

import com.syndo.common.core.domain.BaseEntity;

public class Jgxmcx extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String xmmc;
    private String barq;
    private String gcxz;
    private String jsdw;
    private String jglx;
    private String gcyt;
    private String jzgm;
    private String zj;
    private String kgsj;
    private String jgsj;
    private String kcdw;
    private String sjdw;
    private String sgdw;
    private String jldw;
    private String sgxkzh;

    public Jgxmcx() {
    }

    public Jgxmcx(String xmmc, String barq, String gcxz, String jsdw, String jglx, String gcyt, String jzgm, String zj, String kgsj, String jgsj, String kcdw, String sjdw, String sgdw, String jldw, String sgxkzh) {
        this.xmmc = xmmc;
        this.barq = barq;
        this.gcxz = gcxz;
        this.jsdw = jsdw;
        this.jglx = jglx;
        this.gcyt = gcyt;
        this.jzgm = jzgm;
        this.zj = zj;
        this.kgsj = kgsj;
        this.jgsj = jgsj;
        this.kcdw = kcdw;
        this.sjdw = sjdw;
        this.sgdw = sgdw;
        this.jldw = jldw;
        this.sgxkzh = sgxkzh;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getBarq() {
        return barq;
    }

    public void setBarq(String barq) {
        this.barq = barq;
    }

    public String getGcxz() {
        return gcxz;
    }

    public void setGcxz(String gcxz) {
        this.gcxz = gcxz;
    }

    public String getJsdw() {
        return jsdw;
    }

    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    public String getJglx() {
        return jglx;
    }

    public void setJglx(String jglx) {
        this.jglx = jglx;
    }

    public String getGcyt() {
        return gcyt;
    }

    public void setGcyt(String gcyt) {
        this.gcyt = gcyt;
    }

    public String getJzgm() {
        return jzgm;
    }

    public void setJzgm(String jzgm) {
        this.jzgm = jzgm;
    }

    public String getZj() {
        return zj;
    }

    public void setZj(String zj) {
        this.zj = zj;
    }

    public String getKgsj() {
        return kgsj;
    }

    public void setKgsj(String kgsj) {
        this.kgsj = kgsj;
    }

    public String getJgsj() {
        return jgsj;
    }

    public void setJgsj(String jgsj) {
        this.jgsj = jgsj;
    }

    public String getKcdw() {
        return kcdw;
    }

    public void setKcdw(String kcdw) {
        this.kcdw = kcdw;
    }

    public String getSjdw() {
        return sjdw;
    }

    public void setSjdw(String sjdw) {
        this.sjdw = sjdw;
    }

    public String getSgdw() {
        return sgdw;
    }

    public void setSgdw(String sgdw) {
        this.sgdw = sgdw;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getSgxkzh() {
        return sgxkzh;
    }

    public void setSgxkzh(String sgxkzh) {
        this.sgxkzh = sgxkzh;
    }

    @Override
    public String toString() {
        return "Jgxmcx{" +
                "xmmc='" + xmmc + '\'' +
                ", barq='" + barq + '\'' +
                ", gcxz='" + gcxz + '\'' +
                ", jsdw='" + jsdw + '\'' +
                ", jglx='" + jglx + '\'' +
                ", gcyt='" + gcyt + '\'' +
                ", jzgm='" + jzgm + '\'' +
                ", zj='" + zj + '\'' +
                ", kgsj='" + kgsj + '\'' +
                ", jgsj='" + jgsj + '\'' +
                ", kcdw='" + kcdw + '\'' +
                ", sjdw='" + sjdw + '\'' +
                ", sgdw='" + sgdw + '\'' +
                ", jldw='" + jldw + '\'' +
                ", sgxkzh='" + sgxkzh + '\'' +
                '}';
    }
}
