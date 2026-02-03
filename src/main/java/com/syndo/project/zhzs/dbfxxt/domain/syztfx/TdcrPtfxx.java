package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import java.math.BigDecimal;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 土地出让配套费信息
 */
public class TdcrPtfxx extends BaseEntity {
    @Excel(name = "缴款单位")
    private String jkdw;
    @Excel(name = "项目名称")
    private String xmmc;
    @Excel(name = "建筑面积（㎡）")
    private String jzmj;
    @Excel(name = "综合配套费缴款金额（元）")
    private String zhptfjkjey;
    @Excel(name = "票据单号")
    private String pjdh;
    @Excel(name = "缴款时间")
    private String jksj;
    @Excel(name = "应缴契税")
    private String ynse;

    public String getYnse() {
        return ynse;
    }

    public void setYnse(String ynse) {
        this.ynse = ynse;
    }

    public String getJkdw() {
        return jkdw;
    }

    public void setJkdw(String jkdw) {
        this.jkdw = jkdw;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getJzmj() {
        return jzmj;
    }

    public void setJzmj(String jzmj) {
        this.jzmj = jzmj;
    }

    public String getZhptfjkjey() {
        return zhptfjkjey;
    }

    public void setZhptfjkjey(String zhptfjkjey) {
        this.zhptfjkjey = zhptfjkjey;
    }

    public String getPjdh() {
        return pjdh;
    }

    public void setPjdh(String pjdh) {
        this.pjdh = pjdh;
    }

    public String getJksj() {
        return jksj;
    }

    public void setJksj(String jksj) {
        this.jksj = jksj;
    }

}
