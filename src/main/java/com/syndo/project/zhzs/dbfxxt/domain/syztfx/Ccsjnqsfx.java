package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * @author lvd
 * @date 2021-04-08 15:29
 * @Description 车船税缴纳趋势分析
 */
public class Ccsjnqsfx extends BaseEntity {

    @Excel(name = "纳税人名称")
    private String nsrmc;
    @Excel(name = "去年缴纳")
    private String qnjn;
    @Excel(name = "本年缴纳")
    private String bnjn;
    @Excel(name = "差额")
    private String ce;

    private String ssnd;
    private String sfsj;

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getQnjn() {
        return qnjn;
    }

    public void setQnjn(String qnjn) {
        this.qnjn = qnjn;
    }

    public String getBnjn() {
        return bnjn;
    }

    public void setBnjn(String bnjn) {
        this.bnjn = bnjn;
    }

    public String getCe() {
        return ce;
    }

    public void setCe(String ce) {
        this.ce = ce;
    }

    public String getSsnd() {
        return ssnd;
    }

    public void setSsnd(String ssnd) {
        this.ssnd = ssnd;
    }

	public String getSfsj() {
		return sfsj;
	}

	public void setSfsj(String sfsj) {
		this.sfsj = sfsj;
	}
}
