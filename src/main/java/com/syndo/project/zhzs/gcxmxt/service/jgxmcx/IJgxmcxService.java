package com.syndo.project.zhzs.gcxmxt.service.jgxmcx;

import com.syndo.project.zhzs.gcxmxt.domain.jgxmcx.Jgxmcx;

import java.util.List;

public interface IJgxmcxService {
    /**
     * 竣工项目查询列表信息
     *
     * @param cond
     * @return
     */
    List<Jgxmcx> selectList(Jgxmcx cond);
}
