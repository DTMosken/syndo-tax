package com.syndo.project.zhzs.srfxxt.mapper.xtwh;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qykwh;

import org.apache.ibatis.annotations.Param;

/**
 * 企业库维护
 *
 * @author ykc
 * @date 2020年5月20日
 */
public interface QykwhMapper extends BaseMapper<Qykwh> {

    void insertUpdateHistory(Qykwh qykwh);
    int insertDeleteHistory(@Param("array") String[] strArray, @Param("deleteBy") String deleteBy);

}
