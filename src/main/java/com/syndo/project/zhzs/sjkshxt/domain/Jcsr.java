package com.syndo.project.zhzs.sjkshxt.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Jcsr extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String jczb;
    private String zyjsr;
    private String ssjsr;
    private String dsjsr;
    private String qxjsr;
    private String createtime;

    public Jcsr() {
    }


    public Jcsr(Integer id, String jczb, String zyjsr, String ssjsr, String dsjsr, String qxjsr, String createtime) {
        this.id = id;
        this.jczb = jczb;
        this.zyjsr = zyjsr;
        this.ssjsr = ssjsr;
        this.dsjsr = dsjsr;
        this.qxjsr = qxjsr;
        this.createtime = createtime;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getJczb() {
        return jczb;
    }

    public void setJczb(String jczb) {
        this.jczb = jczb;
    }

    public String getZyjsr() {
        return zyjsr;
    }

    public void setZyjsr(String zyjsr) {
        this.zyjsr = zyjsr;
    }

    public String getSsjsr() {
        return ssjsr;
    }

    public void setSsjsr(String ssjsr) {
        this.ssjsr = ssjsr;
    }

    public String getDsjsr() {
        return dsjsr;
    }

    public void setDsjsr(String dsjsr) {
        this.dsjsr = dsjsr;
    }

    public String getQxjsr() {
        return qxjsr;
    }

    public void setQxjsr(String qxjsr) {
        this.qxjsr = qxjsr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Jcsr{" +
                "id=" + id +
                ", jczb='" + jczb + '\'' +
                ", zyjsr='" + zyjsr + '\'' +
                ", ssjsr='" + ssjsr + '\'' +
                ", dsjsr='" + dsjsr + '\'' +
                ", qxjsr='" + qxjsr + '\'' +
                '}';
    }
}
