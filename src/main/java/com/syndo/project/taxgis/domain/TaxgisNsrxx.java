package com.syndo.project.taxgis.domain;

import java.util.Date;

public class TaxgisNsrxx {
    private String id;
    // 社会信用代码
    private String shxydm;
    // 纳税人名称
    private String nsrmc;
    // 纳税人状态
    private String nsrzt;
    // 注册地址
    private String zcdz;
    // 经营地址
    private String jydz;
    // 登记注册类型
    private String djzclx;
    // 课征主体登记类型
    private String kzztdjlx;
    // lat
    private Double lat;
    // lon
    private Double lon;
    private String geo;

    private String lrr;
    private String xgr;
    private Date lrrq;
    private Date xgrq;
    // 未标注，1：未标注，0：已标注
    private Integer wbz;

    // 附加查询条件
    private String sfbz;
    private String sfybnsr;
    private String jdxz;
    private String zgswjg;

    public String getSfybnsr() {
        return sfybnsr;
    }

    public void setSfybnsr(String sfybnsr) {
        this.sfybnsr = sfybnsr;
    }

    public String getKzztdjlx() {
        return kzztdjlx;
    }

    public void setKzztdjlx(String kzztdjlx) {
        this.kzztdjlx = kzztdjlx;
    }

    public String getSfbz() {
        return sfbz;
    }

    public void setSfbz(String sfbz) {
        this.sfbz = sfbz;
    }

    public String getJdxz() {
        return jdxz;
    }

    public void setJdxz(String jdxz) {
        this.jdxz = jdxz;
    }

    public String getZgswjg() {
        return zgswjg;
    }

    public void setZgswjg(String zgswjg) {
        this.zgswjg = zgswjg;
    }

    public Integer getWbz() {
        return wbz;
    }

    public void setWbz(Integer wbz) {
        this.wbz = wbz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getShxydm() {
        return shxydm;
    }

    public void setShxydm(String shxydm) {
        this.shxydm = shxydm;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getNsrzt() {
        return nsrzt;
    }

    public void setNsrzt(String nsrzt) {
        this.nsrzt = nsrzt;
    }

    public String getZcdz() {
        return zcdz;
    }

    public void setZcdz(String zcdz) {
        this.zcdz = zcdz;
    }

    public String getJydz() {
        return jydz;
    }

    public void setJydz(String jydz) {
        this.jydz = jydz;
    }

    public String getDjzclx() {
        return djzclx;
    }

    public void setDjzclx(String djzclx) {
        this.djzclx = djzclx;
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
}
