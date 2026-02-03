package com.syndo.project.industry.zbgzjs.domain;

import com.syndo.common.core.domain.BaseEntity;

import org.apache.commons.lang3.StringUtils;

public class ZbGzk extends BaseEntity {
	private static final String REG = "(?:\\.0*|(\\.\\d+?)0+)$";

	private String id; // 编码
	private String flmlid; // 分类id
	private String flmc; // 分类名称
	private String gzmc; // 规则名称
	private String gzsm; // 规则说明
	private String yxbz; // 有效标志
	private String lrr; // 录入人
	private String lrsj; // 录入时间 yyyy-mm-dd hh24:mi:ss
	private String xgr; // 修改人
	private String xgsj; // 修改时间 yyyy-mm-dd hh24:mi:ss

	/* 指标规则库分组 */
	private String fzid; // 分组编码
	private String fzidPre; // 上一行分组编码
	private String fzidNext; // 下一行分组编码
	private String gzid; // 规则编码
	private String fzmc; // 分组名称
	private String fzsm; // 分组说明
	private String mfSdzb; // 省定指标满分
	private String mfQxtszb; // 区县特色指标满分
	private String mfJfx; // 加分项满分
	private String mf; // 省定、区县特色指标、加分项满分
	private String fzlx; // 类型 case表示筛选条件；otherwise表示其他
	private String qygm; // 企业规模，1规上、0规下
	private String hydm; // 行业代码，可多个，用;分隔
	private String hymc; // 行业名称
	private String fzpx; // 分组排序
	private String fzpxPre; // 上一行分组排序
	private String fzpxNext; // 下一行分组排序

	/* 指标规则库分组明细 */
	private String zbid; // 指标编码
	private String zbmc; // 指标名称
	private String zbjzz; // 指标基准值
	private String pffs; // 评分方式
	private String zbqz; // 指标权重
	private String zbpx; // 指标排序
	private String fzsx; // 分值上限（默认值从指标库带过来）
	private String fzxx; // 分值下限（默认值从指标库带过来）
	private String sxx; // 上下限
	private String idPre;
	private String idNext;
	private String zbpxPre; // 上一行指标排序
	private String zbpxNext; // 下一行指标排序

	public String getSxx() {
		if (StringUtils.isNotEmpty(fzsx) && StringUtils.isNotEmpty(fzxx)) {
			return fzxx + "/" + fzsx;
		} else if (StringUtils.isNotEmpty(fzxx)) {
			return fzxx + "/-";
		} else {
			return "-/" + fzsx;
		}

	}

	public String getMf() {
		return mfSdzb + "、" + mfQxtszb + "、" + mfJfx;
	}

	public String getFzidPre() {
		return fzidPre;
	}

	public void setFzidPre(String fzidPre) {
		this.fzidPre = fzidPre;
	}

	public String getFzidNext() {
		return fzidNext;
	}

	public void setFzidNext(String fzidNext) {
		this.fzidNext = fzidNext;
	}

	public String getFzpxPre() {
		return fzpxPre;
	}

	public void setFzpxPre(String fzpxPre) {
		this.fzpxPre = fzpxPre;
	}

	public String getFzpxNext() {
		return fzpxNext;
	}

	public void setFzpxNext(String fzpxNext) {
		this.fzpxNext = fzpxNext;
	}

	public String getHymc() {
		return hymc;
	}

	public void setHymc(String hymc) {
		this.hymc = hymc;
	}

	public String getFzid() {
		return fzid;
	}

	public void setFzid(String fzid) {
		this.fzid = fzid;
	}

	public String getGzid() {
		return gzid;
	}

	public void setGzid(String gzid) {
		this.gzid = gzid;
	}

	public String getFzmc() {
		return fzmc;
	}

	public void setFzmc(String fzmc) {
		this.fzmc = fzmc;
	}

	public String getFzsm() {
		return fzsm;
	}

	public void setFzsm(String fzsm) {
		this.fzsm = fzsm;
	}

	public String getFzlx() {
		return fzlx;
	}

	public void setFzlx(String fzlx) {
		this.fzlx = fzlx;
	}

