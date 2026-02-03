package com.syndo.project.zhzs.sjkshxt.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Srqs extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String sryf;
    private String zsr;
    private String dfsr;

    public Srqs() {
    }

    public Srqs(Integer id, String sryf, String zsr, String dfsr) {
        this.id = id;
        this.sryf = sryf;
        this.zsr = zsr;
        this.dfsr = dfsr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSryf() {
        return sryf;
    }

    public void setSryf(String sryf) {
        this.sryf = sryf;
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

    @Override
    public String toString() {
        return "Srqs{" +
                "id=" + id +
                ", sryf='" + sryf + '\'' +
                ", zsr='" + zsr + '\'' +
                ", dfsr='" + dfsr + '\'' +
                '}';
    }
}
