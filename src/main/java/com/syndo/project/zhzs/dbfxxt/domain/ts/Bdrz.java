package com.syndo.project.zhzs.dbfxxt.domain.ts;

import com.syndo.common.core.domain.BaseEntity;

public class Bdrz extends BaseEntity {
    private String id;
    private String bdid;
    private String bz;
    private String lx;
    private String ssq;
    private String zbdm;
    private String zdxcSl;
    private String tsSl;
    private String wtsSl;
    private String msg;
    private String logTime;
    private String creator;

    public String getLxmc() {
        // 类型 1数据比对2自动推送3手动推送
        if(lx == null) {
            return null;
        } else if("1".equals(lx)) {
            return "数据比对";
        } else if("2".equals(lx)) {
            return "自动推送";
        } else if("3".equals(lx)) {
            return "手动推送";
        } else {
            return lx;
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBdid() {
        return bdid;
    }

    public void setBdid(String bdid) {
        this.bdid = bdid;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getSsq() {
        return ssq;
    }

    public void setSsq(String ssq) {
        this.ssq = ssq;
    }

    public String getZbdm() {
        return zbdm;
    }

    public void setZbdm(String zbdm) {
        this.zbdm = zbdm;
    }

    public String getZdxcSl() {
        return zdxcSl;
    }

    public void setZdxcSl(String zdxcSl) {
        this.zdxcSl = zdxcSl;
    }

    public String getTsSl() {
        return tsSl;
    }

    public void setTsSl(String tsSl) {
        this.tsSl = tsSl;
    }

    public String getWtsSl() {
        return wtsSl;
    }

    public void setWtsSl(String wtsSl) {
        this.wtsSl = wtsSl;
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
