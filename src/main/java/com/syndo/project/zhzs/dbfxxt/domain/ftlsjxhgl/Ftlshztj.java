package com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl;

import java.io.Serializable;
import java.util.List;

/**  房土两税汇总统计  实体类
 * @author gxg
 */
public class Ftlshztj implements Serializable{
	private static final long serialVersionUID = 1L;
	private String jd;
	private List<String> jdlist;
	private String jdnum;//街道个数
	private String fcs;
	private String tdsys;
	private String grsds;
	private String znj;
	private String yhs;
	private String hj;
	private String hjgt;
	private String hjlt;
	private String fcsgt;
	private String fcslt;
	private String jdnumgt;
	private String jdnumlt;
	private String tdsyslt;
	private String tdsysgt;

    private String querySql;
	

	public List<String> getJdlist() {
		return jdlist;
	}
	public void setJdlist(List<String> jdlist) {
		this.jdlist = jdlist;
	}
	public String getHjgt() {
		return hjgt;
	}
	public void setHjgt(String hjgt) {
		this.hjgt = hjgt;
	}
	public String getHjlt() {
		return hjlt;
	}
	public void setHjlt(String hjlt) {
		this.hjlt = hjlt;
	}
	public String getFcsgt() {
		return fcsgt;
	}
	public void setFcsgt(String fcsgt) {
		this.fcsgt = fcsgt;
	}
	public String getFcslt() {
		return fcslt;
	}
	public void setFcslt(String fcslt) {
		this.fcslt = fcslt;
	}
	public String getJdnumgt() {
		return jdnumgt;
	}
	public void setJdnumgt(String jdnumgt) {
		this.jdnumgt = jdnumgt;
	}
	public String getJdnumlt() {
		return jdnumlt;
	}
	public void setJdnumlt(String jdnumlt) {
		this.jdnumlt = jdnumlt;
	}
	public String getTdsyslt() {
		return tdsyslt;
	}
	public void setTdsyslt(String tdsyslt) {
		this.tdsyslt = tdsyslt;
	}
	public String getTdsysgt() {
		return tdsysgt;
	}
	public void setTdsysgt(String tdsysgt) {
		this.tdsysgt = tdsysgt;
	}
	public String getJd() {
		return jd;
	}
	public void setJd(String jd) {
		this.jd = jd;
	}
	public String getJdnum() {
		return jdnum;
	}
	public void setJdnum(String jdnum) {
		this.jdnum = jdnum;
	}
	public String getFcs() {
		return fcs;
	}
	public void setFcs(String fcs) {
		this.fcs = fcs;
	}
	public String getTdsys() {
		return tdsys;
	}
	public void setTdsys(String tdsys) {
		this.tdsys = tdsys;
	}
	public String getGrsds() {
		return grsds;
	}
	public void setGrsds(String grsds) {
		this.grsds = grsds;
	}
	public String getZnj() {
		return znj;
	}
	public void setZnj(String znj) {
		this.znj = znj;
	}
	public String getYhs() {
		return yhs;
	}
	public void setYhs(String yhs) {
		this.yhs = yhs;
	}
	public String getHj() {
		return hj;
	}
	public void setHj(String hj) {
		this.hj = hj;
	}
	public String getQuerySql() {
		return querySql;
	}
	public void setQuerySql(String querySql) {
		this.querySql = querySql;
	}
}
