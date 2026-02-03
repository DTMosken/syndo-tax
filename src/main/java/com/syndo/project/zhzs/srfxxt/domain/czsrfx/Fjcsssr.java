package com.syndo.project.zhzs.srfxxt.domain.czsrfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * 分级次税收收入
 *
 */
public class Fjcsssr extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private String rkrq;
	@Excel(name = "征收项目")
	private String zsxm;
	@Excel(name = "合计")
	private BigDecimal hj;
	@Excel(name = "中央级")
	private BigDecimal zyj;
	@Excel(name = "省级")
	private BigDecimal shenj;
	@Excel(name = "市级")
	private BigDecimal shij;
	@Excel(name = "区县级")
	private BigDecimal qxj;
	@Excel(name = "中央待分配")
	private BigDecimal zydfp;
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

	public BigDecimal getShenj() {
		return shenj;
	}

	public void setShenj(BigDecimal shenj) {
		this.shenj = shenj;
	}

	public BigDecimal getShij() {
		return shij;
	}

	public void setShij(BigDecimal shij) {
		this.shij = shij;
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

	public BigDecimal getZydfp() {
		return zydfp;
	}

	public void setZydfp(BigDecimal zydfp) {
		this.zydfp = zydfp;
	}
}