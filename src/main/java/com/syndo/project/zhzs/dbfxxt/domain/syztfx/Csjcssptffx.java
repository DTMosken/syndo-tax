package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;
/**
 * 城市基础设施配套费分析 
 */
public class Csjcssptffx extends BaseEntity {

    private String objId;
    @Excel(name = "纳税人名称",sort = 1)
    private String nsrmc;
    @Excel(name = "配套费金额",sort = 2)
    private String ptfje;
    @Excel(name = "缴纳日期",sort = 3)
    private String jnrq;
    @Excel(name = "应纳契税",sort = 4)
    private String yjqs;
    @Excel(name = "实缴契税",sort = 5)
    private String sjqs;
    @Excel(name = "差额",sort = 6)
    private String ce;
    
    private String state;
    private String ssnd; // 所属年度

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getPtfje() {
        return ptfje;
    }

    public void setPtfje(String ptfje) {
        this.ptfje = ptfje;
    }

    public String getJnrq() {
        return jnrq;
    }

    public void setJnrq(String jnrq) {
        this.jnrq = jnrq;
    }

    public String getYjqs() {
        return yjqs;
    }

    public void setYjqs(String yjqs) {
        this.yjqs = yjqs;
    }

    public String getSjqs() {
        return sjqs;
    }

    public void setSjqs(String sjqs) {
        this.sjqs = sjqs;
    }

    public String getCe() {
        return ce;
    }

    public void setCe(String ce) {
        this.ce = ce;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSsnd() {
        return ssnd;
    }

    public void setSsnd(String ssnd) {
        this.ssnd = ssnd;
    }
}
