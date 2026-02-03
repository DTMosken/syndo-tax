package com.syndo.project.zhzs.dbfxxt.domain.ztzhfx;

import com.syndo.common.annotation.Excel;

import java.io.Serializable;

/**
 * @author lvd
 * @date 2021-04-14 9:57
 * @Description 企业用电分析
 */
public class Qyydfx implements Serializable {

    private static final long serialVersionUID = 1L;

    @Excel(name = "统一社会信用代码")
    private String tyshxydm;
    @Excel(name = "	纳税人名称")
    private String nsrmc;
    @Excel(name = "	所属期起")
    private String ssqq;
    @Excel(name = "	所属期止")
    private String ssqz;
    @Excel(name = "	增值税(元)")
    private String zzs;
    @Excel(name = "	用电量(度)")
    private String ydl;
    @Excel(name = "	税电指数")
    private String sdzs;
    @Excel(name = "	行业税电指数范围")
    private String hysdzsfw;
    @Excel(name = "	税电指数差异")
    private String sdzscy;

    private String sshy;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTyshxydm() {
        return tyshxydm;
    }

    public void setTyshxydm(String tyshxydm) {
        this.tyshxydm = tyshxydm;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getSsqq() {
        return ssqq;
    }

    public void setSsqq(String ssqq) {
        this.ssqq = ssqq;
    }

    public String getSsqz() {
        return ssqz;
    }

    public void setSsqz(String ssqz) {
        this.ssqz = ssqz;
    }

    public String getZzs() {
        return zzs;
    }

    public void setZzs(String zzs) {
        this.zzs = zzs;
    }

    public String getYdl() {
        return ydl;
    }

    public void setYdl(String ydl) {
        this.ydl = ydl;
    }

    public String getSdzs() {
        return sdzs;
    }

    public void setSdzs(String sdzs) {
        this.sdzs = sdzs;
    }

    public String getHysdzsfw() {
        return hysdzsfw;
    }

    public void setHysdzsfw(String hysdzsfw) {
        this.hysdzsfw = hysdzsfw;
    }

    public String getSdzscy() {
        return sdzscy;
    }

    public void setSdzscy(String sdzscy) {
        this.sdzscy = sdzscy;
    }

    public String getSshy() {
        return sshy;
    }

    public void setSshy(String sshy) {
        this.sshy = sshy;
    }

    @Override
    public String toString() {
        return "Qyydfx{" +
                "tyshxydm='" + tyshxydm + '\'' +
                ", nsrmc='" + nsrmc + '\'' +
                ", ssqq='" + ssqq + '\'' +
                ", ssqz='" + ssqz + '\'' +
                ", zzs='" + zzs + '\'' +
                ", ydl='" + ydl + '\'' +
                ", sdzs='" + sdzs + '\'' +
                ", hysdzsfw='" + hysdzsfw + '\'' +
                ", sdzscy='" + sdzscy + '\'' +
                ", sshy='" + sshy + '\'' +
                '}';
    }
}
