package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import java.math.BigDecimal;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsBase;

/**
 * 土地出让契税分析
 */
public class Tdcrnsfx extends TsBase {
    @Excel(name = "纳税人名称")
    private String nsrmc;
    // @Excel(name = "出让时间")
    // private String crsj;
    @Excel(name = "出让面积(㎡)")
    private String crmj;
    @Excel(name = "出让总金额(元)")
    private String crzje;
    @Excel(name = "配套费")
    private String ptf;
    // @Excel(name = "入库日期")
    // private String rkrq;
    // @Excel(name = "应纳土地使用税")
    // private String yjtdsys;
    // @Excel(name = "实缴金额")
    // private String sjje;
    // @Excel(name = "疑似差额")
    // private String ysce;
    @Excel(name = "应纳契税")
    private String ynqs;
    @Excel(name = "实缴契税")
    private String sjqs;
    @Excel(name = "契税差额")
    private String qsce;
    // @Excel(name = "所属年度")
    private String qdrq;
    private String sfqj;

    public String getSfqj() {
        return sfqj;
    }

    public void setSfqj(String sfqj) {
        this.sfqj = sfqj;
    }

    public String getQdrq() {
        return qdrq;
    }

    public void setQdrq(String qdrq) {
        this.qdrq = qdrq;
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

    public String getCrzje() {
        return crzje;
    }

    public void setCrzje(String crzje) {
        this.crzje = crzje;
    }

    public String getYnqs() {
        return ynqs;
    }

    public void setYnqs(String ynqs) {
        this.ynqs = ynqs;
    }

    public String getSjqs() {
        return sjqs;
    }

    public void setSjqs(String sjqs) {
        this.sjqs = sjqs;
    }

    public String getQsce() {
        return qsce;
    }

    public void setQsce(String qsce) {
        this.qsce = qsce;
    }

    public String getPtf() {
        return ptf;
    }

    public void setPtf(String ptf) {
        this.ptf = ptf;
    }

}
