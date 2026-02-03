package com.syndo.web.domain.system;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 用于首页数据展示
 * 
 * @author mdz
 * @date 2019年7月8日
 */
public class Index extends BaseEntity {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String lineNum;
	private String dateTime;
	private String zsr;
	private String zsrRq;
	private String zsrqs;
	private String dfsr;
	private String dfsrqs;
	private String bsyf;
	private String ybs;
	private String wbs;
	private String bssl;
	private String sjzl;
	private String eYf;
	private String eBqs;
	private String eTqs;
	private String eZjl;
	
	private String char1;
	private String char2;

	public String getBsyf() {
		return bsyf;
	}

	public void setBsyf(String bsyf) {
		this.bsyf = bsyf;
	}

	public String getZsrRq() {
		return zsrRq;
	}
	public void setZsrRq(String zsrRq) {
		this.zsrRq = zsrRq;
	}
	public String getChar1() {
		return char1;
	}
	public void setChar1(String char1) {
		this.char1 = char1;
	}
	public String getChar2() {
		return char2;
	}
	public void setChar2(String char2) {
		this.char2 = char2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLineNum() {
		return lineNum;
	}
	public void setLineNum(String lineNum) {
		this.lineNum = lineNum;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getZsr() {
		return zsr;
	}
	public void setZsr(String zsr) {
		this.zsr = zsr;
	}
	public String getZsrqs() {
		return zsrqs;
	}
	public void setZsrqs(String zsrqs) {
		this.zsrqs = zsrqs;
	}
	public String getDfsr() {
		return dfsr;
	}
	public void setDfsr(String dfsr) {
		this.dfsr = dfsr;
	}
	public String getDfsrqs() {
		return dfsrqs;
	}
	public void setDfsrqs(String dfsrqs) {
		this.dfsrqs = dfsrqs;
	}
	public String getYbs() {
		return ybs;
	}
	public void setYbs(String ybs) {
		this.ybs = ybs;
	}
	public String getWbs() {
		return wbs;
	}
	public void setWbs(String wbs) {
		this.wbs = wbs;
	}
	public String getBssl() {
		return bssl;
	}
	public void setBssl(String bssl) {
		this.bssl = bssl;
	}
	public String getSjzl() {
		return sjzl;
	}
	public void setSjzl(String sjzl) {
		this.sjzl = sjzl;
	}
	public String geteYf() {
		return eYf;
	}
	public void seteYf(String eYf) {
		this.eYf = eYf;
	}
	public String geteBqs() {
		return eBqs;
	}
	public void seteBqs(String eBqs) {
		this.eBqs = eBqs;
	}
	public String geteTqs() {
		return eTqs;
	}
	public void seteTqs(String eTqs) {
		this.eTqs = eTqs;
	}
	public String geteZjl() {
		return eZjl;
	}
	public void seteZjl(String eZjl) {
		this.eZjl = eZjl;
	}
	

}
