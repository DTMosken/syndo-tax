package com.syndo.project.industry.sjys.domain;

import com.syndo.common.core.domain.BaseEntity;
/**
 * 企业得分计算
 * @author hry
 *
 */
public class Qydfjs  extends BaseEntity  {
	private String  ID;
	private String  TYSHXYBM;//统一社会信用编码
	private String  QYMC;//企业名称
	private String  SSHY;//所属行业
	private String  SSXZ;//所属乡镇
	private double  ZF;//总分
	private String  PJDJ;//评价等级
	private double  DWYDSS;//单位用地税收
	private double  DWNHXSSR;//单位能耗销售收入
	private double  WRWPFSR;//单位主要污染物排放销售收入
	private double  YFJFTRQD;//研发经费投入强度
	private double  QYLDSCL;//全员劳动生产率
	private String  CJSJ;//创建时间
	private String  XGSJ;//修改时间
	private String  CJR;//创建人
	private String  XGR;//修改人
	private double  SSSJGX;//税收实际贡献
	private double  YDMJ;//用地面积
	private double  XSSR;//销售收入
	private double  ZNH;//总能耗
	private double  ZYWRWPFZDL;//主要污染物排放总当量
	private double  YFJFZC;//研发经费支出
	private double  GYZVZ;//工业总产值（现价）
	private String  NNPJZGRS;//年平均职工人数
	private String  PJNF;//评价年份
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPJNF() {
		return PJNF;
	}
	public void setPJNF(String pJNF) {
		PJNF = pJNF;
	}
	public String getTYSHXYBM() {
		return TYSHXYBM;
	}
	public void setTYSHXYBM(String tYSHXYBM) {
		TYSHXYBM = tYSHXYBM;
	}
	public String getQYMC() {
		return QYMC;
	}
	public void setQYMC(String qYMC) {
		QYMC = qYMC;
	}
	public String getSSHY() {
		return SSHY;
	}
	public void setSSHY(String sSHY) {
		SSHY = sSHY;
	}
	public String getSSXZ() {
		return SSXZ;
	}
	public void setSSXZ(String sSXZ) {
		SSXZ = sSXZ;
	}
 
	public double getZF() {
		return ZF;
	}
	public void setZF(double zF) {
		ZF = zF;
	}
 
	public String getPJDJ() {
		return PJDJ;
	}
	public void setPJDJ(String pJDJ) {
		PJDJ = pJDJ;
	}
	 
	public String getCJSJ() {
		return CJSJ;
	}
	public void setCJSJ(String cJSJ) {
		CJSJ = cJSJ;
	}
	public String getXGSJ() {
		return XGSJ;
	}
	public void setXGSJ(String xGSJ) {
		XGSJ = xGSJ;
	}
	public String getCJR() {
		return CJR;
	}
	public void setCJR(String cJR) {
		CJR = cJR;
	}
	public String getXGR() {
		return XGR;
	}
	public void setXGR(String xGR) {
		XGR = xGR;
	}
	 
	public double getDWYDSS() {
		return DWYDSS;
	}
	public void setDWYDSS(double dWYDSS) {
		DWYDSS = dWYDSS;
	}
	public double getDWNHXSSR() {
		return DWNHXSSR;
	}
	public void setDWNHXSSR(double dWNHXSSR) {
		DWNHXSSR = dWNHXSSR;
	}
	public double getWRWPFSR() {
		return WRWPFSR;
	}
	public void setWRWPFSR(double wRWPFSR) {
		WRWPFSR = wRWPFSR;
	}
	public double getYFJFTRQD() {
		return YFJFTRQD;
	}
	public void setYFJFTRQD(double yFJFTRQD) {
		YFJFTRQD = yFJFTRQD;
	}
	public double getQYLDSCL() {
		return QYLDSCL;
	}
	public void setQYLDSCL(double qYLDSCL) {
		QYLDSCL = qYLDSCL;
	}
	public double getSSSJGX() {
		return SSSJGX;
	}
	public void setSSSJGX(double sSSJGX) {
		SSSJGX = sSSJGX;
	}
	public double getYDMJ() {
		return YDMJ;
	}
	public void setYDMJ(double yDMJ) {
		YDMJ = yDMJ;
	}
	public double getXSSR() {
		return XSSR;
	}
	public void setXSSR(double xSSR) {
		XSSR = xSSR;
	}
	public double getZNH() {
		return ZNH;
	}
	public void setZNH(double zNH) {
		ZNH = zNH;
	}
	public double getZYWRWPFZDL() {
		return ZYWRWPFZDL;
	}
	public void setZYWRWPFZDL(double zYWRWPFZDL) {
		ZYWRWPFZDL = zYWRWPFZDL;
	}
	public double getYFJFZC() {
		return YFJFZC;
	}
	public void setYFJFZC(double yFJFZC) {
		YFJFZC = yFJFZC;
	}
	public double getGYZVZ() {
		return GYZVZ;
	}
	public void setGYZVZ(double gYZVZ) {
		GYZVZ = gYZVZ;
	}
	public String getNNPJZGRS() {
		return NNPJZGRS;
	}
	public void setNNPJZGRS(String nNPJZGRS) {
		NNPJZGRS = nNPJZGRS;
	}
	
	
 
	@Override
	public String toString() {
		return "Qydfjs [ID=" + ID + ", TYSHXYBM=" + TYSHXYBM + ", QYMC=" + QYMC + ", SSHY=" + SSHY + ", SSXZ=" + SSXZ
				+ ", ZF=" + ZF + ", PJDJ=" + PJDJ + ", DWYDSS=" + DWYDSS + ", DWNHXSSR=" + DWNHXSSR + ", WRWPFSR="
				+ WRWPFSR + ", YFJFTRQD=" + YFJFTRQD + ", QYLDSCL=" + QYLDSCL + ", CJSJ=" + CJSJ + ", XGSJ=" + XGSJ
				+ ", CJR=" + CJR + ", XGR=" + XGR + ", SSSJGX=" + SSSJGX + ", YDMJ=" + YDMJ + ", XSSR=" + XSSR
				+ ", ZNH=" + ZNH + ", ZYWRWPFZDL=" + ZYWRWPFZDL + ", YFJFZC=" + YFJFZC + ", GYZVZ=" + GYZVZ
				+ ", NNPJZGRS=" + NNPJZGRS + "]";
	}
	
}
