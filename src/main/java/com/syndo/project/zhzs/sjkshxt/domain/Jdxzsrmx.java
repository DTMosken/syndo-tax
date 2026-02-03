package com.syndo.project.zhzs.sjkshxt.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Jdxzsrmx extends BaseEntity {

    private static final long serialVersionUID = 1L;

    public Jdxzsrmx() {
    }

    private Integer id;
    private String jdxz;
    private String jdzsr;
    private String jdqnzsr;
    private String jdzje;
    private String jdzjl;
    private String jddfsr;
    private String jdqndfsr;
    private String jddfzje;
    private String jddfzjl;
    private String zhs;
    private String qys;
    private String gts;
    private String srzb;
    private String bnsr;
    private String zs;
    private String sjje;

    public Jdxzsrmx(Integer id, String jdxz, String jdzsr, String jdqnzsr, String jdzje, String jdzjl, String jddfsr, String jdqndfsr, String jddfzje, String jddfzjl, String zhs, String qys, String gts, String srzb, String bnsr, String zs, String sjje) {
        this.id = id;
        this.jdxz = jdxz;
        this.jdzsr = jdzsr;
        this.jdqnzsr = jdqnzsr;
        this.jdzje = jdzje;
        this.jdzjl = jdzjl;
        this.jddfsr = jddfsr;
        this.jdqndfsr = jdqndfsr;
        this.jddfzje = jddfzje;
        this.jddfzjl = jddfzjl;
        this.zhs = zhs;
        this.qys = qys;
        this.gts = gts;
        this.srzb = srzb;
        this.bnsr = bnsr;
        this.zs = zs;
        this.sjje = sjje;
    }

    public String getSjje() {
        return sjje;
    }

    public void setSjje(String sjje) {
        this.sjje = sjje;
    }

    public String getBnsr() {
        return bnsr;
    }

    public void setBnsr(String bnsr) {
        this.bnsr = bnsr;
    }

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJdxz() {
        return jdxz;
    }

    public void setJdxz(String jdxz) {
        this.jdxz = jdxz;
    }

    public String getJdzsr() {
        return jdzsr;
    }

    public void setJdzsr(String jdzsr) {
        this.jdzsr = jdzsr;
    }

    public String getJdqnzsr() {
        return jdqnzsr;
    }

    public void setJdqnzsr(String jdqnzsr) {
        this.jdqnzsr = jdqnzsr;
    }

    public String getJdzje() {
        return jdzje;
    }

    public void setJdzje(String jdzje) {
        this.jdzje = jdzje;
    }

    public String getJdzjl() {
        return jdzjl;
    }

    public void setJdzjl(String jdzjl) {
        this.jdzjl = jdzjl;
    }

    public String getJddfsr() {
        return jddfsr;
    }

    public void setJddfsr(String jddfsr) {
        this.jddfsr = jddfsr;
    }

    public String getJdqndfsr() {
        return jdqndfsr;
    }

    public void setJdqndfsr(String jdqndfsr) {
        this.jdqndfsr = jdqndfsr;
    }

    public String getJddfzje() {
        return jddfzje;
    }

    public void setJddfzje(String jddfzje) {
        this.jddfzje = jddfzje;
    }

    public String getJddfzjl() {
        return jddfzjl;
    }

    public void setJddfzjl(String jddfzjl) {
        this.jddfzjl = jddfzjl;
    }

    public String getZhs() {
        return zhs;
    }

    public void setZhs(String zhs) {
        this.zhs = zhs;
    }

    public String getQys() {
        return qys;
    }

    public void setQys(String qys) {
        this.qys = qys;
    }

    public String getGts() {
        return gts;
    }

    public void setGts(String gts) {
        this.gts = gts;
    }

    public String getSrzb() {
        return srzb;
    }

    public void setSrzb(String srzb) {
        this.srzb = srzb;
    }

    @Override
    public String toString() {
        return "Jdxzsrmx{" +
                "id=" + id +
                ", jdxz='" + jdxz + '\'' +
                ", jdzsr='" + jdzsr + '\'' +
                ", jdqnzsr='" + jdqnzsr + '\'' +
                ", jdzje='" + jdzje + '\'' +
                ", jdzjl='" + jdzjl + '\'' +
                ", jddfsr='" + jddfsr + '\'' +
                ", jdqndfsr='" + jdqndfsr + '\'' +
                ", jddfzje='" + jddfzje + '\'' +
                ", jddfzjl='" + jddfzjl + '\'' +
                ", zhs='" + zhs + '\'' +
                ", qys='" + qys + '\'' +
                ", gts='" + gts + '\'' +
                ", srzb='" + srzb + '\'' +
                ", bnsr='" + bnsr + '\'' +
                ", zs='" + zs + '\'' +
                ", sjje='" + sjje + '\'' +
                '}';
    }
}
