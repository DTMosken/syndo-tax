package com.syndo.project.zhzs.srfxxt.domain.szqkfx;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 一般公共预算支出执行情况
 * 
 * @author mdz
 *
 */
@SuppressWarnings("serial")
public class Ybggyszc extends BaseEntity {

	private String objId;
	private String jdxz;// 街镇名称
	private String snybggyszc;// 上年一般公共预算支出
	private String bnybggyszc;// 本年一般公共预算支出
	private String yszjl;// 预算增减率
	private String tqzxs;// 同期执行数
	private String bqzxs;// 本期执行数
	private String zxszjl;// 执行数增减率
	private String wcysjd;// 完成预算进度
	private String cysjd;// 超（欠）预算进度
	private String bz;// 备注

	private String cxsj;
	private String qsrq;
	private String zzrq;
	public String getObjId() {
		return objId;
	}
	public void setObjId(String objId) {
		this.objId = objId;
	}
	public String getJdxz() {
		return jdxz;
	}
	public void setJdxz(String jdxz) {
		this.jdxz = jdxz;
	}
	public String getSnybggyszc() {
		return snybggyszc;
	}
	public void setSnybggyszc(String snybggyszc) {
		this.snybggyszc = snybggyszc;
	}
	public String getBnybggyszc() {
		return bnybggyszc;
	}
	public void setBnybggyszc(String bnybggyszc) {
		this.bnybggyszc = bnybggyszc;
	}
	public String getYszjl() {
		return yszjl;
	}
	public void setYszjl(String yszjl) {
		this.yszjl = yszjl;
	}
	public String getTqzxs() {
		return tqzxs;
	}
	public void setTqzxs(String tqzxs) {
		this.tqzxs = tqzxs;
	}
	public String getBqzxs() {
		return bqzxs;
	}
	public void setBqzxs(String bqzxs) {
		this.bqzxs = bqzxs;
	}
	public String getZxszjl() {
		return zxszjl;
	}
	public void setZxszjl(String zxszjl) {
		this.zxszjl = zxszjl;
	}
	public String getWcysjd() {
		return wcysjd;
	}
	public void setWcysjd(String wcysjd) {
		this.wcysjd = wcysjd;
	}
	public String getCysjd() {
		return cysjd;
	}
	public void setCysjd(String cysjd) {
		this.cysjd = cysjd;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public String getCxsj() {
		return cxsj;
	}
	public void setCxsj(String cxsj) {
		this.cxsj = cxsj;
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