package com.syndo.project.zhzs.dbfxxt.domain.ztzhfx;

import com.syndo.common.annotation.Excel;

import java.io.Serializable;

/**
 * @author lvd
 * @date 2021-04-14 9:54
 * @Description 行业税电指数管理
 */
public class Hysdzsgl implements Serializable {

    private static final long serialVersionUID = 1L;

    @Excel(name = "所属行业")
    private String sshy;
    @Excel(name = "税款(元)")
    private String sk;
    @Excel(name = "用电量(度)")
    private String ydl;
    @Excel(name = "税电指数")
    private String sdzs;
    @Excel(name = "税款所属期起")
    private String skssqq;
    @Excel(name = "税款所属期止")
    private String skssqz;

    private String id;
    private String ydid;
    private String sdzszgz; //税电指数最高值
    private String sdzszdz; //税电指数最低值

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getYdid() {
        return ydid;
    }

    public void setYdid(String ydid) {
        this.ydid = ydid;
    }

    public String getSshy() {
        return sshy;
    }

    public void setSshy(String sshy) {
        this.sshy = sshy;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
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

    public String getSkssqq() {
        return skssqq;
    }

    public void setSkssqq(String skssqq) {
        this.skssqq = skssqq;
    }

    public String getSkssqz() {
        return skssqz;
    }

    public void setSkssqz(String skssqz) {
        this.skssqz = skssqz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSdzszgz() {
        return sdzszgz;
    }

    public void setSdzszgz(String sdzszgz) {
        this.sdzszgz = sdzszgz;
    }

    public String getSdzszdz() {
        return sdzszdz;
    }

    public void setSdzszdz(String sdzszdz) {
        this.sdzszdz = sdzszdz;
    }
}
