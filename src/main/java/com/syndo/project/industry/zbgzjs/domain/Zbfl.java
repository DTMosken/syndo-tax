package com.syndo.project.industry.zbgzjs.domain;

/**
 * 指标分类
 * 
 * @author hry
 *
 */
public class Zbfl {
	String  ID;
	String  PID;
	String MLMC;
	String LX;
 
 

	public String getMLMC() {
		return MLMC;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPID() {
		return PID;
	}

	public void setPID(String pID) {
		PID = pID;
	}

	public void setMLMC(String mLMC) {
		MLMC = mLMC;
	}

	public String getLX() {
		return LX;
	}

	public void setLX(String lX) {
		LX = lX;
	}
}
