package com.syndo.project.zhzs.gcxmxt.service.zftzxmcx;

import com.syndo.project.zhzs.gcxmxt.domain.asgfcx.Asgfcx;
import com.syndo.project.zhzs.gcxmxt.domain.zftzxmcx.Zftzxmcx;

import java.util.List;

public interface IZftzxmcxService {
    /**
     * 政府投资项目查询列表信息
     *
     * @param cond
     * @return
     */
    List<Zftzxmcx> selectList(Zftzxmcx cond);
}
