package com.syndo.project.zhzs.xxgxxt.domain;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 绩效管理—分数
 * 
 * @author wq
 *
 */
public class Fenshu extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private Integer fs1 = 0;
	private Integer fs2 = 0;
	private Integer fs3 = 0;
	private Integer fs4 = 0;
	private Integer fs5 = 0;
	private Integer fs6 = 0;
	private Integer pjfs = 0;
	private Integer countfs = 0;
	private Integer pmfs;
	private String deptName;
	private String dept;
	private String khrq;

	@Override
	public String toString() {
		return "Fenshu [fs1=" + fs1 + ", fs2=" + fs2 + ", fs3=" + fs3 + ", fs4=" + fs4 + ", fs5=" + fs5 + ", fs6=" + fs6
				+ ", pjfs=" + pjfs + ", countfs=" + countfs + ", pmfs=" + pmfs + ", deptName=" + deptName + ", dept="
				+ dept + ", khrq=" + khrq + "]";
	}

	public Integer getPmfs() {
		return pmfs;
	}

	public void setPmfs(Integer pmfs) {
		this.pmfs = pmfs;
	}

	public Integer getCountfs() {
		return fs1 + fs2 + fs3 + fs4 + fs5 + fs6 + pjfs;
	}

	public void setCountfs(Integer countfs) {
		this.countfs = countfs;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getKhrq() {
		return khrq;
	}

	public void setKhrq(String khrq) {
		this.khrq = khrq;
	}

	public Integer getFs1() {
		return fs1;
	}

	public void setFs1(Integer fs1) {
		this.fs1 = fs1;
	}

	public Integer getFs2() {
		return fs2;
	}

	public void setFs2(Integer fs2) {
		this.fs2 = fs2;
	}

	public Integer getFs3() {
		return fs3;
	}

	public void setFs3(Integer fs3) {
		this.fs3 = fs3;
	}

	public Integer getFs4() {
		return fs4;
	}

	public void setFs4(Integer fs4) {
		this.fs4 = fs4;
	}

	public Integer getFs5() {
		return fs5;
	}

	public void setFs5(Integer fs5) {
		this.fs5 = fs5;
	}

	public Integer getFs6() {
		return fs6;
	}

	public void setFs6(Integer fs6) {
		this.fs6 = fs6;
	}

	public Integer getPjfs() {
		return pjfs;
	}

	public void setPjfs(Integer pjfs) {
		this.pjfs = pjfs;
	}
}
