package com.syndo.project.zhzs.dbfxxt.domain.lzlgfx;

import com.syndo.common.annotation.Excel;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsBase;

public class Jnqswjnfcstdsys extends TsBase {
    @Excel(name = "纳税人识别号")
    private String nsrsbh;
    @Excel(name = "纳税人名称")
    private String nsrmc;
    @Excel(name = "征收项目")
    private String zsxm;
    @Excel(name = "纳税人品目")
    private String zspm;
    @Excel(name = "行业门类")
    private String hyml;
    @Excel(name = "税款所属期")
    private String skssq;
    @Excel(name = "入库日期")
    private String rkrq;
    @Excel(name = "计税依据")
    private String jsyj;
    @Excel(name = "课税数量")
    private String kssl;
    @Excel(name = "税率")
    private String sl;
    @Excel(name = "实缴金额")
    private String sjje;
    @Excel(name = "对比类型")
    private String dblx;
    // 所属年度
    private String ssnd;

    public String getHyml() {
        return hyml;
    }

    public void setHyml(String hyml) {
        this.hyml = hyml;
    }

    public String getDblx() {
        return dblx;
    }

    public void setDblx(String dblx) {
        this.dblx = dblx;
    }

    public String getSsnd() {
        return ssnd;
    }

    public void setSsnd(String ssnd) {
        this.ssnd = ssnd;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getZsxm() {
        return zsxm;
    }

    public void setZsxm(String zsxm) {
        this.zsxm = zsxm;
    }

    public String getZspm() {
        return zspm;
    }

    public void setZspm(String zspm) {
        this.zspm = zspm;
    }

    public String getSkssq() {
        return skssq;
    }

    public void setSkssq(String skssq) {
        this.skssq = skssq;
    }

    public String getRkrq() {
        return rkrq;
    }

    public void setRkrq(String rkrq) {
        this.rkrq = rkrq;
    }

    public String getJsyj() {
        return jsyj;
    }

    public void setJsyj(String jsyj) {
        this.jsyj = jsyj;
    }

    public String getKssl() {
        return kssl;
    }

    public void setKssl(String kssl) {
        this.kssl = kssl;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    public String getSjje() {
        return sjje;
    }

    public void setSjje(String sjje) {
        this.sjje = sjje;
    }
}
