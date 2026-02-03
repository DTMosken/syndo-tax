package com.syndo.project.zhzs.dbfxxt.domain.syztfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;
import com.syndo.project.zhzs.dbfxxt.domain.ts.TsBase;

/**
 * 商品房销售税源比对
 * 
 *
 */
public class Spfxssybd extends TsBase {

	private static final long serialVersionUID = 1L;
	@Excel(name = "企业名称",sort = 1)
	private String qymc;//开发商
	@Excel(name = "税款所属期起",sort = 2)
	private String skssqq;
	@Excel(name = "税款所属期止",sort = 3)
	private String skssqz;
	@Excel(name = "包含项目",sort = 4)
	private String xmmc;//项目名称
	@Excel(name = "面积",sort = 5)
	private String mj;
	@Excel(name = "总金额",sort = 6)
	private String zje;
	@Excel(name = "实缴金额",sort = 7)
	private String sjje;
	@Excel(name = "应缴金额",sort = 8)
	private String yjje;
	@Excel(name = "应缴差额",sort = 9)
	private String yjce;
	
	private String yfk;
	private String sl;//税率
	private String zzjnje;
	private String zzjnce;
	
	private String qysj;//签约时间
	private String objId;
	private String ywlx;
	private String fwjg;
	private String fkfs;
	private String zl;
	private String ck;
	private String sfqj;
	private String cedy;
	private String cexy;
	private String zzcedy;
	private String zzcexy;
	private String jsyj;
	private String jsce;
	
	private String djsj;//确定使用首付款还是总价款的时间节点

	private String ptbzzzmj;
	private String ptbzzzsfk;
	private String ptbzzzfwjz;
	private String fptbzzzmj;
	private String fptbzzzsfk;
	private String fptbbzzfwjz;
	private String yyyfmj;
	private String yyyfsfk;
	private String yyyffwjz;
	private String qtfcmj;
	private String qtfcsfk;
	private String qtfcfwjz;
	private String flag;// 1.普通标准住宅 2.非普通标准住宅 3.营业用房 4.其他房产

	private String[] content;
	private String sfk;
	private String fh;
	private String gmr;
	private String fwyt;
	private String hth;
	
	private String spfmj;//建筑面积
	private String spfzje;//总价
	private String slrq;
	private String zrmc;//自然幢名称

	public String getQymc() {
		return qymc;
	}

	public void setQymc(String qymc) {
		this.qymc = qymc;
	}

	public String getMj() {
		return mj;
	}

	public void setMj(String mj) {
		this.mj = mj;
	}

	public String getYfk() {
		return yfk;
	}

	public void setYfk(String yfk) {
		this.yfk = yfk;
	}

	public String getZje() {
		return zje;
	}

	public void setZje(String zje) {
		this.zje = zje;
	}

	public String getSjje() {
		return sjje;
	}

	public void setSjje(String sjje) {
		this.sjje = sjje;
	}

	public String getSl() {
		return sl;
	}

	public void setSl(String sl) {
		this.sl = sl;
	}

	public String getYjje() {
		return yjje;
	}

	public void setYjje(String yjje) {
		this.yjje = yjje;
	}

	public String getYjce() {
		return yjce;
	}

	public void setYjce(String yjce) {
		this.yjce = yjce;
	}

	public String getZzjnje() {
		return zzjnje;
	}

	public void setZzjnje(String zzjnje) {
		this.zzjnje = zzjnje;
	}

	public String getZzjnce() {
		return zzjnce;
	}

	public void setZzjnce(String zzjnce) {
		this.zzjnce = zzjnce;
	}

	public String getSkssqq() {
		return skssqq;
	}

	public void setSkssqq(String skssqq) {
		this.skssqq = skssqq;
	}

	public String getSkssqz() {
		return skssqz;
	}

	public void setSkssqz(String skssqz) {
		this.skssqz = skssqz;
	}

	public String getQysj() {
		return qysj;
	}