	public String getQygm() {
		return qygm;
	}

	public void setQygm(String qygm) {
		this.qygm = qygm;
	}

	public String getHydm() {
		return hydm;
	}

	public void setHydm(String hydm) {
		this.hydm = hydm;
	}

	public String getFzpx() {
		return fzpx;
	}

	public void setFzpx(String fzpx) {
		this.fzpx = fzpx;
	}

	public String getZbid() {
		return zbid;
	}

	public void setZbid(String zbid) {
		this.zbid = zbid;
	}

	public String getZbjzz() {
		if(StringUtils.isNotEmpty(zbjzz)) {
			zbjzz = zbjzz.replaceAll(REG, "$1");
		}
		return zbjzz;
	}

	public void setZbjzz(String zbjzz) {
		this.zbjzz = zbjzz;
	}

	public String getZbqz() {
		if(StringUtils.isNotEmpty(zbqz)) {
			zbqz = zbqz.replaceAll(REG, "$1");
		}
		return zbqz;
	}

	public void setZbqz(String zbqz) {
		this.zbqz = zbqz;
	}

	public String getZbpx() {
		return zbpx;
	}

	public void setZbpx(String zbpx) {
		this.zbpx = zbpx;
	}

	public String getFzsx() {
		return fzsx;
	}

	public void setFzsx(String fzsx) {
		this.fzsx = fzsx;
	}

	public String getFzxx() {
		return fzxx;
	}

	public void setFzxx(String fzxx) {
		this.fzxx = fzxx;
	}

	public String getMfSdzb() {
		return mfSdzb;
	}

	public void setMfSdzb(String mfSdzb) {
		this.mfSdzb = mfSdzb;
	}

	public String getMfQxtszb() {
		return mfQxtszb;
	}

	public void setMfQxtszb(String mfQxtszb) {
		this.mfQxtszb = mfQxtszb;
	}

	public String getMfJfx() {
		return mfJfx;
	}

	public void setMfJfx(String mfJfx) {
		this.mfJfx = mfJfx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFlmlid() {
		return flmlid;
	}

	public void setFlmlid(String flmlid) {
		this.flmlid = flmlid;
	}

	public String getFlmc() {
		return flmc;
	}

	public void setFlmc(String flmc) {
		this.flmc = flmc;
	}

	public String getGzmc() {
		return gzmc;
	}

	public void setGzmc(String gzmc) {
		this.gzmc = gzmc;
	}

	public String getGzsm() {
		return gzsm;
	}

	public void setGzsm(String gzsm) {
		this.gzsm = gzsm;
	}

	public String getYxbz() {
		return yxbz;
	}

	public void setYxbz(String yxbz) {
		this.yxbz = yxbz;
	}

	public String getLrr() {
		return lrr;
	}

	public void setLrr(String lrr) {
		this.lrr = lrr;
	}

	public String getLrsj() {
		return lrsj;
	}

	public void setLrsj(String lrsj) {
		this.lrsj = lrsj;
	}

	public String getXgr() {
		return xgr;
	}

	public void setXgr(String xgr) {
		this.xgr = xgr;
	}

	public String getXgsj() {
		return xgsj;
	}

	public void setXgsj(String xgsj) {
		this.xgsj = xgsj;
	}

	public String getZbpxPre() {
		return zbpxPre;
	}

	public void setZbpxPre(String zbpxPre) {
		this.zbpxPre = zbpxPre;
	}

	public String getZbpxNext() {
		return zbpxNext;
	}

	public void setZbpxNext(String zbpxNext) {
		this.zbpxNext = zbpxNext;
	}

	public String getIdPre() {
		return idPre;
	}

	public void setIdPre(String idPre) {
		this.idPre = idPre;
	}

	public String getIdNext() {
		return idNext;
	}

	public void setIdNext(String idNext) {
		this.idNext = idNext;
	}

	public String getZbmc() {
		return zbmc;
	}

	public void setZbmc(String zbmc) {
		this.zbmc = zbmc;
	}

	public String getPffs() {
		return pffs;
	}

	public void setPffs(String pffs) {
		this.pffs = pffs;
	}
}
