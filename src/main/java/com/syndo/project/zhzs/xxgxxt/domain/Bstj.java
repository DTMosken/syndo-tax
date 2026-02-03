package com.syndo.project.zhzs.xxgxxt.domain;

import com.syndo.common.core.domain.BaseEntity;

public class Bstj extends BaseEntity {

	private int sjbm;//数据部门数
	private int sjzy;//数据资源数
	private int sjzl;//数据总量
	private int ztlm;//主题类目数
	private String rq;//日期
	private String bssl;//报送数量
	private String bsxq;//报送详情
	
	public int getSjbm() {
		return sjbm;
	}
	public void setSjbm(int sjbm) {
		this.sjbm = sjbm;
	}
	public int getSjzy() {
		return sjzy;
	}
	public void setSjzy(int sjzy) {
		this.sjzy = sjzy;
	}
	public int getSjzl() {
		return sjzl;
	}
	public void setSjzl(int sjzl) {
		this.sjzl = sjzl;
	}
	public int getZtlm() {
		return ztlm;
	}
	public void setZtlm(int ztlm) {
		this.ztlm = ztlm;
	}
	public String getRq() {
		return rq;
	}
	public void setRq(String rq) {
		this.rq = rq;
	}
	public String getBssl() {
		return bssl;
	}
	public void setBssl(String bssl) {
		this.bssl = bssl;
	}
	public String getBsxq() {
		return bsxq;
	}
	public void setBsxq(String bsxq) {
		this.bsxq = bsxq;
	}
}
