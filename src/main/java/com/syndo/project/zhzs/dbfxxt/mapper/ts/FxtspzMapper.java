package com.syndo.project.zhzs.dbfxxt.mapper.ts;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Fxtspz;

import java.util.List;

public interface FxtspzMapper extends BaseMapper<Fxtspz> {

    List<Fxtspz> selectFxtspz();

    int saveTsrq(Fxtspz fxtspz);

    int saveFksx(Fxtspz fxtspz);
}
