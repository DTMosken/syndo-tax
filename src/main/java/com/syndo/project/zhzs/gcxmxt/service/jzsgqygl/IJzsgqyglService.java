package com.syndo.project.zhzs.gcxmxt.service.jzsgqygl;

import com.syndo.project.zhzs.gcxmxt.domain.jzsgqygl.Jzsgqygl;
import com.syndo.project.zhzs.gcxmxt.domain.xmgl.Xmgl;

import java.util.List;

public interface IJzsgqyglService {
    /**
     * 企业税收税种
     *
     * @param cond
     * @return
     */
    List<Jzsgqygl> selectList(Jzsgqygl cond);
}
