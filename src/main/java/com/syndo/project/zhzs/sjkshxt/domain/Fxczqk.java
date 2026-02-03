package com.syndo.project.zhzs.sjkshxt.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Fxczqk extends BaseEntity {

    private String zsxm;
    private String ljwcs;
    private String sntq;
    private String bsn;

    public Fxczqk() {
    }

    public Fxczqk(String zsxm, String ljwcs, String sntq, String bsn) {
        this.zsxm = zsxm;
        this.ljwcs = ljwcs;
        this.sntq = sntq;
        this.bsn = bsn;
    }

    public String getZsxm() {
        return zsxm;
    }

    public void setZsxm(String zsxm) {
        this.zsxm = zsxm;
    }

    public String getLjwcs() {
        return ljwcs;
    }

    public void setLjwcs(String ljwcs) {
        this.ljwcs = ljwcs;
    }

    public String getSntq() {
        return sntq;
    }

    public void setSntq(String sntq) {
        this.sntq = sntq;
    }

    public String getBsn() {
        return bsn;
    }

    public void setBsn(String bsn) {
        this.bsn = bsn;
    }

    @Override
    public String toString() {
        return "Fxczqk{" +
                "zsxm=" + zsxm +
                ", ljwcs='" + ljwcs + '\'' +
                ", sntq='" + sntq + '\'' +
                ", bsn='" + bsn + '\'' +
                '}';
    }
}
