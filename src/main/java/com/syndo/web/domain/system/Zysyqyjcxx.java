package com.syndo.web.domain.system;

public class Zysyqyjcxx {


    private static final long serialVersionUID = 1L;

    private String qymc;
    private String hy;
    private String nsrsbh;
    private String zczb;
    private String zs;
    private String frdb;
    private String lng;//经度值
    private String lat;//纬度值
    private String id;

    public Zysyqyjcxx(String qymc, String hy, String nsrsbh, String zczb, String zs, String frdb, String lng, String lat,String id) {
        this.qymc = qymc;
        this.hy = hy;
        this.nsrsbh = nsrsbh;
        this.zczb = zczb;
        this.zs = zs;
        this.frdb = frdb;
        this.lng = lng;
        this.lat = lat;
        this.id = id;
    }

    public Zysyqyjcxx() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQymc() {
        return qymc;
    }

    public void setQymc(String qymc) {
        this.qymc = qymc;
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getZczb() {
        return zczb;
    }

    public void setZczb(String zczb) {
        this.zczb = zczb;
    }

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs;
    }

    public String getFrdb() {
        return frdb;
    }

    public void setFrdb(String frdb) {
        this.frdb = frdb;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Zysyqyjcxx{" +
                "qymc='" + qymc + '\'' +
                ", hy='" + hy + '\'' +
                ", nsrsbh='" + nsrsbh + '\'' +
                ", zczb='" + zczb + '\'' +
                ", zs='" + zs + '\'' +
                ", frdb='" + frdb + '\'' +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                '}';
    }
}
