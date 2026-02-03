package com.syndo.project.zhzs.czjbmfg.mapper;

import java.util.List;

import com.syndo.common.core.domain.entity.Role;
import com.syndo.project.zhzs.czjbmfg.domain.Czglzxkhzjff;
import com.syndo.project.zhzs.czjbmfg.domain.Czzxzjbf;
import org.apache.ibatis.annotations.Param;

/**
 * 角色表 数据层
 * 
 * @author admin
 */
public interface CzjbmfgMapper {


    List<Czglzxkhzjff> selectList(Czglzxkhzjff czglzxkhzjff);

    int insertCzglzxkhzjff(Czglzxkhzjff czglzxkhzjff);

    Czglzxkhzjff selectCzglzxkhzjffById(String khid);

    Integer updateCzglzxkhzjff(Czglzxkhzjff cz);

    Integer deleteKhzjffByIds(@Param("ids") String[] split);

    List<Czzxzjbf> selectCzzxzjbfList(Czzxzjbf czzxzjbf);

    int insertCzzxzjbf(Czzxzjbf czzxzjbf);

    Czzxzjbf selectCzzxzjbfById(String khid);

    Integer updateCzzxzjbf(Czzxzjbf cz);

    Integer deleteCzzxzjbfByIds(@Param("ids") String[] split);

}
