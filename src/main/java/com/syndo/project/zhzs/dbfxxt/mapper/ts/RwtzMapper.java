package com.syndo.project.zhzs.dbfxxt.mapper.ts;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Rwtz;

public interface RwtzMapper extends BaseMapper<Rwtz> {
    int insertFksx(Rwtz rwtz);
    int tzfkr(Rwtz rwtz);
    int tzfksx(Rwtz rwtz);
    int insertQx(Rwtz rwtz);
    int deleteFk(Rwtz rwtz);
}
