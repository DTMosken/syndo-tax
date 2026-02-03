package com.syndo.project.zhzs.czjbmfg.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.syndo.common.core.domain.AjaxResult;
import com.syndo.common.core.domain.entity.Role;
import com.syndo.project.zhzs.czjbmfg.domain.Czglzxkhzjff;
import com.syndo.project.zhzs.czjbmfg.domain.Czzxzjbf;
import com.syndo.system.domain.UserRole;

/**
 * 角色业务层
 * 
 * @author admin
 */
public interface ICzjbmfgService {

	//财政各类专项考核资金发放
	List<Czglzxkhzjff> selectList(Czglzxkhzjff czglzxkhzjff);

	int insertCzglzxkhzjff(Czglzxkhzjff czglzxkhzjff);

    Czglzxkhzjff selectCzglzxkhzjffById(String khid);

	Integer updateCzglzxkhzjff(Czglzxkhzjff cz);

	Integer deleteKhzjffByIds(String[] split);

	//财政专项资金拨付
	List<Czzxzjbf> selectCzzxzjbfList(Czzxzjbf czzxzjbf);

	int insertCzzxzjbf(Czzxzjbf czzxzjbf);

	Czzxzjbf selectCzzxzjbfById(String khid);

	Integer updateCzzxzjbf(Czzxzjbf cz);

	Integer deleteCzzxzjbfByIds(String[] split);
}
