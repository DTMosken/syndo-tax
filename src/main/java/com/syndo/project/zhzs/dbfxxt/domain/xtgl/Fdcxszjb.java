package com.syndo.project.zhzs.dbfxxt.domain.xtgl;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 房地产销售中间表维护
 * 
 * @author xrc
 *
 */
public class Fdcxszjb extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String objId;// 主键
	private String qymc;// 房开商
	private String nsrmc;// 纳税人名称
	private String flag;
	private String zjr;
	private String zjsj;
	private String xgr;
	private String xgsj;

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

	public String getQymc() {
		return qymc;
	}

	public void setQymc(String qymc) {
		this.qymc = qymc;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getZjr() {
		return zjr;
	}

	public void setZjr(String zjr) {
		this.zjr = zjr;
	}

	public String getZjsj() {
		return zjsj;
	}

	public void setZjsj(String zjsj) {
		this.zjsj = zjsj;
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

}
