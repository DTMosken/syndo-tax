package com.syndo.project.zhzs.srfxxt.domain.czsrfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * 分级次税收收入
 *
 */
public class Fjcsssr2 extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private String rkrq;
	@Excel(name = "征收项目")
	private String zsxm;
	@Excel(name = "合计")
	private BigDecimal hj;
	@Excel(name = "中央级")
	private BigDecimal zyj;
	@Excel(name = "地方级")
	private BigDecimal qxj;
	private String dw;

	private String sjy;
	
	public String getSjy() {
		return sjy;
	}
	public void setSjy(String sjy) {
		this.sjy = sjy;
	}
	public String getRkrq() {
		return rkrq;
	}
	public void setRkrq(String rkrq) {
		this.rkrq = rkrq;
	}
	public String getZsxm() {
		return zsxm;
	}
	public void setZsxm(String zsxm) {
		this.zsxm = zsxm;
	}

	public BigDecimal getHj() {
		return hj;
	}

	public void setHj(BigDecimal hj) {
		this.hj = hj;
	}

	public BigDecimal getZyj() {
		return zyj;
	}

	public void setZyj(BigDecimal zyj) {
		this.zyj = zyj;
	}

	public BigDecimal getQxj() {
		return qxj;
	}

	public void setQxj(BigDecimal qxj) {
		this.qxj = qxj;
	}

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}
}