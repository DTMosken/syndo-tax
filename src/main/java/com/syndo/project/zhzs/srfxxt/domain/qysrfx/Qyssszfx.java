package com.syndo.project.zhzs.srfxxt.domain.qysrfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 企业税收税种分析
 * 
 * @author mdz
 *
 */
public class Qyssszfx extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String objId;
	private String qsrq;
	private String zzrq;
	@Excel(name = "统一社会信用代码")
	private String nsrsbh;
	@Excel(name = "纳税人名称")
	private String nsrmc;
	@Excel(name = "税收总计")
	private String sshj;
	private String dfsshj;
	@Excel(name = "增值税")
	private String zzs;
	@Excel(name = "消费税")
	private String xfs;
	@Excel(name = "营业税")
	private String yingys;
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
	@Excel(name = "车辆购置税")
	private String clgzs;
	@Excel(name = "耕地占用税")
	private String gdzys;
	@Excel(name = "契税")
	private String qs;
	@Excel(name = "环境保护税")
	private String hjbhs;
	
	private String yys;
	private String cjs;
	private String sljszxsr;//水利建设专项收入
	private String jyffj;
	private String dfjyfj;
	private String whsyjsf;//文化事业建设费
	private String swbmfmsr;//税务部门罚没收入
	private String cbj;//残保金收入
	private String qtsr;
	private String sljsjjsr;//水利建设基金收入
	private String fzjj;//可再生能源发展基金
	private String fcjj;//大中型水库移民后期扶持基金
	private String tjkj;//统计口径：0 全口径 1一般预算
	private String jdxz;
	private String hyml;
	private String zzsldts;
	private String mdtzzs;
	private String ttsk;
	private String zzsdfp;
	
	private String tqsshj;
	private String tqdfsshj;
	private String nsrmcs;
	private String zsrzze;
	private String zsrzzl;
	private String dfzze;
	private String dfzzl;
	private String qyfl;
	private String ckts;
	
	private String pxzd;
	private Integer sl;
	private Integer dw;
	
	public String getZzsdfp() {
		return zzsdfp;
	}

	public void setZzsdfp(String zzsdfp) {
		this.zzsdfp = zzsdfp;
	}

	public String getDfsshj() {
		return dfsshj;
	}

	public void setDfsshj(String dfsshj) {
		this.dfsshj = dfsshj;
	}

	public String getZzsldts() {
		return zzsldts;
	}

	public void setZzsldts(String zzsldts) {
		this.zzsldts = zzsldts;
	}

	public String getMdtzzs() {
		return mdtzzs;
	}

	public void setMdtzzs(String mdtzzs) {
		this.mdtzzs = mdtzzs;
	}

	public String getTtsk() {
		return ttsk;
	}

	public void setTtsk(String ttsk) {
		this.ttsk = ttsk;
	}

	public String getYingys() {
		return yingys;
	}

	public void setYingys(String yingys) {
		this.yingys = yingys;
	}

	public String getCswhjss() {
		return cswhjss;
	}

	public void setCswhjss(String cswhjss) {
		this.cswhjss = cswhjss;
	}

	public String getJdxz() {
		return jdxz;
	}

	public void setJdxz(String jdxz) {
		this.jdxz = jdxz;
	}

	public String getHyml() {
		return hyml;
	}

	public void setHyml(String hyml) {
		this.hyml = hyml;
	}

	public String getCbj() {
		return cbj;
	}

	public void setCbj(String cbj) {
		this.cbj = cbj;
	}

	public String getSljsjjsr() {
		return sljsjjsr;
	}

	public void setSljsjjsr(String sljsjjsr) {
		this.sljsjjsr = sljsjjsr;
	}

	public String getFzjj() {
		return fzjj;
	}

	public void setFzjj(String fzjj) {
		this.fzjj = fzjj;
	}

	public String getFcjj() {
		return fcjj;
	}

	public void setFcjj(String fcjj) {
		this.fcjj = fcjj;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
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

	public String getNsrsbh() {
		return nsrsbh;
	}

	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
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

	public String getZys() {
		return zys;
	}

	public void setZys(String zys) {
		this.zys = zys;
	}

	public String getYhs() {
		return yhs;
	}

	public void setYhs(String yhs) {
		this.yhs = yhs;
	}

	public String getYys() {
		return yys;
	}

	public void setYys(String yys) {
		this.yys = yys;
	}

	public String getQs() {
		return qs;
	}

	public void setQs(String qs) {
		this.qs = qs;
	}

	public String getFcs() {
		return fcs;
	}

	public void setFcs(String fcs) {
		this.fcs = fcs;
	}

	public String getTdzzs() {
		return tdzzs;
	}

	public void setTdzzs(String tdzzs) {
		this.tdzzs = tdzzs;
	}

	public String getGdzys() {
		return gdzys;
	}

	public void setGdzys(String gdzys) {
		this.gdzys = gdzys;
	}

	public String getCztdsys() {
		return cztdsys;
	}

	public void setCztdsys(String cztdsys) {
		this.cztdsys = cztdsys;
	}

	public String getCjs() {
		return cjs;
	}

	public void setCjs(String cjs) {
		this.cjs = cjs;
	}

	public String getCcs() {
		return ccs;
	}

	public void setCcs(String ccs) {
		this.ccs = ccs;
	}

	public String getClgzs() {
		return clgzs;
	}

	public void setClgzs(String clgzs) {
		this.clgzs = clgzs;
	}

	public String getHjbhs() {
		return hjbhs;
	}

	public void setHjbhs(String hjbhs) {
		this.hjbhs = hjbhs;
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

	public String getWhsyjsf() {
		return whsyjsf;
	}

	public void setWhsyjsf(String whsyjsf) {
		this.whsyjsf = whsyjsf;
	}

	public String getSwbmfmsr() {
		return swbmfmsr;
	}

	public void setSwbmfmsr(String swbmfmsr) {
		this.swbmfmsr = swbmfmsr;
	}

	public String getQtsr() {
		return qtsr;
	}

	public void setQtsr(String qtsr) {
		this.qtsr = qtsr;
	}

	public String getSljszxsr() {
		return sljszxsr;
	}

	public void setSljszxsr(String sljszxsr) {
		this.sljszxsr = sljszxsr;
	}

	public String getTqsshj() {
		return tqsshj;
	}

	public void setTqsshj(String tqsshj) {
		this.tqsshj = tqsshj;
	}

	public String getTqdfsshj() {
		return tqdfsshj;
	}

	public void setTqdfsshj(String tqdfsshj) {
		this.tqdfsshj = tqdfsshj;
	}

	public String getNsrmcs() {
		return nsrmcs;
	}

	public void setNsrmcs(String nsrmcs) {
		this.nsrmcs = nsrmcs;
	}

	public String getZsrzze() {
		return zsrzze;
	}

	public void setZsrzze(String zsrzze) {
		this.zsrzze = zsrzze;
	}

	public String getZsrzzl() {
		return zsrzzl;
	}

	public void setZsrzzl(String zsrzzl) {
		this.zsrzzl = zsrzzl;
	}

	public String getDfzze() {
		return dfzze;
	}

	public void setDfzze(String dfzze) {
		this.dfzze = dfzze;
	}

	public String getDfzzl() {
		return dfzzl;
	}

	public void setDfzzl(String dfzzl) {
		this.dfzzl = dfzzl;
	}

	public String getQyfl() {
		return qyfl;
	}

	public void setQyfl(String qyfl) {
		this.qyfl = qyfl;
	}

	public String getCkts() {
		return ckts;
	}

	public void setCkts(String ckts) {
		this.ckts = ckts;
	}

	public String getPxzd() {
		return pxzd;
	}

	public void setPxzd(String pxzd) {
		this.pxzd = pxzd;
	}

	public Integer getSl() {
		return sl;
	}

	public void setSl(Integer sl) {
		this.sl = sl;
	}

	public String getTjkj() {
		return tjkj;
	}

	public void setTjkj(String tjkj) {
		this.tjkj = tjkj;
	}

	public Integer getDw() {
		return dw;
	}

	public void setDw(Integer dw) {
		this.dw = dw;
	}

}
