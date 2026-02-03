package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;
import com.syndo.common.utils.StringUtils;

/**
 * 公安驾校培训税源比对
 * 
 * @author xrc
 *
 */
public class Gajxpxsybd extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String objId;
	@Excel(name = "驾校名称",sort = 1)
	private String jxmc;
	@Excel(name = "学员数量",sort = 2)
	private String xysl;
	@Excel(name = "单价",sort = 3)
	private String dj;
	@Excel(name = "总学费",sort = 4)
	private String zxf;
	@Excel(name = "税率",sort = 5)
	private String sl;
	@Excel(name = "应交增值税",sort = 6)
	private String yjzzs;
	@Excel(name = "实缴增值税",sort = 7)
	private String sjzzs;
	@Excel(name = "差额",sort = 8)
	private String ce;

	private String cxsjq;
	private String cxsjz;
	private String slsj;

	private String nsrmc;
	private String yyeq;
	private String yyez;
	private String ceq;
	private String cez;
	private String cxtype;
	private String nf;


	public String getNf() {
		return nf;
	}

	public void setNf(String nf) {
		this.nf = nf;
	}

	public String getNsrmc() {
		return nsrmc;
	}

	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}

	public String getYyeq() {
		return yyeq;
	}

	public void setYyeq(String yyeq) {
		this.yyeq = yyeq;
	}

	public String getYyez() {
		return yyez;
	}

	public void setYyez(String yyez) {
		this.yyez = yyez;
	}

	public String getCeq() {
		return ceq;
	}

	public void setCeq(String ceq) {
		this.ceq = ceq;
	}

	public String getCez() {
		return cez;
	}

	public void setCez(String cez) {
		this.cez = cez;
	}

	public String getCxtype() {
		return cxtype;
	}

	public void setCxtype(String cxtype) {
		this.cxtype = cxtype;
	}

	public String getSlsj() {
		return slsj;
	}

	public void setSlsj(String slsj) {
		this.slsj = slsj;
	}

	public String getCxsjq() {
		return cxsjq;
	}

	public void setCxsjq(String cxsjq) {
		this.cxsjq = cxsjq;
	}

	public String getCxsjz() {
		return cxsjz;
	}

	public void setCxsjz(String cxsjz) {
		this.cxsjz = cxsjz;
	}

	public String getJxmc() {
		return jxmc;
	}

	public void setJxmc(String jxmc) {
		this.jxmc = jxmc;
	}

	public String getXysl() {
		return xysl;
	}

	public void setXysl(String xysl) {
		this.xysl = xysl;
	}

	public String getDj() {
		return dj;
	}

	public void setDj(String dj) {
		this.dj = dj;
	}

	public String getZxf() {
		return zxf;
	}

	public void setZxf(String zxf) {
		this.zxf = zxf;
	}

	public String getSl() {
		return sl;
	}

	public void setSl(String sl) {
		this.sl = sl;
	}

	public String getYjzzs() {
		return yjzzs;
	}

	public void setYjzzs(String yjzzs) {
		this.yjzzs = yjzzs;
	}

	public String getSjzzs() {
		return sjzzs;
	}

	public void setSjzzs(String sjzzs) {
		this.sjzzs = sjzzs;
	}

	public String getCe() {
		return ce;
	}

	public void setCe(String ce) {
		this.ce = ce;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public List<String> getPkeyList() {
		List<String> jxmcs = this.split2List(jxmc);
		List<String> slsjs = this.split2List(slsj);
		if (jxmcs.size() == 0 || slsjs.size() == 0) {
			return null;
		}
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < jxmcs.size(); i++) {
			list.add(jxmcs.get(i) + slsjs.get(i));
		}
		return list;
	}

	/**
	 * 分割字符串去列表
	 */
	public List<String> split2List(String str, String split) {
		if (StringUtils.isEmpty(str)) {
			return new ArrayList<String>();
		}
		String[] strs = str.split(split);
		return Arrays.asList(strs);
	}

	public List<String> split2List(String str) {
		return split2List(str, ",");
	}
}
