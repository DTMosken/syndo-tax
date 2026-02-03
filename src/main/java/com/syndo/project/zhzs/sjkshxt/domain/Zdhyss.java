package com.syndo.project.zhzs.sjkshxt.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Zdhyss extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String hy;
    private String sssr;

    public Zdhyss() {
    }

    public Zdhyss(Integer id, String hy, String sssr) {
        this.id = id;
        this.hy = hy;
        this.sssr = sssr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy;
    }

    public String getSssr() {
        return sssr;
    }

    public void setSssr(String sssr) {
        this.sssr = sssr;
    }

    @Override
    public String toString() {
        return "Zdhyss{" +
                "id=" + id +
                ", hy='" + hy + '\'' +
                ", sssr='" + sssr + '\'' +
                '}';
    }
}
