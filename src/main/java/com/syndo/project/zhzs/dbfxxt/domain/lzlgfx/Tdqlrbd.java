package com.syndo.project.zhzs.dbfxxt.domain.lzlgfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsBase;

/**
 * @author lvd
 * @date 2021-03-31 15:47
 * @Description 土地权利人比对
 */
@SuppressWarnings("serial")
public class Tdqlrbd extends TsBase {

    private String id;

    @Excel(name = "权利人名称")
    private String qlrmc;

    @Excel(name = "使用权面积(平方米)")
    private String mj;

    @Excel(name = "纳税人名称")
    private String nsrmc;

    @Excel(name = "纳税人识别号")
    private String nsrsbh;

    @Excel(name = "不动产用途")
    private String bdcyt;

    @Excel(name = "匹配状态(匹配、未匹配)")
    private String ppzt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQlrmc() {
        return qlrmc;
    }

    public void setQlrmc(String qlrmc) {
        this.qlrmc = qlrmc;
    }

    public String getMj() {
        return mj;
    }

    public void setMj(String mj) {
        this.mj = mj;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getPpzt() {
        return ppzt;
    }

    public void setPpzt(String ppzt) {
        this.ppzt = ppzt;
    }

    public String getBdcyt() {
        return bdcyt;
    }

    public void setBdcyt(String bdcyt) {
        this.bdcyt = bdcyt;
    }
}
