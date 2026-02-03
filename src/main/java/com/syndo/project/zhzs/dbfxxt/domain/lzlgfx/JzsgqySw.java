package com.syndo.project.zhzs.dbfxxt.domain.lzlgfx;

import com.syndo.common.annotation.Excel;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsBase;

/**
 * 户籍比对 - 建筑施工企业未在税务注册
 */
@SuppressWarnings("serial")
public class JzsgqySw extends TsBase {

	private String id;
	@Excel(name = "施工单位全称")
    private String qymc;
	@Excel(name = "所在项目")
    private String xmmc;
    private String flag;
	@Excel(name = "对比类型")
    private String info;
	@Excel(name = "处理单位")
    private String cldw;
    private String type;
    private String ssnd; //所属年度

    /*private String sgdw;
    private String nsrmc;
    private String nsrzt;
    private String frmc;
    private String scjydz;

    private String sgxkzhm;
    private String gcmc;
    private String xmdz;
    private String lxdh;*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getQymc() {
		return qymc;
	}
	public void setQymc(String qymc) {
		this.qymc = qymc;
	}
	public String getXmmc() {
		return xmmc;
	}
	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getCldw() {
		return cldw;
	}
	public void setCldw(String cldw) {
		this.cldw = cldw;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getSsnd() {
		return ssnd;
	}

	public void setSsnd(String ssnd) {
		this.ssnd = ssnd;
	}
}
