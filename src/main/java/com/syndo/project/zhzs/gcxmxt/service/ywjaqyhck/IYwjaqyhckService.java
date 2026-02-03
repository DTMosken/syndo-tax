package com.syndo.project.zhzs.gcxmxt.service.ywjaqyhck;

import com.syndo.project.zhzs.gcxmxt.domain.ywjaqyhck.Ywjaqyhck;

import java.util.List;

public interface IYwjaqyhckService {
    /**
     * 域外建安企业核查库列表信息
     *
     * @param ywjaqyhck
     * @return
     */
    List<Ywjaqyhck> selectList(Ywjaqyhck ywjaqyhck);
}
