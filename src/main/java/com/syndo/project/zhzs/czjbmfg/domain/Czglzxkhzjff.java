package com.syndo.project.zhzs.czjbmfg.domain;

import com.syndo.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor //全参构造函数
@NoArgsConstructor //无参构造函数
/*财政局部门分管----财政管理专项考核资金发放*/
public class Czglzxkhzjff extends BaseEntity{

    private static final long serialVersionUID = 1L;

    private String xxssnd;
    private String jlnr;
    private String dwgrmc;
    private String jey;
    private String ffsj;
    private String sjssq;
    private String id;
    private String loginName;
    private Integer userid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSjssq() {
        return sjssq;
    }

    public void setSjssq(String sjssq) {
        this.sjssq = sjssq;
    }

    public String getXxssnd() {
        return xxssnd;
    }

    public void setXxssnd(String xxssnd) {
        this.xxssnd = xxssnd;
    }

    public String getJlnr() {
        return jlnr;
    }

    public void setJlnr(String jlnr) {
        this.jlnr = jlnr;
    }

    public String getDwgrmc() {
        return dwgrmc;
    }

    public void setDwgrmc(String dwgrmc) {
        this.dwgrmc = dwgrmc;
    }

    public String getJey() {
        return jey;
    }

    public void setJey(String jey) {
        this.jey = jey;
    }

    public String getFfsj() {
        return ffsj;
    }

    public void setFfsj(String ffsj) {
        this.ffsj = ffsj;
    }
}
