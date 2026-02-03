package com.syndo.project.industry.sjsb.domain;

/**
 * 
 * @ClassName: EvaluateElectricInfo
 * @Description： 用电信息 
 * @author ykc
 * @date 2020-8-19
 *
 */
public class EvaluateElectricInfo {

	private String id;
	private String pid;
	private String ydhm; // 用电户名
	private String yhhh; // 用电户号
	
	public String getId() {
		return id;
	}
	public String getPid() {
		return pid;
	}
	public String getYdhm() {
		return ydhm;
	}
	public String getYhhh() {
		return yhhh;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public void setYdhm(String ydhm) {
		this.ydhm = ydhm;
	}
	public void setYhhh(String yhhh) {
		this.yhhh = yhhh;
	}
	
}
