package com.syndo.project.industry.wstb.domain;

import java.util.List;

/**
 * 网上填报 综合信息
 * 
 * @author hry
 *
 */
public class Wstb_zhxx {
	private String ID;
	private String QYMC;
	private String TYSHXYDM;
	private String QYDZ;
	private String QYDZC;
	private String QYDZL;
	private String QYDZH;
	private String SSHY;
	private String HYDM;
	private String FRXM;
	private String FRSJHM;
	private String FRLXDH;
	private String TBRXM;
	private String TBRSJHM;
	private String TBRLXDH;
	private String ZYCP;
	private String SFZJTX;
	private String GYZCZ;
	private String NPJZG;
	private String LRZE;
	private String GSWZ;
	private String PJNF;
	private String chuzuxxinp;
	private String chengzuxxinp;
	private String ydhhxxinp;
	private String yshhxxinp;
	private List<Wstb_tdxx> CHUZULST;
	private List<Wstb_tdxx> CHENGZULST;
	private List<Wstb_yshhxx> YSHHXXLST;
	private List<Wstb_ydhhxx> YDHYXXLST;
 

	public List<Wstb_tdxx> getCHENGZULST() {
		return CHENGZULST;
	}

	public void setCHENGZULST(List<Wstb_tdxx> cHENGZULST) {
		CHENGZULST = cHENGZULST;
	}

 

	public List<Wstb_yshhxx> getYSHHXXLST() {
		return YSHHXXLST;
	}

	public void setYSHHXXLST(List<Wstb_yshhxx> ySHHXXLST) {
		YSHHXXLST = ySHHXXLST;
	}

	public List<Wstb_ydhhxx> getYDHYXXLST() {
		return YDHYXXLST;
	}

	public void setYDHYXXLST(List<Wstb_ydhhxx> yDHYXXLST) {
		YDHYXXLST = yDHYXXLST;
	}

	public List<Wstb_tdxx> getCHUZULST() {
		return CHUZULST;
	}

	public void setCHUZULST(List<Wstb_tdxx> cHUZULST) {
		CHUZULST = cHUZULST;
	}

	public String getChuzuxxinp() {
		return chuzuxxinp;
	}

	public void setChuzuxxinp(String chuzuxxinp) {
		this.chuzuxxinp = chuzuxxinp;
	}
 

	public String getChengzuxxinp() {
		return chengzuxxinp;
	}

	public void setChengzuxxinp(String chengzuxxinp) {
		this.chengzuxxinp = chengzuxxinp;
	}

	public String getYshhxxinp() {
		return yshhxxinp;
	}

	public void setYshhxxinp(String yshhxxinp) {
		this.yshhxxinp = yshhxxinp;
	}
 

	public String getYdhhxxinp() {
		return ydhhxxinp;
	}

	public void setYdhhxxinp(String ydhhxxinp) {
		this.ydhhxxinp = ydhhxxinp;
	}

	public String getByshhxxs() {
		return byshhxxs;
	}

	public void setByshhxxs(String byshhxxs) {
		this.byshhxxs = byshhxxs;
	}

	private String byshhxxs;

	public String getID() {
		return ID;
	}

 

	public void setID(String iD) {
		ID = iD;
	}

	public String getQYMC() {
		return QYMC;
	}

	public void setQYMC(String qYMC) {
		QYMC = qYMC;
	}

	public String getTYSHXYDM() {
		return TYSHXYDM;
	}

	public void setTYSHXYDM(String tYSHXYDM) {
		TYSHXYDM = tYSHXYDM;
	}

	public String getQYDZ() {
		return QYDZ;
	}

	public void setQYDZ(String qYDZ) {
		QYDZ = qYDZ;
	}

	public String getQYDZC() {
		return QYDZC;
	}

	public void setQYDZC(String qYDZC) {
		QYDZC = qYDZC;
	}

	public String getQYDZL() {
		return QYDZL;
	}

	public void setQYDZL(String qYDZL) {
		QYDZL = qYDZL;
	}

	public String getQYDZH() {
		return QYDZH;
	}

	public void setQYDZH(String qYDZH) {
		QYDZH = qYDZH;
	}

	public String getSSHY() {
		return SSHY;
	}

	public void setSSHY(String sSHY) {
		SSHY = sSHY;
	}

	public String getHYDM() {
		return HYDM;
	}

	public void setHYDM(String hYDM) {
		HYDM = hYDM;
	}

	public String getFRXM() {
		return FRXM;
	}

	public void setFRXM(String fRXM) {
		FRXM = fRXM;
	}

	public String getFRSJHM() {
		return FRSJHM;
	}

	public void setFRSJHM(String fRSJHM) {
		FRSJHM = fRSJHM;
	}

	public String getFRLXDH() {
		return FRLXDH;
	}

