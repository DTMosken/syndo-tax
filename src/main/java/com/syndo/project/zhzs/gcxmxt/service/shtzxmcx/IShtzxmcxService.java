package com.syndo.project.zhzs.gcxmxt.service.shtzxmcx;

import com.syndo.project.zhzs.gcxmxt.domain.shtzxmcx.Shtzxmcx;

import java.util.List;

public interface IShtzxmcxService {
    /**
     * 按社会投资项目查询列表信息
     *
     * @param cond
     * @return
     */
    List<Shtzxmcx> selectList(Shtzxmcx cond);
}
