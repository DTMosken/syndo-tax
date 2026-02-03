package com.syndo.project.industry.sjsb.domain;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 
 * @ClassName: EvaluateBaseInfo
 * @Description： 亩产评价-基础信息
 * @author ykc
 * @date 2020-8-19
 *
 */
public class EvaluateBaseInfo extends BaseEntity {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String qymc; // 企业名称
	private String tyshxydm; // 统一社会信用代码
	private String qydz; // 企业地址
	private String qydzc; // 企业地址（村、工业区）
	private String qydzl; // 企业地址（路、弄）
	private String qydzh; // 企业地址（号）
	private String sshy; // 所属行业
	private String hydm; // 行业代码
	private String frxm; // 法人姓名
	private String frsjhm; // 法人手机号码
	private String frlxdh; // 法人联系电话
	private String tbrxm; // 填表人姓名
	private String tbrsjhm; // 填表人手机号码
	private String tbrlxdh; // 填表人联系电话
	private String zycp; // 主要产品
	private String sfzjtx; // 是否专精特新（0：是，1：否）
	private String gyzcz; // 工业总产值（万元）
	private String npjzg; // 年平均职工人数（人）
	private String lrze; // 利润总额（万元）
	private String gswz; // 公司网站
	private String pjnf; // 评价年份
	private String qygm; // 企业规模
	
	public String getId() {
		return id;
	}
	public String getQymc() {
		return qymc;
	}
	public String getTyshxydm() {
		return tyshxydm;
	}
	public String getQydz() {
		return qydz;
	}
	public String getQydzc() {
		return qydzc;
	}
	public String getQydzl() {
		return qydzl;
	}
	public String getQydzh() {
		return qydzh;
	}
	public String getSshy() {
		return sshy;
	}
	public String getHydm() {
		return hydm;
	}
	public String getFrxm() {
		return frxm;
	}
	public String getFrsjhm() {
		return frsjhm;
	}
	public String getFrlxdh() {
		return frlxdh;
	}
	public String getTbrxm() {
		return tbrxm;
	}
	public String getTbrsjhm() {
		return tbrsjhm;
	}
	public String getTbrlxdh() {
		return tbrlxdh;
	}
	public String getZycp() {
		return zycp;
	}
	public String getSfzjtx() {
		return sfzjtx;
	}
	public String getGyzcz() {
		return gyzcz;
	}
	public String getNpjzg() {
		return npjzg;
	}
	public String getLrze() {
		return lrze;
	}
	public String getGswz() {
		return gswz;
	}
	public String getPjnf() {
		return pjnf;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setQymc(String qymc) {
		this.qymc = qymc;
	}
	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}
	public void setQydz(String qydz) {
		this.qydz = qydz;
	}
	public void setQydzc(String qydzc) {
		this.qydzc = qydzc;
	}

	public void setQydzl(String qydzl) {
		this.qydzl = qydzl;
	}
	public void setQydzh(String qydzh) {
		this.qydzh = qydzh;
	}
	public void setSshy(String sshy) {
		this.sshy = sshy;
	}
	public void setHydm(String hydm) {
		this.hydm = hydm;
	}
	public void setFrxm(String frxm) {
		this.frxm = frxm;
	}
	public void setFrsjhm(String frsjhm) {
		this.frsjhm = frsjhm;
	}
	public void setFrlxdh(String frlxdh) {
		this.frlxdh = frlxdh;
	}
	public void setTbrxm(String tbrxm) {
		this.tbrxm = tbrxm;
	}
	public void setTbrsjhm(String tbrsjhm) {
		this.tbrsjhm = tbrsjhm;
	}
	public void setTbrlxdh(String tbrlxdh) {
		this.tbrlxdh = tbrlxdh;
	}
	public void setZycp(String zycp) {
		this.zycp = zycp;
	}
	public void setSfzjtx(String sfzjtx) {
		this.sfzjtx = sfzjtx;
	}
	public void setGyzcz(String gyzcz) {
		this.gyzcz = gyzcz;
	}
	public void setNpjzg(String npjzg) {
		this.npjzg = npjzg;
	}
	public void setLrze(String lrze) {
		this.lrze = lrze;
	}
	public void setGswz(String gswz) {
		this.gswz = gswz;
	}
	public void setPjnf(String pjnf) {
		this.pjnf = pjnf;
	}
	public String getQygm() {
		return qygm;
	}
	public void setQygm(String qygm) {
		this.qygm = qygm;
	}
	@Override
	public String toString() {
		return "EvaluateBaseInfo [id=" + id + ", qymc=" + qymc + ", tyshxydm=" + tyshxydm + ", qydz=" + qydz
				+ ", qydzc=" + qydzc + ", qydzl=" + qydzl + ", qydzh=" + qydzh + ", sshy=" + sshy + ", hydm=" + hydm
				+ ", frxm=" + frxm + ", frsjhm=" + frsjhm + ", frlxdh=" + frlxdh + ", tbrxm=" + tbrxm + ", tbrsjhm="
				+ tbrsjhm + ", tbrlxdh=" + tbrlxdh + ", zycp=" + zycp + ", sfzjtx=" + sfzjtx + ", gyzcz=" + gyzcz
				+ ", npjzg=" + npjzg + ", lrze=" + lrze + ", gswz=" + gswz + ", pjnf=" + pjnf + ", qygm=" + qygm + "]";
	}
	
}
