package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import com.syndo.common.annotation.Excel;

public class Ldjdhy {
    
    private String objId;

    private String qydm;
    @Excel(name = "企业名称",sort = 1)
    private String qymc;
    private String rzrc;
    private String rzl;
    private String dj;
    private String sj;
    private String bszq;
    private String ck;
    @Excel(name = "税款所属期起",sort = 2)
    private String skssqq;
    @Excel(name = "税款所属期止",sort = 3)
    private String skssqz;
    @Excel(name = "营业额",sort = 4)
    private String yye;
    @Excel(name = "实缴金额",sort = 6)
    private String sjje;
    @Excel(name = "应缴金额",sort = 5)
    private String yjje;
    @Excel(name = "差额",sort = 7)
    private String ce;
    private String type;
    private String cedy; //差额大于
    private String cexy; //差额小于
    private String []content;
    
    private String lgmc;
    private String lgdz;
    private String rzlk;
    private String tslk;
    
    public String getObjId() {
        return objId;
    }
    public void setObjId(String objId) {
        this.objId = objId;
    }
    public String getQydm() {
        return qydm;
    }
    public void setQydm(String qydm) {
        this.qydm = qydm;
    }
    public String getQymc() {
        return qymc;
    }
    public void setQymc(String qymc) {
        this.qymc = qymc;
    }
    public String getRzrc() {
        return rzrc;
    }
    public void setRzrc(String rzrc) {
        this.rzrc = rzrc;
    }
    public String getRzl() {
        return rzl;
    }
    public void setRzl(String rzl) {
        this.rzl = rzl;
    }
    public String getDj() {
        return dj;
    }
    public void setDj(String dj) {
        this.dj = dj;
    }
    public String getSj() {
        return sj;
    }
    public void setSj(String sj) {
        this.sj = sj;
    }
    public String getBszq() {
        return bszq;
    }
    public void setBszq(String bszq) {
        this.bszq = bszq;
    }
    public String getCk() {
        return ck;
    }
    public void setCk(String ck) {
        this.ck = ck;
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
    public String getYye() {
        return yye;
    }
    public void setYye(String yye) {
        this.yye = yye;
    }
    public String getSjje() {
        return sjje;
    }
    public void setSjje(String sjje) {
        this.sjje = sjje;
    }
    public String getYjje() {
        return yjje;
    }
    public void setYjje(String yjje) {
        this.yjje = yjje;
    }
    public String getCe() {
        return ce;
    }
    public void setCe(String ce) {
        this.ce = ce;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCedy() {
        return cedy;
    }
    public void setCedy(String cedy) {
        this.cedy = cedy;
    }
    public String getCexy() {
        return cexy;
    }
    public void setCexy(String cexy) {
        this.cexy = cexy;
    }
    public String[] getContent() {
        return content;
    }
    public void setContent(String[] content) {
        this.content = content;
    }
    public String getLgmc() {
        return lgmc;
    }
    public void setLgmc(String lgmc) {
        this.lgmc = lgmc;
    }
    public String getLgdz() {
        return lgdz;
    }
    public void setLgdz(String lgdz) {
        this.lgdz = lgdz;
    }
    public String getRzlk() {
        return rzlk;
    }
    public void setRzlk(String rzlk) {
        this.rzlk = rzlk;
    }
    public String getTslk() {
        return tslk;
    }
    public void setTslk(String tslk) {
        this.tslk = tslk;
    }
    
}