	public void setFRLXDH(String fRLXDH) {
		FRLXDH = fRLXDH;
	}

	public String getTBRXM() {
		return TBRXM;
	}

	public void setTBRXM(String tBRXM) {
		TBRXM = tBRXM;
	}

	public String getTBRSJHM() {
		return TBRSJHM;
	}

	public void setTBRSJHM(String tBRSJHM) {
		TBRSJHM = tBRSJHM;
	}

	public String getTBRLXDH() {
		return TBRLXDH;
	}

	public void setTBRLXDH(String tBRLXDH) {
		TBRLXDH = tBRLXDH;
	}

	public String getZYCP() {
		return ZYCP;
	}

	public void setZYCP(String zYCP) {
		ZYCP = zYCP;
	}

	public String getSFZJTX() {
		return SFZJTX;
	}

	public void setSFZJTX(String sFZJTX) {
		SFZJTX = sFZJTX;
	}

	public String getGYZCZ() {
		return GYZCZ;
	}

	public void setGYZCZ(String gYZCZ) {
		GYZCZ = gYZCZ;
	}

	public String getNPJZG() {
		return NPJZG;
	}

	public void setNPJZG(String nPJZG) {
		NPJZG = nPJZG;
	}

	public String getLRZE() {
		return LRZE;
	}

	public void setLRZE(String lRZE) {
		LRZE = lRZE;
	}

	public String getGSWZ() {
		return GSWZ;
	}

	public void setGSWZ(String gSWZ) {
		GSWZ = gSWZ;
	}

	public String getPJNF() {
		return PJNF;
	}

	public void setPJNF(String pJNF) {
		PJNF = pJNF;
	}

 
	public String getPID() {
		return PID;
	}

	public void setPID(String pID) {
		PID = pID;
	}

	public String getQYZTGYZJZ() {
		return QYZTGYZJZ;
	}

	public void setQYZTGYZJZ(String qYZTGYZJZ) {
		QYZTGYZJZ = qYZTGYZJZ;
	}

	public String getQYZTNPJZGRS() {
		return QYZTNPJZGRS;
	}

	public void setQYZTNPJZGRS(String qYZTNPJZGRS) {
		QYZTNPJZGRS = qYZTNPJZGRS;
	}

	public String getQYZTYFJFZC() {
		return QYZTYFJFZC;
	}

	public void setQYZTYFJFZC(String qYZTYFJFZC) {
		QYZTYFJFZC = qYZTYFJFZC;
	}

	public String getQYZTNZHNH() {
		return QYZTNZHNH;
	}

	public void setQYZTNZHNH(String qYZTNZHNH) {
		QYZTNZHNH = qYZTNZHNH;
	}

	public String getQYZTZYYWSR() {
		return QYZTZYYWSR;
	}

	public void setQYZTZYYWSR(String qYZTZYYWSR) {
		QYZTZYYWSR = qYZTZYYWSR;
	}

	public String getQYZTSJSS() {
		return QYZTSJSS;
	}

	public void setQYZTSJSS(String qYZTSJSS) {
		QYZTSJSS = qYZTSJSS;
	}

	public String getQYZTYDL() {
		return QYZTYDL;
	}

	public void setQYZTYDL(String qYZTYDL) {
		QYZTYDL = qYZTYDL;
	}

	public String getYDHYQK() {
		return YDHYQK;
	}

	public void setYDHYQK(String yDHYQK) {
		YDHYQK = yDHYQK;
	}

	public String getNYSL() {
		return NYSL;
	}

	public void setNYSL(String nYSL) {
		NYSL = nYSL;
	}

	public String getYSHYQK() {
		return YSHYQK;
	}

	public void setYSHYQK(String ySHYQK) {
		YSHYQK = ySHYQK;
	}

	public String getSJYDMJ() {
		return SJYDMJ;
	}

	public void setSJYDMJ(String sJYDMJ) {
		SJYDMJ = sJYDMJ;
	}

	public String getJZMJ() {
		return JZMJ;
	}

	public void setJZMJ(String jZMJ) {
		JZMJ = jZMJ;
	}

	public String getSSMJ() {
		return SSMJ;
	}

	public void setSSMJ(String sSMJ) {
		SSMJ = sSMJ;
	}

	public String getYSPDJTDZMJ() {
		return YSPDJTDZMJ;
	}

	public void setYSPDJTDZMJ(String ySPDJTDZMJ) {
		YSPDJTDZMJ = ySPDJTDZMJ;
	}

	public String getTHJHDSGYZJZ() {
		return THJHDSGYZJZ;
	}

	public void setTHJHDSGYZJZ(String tHJHDSGYZJZ) {
		THJHDSGYZJZ = tHJHDSGYZJZ;
	}

