package com.syndo.project.zhzs.srfxxt.domain.qysrfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 企业税收税种分析
 * 
 * @author mdz
 *
 */
public class Qyssszfx2 extends BaseEntity {
	@Excel(name = "纳税人名称")
	private String nsrmc;
	@Excel(name = "总计")
	private String sshj;
	@Excel(name = "增值税")
	private String zzs;
	@Excel(name = "免抵调库")
	private String mdtk;
	@Excel(name = "消费税")
	private String xfs;
	@Excel(name = "企业所得税")
	private String qysds;
	@Excel(name = "个人所得税")
	private String grsds;
	@Excel(name = "车船税")
	private String ccs;
	@Excel(name = "城市维护建设税")
	private String cswhjss;
	@Excel(name = "城镇土地使用税")
	private String cztdsys;
	@Excel(name = "房产税")
	private String fcs;
	@Excel(name = "耕地占用税")
	private String gdzys;
	@Excel(name = "环境保护税")
	private String hjbhs;
	@Excel(name = "契税")
	private String qs;
	@Excel(name = "土地增值税")
	private String tdzzs;
	@Excel(name = "印花税")
	private String yhs;
	@Excel(name = "资源税")
	private String zys;
	
	private String sjy;
	
	public String getSjy() {
		return sjy;
	}

	public void setSjy(String sjy) {
		this.sjy = sjy;
	}

	public String getNsrmc() {
		return nsrmc;
	}

	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}

	public String getSshj() {
		return sshj;
	}

	public void setSshj(String sshj) {
		this.sshj = sshj;
	}

	public String getZzs() {
		return zzs;
	}

	public void setZzs(String zzs) {
		this.zzs = zzs;
	}

	public String getMdtk() {
		return mdtk;
	}

	public void setMdtk(String mdtk) {
		this.mdtk = mdtk;
	}

	public String getXfs() {
		return xfs;
	}

	public void setXfs(String xfs) {
		this.xfs = xfs;
	}

	public String getQysds() {
		return qysds;
	}

	public void setQysds(String qysds) {
		this.qysds = qysds;
	}

	public String getGrsds() {
		return grsds;
	}

	public void setGrsds(String grsds) {
		this.grsds = grsds;
	}

	public String getCcs() {
		return ccs;
	}

	public void setCcs(String ccs) {
		this.ccs = ccs;
	}

	public String getCswhjss() {
		return cswhjss;
	}

	public void setCswhjss(String cswhjss) {
		this.cswhjss = cswhjss;
	}

	public String getCztdsys() {
		return cztdsys;
	}

	public void setCztdsys(String cztdsys) {
		this.cztdsys = cztdsys;
	}

	public String getFcs() {
		return fcs;
	}

	public void setFcs(String fcs) {
		this.fcs = fcs;
	}

	public String getGdzys() {
		return gdzys;
	}

	public void setGdzys(String gdzys) {
		this.gdzys = gdzys;
	}

	public String getHjbhs() {
		return hjbhs;
	}

	public void setHjbhs(String hjbhs) {
		this.hjbhs = hjbhs;
	}

	public String getQs() {
		return qs;
	}

	public void setQs(String qs) {
		this.qs = qs;
	}

	public String getTdzzs() {
		return tdzzs;
	}

	public void setTdzzs(String tdzzs) {
		this.tdzzs = tdzzs;
	}

	public String getYhs() {
		return yhs;
	}

	public void setYhs(String yhs) {
		this.yhs = yhs;
	}

	public String getZys() {
		return zys;
	}

	public void setZys(String zys) {
		this.zys = zys;
	}
}
