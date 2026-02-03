package com.syndo.project.industry.zbgzjs.domain;

public class Zbk {
    private String id;
    private String flmlid; // 分类目录
    private String zbmc; // 指标名称
    private String zbsm; // 指标说明
    private String pffs; // 评分方式
    private String jsgs; // 计算公式
    private String fzsx; // 分值上限
    private String fzxx; // 分值下限
    private String pfsm; // 评分说明
    private String yxbz; // 有效标志

    // 构建指标树额外字段
    private String pid;
    private String lx;
    private Integer childrenZbCnt; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlmlid() {
        return flmlid;
    }

    public void setFlmlid(String flmlid) {
        this.flmlid = flmlid;
    }

    public String getZbmc() {
        return zbmc;
    }

    public void setZbmc(String zbmc) {
        this.zbmc = zbmc;
    }

    public String getZbsm() {
        return zbsm;
    }

    public void setZbsm(String zbsm) {
        this.zbsm = zbsm;
    }

    public String getPffs() {
        return pffs;
    }

    public void setPffs(String pffs) {
        this.pffs = pffs;
    }

    public String getJsgs() {
        return jsgs;
    }

    public void setJsgs(String jsgs) {
        this.jsgs = jsgs;
    }

    public String getFzsx() {
        return fzsx;
    }

    public void setFzsx(String fzsx) {
        this.fzsx = fzsx;
    }

    public String getFzxx() {
        return fzxx;
    }

    public void setFzxx(String fzxx) {
        this.fzxx = fzxx;
    }

    public String getPfsm() {
        return pfsm;
    }

    public void setPfsm(String pfsm) {
        this.pfsm = pfsm;
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public Integer getChildrenZbCnt() {
        return childrenZbCnt;
    }

    public void setChildrenZbCnt(Integer childrenZbCnt) {
        this.childrenZbCnt = childrenZbCnt;
    }

    

}
