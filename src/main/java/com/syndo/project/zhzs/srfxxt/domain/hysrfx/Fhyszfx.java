package com.syndo.project.zhzs.srfxxt.domain.hysrfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * 分行业税种分析
 */
public class Fhyszfx extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private String tjkj;//查询类型，全口径，一般预算
	@Excel(name = "行业门类")
	private String hy;//行业
	@Excel(name = "合计金额")
	private BigDecimal hjje;//合计金额
	private String qsrq;//入库期启
	private String zzrq;//入库期止
	@Excel(name = "增值税")
	private BigDecimal zzs;
	@Excel(name = "消费税")
	private BigDecimal xfs;
	@Excel(name = "营业税")
	private BigDecimal yys;
	@Excel(name = "企业所得税")
	private BigDecimal qysds;
	@Excel(name = "个人所得税")
	private BigDecimal grsds;
	@Excel(name = "资源税")
	private BigDecimal zys;
	@Excel(name = "城市维护建设税")
	private BigDecimal cswhjss;
	@Excel(name = "房产税")
	private BigDecimal fcs;
	@Excel(name = "印花税")
	private BigDecimal yhs;
	@Excel(name = "城镇土地使用税")
	private BigDecimal cztdsys;
	@Excel(name = "土地增值税")
	private BigDecimal tdzzs;
	@Excel(name = "车船税")
	private BigDecimal ccs;
	@Excel(name = "耕地占用税")
	private BigDecimal gdzys;
	@Excel(name = "契税")
	private BigDecimal qs;
	@Excel(name = "环境保护税")
	private BigDecimal hjbhs;

	private String dw;
	
	public String getDw() {
		return dw;
	}
	public void setDw(String dw) {
		this.dw = dw;
	}
	public String getTjkj() {
		return tjkj;
	}
	public void setTjkj(String tjkj) {
		this.tjkj = tjkj;
	}
	public String getHy() {
		return hy;
	}
	public void setHy(String hy) {
		this.hy = hy;
	}

	public BigDecimal getHjje() {
		return hjje;
	}

	public void setHjje(BigDecimal hjje) {
		this.hjje = hjje;
	}
	
	public String getQsrq() {
		return qsrq;
	}
	public void setQsrq(String qsrq) {
		this.qsrq = qsrq;
	}
	
	public String getZzrq() {
		return zzrq;
	}
	public void setZzrq(String zzrq) {
		this.zzrq = zzrq;
	}
	
	public BigDecimal getZzs() {
		return zzs;
	}

	public void setZzs(BigDecimal zzs) {
		this.zzs = zzs;
	}

	public BigDecimal getXfs() {
		return xfs;
	}

	public void setXfs(BigDecimal xfs) {
		this.xfs = xfs;
	}

	public BigDecimal getYys() {
		return yys;
	}

	public void setYys(BigDecimal yys) {
		this.yys = yys;
	}

	public BigDecimal getQysds() {
		return qysds;
	}

	public void setQysds(BigDecimal qysds) {
		this.qysds = qysds;
	}

	public BigDecimal getGrsds() {
		return grsds;
	}

	public void setGrsds(BigDecimal grsds) {
		this.grsds = grsds;
	}

	public BigDecimal getZys() {
		return zys;
	}

	public void setZys(BigDecimal zys) {
		this.zys = zys;
	}

	public BigDecimal getCswhjss() {
		return cswhjss;
	}

	public void setCswhjss(BigDecimal cswhjss) {
		this.cswhjss = cswhjss;
	}

	public BigDecimal getFcs() {
		return fcs;
	}

	public void setFcs(BigDecimal fcs) {
		this.fcs = fcs;
	}

	public BigDecimal getYhs() {
		return yhs;
	}

	public void setYhs(BigDecimal yhs) {
		this.yhs = yhs;
	}

	public BigDecimal getCztdsys() {
		return cztdsys;
	}

	public void setCztdsys(BigDecimal cztdsys) {
		this.cztdsys = cztdsys;
	}

	public BigDecimal getTdzzs() {
		return tdzzs;
	}

	public void setTdzzs(BigDecimal tdzzs) {
		this.tdzzs = tdzzs;
	}

	public BigDecimal getCcs() {
		return ccs;
	}

	public void setCcs(BigDecimal ccs) {
		this.ccs = ccs;
	}

	public BigDecimal getGdzys() {
		return gdzys;
	}

	public void setGdzys(BigDecimal gdzys) {
		this.gdzys = gdzys;
	}

	public BigDecimal getQs() {
		return qs;
	}

	public void setQs(BigDecimal qs) {
		this.qs = qs;
	}

	public BigDecimal getHjbhs() {
		return hjbhs;
	}

	public void setHjbhs(BigDecimal hjbhs) {
		this.hjbhs = hjbhs;
	}
}