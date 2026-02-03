package com.syndo.project.zhzs.xxgxxt.domain;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 报送详情
 * 
 */
public class Bsxq extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// 部门id
	private String deptId;
	// 部门名称
	private String deptName;
	// 指标名称
	private String chdesc;
	// 数据所属期
	private String dateTime;
	// 报送人
	private String userName;
	// 报送数量
	private String count;
	// 报送类型
	private String type;
	// 报送时间
	private String logDate;

	// 报送时间（查询条件）
	private String bsTime;
	// 报送时间起（查询条件）
	private String bsTimeStart;
	// 报送时间止（查询条件）
	private String bsTimeEnd;

	public String getBsTime() {
		return bsTime;
	}

	public void setBsTime(String bsTime) {
		this.bsTime = bsTime;
	}

	public String getBsTimeStart() {
		return bsTimeStart;
	}

	public void setBsTimeStart(String bsTimeStart) {
		this.bsTimeStart = bsTimeStart;
	}

	public String getBsTimeEnd() {
		return bsTimeEnd;
	}

	public void setBsTimeEnd(String bsTimeEnd) {
		this.bsTimeEnd = bsTimeEnd;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getChdesc() {
		return chdesc;
	}

	public void setChdesc(String chdesc) {
		this.chdesc = chdesc;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLogDate() {
		return logDate;
	}

	public void setLogDate(String logDate) {
		this.logDate = logDate;
	}

}
