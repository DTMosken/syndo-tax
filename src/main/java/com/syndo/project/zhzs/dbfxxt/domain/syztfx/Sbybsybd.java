package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import com.syndo.common.annotation.Excel;

import java.io.Serializable;

public class Sbybsybd implements Serializable{
	private static final long serialVersionUID = 1L;
	//列表项
	private String objId;
	//@Excel(name = "药店名称",sort = 1)
	private String ydmc;
	//@Excel(name = "税款所属期起",sort = 2)
	private String skssqq;
	//@Excel(name = "税款所属期止",sort = 3)
	private String skssqz;
	//@Excel(name = "销售金额",sort = 4)
	private String xsje;
	//@Excel(name = "计税依据",sort = 5)
	private String jsyj;
	//@Excel(name = "计税差额",sort = 6)
	private String jsce;
	//@Excel(name = "应缴金额",sort = 7)
	private String yjje;
	//@Excel(name = "实缴金额",sort = 8)
	private String sjje;
	//@Excel(name = "差额",sort = 9)
	private String ce;
	private String sj;

	@Excel(name = "纳税人名称")
	private String nsrmc;
	@Excel(name = "所属期起")
	private String ssqq;
	@Excel(name = "所属期止")
	private String ssqz;
	@Excel(name = "刷卡金额")
	private String skje;
	@Excel(name = "应纳增值税")
	private String ynzzs;
	@Excel(name = "实缴增值税")
	private String sjzzs;
	@Excel(name = "疑似差额")
	private String ysce;

	//查询条件
	private String skjecj;  //刷卡金额乘积
	private String yscedy; //疑似差额大于
	private String yscexy; //疑似差额小于

	//查询条件
	private String yjjeq;
	private String yjjez;
	private String type;
	private String cedy;
	private String cexy;

	//刷卡明细数据
	private String bh;//药店编号
	private String jydz;//经营地址
	private String fzr;//负责人
	private String bgdh;//办公电话
	private String shh;//商户号
	private String skyf;//刷卡月份

	private String[] content;

	public String getJsyj() {
		return jsyj;
	}

	public void setJsyj(String jsyj) {
		this.jsyj = jsyj;
	}

	public String getJsce() {
		return jsce;
	}

	public void setJsce(String jsce) {
		this.jsce = jsce;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCedy() {
		return cedy;
	}

	public void setCedy(String cedy) {
		this.cedy = cedy;
	}

	public String getCexy() {
		return cexy;
	}

	public void setCexy(String cexy) {
		this.cexy = cexy;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public String getYdmc() {
		return ydmc;
	}

	public void setYdmc(String ydmc) {
		this.ydmc = ydmc;
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

	public String getXsje() {
		return xsje;
	}

	public void setXsje(String xsje) {
		this.xsje = xsje;
	}

	public String getYjje() {
		return yjje;
	}

	public void setYjje(String yjje) {
		this.yjje = yjje;
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

	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getYjjeq() {
		return yjjeq;
	}

	public void setYjjeq(String yjjeq) {
		this.yjjeq = yjjeq;
	}

	public String getYjjez() {
		return yjjez;
	}

	public void setYjjez(String yjjez) {
		this.yjjez = yjjez;
	}

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getJydz() {
		return jydz;
	}

	public void setJydz(String jydz) {
		this.jydz = jydz;
	}

	public String getFzr() {
		return fzr;
	}

	public void setFzr(String fzr) {
		this.fzr = fzr;
	}

	public String getBgdh() {
		return bgdh;
	}

	public void setBgdh(String bgdh) {
		this.bgdh = bgdh;
	}

	public String getShh() {
		return shh;
	}

	public void setShh(String shh) {
		this.shh = shh;
	}

	public String getSkyf() {
		return skyf;
	}

	public void setSkyf(String skyf) {
		this.skyf = skyf;
	}

	public String getSkje() {
		return skje;
	}

	public void setSkje(String skje) {
		this.skje = skje;
	}

	public String[] getContent() {
		return content;
	}

	public void setContent(String[] content) {
		this.content = content;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getNsrmc() {
		return nsrmc;
	}

	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}

	public String getSsqq() {
		return ssqq;
	}

	public void setSsqq(String ssqq) {
		this.ssqq = ssqq;
	}

	public String getSsqz() {
		return ssqz;
	}

	public void setSsqz(String ssqz) {
		this.ssqz = ssqz;
	}

	public String getYnzzs() {
		return ynzzs;
	}

	public void setYnzzs(String ynzzs) {
		this.ynzzs = ynzzs;
	}

	public String getSjzzs() {
		return sjzzs;
	}

	public void setSjzzs(String sjzzs) {
		this.sjzzs = sjzzs;
	}

	public String getYsce() {
		return ysce;
	}

	public void setYsce(String ysce) {
		this.ysce = ysce;
	}

	public String getSkjecj() {
		return skjecj;
	}

	public void setSkjecj(String skjecj) {
		this.skjecj = skjecj;
	}

	public String getYscedy() {
		return yscedy;
	}

	public void setYscedy(String yscedy) {
		this.yscedy = yscedy;
	}

	public String getYscexy() {
		return yscexy;
	}

	public void setYscexy(String yscexy) {
		this.yscexy = yscexy;
	}
}