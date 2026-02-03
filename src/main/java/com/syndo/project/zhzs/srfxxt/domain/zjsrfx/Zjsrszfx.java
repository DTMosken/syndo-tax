package com.syndo.project.zhzs.srfxxt.domain.zjsrfx;

import java.lang.String;

import javax.validation.constraints.NotBlank;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 *  镇街收入税种分析
 * 
 *
 */
public class Zjsrszfx extends BaseEntity {

	private static final long serialVersionUID = 1L;
	@Excel(name = "镇街乡镇")
	private String jdxz;
	@Excel(name = "合计")
	private String sjje;
	@Excel(name = "增值税")
	private String zzs;
	@Excel(name = "消费税")
	private String xfs;
	@Excel(name = "营业税")
	private String yys;
	@Excel(name = "企业所得税")
	private String qysds;
	@Excel(name = "个人所得税")
	private String grsds;
	@Excel(name = "资源税")
	private String zys;
	@Excel(name = "城市维护建设税")
	private String cswhjss;
	@Excel(name = "房产税")
	private String fcs;
	@Excel(name = "印花税")
	private String yhs;
	@Excel(name = "城镇土地使用税")
	private String cztdsys;
	@Excel(name = "土地增值税")
	private String tdzzs;
	@Excel(name = "车船税")
	private String ccs;
	@Excel(name = "耕地占用税")
	private String gdzys;
	@Excel(name = "契税")
	private String qs;
	@Excel(name = "环境保护税")
	private String hjbhs;
	@Excel(name = "车辆购置税")
	private String clgzs;
	@Excel(name = "烟叶税")
	private String yy;
	@Excel(name = "教育费附加")
	private String jyffj;
	@Excel(name = "地方教育附加")
	private String dfjyfj;
	@Excel(name = "残疾人就业保证金")
	private String cjrjybzj;
	@Excel(name = "文化事业建设被")
	private String whsjjsf;
	@Excel(name = "税务部门罚没收入")
	private String swbmfmsr;
	@Excel(name = "水利建设专项收入")
	private String sljszxsr;
	@Excel(name = "其他收入")
	private String qtsr;

	private String qsrq;
	private String zzrq;
	private String dw;

	public String getJdxz() {
		return jdxz;
	}

	public void setJdxz(String jdxz) {
		this.jdxz = jdxz;
	}

	public String getSjje() {
		return sjje;
	}

	public void setSjje(String sjje) {
		this.sjje = sjje;
	}

	public String getZzs() {
		return zzs;
	}

	public void setZzs(String zzs) {
		this.zzs = zzs;
	}

	public String getXfs() {
		return xfs;
	}

	public void setXfs(String xfs) {
		this.xfs = xfs;
	}

	public String getYys() {
		return yys;
	}

	public void setYys(String yys) {
		this.yys = yys;
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

	public String getZys() {
		return zys;
	}

	public void setZys(String zys) {
		this.zys = zys;
	}

	public String getCswhjss() {
		return cswhjss;
	}

	public void setCswhjss(String cswhjss) {
		this.cswhjss = cswhjss;
	}

	public String getFcs() {
		return fcs;
	}

	public void setFcs(String fcs) {
		this.fcs = fcs;
	}

	public String getYhs() {
		return yhs;
	}

	public void setYhs(String yhs) {
		this.yhs = yhs;
	}

	public String getCztdsys() {
		return cztdsys;
	}

	public void setCztdsys(String cztdsys) {
		this.cztdsys = cztdsys;
	}

	public String getTdzzs() {
		return tdzzs;
	}

	public void setTdzzs(String tdzzs) {
		this.tdzzs = tdzzs;
	}

	public String getCcs() {
		return ccs;
	}

	public void setCcs(String ccs) {
		this.ccs = ccs;
	}

	public String getGdzys() {
		return gdzys;
	}

	public void setGdzys(String gdzys) {
		this.gdzys = gdzys;
	}

	public String getQs() {
		return qs;
	}

	public void setQs(String qs) {
		this.qs = qs;
	}

	public String getHjbhs() {
		return hjbhs;
	}

	public void setHjbhs(String hjbhs) {
		this.hjbhs = hjbhs;
	}

	public String getClgzs() {
		return clgzs;
	}

	public void setClgzs(String clgzs) {
		this.clgzs = clgzs;
	}

	public String getYy() {
		return yy;
	}

	public void setYy(String yy) {
		this.yy = yy;
	}

	public String getJyffj() {
		return jyffj;
	}

	public void setJyffj(String jyffj) {
		this.jyffj = jyffj;
	}

	public String getDfjyfj() {
		return dfjyfj;
	}

	public void setDfjyfj(String dfjyfj) {
		this.dfjyfj = dfjyfj;
	}

	public String getCjrjybzj() {
		return cjrjybzj;
	}

	public void setCjrjybzj(String cjrjybzj) {
		this.cjrjybzj = cjrjybzj;
	}

	public String getWhsjjsf() {
		return whsjjsf;
	}

	public void setWhsjjsf(String whsjjsf) {
		this.whsjjsf = whsjjsf;
	}

	public String getSwbmfmsr() {
		return swbmfmsr;
	}

	public void setSwbmfmsr(String swbmfmsr) {
		this.swbmfmsr = swbmfmsr;
	}

	public String getSljszxsr() {
		return sljszxsr;
	}

	public void setSljszxsr(String sljszxsr) {
		this.sljszxsr = sljszxsr;
	}

	public String getQtsr() {
		return qtsr;
	}

	public void setQtsr(String qtsr) {
		this.qtsr = qtsr;
	}

	@NotBlank(message = "查询日期起不能为空")
	public String getQsrq() {
		return qsrq;
	}

	public void setQsrq(String qsrq) {
		this.qsrq = qsrq;
	}

	@NotBlank(message = "查询日期止不能为空")
	public String getZzrq() {
		return zzrq;
	}

	public void setZzrq(String zzrq) {
		this.zzrq = zzrq;
	}

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

}