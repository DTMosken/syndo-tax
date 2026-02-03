package com.syndo.project.zhzs.srfxxt.domain.xtwh;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 未入企业库纳税人
 *
 * @author ykc
 * @date 2020年6月17日
 */
public class Wrqyknsr extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String tyshxydm; // 纳税人识别号
	private String nsrmc; // 纳税人名称
	private String sjje; // 实缴金额
	private String jdxz; // 街道乡镇
	
	
	
	public String getTyshxydm() {
		return tyshxydm;
	}
	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}
	public String getNsrmc() {
		return nsrmc;
	}
	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}
	public String getSjje() {
		return sjje;
	}
	public void setSjje(String sjje) {
		this.sjje = sjje;
	}
	public String getJdxz() {
		return jdxz;
	}
	public void setJdxz(String jdxz) {
		this.jdxz = jdxz;
	}
	
}
