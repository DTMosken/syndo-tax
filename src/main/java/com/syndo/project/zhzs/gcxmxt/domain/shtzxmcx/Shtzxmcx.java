package com.syndo.project.zhzs.gcxmxt.domain.shtzxmcx;

import com.syndo.common.core.domain.BaseEntity;

/**
*社会投资项目查询
 * */
public class Shtzxmcx extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String xmmc;
    private String xmzt;
    private String xmdz;
    private String jsnr;
    private String jsgm;
    private String tzy;
    private String ljwctz;
    private String jsdw;
    private String sgdw;
    private String lxr;
    private String lxdh;
    private String kgsj;
    private String jgsj;
    private String zjly;
    private String htqdsj;
    private String htqdje;
    private String ljbk;

    public Shtzxmcx() {
    }

    public Shtzxmcx(String xmmc, String xmzt, String xmdz, String jsnr, String jsgm, String tzy, String ljwctz, String jsdw, String sgdw, String lxr, String lxdh, String kgsj, String jgsj, String zjly, String htqdsj, String htqdje, String ljbk) {
        this.xmmc = xmmc;
        this.xmzt = xmzt;
        this.xmdz = xmdz;
        this.jsnr = jsnr;
        this.jsgm = jsgm;
        this.tzy = tzy;
        this.ljwctz = ljwctz;
        this.jsdw = jsdw;
        this.sgdw = sgdw;
        this.lxr = lxr;
        this.lxdh = lxdh;
        this.kgsj = kgsj;
        this.jgsj = jgsj;
        this.zjly = zjly;
        this.htqdsj = htqdsj;
        this.htqdje = htqdje;
        this.ljbk = ljbk;
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

    public String getJsnr() {
        return jsnr;
    }

    public void setJsnr(String jsnr) {
        this.jsnr = jsnr;
    }

    public String getJsgm() {
        return jsgm;
    }

    public void setJsgm(String jsgm) {
        this.jsgm = jsgm;
    }

    public String getTzy() {
        return tzy;
    }

    public void setTzy(String tzy) {
        this.tzy = tzy;
    }

    public String getLjwctz() {
        return ljwctz;
    }

    public void setLjwctz(String ljwctz) {
        this.ljwctz = ljwctz;
    }

    public String getJsdw() {
        return jsdw;
    }

    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    public String getSgdw() {
        return sgdw;
    }

    public void setSgdw(String sgdw) {
        this.sgdw = sgdw;
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

    public String getJgsj() {
        return jgsj;
    }

    public void setJgsj(String jgsj) {
        this.jgsj = jgsj;
    }

    public String getZjly() {
        return zjly;
    }

    public void setZjly(String zjly) {
        this.zjly = zjly;
    }

    public String getHtqdsj() {
        return htqdsj;
    }

    public void setHtqdsj(String htqdsj) {
        this.htqdsj = htqdsj;
    }

    public String getHtqdje() {
        return htqdje;
    }

    public void setHtqdje(String htqdje) {
        this.htqdje = htqdje;
    }

    public String getLjbk() {
        return ljbk;
    }

    public void setLjbk(String ljbk) {
        this.ljbk = ljbk;
    }

    @Override
    public String toString() {
        return "Shtzxmcx{" +
                "xmmc='" + xmmc + '\'' +
                ", xmzt='" + xmzt + '\'' +
                ", xmdz='" + xmdz + '\'' +
                ", jsnr='" + jsnr + '\'' +
                ", jsgm='" + jsgm + '\'' +
                ", tzy='" + tzy + '\'' +
                ", ljwctz='" + ljwctz + '\'' +
                ", jsdw='" + jsdw + '\'' +
                ", sgdw='" + sgdw + '\'' +
                ", lxr='" + lxr + '\'' +
                ", lxdh='" + lxdh + '\'' +
                ", kgsj='" + kgsj + '\'' +
                ", jgsj='" + jgsj + '\'' +
                ", zjly='" + zjly + '\'' +
                ", htqdsj='" + htqdsj + '\'' +
                ", htqdje='" + htqdje + '\'' +
                ", ljbk='" + ljbk + '\'' +
                '}';
    }
}
