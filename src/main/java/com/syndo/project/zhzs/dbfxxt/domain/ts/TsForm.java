package com.syndo.project.zhzs.dbfxxt.domain.ts;

import java.util.List;
import java.util.Map;

public class TsForm extends TsBase {
    private String zbdm;
    private String zbmc;
    private String tsr;
    private String tsrmc;
    private String tssm;
    private String tssj;

    private List<Map<String,String>> cols;

    public List<Map<String, String>> getCols() {
        return cols;
    }
    public void setCols(List<Map<String, String>> cols) {
        this.cols = cols;
    }
    public String getTssm() {
        return tssm;
    }
    public void setTssm(String tssm) {
        this.tssm = tssm;
    }
    public String getTsrmc() {
        return tsrmc;
    }
    public void setTsrmc(String tsrmc) {
        this.tsrmc = tsrmc;
    }
    public String getZbdm() {
        return zbdm;
    }
    public void setZbdm(String zbdm) {
        this.zbdm = zbdm;
    }
    public String getZbmc() {
        return zbmc;
    }
    public void setZbmc(String zbmc) {
        this.zbmc = zbmc;
    }
    public String getTsr() {
        return tsr;
    }
    public void setTsr(String tsr) {
        this.tsr = tsr;
    }
    public String getTssj() {
        return tssj;
    }
    public void setTssj(String tssj) {
        this.tssj = tssj;
    }    
}
