package com.syndo.project.zhzs.czjbmfg.domain;

import com.syndo.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor //全参构造函数
@NoArgsConstructor //无参构造函数
/*财政局部门分管----财政专项资金拨付*/
public class Czzxzjbf extends BaseEntity{

    private static final long serialVersionUID = 1L;

    private String ks;
    private String nsrsbh;
    private String qymc;
    private String xmnr;
    private String bfjey;
    private String zfyt;
    private String id;
    private String loginName;
    private String bfsj;
    private String sjssq;

    public String getKs() {
        return ks;
    }

    public void setKs(String ks) {
        this.ks = ks;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getQymc() {
        return qymc;
    }

    public void setQymc(String qymc) {
        this.qymc = qymc;
    }

    public String getXmnr() {
        return xmnr;
    }

    public void setXmnr(String xmnr) {
        this.xmnr = xmnr;
    }

    public String getBfjey() {
        return bfjey;
    }

    public void setBfjey(String bfjey) {
        this.bfjey = bfjey;
    }

    public String getZfyt() {
        return zfyt;
    }

    public void setZfyt(String zfyt) {
        this.zfyt = zfyt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getBfsj() {
        return bfsj;
    }

    public void setBfsj(String bfsj) {
        this.bfsj = bfsj;
    }

    public String getSjssq() {
        return sjssq;
    }

    public void setSjssq(String sjssq) {
        this.sjssq = sjssq;
    }
}
