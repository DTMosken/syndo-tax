package com.syndo.project.zhzs.sjkshxt.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Ssqsqy extends BaseEntity {

    private String id;
    private String qymc;
    private String bn;
    private String sntq;
    private String zs;

    public Ssqsqy() {
    }

    public Ssqsqy(String id, String qymc, String bn, String sntq, String zs) {
        this.id = id;
        this.qymc = qymc;
        this.bn = bn;
        this.sntq = sntq;
        this.zs = zs;
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

    public String getBn() {
        return bn;
    }

    public void setBn(String bn) {
        this.bn = bn;
    }

    public String getSntq() {
        return sntq;
    }

    public void setSntq(String sntq) {
        this.sntq = sntq;
    }

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs;
    }

    @Override
    public String toString() {
        return "Ssqsqy{" +
                "id='" + id + '\'' +
                ", qymc='" + qymc + '\'' +
                ", bn='" + bn + '\'' +
                ", sntq='" + sntq + '\'' +
                ", zs='" + zs + '\'' +
                '}';
    }
}
