package com.syndo.project.zhzs.dbfxxt.domain.ts;

import com.syndo.common.core.domain.BaseEntity;

import java.util.List;
import java.util.Map;

/**
 * 任务反馈
 */
public class Rwfk extends BaseEntity {
    private String id;
    // 业务id
    private String ywid;
    // 纳税人名称
    private String nsrmc;
    // 指标代码
    private String zbdm;
    // 状态 1已推送，2已反馈，3已归档，3.0自动消除，3.1已退回，3.2消除，3.3转稽查
    private String zt;
    // 推送人
    private String tsr;
    // 推送时间
    private String tssj;
    // 反馈人
    private String fkr;
    // 反馈时间
    private String fksj;
    // 修改反馈人
    private String xgfkr;
    // 修改反馈时间
    private String xgfksj;
    // 反馈类型
    private String fklx;
    // 反馈内容
    private String fknr;
    // 反馈图片
    private String fktp;
    // 反馈附件
    private String fkfj;

    // 反馈ID
    private String fkid;
    // 明细Key
    private String mxkey;
    // 明细值
    private String mxvalue;
    // 指标名称
    private String zbmc;
    // 推送人名称
    private String tsrmc;
    // 反馈人名称
    private String fkrmc;
    // 修改反馈人名称
    private String xgfkrmc;

    private String ids;
    List<Map<String,String>> cols = null;
    List<Map<String,String>> rows = null;
    private List<Map<String, String>> fktps = null;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getFkid() {
        return fkid;
    }

    public void setFkid(String fkid) {
        this.fkid = fkid;
    }

    public String getXgfkrmc() {
        return xgfkrmc;
    }

    public void setXgfkrmc(String xgfkrmc) {
        this.xgfkrmc = xgfkrmc;
    }

    public List<Map<String, String>> getRows() {
        return rows;
    }

    public void setRows(List<Map<String, String>> rows) {
        this.rows = rows;
    }

    public List<Map<String, String>> getFktps() {
        return fktps;
    }

    public void setFktps(List<Map<String, String>> fktps) {
        this.fktps = fktps;
    }

    public String getTsrmc() {
        return tsrmc;
    }

    public void setTsrmc(String tsrmc) {
        this.tsrmc = tsrmc;
    }

    public String getFkrmc() {
        return fkrmc;
    }

    public void setFkrmc(String fkrmc) {
        this.fkrmc = fkrmc;
    }

    public List<Map<String, String>> getCols() {
        return cols;
    }

    public void setCols(List<Map<String, String>> cols) {
        this.cols = cols;
    }

    public String getZbmc() {
        return zbmc;
    }

    public void setZbmc(String zbmc) {
        this.zbmc = zbmc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYwid() {
        return ywid;
    }

    public void setYwid(String ywid) {
        this.ywid = ywid;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getZbdm() {
        return zbdm;
    }

    public void setZbdm(String zbdm) {
        this.zbdm = zbdm;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
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

    public String getFkr() {
        return fkr;
    }

    public void setFkr(String fkr) {
        this.fkr = fkr;
    }

    public String getFksj() {
        return fksj;
    }

    public void setFksj(String fksj) {
        this.fksj = fksj;
    }

    public String getXgfkr() {
        return xgfkr;
    }

    public void setXgfkr(String xgfkr) {
        this.xgfkr = xgfkr;
    }

    public String getXgfksj() {
        return xgfksj;
    }

    public void setXgfksj(String xgfksj) {
        this.xgfksj = xgfksj;
    }

    public String getFklx() {
        return fklx;
    }

    public void setFklx(String fklx) {
        this.fklx = fklx;
    }

    public String getFknr() {
        return fknr;
    }

    public void setFknr(String fknr) {
        this.fknr = fknr;
    }

    public String getFktp() {
        return fktp;
    }

    public void setFktp(String fktp) {
        this.fktp = fktp;
    }

    public String getFkfj() {
        return fkfj;
    }

    public void setFkfj(String fkfj) {
        this.fkfj = fkfj;
    }

    public String getMxkey() {
        return mxkey;
    }

    public void setMxkey(String mxkey) {
        this.mxkey = mxkey;
    }

    public String getMxvalue() {
        return mxvalue;
    }

    public void setMxvalue(String mxvalue) {
        this.mxvalue = mxvalue;
    }
}
