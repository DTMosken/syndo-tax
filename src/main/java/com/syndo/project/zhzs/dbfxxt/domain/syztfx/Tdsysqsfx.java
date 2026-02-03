package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import com.syndo.common.annotation.Excel;

import java.io.Serializable;

public class Tdsysqsfx implements Serializable{
	private static final long serialVersionUID = 1L;

	private String objId;
	@Excel(name = "纳税人名称",sort = 1)
	private String nsrmc;//纳税人
	@Excel(name = "本期缴纳税款",sort = 2)
	private String bqjnsk;//本期缴纳税款
	@Excel(name = "同期缴纳税款",sort = 3)
	private String tqjnsk;//同期缴纳税款
	@Excel(name = "缴纳税款差额",sort = 4)
	private String jnskce;//缴纳税款差额
	
	private String nd;//年度
	private String sfsj;//是否少缴税款
	private String ksy;//开始月
	private String jsy;//结束月
	private String fxlx;//分析类型
	
	//第二套
	private String jd;//季度
	private String dyjd;//第一季度
	private String dejd;//第二季度
	private String dsanjd;//第三季度
	private String dsijd;//第四季度
	

	public String getDyjd() {
		return dyjd;
	}

	public void setDyjd(String dyjd) {
		this.dyjd = dyjd;
	}

	public String getDejd() {
		return dejd;
	}

	public void setDejd(String dejd) {
		this.dejd = dejd;
	}

	public String getDsanjd() {
		return dsanjd;
	}

	public void setDsanjd(String dsanjd) {
		this.dsanjd = dsanjd;
	}

	public String getDsijd() {
		return dsijd;
	}

	public void setDsijd(String dsijd) {
		this.dsijd = dsijd;
	}

	public String getKsy() {
		return ksy;
	}

	public void setKsy(String ksy) {
		this.ksy = ksy;
	}

	public String getJsy() {
		return jsy;
	}

	public void setJsy(String jsy) {
		this.jsy = jsy;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public String getNsrmc() {
		return nsrmc;
	}

	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}

	public String getNd() {
		return nd;
	}

	public void setNd(String nd) {
		this.nd = nd;
	}

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getBqjnsk() {
		return bqjnsk;
	}

	public void setBqjnsk(String bqjnsk) {
		this.bqjnsk = bqjnsk;
	}

	public String getTqjnsk() {
		return tqjnsk;
	}

	public void setTqjnsk(String tqjnsk) {
		this.tqjnsk = tqjnsk;
	}

	public String getJnskce() {
		return jnskce;
	}

	public void setJnskce(String jnskce) {
		this.jnskce = jnskce;
	}

	public String getFxlx() {
		return fxlx;
	}

	public void setFxlx(String fxlx) {
		this.fxlx = fxlx;
	}

	public String getSfsj() {
		return sfsj;
	}

	public void setSfsj(String sfsj) {
		this.sfsj = sfsj;
	}
	
}