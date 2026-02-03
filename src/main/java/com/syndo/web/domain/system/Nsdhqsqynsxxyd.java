package com.syndo.web.domain.system;

import com.syndo.common.core.domain.BaseEntity;

public class Nsdhqsqynsxxyd{

    private static final long serialVersionUID = 1L;

    private String id;
    private String qymc;
    private String yf;
    private String nsrsbh;
    private String ynse;
    private String tbynse;

    public Nsdhqsqynsxxyd() {
    }

    public Nsdhqsqynsxxyd(String id, String qymc, String yf, String nsrsbh, String ynse, String tbynse) {
        this.id = id;
        this.qymc = qymc;
        this.yf = yf;
        this.nsrsbh = nsrsbh;
        this.ynse = ynse;
        this.tbynse = tbynse;
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

    public String getYf() {
        return yf;
    }

    public void setYf(String yf) {
        this.yf = yf;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getYnse() {
        return ynse;
    }

    public void setYnse(String ynse) {
        this.ynse = ynse;
    }

    public String getTbynse() {
        return tbynse;
    }

    public void setTbynse(String tbynse) {
        this.tbynse = tbynse;
    }

    @Override
    public String toString() {
        return "Nsdhqsqynsxxyd{" +
                "id='" + id + '\'' +
                ", qymc='" + qymc + '\'' +
                ", yf='" + yf + '\'' +
                ", nsrsbh='" + nsrsbh + '\'' +
                ", ynse='" + ynse + '\'' +
                ", tbynse='" + tbynse + '\'' +
                '}';
    }
}
