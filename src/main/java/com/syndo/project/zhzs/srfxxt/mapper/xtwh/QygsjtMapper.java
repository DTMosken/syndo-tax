package com.syndo.project.zhzs.srfxxt.mapper.xtwh;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Qygsjt;

import org.apache.ibatis.annotations.Param;

/**
 * 企业归属集团
 *
 */
public interface QygsjtMapper extends BaseMapper<Qygsjt> {

    void insertUpdateHistory(Qygsjt qygsjt);
    void insertDeleteHistory(@Param("array") String[] strArray, @Param("deleteBy") String deleteBy);

}
