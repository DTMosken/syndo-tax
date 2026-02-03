package com.syndo.project.zhzs.dbfxxt.domain.xtgl;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 公安驾校价格维护
 * 
 * @author xrc
 *
 */
public class Gajxjgwh extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String objId;
	private String jxmc;
	private String sqzjcx;
	private String jg;
	private String kssj;
	private String jssj;
	private String nd;
	private String flag;
	private String whsj;

	/**
	 * 标识是否批量插入
	 */
	private String flagjgwh;

	public String getFlagjgwh() {
		return flagjgwh;
	}

	public void setFlagjgwh(String flagjgwh) {
		this.flagjgwh = flagjgwh;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public String getJxmc() {
		return jxmc;
	}

	public void setJxmc(String jxmc) {
		this.jxmc = jxmc;
	}

	public String getSqzjcx() {
		return sqzjcx;
	}

	public void setSqzjcx(String sqzjcx) {
		this.sqzjcx = sqzjcx;
	}

	public String getJg() {
		return jg;
	}

	public void setJg(String jg) {
		this.jg = jg;
	}

	public String getKssj() {
		return kssj;
	}

	public void setKssj(String kssj) {
		this.kssj = kssj;
	}

	public String getJssj() {
		return jssj;
	}

	public void setJssj(String jssj) {
		this.jssj = jssj;
	}

	public String getNd() {
		return nd;
	}

	public void setNd(String nd) {
		this.nd = nd;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getWhsj() {
		return whsj;
	}

	public void setWhsj(String whsj) {
		this.whsj = whsj;
	}

}
