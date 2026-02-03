package com.syndo.project.zhzs.dbfxxt.domain.lzlgfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 户籍比对 - 人社局缴纳社保企业未在税务注册
 */
public class Rsjjnsb extends BaseEntity {

    private String id;
    @Excel(name = "单位名称")
    private String qymc;
    private String yddz;
    private String fzr;
    private String lxdh;
    
    private String nsrmc;
    @Excel(name = "处理单位")
    private String cldw;
    @Excel(name = "对比类型")
    private String info;
    private String ydmc;
    
    private String type;
    private String flag;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getQymc() {
        return qymc;
    }
    public void setQymc(String qymc) {
        this.qymc = qymc;
    }
    public String getYddz() {
        return yddz;
    }
    public void setYddz(String yddz) {
        this.yddz = yddz;
    }
    public String getFzr() {
        return fzr;
    }
    public void setFzr(String fzr) {
        this.fzr = fzr;
    }
    public String getLxdh() {
        return lxdh;
    }
    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }
    public String getNsrmc() {
        return nsrmc;
    }
    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }
    public String getCldw() {
        return cldw;
    }
    public void setCldw(String cldw) {
        this.cldw = cldw;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public String getYdmc() {
        return ydmc;
    }
    public void setYdmc(String ydmc) {
        this.ydmc = ydmc;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    
}
