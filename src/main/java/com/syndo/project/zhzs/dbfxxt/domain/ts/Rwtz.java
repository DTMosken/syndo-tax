package com.syndo.project.zhzs.dbfxxt.domain.ts;

import java.util.List;

public class Rwtz extends Dbrw {
    // 反馈表ID
    private String fkid;
    // 调整属性，fkr反馈人，fksx反馈时限
    private String tzsx;
    // 调整前
    private String tzq;
    // 调整后
    private String tzh;
    // 调整人
    private String creator;

    // 推送日期
    private String tsrq;
    // 剩余天数
    private Integer syts;

    // 调整方式：1指定到风控小组成员，2均分给其他风控小组成员
    private String tzfs;
    // 之前的反馈人
    private String oldFkr;
    // 之前的反馈时限
    private String oldFksx;
    // 任务id,分割符a
    private String ids;
    private List<String> idList;

    // 分组id
    private String fzid;

    public String getFzid() {
        return fzid;
    }

    public void setFzid(String fzid) {
        this.fzid = fzid;
    }

    public String getOldFksx() {
        return oldFksx;
    }

    public void setOldFksx(String oldFksx) {
        this.oldFksx = oldFksx;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getFkid() {
        return fkid;
    }

    public void setFkid(String fkid) {
        this.fkid = fkid;
    }

    public String getTzsx() {
        return tzsx;
    }

    public void setTzsx(String tzsx) {
        this.tzsx = tzsx;
    }

    public String getTzq() {
        return tzq;
    }

    public void setTzq(String tzq) {
        this.tzq = tzq;
    }

    public String getTzh() {
        return tzh;
    }

    public void setTzh(String tzh) {
        this.tzh = tzh;
    }

    public String getOldFkr() {
        return oldFkr;
    }

    public void setOldFkr(String oldFkr) {
        this.oldFkr = oldFkr;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getTzfs() {
        return tzfs;
    }

    public void setTzfs(String tzfs) {
        this.tzfs = tzfs;
    }

    public String getTsrq() {
        return tsrq;
    }

    public void setTsrq(String tsrq) {
        this.tsrq = tsrq;
    }

    public Integer getSyts() {
        return syts;
    }

    public void setSyts(Integer syts) {
        this.syts = syts;
    }
}
