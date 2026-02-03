package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import com.syndo.common.annotation.Excel;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsBase;

/**
 * 土地转让契税分析
 */
public class Tdzrnsfx extends TsBase {

    @Excel(name = "受让方")
    private String nsrmc;
    @Excel(name = "转让面积")
    private String zrmj;
    @Excel(name = "转让总金额")
    private String zrzje;
    @Excel(name = "应纳契税")
    private String ynqs;
    @Excel(name = "实缴契税")
    private String sjqs;
    @Excel(name = "契税差额")
    private String qsce;
    private String qdrq;
    private String sfqj;

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getZrmj() {
		return zrmj;
	}

	public void setZrmj(String zrmj) {
		this.zrmj = zrmj;
	}

	public String getZrzje() {
		return zrzje;
	}

	public void setZrzje(String zrzje) {
		this.zrzje = zrzje;
	}

	public String getYnqs() {
        return ynqs;
    }

    public void setYnqs(String ynqs) {
        this.ynqs = ynqs;
    }

    public String getSjqs() {
        return sjqs;
    }

    public void setSjqs(String sjqs) {
        this.sjqs = sjqs;
    }

    public String getQsce() {
        return qsce;
    }

    public void setQsce(String qsce) {
        this.qsce = qsce;
    }

    public String getQdrq() {
        return qdrq;
    }

    public void setQdrq(String qdrq) {
        this.qdrq = qdrq;
    }

    public String getSfqj() {
        return sfqj;
    }

    public void setSfqj(String sfqj) {
        this.sfqj = sfqj;
    }

}
