package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import java.math.BigDecimal;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 土地转让土地信息
 */
public class TdzrTdxx extends BaseEntity {
    private String id;
    @Excel(name = "转让方")
    private String zrf;
    @Excel(name = "转让方法定代表人")
    private String zrffddbr;
    @Excel(name = "受让方")
    private String srf;
    @Excel(name = "受让方法定代表人")
    private String srffddbr;
    @Excel(name = "土地位置")
    private String tdwz;
    @Excel(name = "土地面积")
    private String tdmj;
    @Excel(name = "转让时间")
    private String zrsj;
    @Excel(name = "转让总金额")
    private String zrzje;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZrf() {
        return zrf;
    }

    public void setZrf(String zrf) {
        this.zrf = zrf;
    }

    public String getZrffddbr() {
        return zrffddbr;
    }

    public void setZrffddbr(String zrffddbr) {
        this.zrffddbr = zrffddbr;
    }

    public String getSrf() {
        return srf;
    }

    public void setSrf(String srf) {
        this.srf = srf;
    }

    public String getSrffddbr() {
        return srffddbr;
    }

    public void setSrffddbr(String srffddbr) {
        this.srffddbr = srffddbr;
    }

    public String getTdwz() {
        return tdwz;
    }

    public void setTdwz(String tdwz) {
        this.tdwz = tdwz;
    }

    public String getTdmj() {
        return tdmj;
    }

    public void setTdmj(String tdmj) {
        this.tdmj = tdmj;
    }

    public String getZrsj() {
        return zrsj;
    }

    public void setZrsj(String zrsj) {
        this.zrsj = zrsj;
    }

    public String getZrzje() {
        return zrzje;
    }

    public void setZrzje(String zrzje) {
        this.zrzje = zrzje;
    }

}
