package com.syndo.project.zhzs.gcxmxt.service.xmzhcx;

import com.syndo.project.zhzs.gcxmxt.domain.xmzhcx.Xmzhcx;

import java.util.List;

public interface IXmzhcxService {
    /**
     * 企业税收税种
     *
     * @param cond
     * @return
     */
    List<Xmzhcx> selectList(Xmzhcx cond);
}
