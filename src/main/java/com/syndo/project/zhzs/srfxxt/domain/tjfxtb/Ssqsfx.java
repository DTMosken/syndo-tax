package com.syndo.project.zhzs.srfxxt.domain.tjfxtb;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 税收趋势分析
 * @author mdz
 * @date 2020年4月20日
 */
public class Ssqsfx extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private String xm;
	private String zsr;
	private String dfsr;
	private String rq;
	private String rkrqq;
	private String rkrqz;
	private String cxsj;

	public String getRkrqq() {
		return rkrqq;
	}

	public void setRkrqq(String rkrqq) {
		this.rkrqq = rkrqq;
	}

	public String getRkrqz() {
		return rkrqz;
	}

	public void setRkrqz(String rkrqz) {
		this.rkrqz = rkrqz;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getZsr() {
		return zsr;
	}

	public void setZsr(String zsr) {
		this.zsr = zsr;
	}

	public String getCxsj() {
		return cxsj;
	}

	public void setCxsj(String cxsj) {
		this.cxsj = cxsj;
	}

	public String getDfsr() {
		return dfsr;
	}

	public void setDfsr(String dfsr) {
		this.dfsr = dfsr;
	}

	public String getRq() {
		return rq;
	}

	public void setRq(String rq) {
		this.rq = rq;
	}

}