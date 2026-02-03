package com.syndo.project.zhzs.gcxmxt.domain.xmzhcx;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 项目管理
 *
 * @author zyc
 *
 */
public class Xmzhcx extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String xmmc;
    private String xmzt;
    private String xmdz;
    private String jsnr;
    private String jsgm;
    private String tze;
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

    public Xmzhcx() {
    }

    public Xmzhcx(String xmmc, String xmzt, String xmdz, String jsnr, String jsgm, String tze, String ljwctz, String jsdw, String sgdw, String lxr, String lxdh, String kgsj, String jgsj, String zjly, String htqdsj, String htqdje, String ljbk) {
        this.xmmc = xmmc;
        this.xmzt = xmzt;
        this.xmdz = xmdz;
        this.jsnr = jsnr;
        this.jsgm = jsgm;
        this.tze = tze;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getXmmc() {
        return xmmc;
    }

    public String getXmzt() {
        return xmzt;
    }

    public String getXmdz() {
        return xmdz;
    }

    public String getJsnr() {
        return jsnr;
    }

    public String getJsgm() {
        return jsgm;
    }

    public String getTze() {
        return tze;
    }

    public String getLjwctz() {
        return ljwctz;
    }

    public String getJsdw() {
        return jsdw;
    }

    public String getSgdw() {
        return sgdw;
    }

    public String getLxr() {
        return lxr;
    }

    public String getLxdh() {
        return lxdh;
    }

    public String getKgsj() {
        return kgsj;
    }

    public String getJgsj() {
        return jgsj;
    }

    public String getZjly() {
        return zjly;
    }

    public String getHtqdsj() {
        return htqdsj;
    }

    public String getHtqdje() {
        return htqdje;
    }

    public String getLjbk() {
        return ljbk;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public void setXmzt(String xmzt) {
        this.xmzt = xmzt;
    }

    public void setXmdz(String xmdz) {
        this.xmdz = xmdz;
    }

    public void setJsnr(String jsnr) {
        this.jsnr = jsnr;
    }

    public void setJsgm(String jsgm) {
        this.jsgm = jsgm;
    }

    public void setTze(String tze) {
        this.tze = tze;
    }

    public void setLjwctz(String ljwctz) {
        this.ljwctz = ljwctz;
    }

    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    public void setSgdw(String sgdw) {
        this.sgdw = sgdw;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public void setKgsj(String kgsj) {
        this.kgsj = kgsj;
    }

    public void setJgsj(String jgsj) {
        this.jgsj = jgsj;
    }

    public void setZjly(String zjly) {
        this.zjly = zjly;
    }

    public void setHtqdsj(String htqdsj) {
        this.htqdsj = htqdsj;
    }

    public void setHtqdje(String htqdje) {
        this.htqdje = htqdje;
    }

    public void setLjbk(String ljbk) {
        this.ljbk = ljbk;
    }

    @Override
    public String toString() {
        return "Xmgl{" +
                "xmmc='" + xmmc + '\'' +
                ", xmzt='" + xmzt + '\'' +
                ", xmdz='" + xmdz + '\'' +
                ", jsnr='" + jsnr + '\'' +
                ", jsgm='" + jsgm + '\'' +
                ", tze='" + tze + '\'' +
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
