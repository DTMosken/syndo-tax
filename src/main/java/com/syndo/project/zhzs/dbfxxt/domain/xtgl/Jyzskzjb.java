package com.syndo.project.zhzs.dbfxxt.domain.xtgl;

/**
 * 加油站税控中间表实体
 * @author hry
 *
 */
public class Jyzskzjb {
	private String objId;// 对象id
	private String qymc;//企业名称
	private String nsrmc;//纳税人名称
	private String gxdx;//关系对象
	private String flag;
	private String zjr;
	private String zjsj;
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

	private String xgr;
	private String xgsj;

 

	public String getQymc() {
		return qymc;
	}

	public void setQymc(String qymc) {
		this.qymc = qymc;
	}

	public String getNsrmc() {
		return nsrmc;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}

	public String getGxdx() {
		return gxdx;
	}

	public void setGxdx(String gxdx) {
		this.gxdx = gxdx;
	}

}
