package com.syndo.project.zhzs.xxgxxt.domain;

import com.syndo.common.core.domain.BaseEntity;

@SuppressWarnings("serial")
public class Zblog extends BaseEntity {

    private String logId;
    private String dept;
    private String deptName;
    private String tjsjq;
    private String bszq;
    private String userId;
    private String userName;
    private String zbbh;
    private String zbmc;
    private String wzx;
    private long bssl;
    private String logDate;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getTjsjq() {
        return tjsjq;
    }

    public void setTjsjq(String tjsjq) {
        this.tjsjq = tjsjq;
    }

    public String getBszq() {
        return bszq;
    }

    public void setBszq(String bszq) {
        this.bszq = bszq;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getZbbh() {
        return zbbh;
    }

    public void setZbbh(String zbbh) {
        this.zbbh = zbbh;
    }

    public String getZbmc() {
        return zbmc;
    }

    public void setZbmc(String zbmc) {
        this.zbmc = zbmc;
    }

    public String getWzx() {
        return wzx;
    }

    public void setWzx(String wzx) {
        this.wzx = wzx;
    }

    public long getBssl() {
        return bssl;
    }

    public void setBssl(long bssl) {
        this.bssl = bssl;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

}
