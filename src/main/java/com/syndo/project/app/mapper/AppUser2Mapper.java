package com.syndo.project.app.mapper;

import java.util.List;

import com.syndo.project.app.domain.AppUser;

public interface AppUser2Mapper {
    AppUser selectById(String var1);

    List<AppUser> selectList(AppUser var1);

    int insert(AppUser var1);

    int update(AppUser var1);

    int deleteByIds(String[] var1);

    int resetPwd(String userId);
}