	public String getTHJHDSNPJZGRS() {
		return THJHDSNPJZGRS;
	}

	public void setTHJHDSNPJZGRS(String tHJHDSNPJZGRS) {
		THJHDSNPJZGRS = tHJHDSNPJZGRS;
	}

	public String getTHJHDSYFJFZC() {
		return THJHDSYFJFZC;
	}

	public void setTHJHDSYFJFZC(String tHJHDSYFJFZC) {
		THJHDSYFJFZC = tHJHDSYFJFZC;
	}

	public String getTHJHDSNZHNH() {
		return THJHDSNZHNH;
	}

	public void setTHJHDSNZHNH(String tHJHDSNZHNH) {
		THJHDSNZHNH = tHJHDSNZHNH;
	}

	public String getSWJHDSZYYWSR() {
		return SWJHDSZYYWSR;
	}

	public void setSWJHDSZYYWSR(String sWJHDSZYYWSR) {
		SWJHDSZYYWSR = sWJHDSZYYWSR;
	}

	public String getSWJHDSSJSS() {
		return SWJHDSSJSS;
	}

	public void setSWJHDSSJSS(String sWJHDSSJSS) {
		SWJHDSSJSS = sWJHDSSJSS;
	}

	public String getGDJHDSYDL() {
		return GDJHDSYDL;
	}

	public void setGDJHDSYDL(String gDJHDSYDL) {
		GDJHDSYDL = gDJHDSYDL;
	}

	public String getZRZYJHDHDTDZMJ() {
		return ZRZYJHDHDTDZMJ;
	}

	public void setZRZYJHDHDTDZMJ(String zRZYJHDHDTDZMJ) {
		ZRZYJHDHDTDZMJ = zRZYJHDHDTDZMJ;
	}

	public String getQYZTPFL() {
		return QYZTPFL;
	}

	public void setQYZTPFL(String qYZTPFL) {
		QYZTPFL = qYZTPFL;
	}

	public String getSTHJJPFL() {
		return STHJJPFL;
	}

	public void setSTHJJPFL(String sTHJJPFL) {
		STHJJPFL = sTHJJPFL;
	}

	public String getSZXQSHYDMJ() {
		return SZXQSHYDMJ;
	}

	public void setSZXQSHYDMJ(String sZXQSHYDMJ) {
		SZXQSHYDMJ = sZXQSHYDMJ;
	}

	public String getSZXQSHYSPMJ() {
		return SZXQSHYSPMJ;
	}

	public void setSZXQSHYSPMJ(String sZXQSHYSPMJ) {
		SZXQSHYSPMJ = sZXQSHYSPMJ;
	}

	public String getSZXQSHWSPMJ() {
		return SZXQSHWSPMJ;
	}

	public void setSZXQSHWSPMJ(String sZXQSHWSPMJ) {
		SZXQSHWSPMJ = sZXQSHWSPMJ;
	}

	public String getSZXQSHDCRXM() {
		return SZXQSHDCRXM;
	}

	public void setSZXQSHDCRXM(String sZXQSHDCRXM) {
		SZXQSHDCRXM = sZXQSHDCRXM;
	}

	public String getSZXQSHSHRXM() {
		return SZXQSHSHRXM;
	}

	public void setSZXQSHSHRXM(String sZXQSHSHRXM) {
		SZXQSHSHRXM = sZXQSHSHRXM;
	}

	public String getGDJHDSYDHYQK() {
		return GDJHDSYDHYQK;
	}

	public void setGDJHDSYDHYQK(String gDJHDSYDHYQK) {
		GDJHDSYDHYQK = gDJHDSYDHYQK;
	}

	// 评价指标字段
	private String PID;
	private String QYZTGYZJZ;
	private String QYZTNPJZGRS;
	private String QYZTYFJFZC;
	private String QYZTNZHNH;
	private String QYZTZYYWSR;
	private String QYZTSJSS;
	private String QYZTYDL;
	private String YDHYQK;
	private String NYSL;
	private String YSHYQK;
	private String SJYDMJ;
	private String JZMJ;
	private String SSMJ;
	private String YSPDJTDZMJ;
	private String THJHDSGYZJZ;
	private String THJHDSNPJZGRS;
	private String THJHDSYFJFZC;
	private String THJHDSNZHNH;
	private String SWJHDSZYYWSR;
	private String SWJHDSSJSS;
	private String GDJHDSYDL;
	private String ZRZYJHDHDTDZMJ;
	private String QYZTPFL;
	private String STHJJPFL;
	private String SZXQSHYDMJ;
	private String SZXQSHYSPMJ;
	private String SZXQSHWSPMJ;
	private String SZXQSHDCRXM;
	private String SZXQSHSHRXM;
	private String GDJHDSYDHYQK;


}
