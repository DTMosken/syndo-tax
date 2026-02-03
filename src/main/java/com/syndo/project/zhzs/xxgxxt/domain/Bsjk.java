package com.syndo.project.zhzs.xxgxxt.domain;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 报送监控
 * 
 */
@ExcelIgnoreUnannotated
public class Bsjk extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// 部门id
	private String deptId;
	// 部门名称
	@ExcelProperty("部门名称")
	private String deptName;
	// 指标名称
	@ExcelProperty("指标名称")
	private String chdesc;
	// 数据所属期
	@ExcelProperty("数据所属期")
	private String dateTime;
	// 是否报送
	@ExcelProperty("是否报送")
	private String isSubmit;
	// 报送条数
	@ExcelProperty("报送条数")
	private String cnt;
	// 应报送时间
	@ExcelProperty("应报送时间")
	private String dueDate;
	// 报送时间
	@ExcelProperty("报送时间")
	private String logDate;
	// 报送状态
	@ExcelProperty("报送状态")
	private String submitStatus;
	// 超期天数
	@ExcelProperty("超期天数")
	private String overDays;
	// 报送周期
	private String submitCycle;

	// 报送时间（查询条件）
	private String bsTime;
	// 报送时间起（查询条件）
	private String bsTimeStart;
	// 报送时间止（查询条件）
	private String bsTimeEnd;

	public String getCnt() {
		return cnt;
	}

	public void setCnt(String cnt) {
		this.cnt = cnt;
	}

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

	public String getIsSubmit() {
		return isSubmit;
	}

	public void setIsSubmit(String isSubmit) {
		this.isSubmit = isSubmit;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getLogDate() {
		return logDate;
	}

	public void setLogDate(String logDate) {
		this.logDate = logDate;
	}

	public String getSubmitStatus() {
		return submitStatus;
	}

	public void setSubmitStatus(String submitStatus) {
		this.submitStatus = submitStatus;
	}

	public String getOverDays() {
		return overDays;
	}

	public void setOverDays(String overDays) {
		this.overDays = overDays;
	}

	public String getSubmitCycle() {
		return submitCycle;
	}

	public void setSubmitCycle(String submitCycle) {
		this.submitCycle = submitCycle;
	}

}
