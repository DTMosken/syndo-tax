package com.syndo.project.jjyx.mapper;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.jjyx.domain.JjyxData;
import com.syndo.project.jjyx.domain.Rlt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JjyxMapper extends BaseMapper<Rlt> {
    List<Rlt> qyxxRltQy();

    List<Rlt> qyxxRltSs();

    List<JjyxData> selectJjyxData(@Param("name") String name);
    JjyxData selectJjyxDataByKey(@Param("name") String name, @Param("key") String key);
}
