package com.syndo.project.zhzs.dbfxxt.mapper.ts;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Zbxx;

import java.util.List;

public interface ZbxxMapper extends BaseMapper<Zbxx> {

    Zbxx selectByZbdm(String zbdm);

    List<Zbxx> selectAllZbxx();
}
