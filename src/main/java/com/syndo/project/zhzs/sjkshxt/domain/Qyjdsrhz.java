package com.syndo.project.zhzs.sjkshxt.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Qyjdsrhz extends BaseEntity {

    private static final long serialVersionUID = 1L;

    public Qyjdsrhz() {
    }

    private Integer id;
    private Integer qyzs;
    private Integer byxz;
    private String zsr;
    private String byzsr;
    private String dfsr;
    private String bydfsr;


    public Qyjdsrhz(Integer id, Integer qyzs, Integer byxz, String zsr, String byzsr, String dfsr, String bydfsr) {
        this.id = id;
        this.qyzs = qyzs;
        this.byxz = byxz;
        this.zsr = zsr;
        this.byzsr = byzsr;
        this.dfsr = dfsr;
        this.bydfsr = bydfsr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQyzs() {
        return qyzs;
    }

    public void setQyzs(Integer qyzs) {
        this.qyzs = qyzs;
    }

    public Integer getByxz() {
        return byxz;
    }

    public void setByxz(Integer byxz) {
        this.byxz = byxz;
    }

    public String getZsr() {
        return zsr;
    }

    public void setZsr(String zsr) {
        this.zsr = zsr;
    }

    public String getByzsr() {
        return byzsr;
    }

    public void setByzsr(String byzsr) {
        this.byzsr = byzsr;
    }

    public String getDfsr() {
        return dfsr;
    }

    public void setDfsr(String dfsr) {
        this.dfsr = dfsr;
    }

    public String getBydfsr() {
        return bydfsr;
    }

    public void setBydfsr(String bydfsr) {
        this.bydfsr = bydfsr;
    }

    @Override
    public String toString() {
        return "Qyjdsrhz{" +
                "id=" + id +
                ", qyzs=" + qyzs +
                ", byxz=" + byxz +
                ", zsr='" + zsr + '\'' +
                ", byzsr='" + byzsr + '\'' +
                ", dfsr='" + dfsr + '\'' +
                ", bydfsr='" + bydfsr + '\'' +
                '}';
    }
}
