package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import java.math.BigDecimal;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 土地税源信息
 */
public class Tdsyxx extends BaseEntity {
    @Excel(name = "社会信用代码")
    private String shxydm;
    @Excel(name = "纳税人名称")
    private String nsrmc;
    @Excel(name = "纳税人类型")
    private String nsrlx;
    @Excel(name = "土地编号")
    private String tdbh;
    @Excel(name = "地号")
    private String dh;
    @Excel(name = "土地使用权证编号")
    private String tdsyqzbh;
    @Excel(name = "土地名称")
    private String tdmc;
    @Excel(name = "土地使用权人纳税人识别号")
    private String tdsyqrnsrsbh;
    @Excel(name = "土地权利人名称")
    private String tdsyqrmc;
    @Excel(name = "土地性质")
    private String tdxz;
    @Excel(name = "土地取得方式")
    private String tdqdfs;
    @Excel(name = "土地用途")
    private String tdyt;
    @Excel(name = "街道乡镇")
    private String jdxz;
    @Excel(name = "主管税务所（科、分局）")
    private String zgswskfj;
    @Excel(name = "土地坐落地址")
    private String tdzldz;
    @Excel(name = "占用土地面积")
    private String zytdmj;
    @Excel(name = "其中取得土地使用权支付金额")
    private String qzqdtdsyqzfje;
    @Excel(name = "其中土地开发成本")
    private String qztdkfcb;
    @Excel(name = "初始取得时间")
    private String csqdsj;
    @Excel(name = "纳税义务终止时间")
    private String nsywzzsj;
    @Excel(name = "有效期起")
    private String yxqq;
    @Excel(name = "有效期止")
    private String yxqz;
    @Excel(name = "征收品目")
    private String zspm;
    @Excel(name = "土地等级")
    private String tddj;
    @Excel(name = "税额标准")
    private String sebz;
    @Excel(name = "减免税土地面积")
    private String jmstdmj;
    @Excel(name = "月减免税金额")
    private String yjmsje;

    public String getShxydm() {
        return shxydm;
    }

    public void setShxydm(String shxydm) {
        this.shxydm = shxydm;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getNsrlx() {
        return nsrlx;
    }

    public void setNsrlx(String nsrlx) {
        this.nsrlx = nsrlx;
    }

    public String getTdbh() {
        return tdbh;
    }

    public void setTdbh(String tdbh) {
        this.tdbh = tdbh;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getTdsyqzbh() {
        return tdsyqzbh;
    }

    public void setTdsyqzbh(String tdsyqzbh) {
        this.tdsyqzbh = tdsyqzbh;
    }

    public String getTdmc() {
        return tdmc;
    }

    public void setTdmc(String tdmc) {
        this.tdmc = tdmc;
    }

    public String getTdsyqrnsrsbh() {
        return tdsyqrnsrsbh;
    }

    public void setTdsyqrnsrsbh(String tdsyqrnsrsbh) {
        this.tdsyqrnsrsbh = tdsyqrnsrsbh;
    }

    public String getTdsyqrmc() {
        return tdsyqrmc;
    }

    public void setTdsyqrmc(String tdsyqrmc) {
        this.tdsyqrmc = tdsyqrmc;
    }

    public String getTdxz() {
        return tdxz;
    }

    public void setTdxz(String tdxz) {
        this.tdxz = tdxz;
    }

    public String getTdqdfs() {
        return tdqdfs;
    }

    public void setTdqdfs(String tdqdfs) {
        this.tdqdfs = tdqdfs;
    }

    public String getTdyt() {
        return tdyt;
    }

    public void setTdyt(String tdyt) {
        this.tdyt = tdyt;
    }

    public String getJdxz() {
        return jdxz;
    }

    public void setJdxz(String jdxz) {
        this.jdxz = jdxz;
    }

    public String getZgswskfj() {
        return zgswskfj;
    }

    public void setZgswskfj(String zgswskfj) {
        this.zgswskfj = zgswskfj;
    }

    public String getTdzldz() {
        return tdzldz;
    }

    public void setTdzldz(String tdzldz) {
        this.tdzldz = tdzldz;
    }

    public String getZytdmj() {
        return zytdmj;
    }

    public void setZytdmj(String zytdmj) {
        this.zytdmj = zytdmj;
    }

    public String getQzqdtdsyqzfje() {
        return qzqdtdsyqzfje;
    }

    public void setQzqdtdsyqzfje(String qzqdtdsyqzfje) {
        this.qzqdtdsyqzfje = qzqdtdsyqzfje;
    }

    public String getQztdkfcb() {
        return qztdkfcb;
    }

    public void setQztdkfcb(String qztdkfcb) {
        this.qztdkfcb = qztdkfcb;
    }

    public String getCsqdsj() {
        return csqdsj;
    }

    public void setCsqdsj(String csqdsj) {
        this.csqdsj = csqdsj;
    }

    public String getNsywzzsj() {
        return nsywzzsj;
    }

    public void setNsywzzsj(String nsywzzsj) {
        this.nsywzzsj = nsywzzsj;
    }

    public String getYxqq() {
        return yxqq;
    }

    public void setYxqq(String yxqq) {
        this.yxqq = yxqq;
    }

    public String getYxqz() {
        return yxqz;
    }

    public void setYxqz(String yxqz) {
        this.yxqz = yxqz;
    }

    public String getZspm() {
        return zspm;
    }

    public void setZspm(String zspm) {
        this.zspm = zspm;
    }

    public String getTddj() {
        return tddj;
    }

    public void setTddj(String tddj) {
        this.tddj = tddj;
    }

    public String getSebz() {
        return sebz;
    }

    public void setSebz(String sebz) {
        this.sebz = sebz;
    }

    public String getJmstdmj() {
        return jmstdmj;
    }

    public void setJmstdmj(String jmstdmj) {
        this.jmstdmj = jmstdmj;
    }

    public String getYjmsje() {
        return yjmsje;
    }

    public void setYjmsje(String yjmsje) {
        this.yjmsje = yjmsje;
    }

}
