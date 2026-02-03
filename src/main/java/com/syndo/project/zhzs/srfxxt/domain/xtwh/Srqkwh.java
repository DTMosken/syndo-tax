package com.syndo.project.zhzs.srfxxt.domain.xtwh;

import com.syndo.common.core.domain.BaseEntity;

public class Srqkwh extends BaseEntity {
    private String id;
    private String dateTime;
    private String zsr;
    private String dfsr;
    private String zsrTq;
    private String dfsrTq;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getDateTime() {
        return dateTime;
    }

    @Override
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getZsr() {
        return zsr;
    }

    public void setZsr(String zsr) {
        this.zsr = zsr;
    }

    public String getDfsr() {
        return dfsr;
    }

    public void setDfsr(String dfsr) {
        this.dfsr = dfsr;
    }

    public String getZsrTq() {
        return zsrTq;
    }

    public void setZsrTq(String zsrTq) {
        this.zsrTq = zsrTq;
    }

    public String getDfsrTq() {
        return dfsrTq;
    }

    public void setDfsrTq(String dfsrTq) {
        this.dfsrTq = dfsrTq;
    }
}
