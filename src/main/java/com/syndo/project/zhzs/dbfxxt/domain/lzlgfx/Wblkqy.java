package com.syndo.project.zhzs.dbfxxt.domain.lzlgfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsBase;

/**
 * @author lvd
 * @date 2021-04-01 10:20
 * @Description  有施工许可未办理跨区域登记
 */
@SuppressWarnings("serial")
public class Wblkqy extends TsBase {

    private String id;

    @Excel(name = "工程名称")
    private String gcmc;
    @Excel(name = "施工许可证号")
    private String sgxkzh;
    @Excel(name = "施工单位名称")
    private String sgdwmc;
    @Excel(name = "对比类型")
    private String dblx;
    @Excel(name = "发证日期")
    private String fzrq;
    @Excel(name = "发证天数")
    private String fzts;

    private String ssnd; //所属年度

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGcmc() {
        return gcmc;
    }

    public void setGcmc(String gcmc) {
        this.gcmc = gcmc;
    }

    public String getSgxkzh() {
        return sgxkzh;
    }

    public void setSgxkzh(String sgxkzh) {
        this.sgxkzh = sgxkzh;
    }

    public String getSgdwmc() {
        return sgdwmc;
    }

    public void setSgdwmc(String sgdwmc) {
        this.sgdwmc = sgdwmc;
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

	public String getFzrq() {
		return fzrq;
	}

	public void setFzrq(String fzrq) {
		this.fzrq = fzrq;
	}

	public String getFzts() {
		return fzts;
	}

	public void setFzts(String fzts) {
		this.fzts = fzts;
	}
}
