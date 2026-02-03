package com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl;

import java.util.List;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 房土两税精细化管理-房土两税完税情况
 */
public class Ftlswsqk extends BaseEntity {

    private String jd;
    private String yjse;
    private String sjsetotal;
    private String cetotal;
    private String nf;
    
    private String yjsemax;
    private String yjsemin;
    private String sjsetotalmax;
    private String sjsetotalmin;
    private String cetotalmax;
    private List<String> jdlist;
    
    public String getJd() {
        return jd;
    }
    public void setJd(String jd) {
        this.jd = jd;
    }
    public String getYjse() {
        return yjse;
    }
    public void setYjse(String yjse) {
        this.yjse = yjse;
    }
    public String getSjsetotal() {
        return sjsetotal;
    }
    public void setSjsetotal(String sjsetotal) {
        this.sjsetotal = sjsetotal;
    }
    public String getCetotal() {
        return cetotal;
    }
    public void setCetotal(String cetotal) {
        this.cetotal = cetotal;
    }
    public String getNf() {
        return nf;
    }
    public void setNf(String nf) {
        this.nf = nf;
    }
    public String getYjsemax() {
        return yjsemax;
    }
    public void setYjsemax(String yjsemax) {
        this.yjsemax = yjsemax;
    }
    public String getYjsemin() {
        return yjsemin;
    }
    public void setYjsemin(String yjsemin) {
        this.yjsemin = yjsemin;
    }
    public String getSjsetotalmax() {
        return sjsetotalmax;
    }
    public void setSjsetotalmax(String sjsetotalmax) {
        this.sjsetotalmax = sjsetotalmax;
    }
    public String getSjsetotalmin() {
        return sjsetotalmin;
    }
    public void setSjsetotalmin(String sjsetotalmin) {
        this.sjsetotalmin = sjsetotalmin;
    }
    public String getCetotalmax() {
        return cetotalmax;
    }
    public void setCetotalmax(String cetotalmax) {
        this.cetotalmax = cetotalmax;
    }
    public List<String> getJdlist() {
        return jdlist;
    }
    public void setJdlist(List<String> jdlist) {
        this.jdlist = jdlist;
    }
    
}
