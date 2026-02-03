package com.syndo.project.zhzs.gcxmxt.service.gcxmhck;

import com.syndo.project.zhzs.gcxmxt.domain.gcxmhck.Gcxmhck;

import java.util.List;

public interface IGcxmhckService {
    /**
     * 工程项目核查库列表信息
     *
     * @param cond
     * @return
     */
    List<Gcxmhck> selectList(Gcxmhck cond);
}
