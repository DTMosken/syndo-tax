package com.syndo.project.zhzs.gcxmxt.service.xmgl;

import com.syndo.project.zhzs.gcxmxt.domain.xmgl.Xmgl;
import com.syndo.project.zhzs.gcxmxt.domain.xmzhcx.Xmzhcx;

import java.util.List;

public interface IXmglService {
    /**
     * 企业税收税种
     *
     * @param cond
     * @return
     */
    List<Xmgl> selectList(Xmgl cond);
}
