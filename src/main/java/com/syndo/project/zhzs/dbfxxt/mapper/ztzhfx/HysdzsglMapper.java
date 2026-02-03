package com.syndo.project.zhzs.dbfxxt.mapper.ztzhfx;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Hysdzsgl;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-14 10:19
 * @Description 行业税电指数管理
 */
public interface HysdzsglMapper extends BaseMapper<Hysdzsgl> {

    //设置行业税电指数管理
    int setSave(Hysdzsgl entity);

    int beforeSetSave(Hysdzsgl entity);

    int setSaveUpdate(Hysdzsgl entity);

    // Hysdzsgl selectById(@Param("id") String id, @Param("ydid") String ydid);
}
