package com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl;

import java.io.Serializable;

/**  企业信息上报统计  实体类
 * @author gxg
 */
public class Qyxxsbtj implements Serializable{
	private static final long serialVersionUID = 1L;
	

	private String  userCode;
	private String  userName;
	private String  userTel;
	private String  userDept;
	private String  totals;
	private String  bszq;
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserDept() {
		return userDept;
	}
	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}
	public String getTotals() {
		return totals;
	}
	public void setTotals(String totals) {
		this.totals = totals;
	}
	public String getBszq() {
		return bszq;
	}
	public void setBszq(String bszq) {
		this.bszq = bszq;
	}
	
	
	
		

}
