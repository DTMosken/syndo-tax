package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import java.math.BigDecimal;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsBase;

/**
 * 土地出让使用税分析
 */
public class Tdcrsysfx extends TsBase {
    @Excel(name = "受让人名称")
    private String nsrmc;
    @Excel(name = "出让面积(㎡)")
    private String crmj;
    @Excel(name = "免税面积")
    private String msmj;
    @Excel(name = "减免税额")
    private String jmse;
    @Excel(name = "实缴城镇土地使用税")
    private String sjje;
    @Excel(name = "应纳土地使用税(元)")
    private String ynse;
    @Excel(name = "城镇土地使用税差额")
    private String ce;
    private String qdrq;
    private String sfqj;

    public String getSfqj() {
        return sfqj;
    }

    public void setSfqj(String sfqj) {
        this.sfqj = sfqj;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getCrmj() {
        return crmj;
    }

    public void setCrmj(String crmj) {
        this.crmj = crmj;
    }

    public String getMsmj() {
        return msmj;
    }

    public void setMsmj(String msmj) {
        this.msmj = msmj;
    }

    public String getJmse() {
        return jmse;
    }

    public void setJmse(String jmse) {
        this.jmse = jmse;
    }

    public String getSjje() {
        return sjje;
    }

    public void setSjje(String sjje) {
        this.sjje = sjje;
    }

    public String getYnse() {
        return ynse;
    }

    public void setYnse(String ynse) {
        this.ynse = ynse;
    }

    public String getCe() {
        return ce;
    }

    public void setCe(String ce) {
        this.ce = ce;
    }

    public String getQdrq() {
        return qdrq;
    }

    public void setQdrq(String qdrq) {
        this.qdrq = qdrq;
    }

}
