package com.syndo.project.industry.sjsb.domain;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 需求调查表
 *
 * @author ykc
 * @date 2020年7月22日
 */
public class NeedsForm extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String tyshxydm; // 统一社会信用代码
	private String qymc; // 企业名称
	private String nd; // 年度
	private String tbr; // 填表人
	private String lxdh; // 联系电话
	private String gswz; // 公司网站
	private String zycp; // 主要产品名称
	private String sczyl; // 市场占有率或行业地位
	private String zysc; // 主要市场或主要客户群
	private String cpsshy; // 产品所属行业或概念
	private String zzc; // 总资产（上年度）
	private String zdhsb; // 自动化设备和信息化总投入（上年度）
	private String jyxjje; // 经营现金净额（上年度）
	private String mqhzyx; // 目前合作院校
	private String ywydxq; // 有无用地需求
	private String xzftgsb; // 需政府提供的公共设备
	private String xqtd; // 需求土地
	private String zlqy; // 坐落区域
	private String xzffwnr; // 需政府公共平台服务内容
	private String fgzcxq; // 扶工政策需求
	private String xjjqtwt; // 还需解决的其他问题
	
	private String[] zycps;
	private String[] sczyls;
	private String[] zyscs;
	private String[] cpsshys;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTyshxydm() {
		return tyshxydm;
	}
	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}
	public String getQymc() {
		return qymc;
	}
	public void setQymc(String qymc) {
		this.qymc = qymc;
	}
	public String getNd() {
		return nd;
	}
	public void setNd(String nd) {
		this.nd = nd;
	}
	public String getTbr() {
		return tbr;
	}
	public void setTbr(String tbr) {
		this.tbr = tbr;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getGswz() {
		return gswz;
	}
	public void setGswz(String gswz) {
		this.gswz = gswz;
	}
	public String getZycp() {
		return zycp;
	}
	public void setZycp(String zycp) {
		this.zycp = zycp;
	}
	public String getSczyl() {
		return sczyl;
	}
	public void setSczyl(String sczyl) {
		this.sczyl = sczyl;
	}
	public String getZysc() {
		return zysc;
	}
	public void setZysc(String zysc) {
		this.zysc = zysc;
	}
	public String getCpsshy() {
		return cpsshy;
	}
	public void setCpsshy(String cpsshy) {
		this.cpsshy = cpsshy;
	}
	public String getZzc() {
		return zzc;
	}
	public void setZzc(String zzc) {
		this.zzc = zzc;
	}
	public String getZdhsb() {
		return zdhsb;
	}
	public void setZdhsb(String zdhsb) {
		this.zdhsb = zdhsb;
	}
	public String getJyxjje() {
		return jyxjje;
	}
	public void setJyxjje(String jyxjje) {
		this.jyxjje = jyxjje;
	}
	public String getMqhzyx() {
		return mqhzyx;
	}
	public void setMqhzyx(String mqhzyx) {
		this.mqhzyx = mqhzyx;
	}
	public String getYwydxq() {
		return ywydxq;
	}
	public void setYwydxq(String ywydxq) {
		this.ywydxq = ywydxq;
	}
	public String getXzftgsb() {
		return xzftgsb;
	}
	public void setXzftgsb(String xzftgsb) {
		this.xzftgsb = xzftgsb;
	}
	public String getXqtd() {
		return xqtd;
	}
	public void setXqtd(String xqtd) {
		this.xqtd = xqtd;
	}
	public String getZlqy() {
		return zlqy;
	}
	public void setZlqy(String zlqy) {
		this.zlqy = zlqy;
	}
	public String getXzffwnr() {
		return xzffwnr;
	}
	public void setXzffwnr(String xzffwnr) {
		this.xzffwnr = xzffwnr;
	}
	public String getFgzcxq() {
		return fgzcxq;
	}
	public void setFgzcxq(String fgzcxq) {
		this.fgzcxq = fgzcxq;
	}
	public String getXjjqtwt() {
		return xjjqtwt;
	}
	public void setXjjqtwt(String xjjqtwt) {
		this.xjjqtwt = xjjqtwt;
	}
	public String[] getZycps() {
		return zycps;
	}
	public void setZycps(String[] zycps) {
		this.zycps = zycps;
	}
	public String[] getSczyls() {
		return sczyls;
	}
	public void setSczyls(String[] sczyls) {
		this.sczyls = sczyls;
	}
	public String[] getZyscs() {
		return zyscs;
	}
	public void setZyscs(String[] zyscs) {
		this.zyscs = zyscs;
	}
	public String[] getCpsshys() {
		return cpsshys;
	}
	public void setCpsshys(String[] cpsshys) {
		this.cpsshys = cpsshys;
	}
	
}
