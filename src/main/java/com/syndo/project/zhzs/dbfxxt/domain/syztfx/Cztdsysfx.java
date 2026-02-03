package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsBase;

/**
 * @author lvd
 * @date 2021-04-06 11:11
 * @Description 城镇土地使用税比对分析
 */
public class Cztdsysfx extends TsBase {

	/** @Fields serialVersionUID : TODO */
	private static final long serialVersionUID = 1L;
	@Excel(name = "纳税人名称")
    private String nsrmc;
    @Excel(name = "所属期起")
    private String skssqq;
    @Excel(name = "所属期止")
    private String skssqz;
    @Excel(name = "国土登记面积(㎡)")
    private String mj;
    @Excel(name = "免税面积(㎡)")
    private String msmj;
    @Excel(name = "估算应纳金额(元)")
    private String ynse;
    @Excel(name = "实缴金额(元)")
    private String sjje;
    @Excel(name = "疑似差额(元)")
    private String ce;
    
    private String sfqj;
    
	public String getNsrmc() {
		return nsrmc;
	}
	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
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
	public String getMj() {
		return mj;
	}
	public void setMj(String mj) {
		this.mj = mj;
	}
	public String getMsmj() {
		return msmj;
	}
	public void setMsmj(String msmj) {
		this.msmj = msmj;
	}
	public String getYnse() {
		return ynse;
	}
	public void setYnse(String ynse) {
		this.ynse = ynse;
	}
	public String getSjje() {
		return sjje;
	}
	public void setSjje(String sjje) {
		this.sjje = sjje;
	}
	public String getCe() {
		return ce;
	}
	public void setCe(String ce) {
		this.ce = ce;
	}
	public String getSfqj() {
		return sfqj;
	}
	public void setSfqj(String sfqj) {
		this.sfqj = sfqj;
	}
}
