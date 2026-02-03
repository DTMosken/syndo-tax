package com.syndo.project.zhzs.srfxxt.domain.jkbb;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 金库单/多级表统计  实体类
 */
public class Jkdjb extends BaseEntity {
   
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String kmdm;
    private String kmmc;
    private String shuie;//税额
    private String zyshuie;//中央级税额
    private String shengshuie;//省级税额
    private String shishuie;//市级税额
    private String qxshuie;//区县级税额
    
    private String zshuie;//总税额
    private String flag;//标识  1:中央 ;2.省级;3.市级;4.区县级税额
    
    private String cxrqq;
    private String cxrqz;
    public String getKmdm() {
        return kmdm;
    }
    public void setKmdm(String kmdm) {
        this.kmdm = kmdm;
    }
    public String getKmmc() {
        return kmmc;
    }
    public void setKmmc(String kmmc) {
        this.kmmc = kmmc;
    }
    public String getShuie() {
        return shuie;
    }
    public void setShuie(String shuie) {
        this.shuie = shuie;
    }
    public String getZyshuie() {
        return zyshuie;
    }
    public void setZyshuie(String zyshuie) {
        this.zyshuie = zyshuie;
    }
    public String getShengshuie() {
        return shengshuie;
    }
    public void setShengshuie(String shengshuie) {
        this.shengshuie = shengshuie;
    }
    public String getShishuie() {
        return shishuie;
    }
    public void setShishuie(String shishuie) {
        this.shishuie = shishuie;
    }
    public String getQxshuie() {
        return qxshuie;
    }
    public void setQxshuie(String qxshuie) {
        this.qxshuie = qxshuie;
    }
    public String getZshuie() {
        return zshuie;
    }
    public void setZshuie(String zshuie) {
        this.zshuie = zshuie;
    }
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getCxrqq() {
        return cxrqq;
    }
    public void setCxrqq(String cxrqq) {
        this.cxrqq = cxrqq;
    }
    public String getCxrqz() {
        return cxrqz;
    }
    public void setCxrqz(String cxrqz) {
        this.cxrqz = cxrqz;
    }
    
}
