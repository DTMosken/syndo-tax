package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import java.math.BigDecimal;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 土地出让契税分析
 */
public class TdcrTdxx extends BaseEntity {
    private String id;
    @Excel(name = "项目名称")
    private String xmmc;
    @Excel(name = "签订日期")
    private String qdrq;
    @Excel(name = "受让人")
    private String srr;
    @Excel(name = "宗地编号")
    private String zdbh;
    @Excel(name = "宗地位置")
    private String zdwz;
    @Excel(name = "总面积")
    private String zmj;
    @Excel(name = "占用耕地面积")
    private String zygdmj;
    @Excel(name = "出让/划拨价歀")
    private String crhbjk;
    @Excel(name = "约定交地时间")
    private String ydjdsj;
    @Excel(name = "应缴契税")
    private String ynse;
    
    public String getYnse() {
        return ynse;
    }

    public void setYnse(String ynse) {
        this.ynse = ynse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getQdrq() {
        return qdrq;
    }

    public void setQdrq(String qdrq) {
        this.qdrq = qdrq;
    }

    public String getSrr() {
        return srr;
    }

    public void setSrr(String srr) {
        this.srr = srr;
    }

    public String getZdbh() {
        return zdbh;
    }

    public void setZdbh(String zdbh) {
        this.zdbh = zdbh;
    }

    public String getZdwz() {
        return zdwz;
    }

    public void setZdwz(String zdwz) {
        this.zdwz = zdwz;
    }

    public String getZmj() {
        return zmj;
    }

    public void setZmj(String zmj) {
        this.zmj = zmj;
    }

    public String getZygdmj() {
        return zygdmj;
    }

    public void setZygdmj(String zygdmj) {
        this.zygdmj = zygdmj;
    }

    public String getCrhbjk() {
        return crhbjk;
    }

    public void setCrhbjk(String crhbjk) {
        this.crhbjk = crhbjk;
    }

    public String getYdjdsj() {
        return ydjdsj;
    }

    public void setYdjdsj(String ydjdsj) {
        this.ydjdsj = ydjdsj;
    }

}
