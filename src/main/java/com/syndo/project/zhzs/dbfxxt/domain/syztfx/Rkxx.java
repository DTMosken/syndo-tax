package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import java.math.BigDecimal;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 土地出让契税分析, 入库信息
 */
public class Rkxx extends BaseEntity {
    private String id;
    @Excel(name = "社会信用代码（纳税人识别号）")
    private String nsrsbh;
    @Excel(name = "纳税人名称")
    private String nsrmc;
    @Excel(name = "电子税票号码")
    private String dzsphm;
    @Excel(name = "票证号码")
    private String pzhm;
    @Excel(name = "征收项目")
    private String zsxm;
    @Excel(name = "征收品目")
    private String zspm;
    @Excel(name = "税款所属期起")
    private String skssqq;
    @Excel(name = "税款所属期止")
    private String skssqz;
    @Excel(name = "行业")
    private String hy;
    @Excel(name = "征收代理方式")
    private String zsdlfs;
    @Excel(name = "计税依据")
    private String jsyj;
    @Excel(name = "课税数量")
    private String kssl;
    @Excel(name = "税率")
    private String sl;
    @Excel(name = "实缴金额")
    private String sjje;
    @Excel(name = "入库日期")
    private String rkrq;
    @Excel(name = "预算科目")
    private String yskm;
    @Excel(name = "预算分配比例")
    private String ysfpbl;
    @Excel(name = "税款所属税务机关")
    private String skssswjg;
    @Excel(name = "主管税务所（科、分局）")
    private String zgswskfj;
    @Excel(name = "票证种类")
    private String pzzl;
    @Excel(name = "税款种类")
    private String skzl;
    @Excel(name = "税款属性")
    private String sksx;
    @Excel(name = "申报方式")
    private String sbfs;
    @Excel(name = "征收方式")
    private String zsfs;
    @Excel(name = "街道乡镇")
    private String jdxz;
    @Excel(name = "登记序号")
    private String djxh;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDzsphm() {
        return dzsphm;
    }

    public void setDzsphm(String dzsphm) {
        this.dzsphm = dzsphm;
    }

    public String getPzhm() {
        return pzhm;
    }

    public void setPzhm(String pzhm) {
        this.pzhm = pzhm;
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

    public String getSkssqq() {
        return skssqq;
    }

    public void setSkssqq(String skssqq) {
        this.skssqq = skssqq;
    }

    public String getSkssqz() {
        return skssqz;
    }

    public void setSkssqz(String skssqz) {
        this.skssqz = skssqz;
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy;
    }

    public String getZsdlfs() {
        return zsdlfs;
    }

    public void setZsdlfs(String zsdlfs) {
        this.zsdlfs = zsdlfs;
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

    public String getRkrq() {
        return rkrq;
    }

    public void setRkrq(String rkrq) {
        this.rkrq = rkrq;
    }

    public String getYskm() {
        return yskm;
    }

    public void setYskm(String yskm) {
        this.yskm = yskm;
    }

    public String getYsfpbl() {
        return ysfpbl;
    }

    public void setYsfpbl(String ysfpbl) {
        this.ysfpbl = ysfpbl;
    }

    public String getSkssswjg() {
        return skssswjg;
    }

    public void setSkssswjg(String skssswjg) {
        this.skssswjg = skssswjg;
    }

    public String getZgswskfj() {
        return zgswskfj;
    }

    public void setZgswskfj(String zgswskfj) {
        this.zgswskfj = zgswskfj;
    }

    public String getPzzl() {
        return pzzl;
    }

    public void setPzzl(String pzzl) {
        this.pzzl = pzzl;
    }

    public String getSkzl() {
        return skzl;
    }

    public void setSkzl(String skzl) {
        this.skzl = skzl;
    }

    public String getSksx() {
        return sksx;
    }

    public void setSksx(String sksx) {
        this.sksx = sksx;
    }

    public String getSbfs() {
        return sbfs;
    }

    public void setSbfs(String sbfs) {
        this.sbfs = sbfs;
    }

    public String getZsfs() {
        return zsfs;
    }

    public void setZsfs(String zsfs) {
        this.zsfs = zsfs;
    }

    public String getJdxz() {
        return jdxz;
    }

    public void setJdxz(String jdxz) {
        this.jdxz = jdxz;
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh;
    }

}
