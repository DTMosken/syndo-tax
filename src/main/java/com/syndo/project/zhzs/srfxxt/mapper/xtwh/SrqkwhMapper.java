package com.syndo.project.zhzs.srfxxt.mapper.xtwh;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.xtwh.Srqkwh;
import com.syndo.web.domain.system.Index;

public interface SrqkwhMapper extends BaseMapper<Srqkwh> {
    Index selectIndex1();
    Index selectIndex2();

    Srqkwh getBySsq(Srqkwh srqkwh);
}
