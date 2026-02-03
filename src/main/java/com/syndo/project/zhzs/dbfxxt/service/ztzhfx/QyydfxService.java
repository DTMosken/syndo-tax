package com.syndo.project.zhzs.dbfxxt.service.ztzhfx;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Qyydfx;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-15 10:22
 * @Description  企业用电分析
 */
public interface QyydfxService {
    public List<Qyydfx> selectList(Qyydfx qyydfx);
}
