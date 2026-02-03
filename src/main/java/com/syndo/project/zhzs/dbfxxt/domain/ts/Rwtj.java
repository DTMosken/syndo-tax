package com.syndo.project.zhzs.dbfxxt.domain.ts;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.syndo.common.core.domain.BaseEntity;
@ExcelIgnoreUnannotated
public class Rwtj extends BaseEntity {
    // 反馈人
    private String fkr;
    // 反馈人名称
    @ExcelProperty(value = {"反馈人","反馈人"})
    private String fkrmc;
    // 任务数
    @ExcelProperty(value = {"任务数","任务数"})
    private String rws;
    // 待反馈未超期
    @ExcelProperty(value = {"待反馈","未超期"})
    private String dfkWcq;
    // 待反馈超期
    @ExcelProperty(value = {"待反馈","超期"})
    private String dfkCq;
    // 已反馈-准期
    @ExcelProperty(value = {"已反馈","准期"})
    private String yfkZq;
    // 已反馈-超期
    @ExcelProperty(value = {"已反馈","超期"})
    private String yfkCq;
    // 反馈率
    @ExcelProperty(value = {"反馈率","反馈率"})
    private String fkl;
//    // 反馈类型-自动消除
//    @ExcelProperty(value = {"反馈类型","自动消除"})
//    private String fklxZdxc;
    // 反馈类型-已整改
    @ExcelProperty(value = {"反馈类型","已整改"})
    private String fklxYzg;
    // 反馈类型-无法整改
    @ExcelProperty(value = {"反馈类型","无法整改"})
    private String fklxWfzg;
    // 反馈类型-拒不整改
    @ExcelProperty(value = {"反馈类型","拒不整改"})
    private String fklxJbzg;
    // 反馈类型-无问题
    @ExcelProperty(value = {"反馈类型","无问题"})
    private String fklxWwt;
    // 审批类型-归档
    @ExcelProperty(value = {"审核类型","归档"})
    private String splxGd;
    // 审批类型-自动消除
    @ExcelProperty(value = {"审核类型","自动消除"})
    private String splxZdxc;
    // 审批类型-已退回
    @ExcelProperty(value = {"审核类型","已退回"})
    private String splxYth;
    // 审批类型-消除
    @ExcelProperty(value = {"审核类型","消除"})
    private String splxXc;
    // 审批类型-转稽查
    @ExcelProperty(value = {"审核类型","转稽查"})
    private String splxZjc;

    private String qsrq;
    private String zzrq;

    public String getSplxGd() {
        return splxGd;
    }

    public void setSplxGd(String splxGd) {
        this.splxGd = splxGd;
    }

    public String getSplxZdxc() {
        return splxZdxc;
    }

    public void setSplxZdxc(String splxZdxc) {
        this.splxZdxc = splxZdxc;
    }

    public String getSplxYth() {
        return splxYth;
    }

    public void setSplxYth(String splxYth) {
        this.splxYth = splxYth;
    }

    public String getSplxXc() {
        return splxXc;
    }

    public void setSplxXc(String splxXc) {
        this.splxXc = splxXc;
    }

    public String getSplxZjc() {
        return splxZjc;
    }

    public void setSplxZjc(String splxZjc) {
        this.splxZjc = splxZjc;
    }

    public String getFkrmc() {
        return fkrmc;
    }

    public void setFkrmc(String fkrmc) {
        this.fkrmc = fkrmc;
    }

    public String getRws() {
        return rws;
    }

    public void setRws(String rws) {
        this.rws = rws;
    }

    public String getFkr() {
        return fkr;
    }

    public void setFkr(String fkr) {
        this.fkr = fkr;
    }

    public String getDfkWcq() {
        return dfkWcq;
    }

    public void setDfkWcq(String dfkWcq) {
        this.dfkWcq = dfkWcq;
    }

    public String getDfkCq() {
        return dfkCq;
    }

    public void setDfkCq(String dfkCq) {
        this.dfkCq = dfkCq;
    }

    public String getYfkZq() {
        return yfkZq;
    }

    public void setYfkZq(String yfkZq) {
        this.yfkZq = yfkZq;
    }

    public String getYfkCq() {
        return yfkCq;
    }

    public void setYfkCq(String yfkCq) {
        this.yfkCq = yfkCq;
    }

    public String getFkl() {
        return fkl;
    }

    public void setFkl(String fkl) {
        this.fkl = fkl;
    }

    public String getFklxYzg() {
        return fklxYzg;
    }

    public void setFklxYzg(String fklxYzg) {
        this.fklxYzg = fklxYzg;
    }

    public String getFklxWfzg() {
        return fklxWfzg;
    }

    public void setFklxWfzg(String fklxWfzg) {
        this.fklxWfzg = fklxWfzg;
    }

    public String getFklxJbzg() {
        return fklxJbzg;
    }

    public void setFklxJbzg(String fklxJbzg) {
        this.fklxJbzg = fklxJbzg;
    }

    public String getFklxWwt() {
        return fklxWwt;
    }

    public void setFklxWwt(String fklxWwt) {
        this.fklxWwt = fklxWwt;
    }

    public String getQsrq() {
        return qsrq;
    }

    public void setQsrq(String qsrq) {
        this.qsrq = qsrq;
    }

    public String getZzrq() {
        return zzrq;
    }

    public void setZzrq(String zzrq) {
        this.zzrq = zzrq;
    }
}
