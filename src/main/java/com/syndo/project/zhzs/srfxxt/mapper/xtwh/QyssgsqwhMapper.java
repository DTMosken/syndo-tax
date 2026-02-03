package com.syndo.project.zhzs.srfxxt.mapper.xtwh;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qyssgsqwh;

import org.apache.ibatis.annotations.Param;

/**
 *企业税收归属权维护
 *
 */
public interface QyssgsqwhMapper extends BaseMapper<Qyssgsqwh> {

    void insertUpdateHistory(Qyssgsqwh qyssgsqwh);
    void insertDeleteHistory(@Param("array") String[] strArray, @Param("deleteBy") String deleteBy);

}
