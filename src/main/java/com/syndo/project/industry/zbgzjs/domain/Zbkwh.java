package com.syndo.project.industry.zbgzjs.domain;

/**
 * 指标维护
 * @author hry
 *
 */
public class Zbkwh {
	String ID;
	String FLMLID;//分类目录编码
	String FLMC;//分类目录名称
	String ZBMC;//指标名称
	String ZBSM;//指标说明
	String PFFS;//评分方式，1:计算公式;2:直接打分
	String JSGS;//计算公式
	Integer FZSX;//分值上限
	Integer FZXX;//分值下限
	String PFSM;//评分说明
	String YXBZ;//有效标志，Y有效；N无效
	
	public String getFLMC() {
		return FLMC;
	}
	public void setFLMC(String fLMC) {
		FLMC = fLMC;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getFLMLID() {
		return FLMLID;
	}
	public void setFLMLID(String fLMLID) {
		FLMLID = fLMLID;
	}
	public String getZBMC() {
		return ZBMC;
	}
	public void setZBMC(String zBMC) {
		ZBMC = zBMC;
	}
	public String getZBSM() {
		return ZBSM;
	}
	public void setZBSM(String zBSM) {
		ZBSM = zBSM;
	}
	public String getPFFS() {
		return PFFS;
	}
	public void setPFFS(String pFFS) {
		PFFS = pFFS;
	}
	public String getJSGS() {
		return JSGS;
	}
	public void setJSGS(String jSGS) {
		JSGS = jSGS;
	}
	 
	public Integer getFZSX() {
		return FZSX;
	}
	public void setFZSX(Integer fZSX) {
		FZSX = fZSX;
	}
	public Integer getFZXX() {
		return FZXX;
	}
	public void setFZXX(Integer fZXX) {
		FZXX = fZXX;
	}
	public String getPFSM() {
		return PFSM;
	}
	public void setPFSM(String pFSM) {
		PFSM = pFSM;
	}
	public String getYXBZ() {
		return YXBZ;
	}
	public void setYXBZ(String yXBZ) {
		YXBZ = yXBZ;
	}

	 

}
