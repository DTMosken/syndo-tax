package com.syndo.project.industry.wstb.service;

import java.util.List;
import java.util.Map;

import com.syndo.project.industry.wstb.domain.Wstb_pizj;
import com.syndo.project.industry.wstb.domain.Wstb_tdxx;
import com.syndo.project.industry.wstb.domain.Wstb_ydhhxx;
import com.syndo.project.industry.wstb.domain.Wstb_yshhxx;
import com.syndo.project.industry.wstb.domain.Wstb_zhxx;


/**
 * 网上填报
 * @author hry
 *
 */
public interface IWstbService {
	
	 
	
	void updateSave(Wstb_zhxx entity);
	void updateSavePjzb(Wstb_zhxx entity);
	Wstb_zhxx GetWstb(Wstb_zhxx jbxx);
	Wstb_pizj Getpjxx(Wstb_pizj pjzb);
	/**
	 * 删除子表
	 * 
	 * @param tableName
	 * @param pid
	 */
	void deleteByIds(Map map);

	/**
	 * add 土地信息子表
	 * @param tdxx
	 */
	void insertTdxx(Wstb_tdxx tdxx);

	/**
	 * add 用电信息
	 * @param ydxx
	 */
	void insertYdhhxx(Wstb_ydhhxx ydxx);

	/**
	 * add 用水信息
	 * @param ysxx
	 */
	void insertYshhxx(Wstb_yshhxx ysxx);
	
	/**
	 * 获取出租信息
	 * @param PID
	 * @return
	 */
	List<Wstb_tdxx> GetWstbChuzu(String PID);
	
	/**
	 * 获取承租信息
	 * @param PID
	 * @return
	 */
	List<Wstb_tdxx> GetWstbChengzu(String PID);
	
	/**
	 * 获取用水户号信息
	 * @param PID
	 * @return
	 */
	List<Wstb_yshhxx> GetWstbYshhxx(String PID);
	
	/**
	 * 获取用电户号信息
	 * @param PID
	 * @return
	 */
	List<Wstb_ydhhxx> GetWstbYdhhxx(String PID);
}
