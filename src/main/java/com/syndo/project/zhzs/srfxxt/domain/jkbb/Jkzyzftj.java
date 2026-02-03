package com.syndo.project.zhzs.srfxxt.domain.jkbb;

import java.io.Serializable;

/**  金库转移支付统计  实体类
 * @author gxg
 */
public class Jkzyzftj implements Serializable{
	private static final long serialVersionUID = 1L;
	private String cztbId;

    private String kmdm;

    private String kmmc;

    private String byfse;
    private String bnlj;

    private String bszq;

    private String zjr;

    private String zjsj;

    private String xgr;

    private String xgsj;


    public String getKmdm() {
        return kmdm;
    }

    public void setKmdm(String kmdm) {
        this.kmdm = kmdm == null ? null : kmdm.trim();
    }

    public String getKmmc() {
        return kmmc;
    }

    public void setKmmc(String kmmc) {
        this.kmmc = kmmc == null ? null : kmmc.trim();
    }

    public String getCztbId() {
        return cztbId;
    }

    public void setCztbId(String cztbId) {
        this.cztbId = cztbId;
    }

    public String getByfse() {
        return byfse;
    }

    public void setByfse(String byfse) {
        this.byfse = byfse;
    }

    public String getBnlj() {
        return bnlj;
    }

    public void setBnlj(String bnlj) {
        this.bnlj = bnlj;
    }

    public String getBszq() {
        return bszq;
    }

    public void setBszq(String bszq) {
        this.bszq = bszq == null ? null : bszq.trim();
    }

    public String getZjr() {
        return zjr;
    }

    public void setZjr(String zjr) {
        this.zjr = zjr == null ? null : zjr.trim();
    }

    public String getZjsj() {
        return zjsj;
    }

    public void setZjsj(String zjsj) {
        this.zjsj = zjsj == null ? null : zjsj.trim();
    }

    public String getXgr() {
        return xgr;
    }

    public void setXgr(String xgr) {
        this.xgr = xgr == null ? null : xgr.trim();
    }

    public String getXgsj() {
        return xgsj;
    }

    public void setXgsj(String xgsj) {
        this.xgsj = xgsj == null ? null : xgsj.trim();
    }
}
