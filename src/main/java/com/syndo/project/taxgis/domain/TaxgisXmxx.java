package com.syndo.project.taxgis.domain;

import java.util.Date;

public class TaxgisXmxx {
    private String id;
    // 项目名称
    private String xmmc;
    // 项目地址
    private String xmdz;
    // geo
    private String geo;

    // 建设内容
    private String jsnr;
    // 开工时间
    private String kgsj;
    // 竣工时间
    private String jgsj;
    // 建设单位
    private String jsdw;
    // 建设单位联系人
    private String jsdwlxr;
    // 联系方式
    private String lxfs;
    // 建设期限
    private String jsqx;
    // 投资额（元）
    private String tze;
    // 年计划投资
    private String njhtz;
    // 建设规模（㎡）
    private String jsgm;
    // 立项时间
    private String lxsj;
    // 资金来源
    private String zjly;

    // lat
    private Double lat;
    // lon
    private Double lon;

    private String lrr;
    private String xgr;
    private Date lrrq;
    private Date xgrq;
    // 未标注，1：未标注，0：已标注
    private Integer wbz;

    // 附加查询条件
    private String sfbz;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getXmdz() {
        return xmdz;
    }

    public void setXmdz(String xmdz) {
        this.xmdz = xmdz;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getJsnr() {
        return jsnr;
    }

    public void setJsnr(String jsnr) {
        this.jsnr = jsnr;
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

    public String getJsdw() {
        return jsdw;
    }

    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    public String getJsdwlxr() {
        return jsdwlxr;
    }

    public void setJsdwlxr(String jsdwlxr) {
        this.jsdwlxr = jsdwlxr;
    }

    public String getLxfs() {
        return lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
    }

    public String getJsqx() {
        return jsqx;
    }

    public void setJsqx(String jsqx) {
        this.jsqx = jsqx;
    }

    public String getTze() {
        return tze;
    }

    public void setTze(String tze) {
        this.tze = tze;
    }

    public String getNjhtz() {
        return njhtz;
    }

    public void setNjhtz(String njhtz) {
        this.njhtz = njhtz;
    }

    public String getJsgm() {
        return jsgm;
    }

    public void setJsgm(String jsgm) {
        this.jsgm = jsgm;
    }

    public String getLxsj() {
        return lxsj;
    }

    public void setLxsj(String lxsj) {
        this.lxsj = lxsj;
    }

    public String getZjly() {
        return zjly;
    }

    public void setZjly(String zjly) {
        this.zjly = zjly;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
    }

    public String getXgr() {
        return xgr;
    }

    public void setXgr(String xgr) {
        this.xgr = xgr;
    }

    public Date getLrrq() {
        return lrrq;
    }

    public void setLrrq(Date lrrq) {
        this.lrrq = lrrq;
    }

    public Date getXgrq() {
        return xgrq;
    }

    public void setXgrq(Date xgrq) {
        this.xgrq = xgrq;
    }

    public Integer getWbz() {
        return wbz;
    }

    public void setWbz(Integer wbz) {
        this.wbz = wbz;
    }

    public String getSfbz() {
        return sfbz;
    }

    public void setSfbz(String sfbz) {
        this.sfbz = sfbz;
    }
}