	public void setQysj(String qysj) {
		this.qysj = qysj;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public String getYwlx() {
		return ywlx;
	}

	public void setYwlx(String ywlx) {
		this.ywlx = ywlx;
	}

	public String getFwjg() {
		return fwjg;
	}

	public void setFwjg(String fwjg) {
		this.fwjg = fwjg;
	}

	public String getFkfs() {
		return fkfs;
	}

	public void setFkfs(String fkfs) {
		this.fkfs = fkfs;
	}

	public String getZl() {
		return zl;
	}

	public void setZl(String zl) {
		this.zl = zl;
	}

	public String getCk() {
		return ck;
	}

	public void setCk(String ck) {
		this.ck = ck;
	}

	public String getSfqj() {
		return sfqj;
	}

	public void setSfqj(String sfqj) {
		this.sfqj = sfqj;
	}

	public String getCedy() {
		return cedy;
	}

	public void setCedy(String cedy) {
		this.cedy = cedy;
	}

	public String getCexy() {
		return cexy;
	}

	public void setCexy(String cexy) {
		this.cexy = cexy;
	}

	public String getZzcedy() {
		return zzcedy;
	}

	public void setZzcedy(String zzcedy) {
		this.zzcedy = zzcedy;
	}

	public String getZzcexy() {
		return zzcexy;
	}

	public void setZzcexy(String zzcexy) {
		this.zzcexy = zzcexy;
	}

	public String getJsyj() {
		return jsyj;
	}

	public void setJsyj(String jsyj) {
		this.jsyj = jsyj;
	}

	public String getJsce() {
		return jsce;
	}

	public void setJsce(String jsce) {
		this.jsce = jsce;
	}

	public String getDjsj() {
		return djsj;
	}

	public void setDjsj(String djsj) {
		this.djsj = djsj;
	}

	public String getPtbzzzmj() {
		return ptbzzzmj;
	}

	public void setPtbzzzmj(String ptbzzzmj) {
		this.ptbzzzmj = ptbzzzmj;
	}

	public String getPtbzzzsfk() {
		return ptbzzzsfk;
	}

	public void setPtbzzzsfk(String ptbzzzsfk) {
		this.ptbzzzsfk = ptbzzzsfk;
	}

	public String getPtbzzzfwjz() {
		return ptbzzzfwjz;
	}

	public void setPtbzzzfwjz(String ptbzzzfwjz) {
		this.ptbzzzfwjz = ptbzzzfwjz;
	}

	public String getFptbzzzmj() {
		return fptbzzzmj;
	}

	public void setFptbzzzmj(String fptbzzzmj) {
		this.fptbzzzmj = fptbzzzmj;
	}

	public String getFptbzzzsfk() {
		return fptbzzzsfk;
	}

	public void setFptbzzzsfk(String fptbzzzsfk) {
		this.fptbzzzsfk = fptbzzzsfk;
	}

	public String getFptbbzzfwjz() {
		return fptbbzzfwjz;
	}

	public void setFptbbzzfwjz(String fptbbzzfwjz) {
		this.fptbbzzfwjz = fptbbzzfwjz;
	}

	public String getYyyfmj() {
		return yyyfmj;
	}

	public void setYyyfmj(String yyyfmj) {
		this.yyyfmj = yyyfmj;
	}

	public String getYyyfsfk() {
		return yyyfsfk;
	}

	public void setYyyfsfk(String yyyfsfk) {
		this.yyyfsfk = yyyfsfk;
	}

	public String getYyyffwjz() {
		return yyyffwjz;
	}

	public void setYyyffwjz(String yyyffwjz) {
		this.yyyffwjz = yyyffwjz;
	}

	public String getQtfcmj() {
		return qtfcmj;
	}

	public void setQtfcmj(String qtfcmj) {
		this.qtfcmj = qtfcmj;
	}

	public String getQtfcsfk() {
		return qtfcsfk;
	}

	public void setQtfcsfk(String qtfcsfk) {
		this.qtfcsfk = qtfcsfk;
	}

	public String getQtfcfwjz() {
		return qtfcfwjz;
	}

	public void setQtfcfwjz(String qtfcfwjz) {
		this.qtfcfwjz = qtfcfwjz;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String[] getContent() {
		return content;
	}

	public void setContent(String[] content) {
		this.content = content;
	}

	public String getSfk() {
		return sfk;
	}

	public void setSfk(String sfk) {
		this.sfk = sfk;
	}

	public String getFh() {
		return fh;
	}

	public void setFh(String fh) {
		this.fh = fh;
	}

	public String getGmr() {
		return gmr;
	}

	public void setGmr(String gmr) {
		this.gmr = gmr;
	}

	public String getFwyt() {
		return fwyt;
	}

	public void setFwyt(String fwyt) {
		this.fwyt = fwyt;
	}

	public String getHth() {
		return hth;
	}

	public void setHth(String hth) {
		this.hth = hth;
	}

	public String getXmmc() {
		return xmmc;
	}

	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}

	public String getSpfmj() {
		return spfmj;
	}

	public void setSpfmj(String spfmj) {
		this.spfmj = spfmj;
	}

	public String getSpfzje() {
		return spfzje;
	}

	public void setSpfzje(String spfzje) {
		this.spfzje = spfzje;
	}

	public String getSlrq() {
		return slrq;
	}

	public void setSlrq(String slrq) {
		this.slrq = slrq;
	}

	public String getZrmc() {
		return zrmc;
	}

	public void setZrmc(String zrmc) {
		this.zrmc = zrmc;
	}

}
