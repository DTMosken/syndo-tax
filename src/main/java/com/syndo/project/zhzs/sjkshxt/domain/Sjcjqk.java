package com.syndo.project.zhzs.sjkshxt.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Sjcjqk extends BaseEntity {


    private static final long serialVersionUID = 1L;


    public Sjcjqk() {
    }

    private Integer id;
    private String sjbm;
    private String sjzy;
    private String sjzl;
    private String hyzt;

    public Sjcjqk(Integer id, String sjbm, String sjzy, String sjzl, String hyzt) {
        this.id = id;
        this.sjbm = sjbm;
        this.sjzy = sjzy;
        this.sjzl = sjzl;
        this.hyzt = hyzt;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSjbm() {
        return sjbm;
    }

    public void setSjbm(String sjbm) {
        this.sjbm = sjbm;
    }

    public String getSjzy() {
        return sjzy;
    }

    public void setSjzy(String sjzy) {
        this.sjzy = sjzy;
    }

    public String getSjzl() {
        return sjzl;
    }

    public void setSjzl(String sjzl) {
        this.sjzl = sjzl;
    }

    public String getHyzt() {
        return hyzt;
    }

    public void setHyzt(String hyzt) {
        this.hyzt = hyzt;
    }


    @Override
    public String toString() {
        return "Sjcjqk{" +
                "id=" + id +
                ", sjbm='" + sjbm + '\'' +
                ", sjzy='" + sjzy + '\'' +
                ", sjzl='" + sjzl + '\'' +
                ", hyzt='" + hyzt + '\'' +
                '}';
    }
}
