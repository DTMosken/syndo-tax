package com.syndo.project.zhzs.gcxmxt.service.asgfcx;

import com.syndo.project.zhzs.gcxmxt.domain.asgfcx.Asgfcx;

import java.util.List;

public interface IAsgfcxService {
    /**
     * 按施工方查询列表信息
     *
     * @param cond
     * @return
     */
    List<Asgfcx> selectList(Asgfcx cond);
}
