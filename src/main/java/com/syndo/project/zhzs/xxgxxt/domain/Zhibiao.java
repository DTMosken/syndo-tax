package com.syndo.project.zhzs.xxgxxt.domain;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 绩效管理-指标
 * 
 * @author wq
 *
 */
public class Zhibiao extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String zbbh;// 指标编号
	private String zbmc;// 指标名称
	private String dept;// 部门编号
	private String deptName;// 部门名称
	private String yscsj;// 应上传时间
	private String sjscsj;// 实际上传时间
	private Integer sjdf;// 实际得分
	private String khrq;

	public String getZbbh() {
		return zbbh;
	}

	public void setZbbh(String zbbh) {
		this.zbbh = zbbh;
	}

	public String getZbmc() {
		return zbmc;
	}

	public void setZbmc(String zbmc) {
		this.zbmc = zbmc;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getYscsj() {
		return yscsj;
	}

	public void setYscsj(String yscsj) {
		this.yscsj = yscsj;
	}

	public String getSjscsj() {
		return sjscsj;
	}

	public void setSjscsj(String sjscsj) {
		this.sjscsj = sjscsj;
	}

	public Integer getSjdf() {
		return sjdf;
	}

	public void setSjdf(Integer sjdf) {
		this.sjdf = sjdf;
	}

	public String getKhrq() {
		return khrq;
	}

	public void setKhrq(String khrq) {
		this.khrq = khrq;
	}

	@Override
	public String toString() {
		return "Zhibiao [zbbh=" + zbbh + ", zbmc=" + zbmc + ", dept=" + dept + ", deptName=" + deptName + ", yscsj="
				+ yscsj + ", sjscsj=" + sjscsj + ", sjdf=" + sjdf + "]";
	}

}