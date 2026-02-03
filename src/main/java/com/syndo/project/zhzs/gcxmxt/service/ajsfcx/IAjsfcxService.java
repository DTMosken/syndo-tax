package com.syndo.project.zhzs.gcxmxt.service.ajsfcx;

import com.syndo.project.zhzs.gcxmxt.domain.ajsfcx.Ajsfcx;

import java.util.List;

public interface IAjsfcxService {
    /**
     * 按建设方查询列表信息
     *
     * @param cond
     * @return
     */
    List<Ajsfcx> selectList(Ajsfcx cond);
}
