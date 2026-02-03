package com.syndo.project.app.mapper;

import java.util.List;

import com.syndo.project.app.domain.AppMessage;

public interface AppMessageMapper {
    AppMessage selectById(String var1);

    List<AppMessage> selectList(AppMessage var1);

    int insert(AppMessage var1);

    int update(AppMessage var1);

    int deleteByIds(String[] var1);
}
