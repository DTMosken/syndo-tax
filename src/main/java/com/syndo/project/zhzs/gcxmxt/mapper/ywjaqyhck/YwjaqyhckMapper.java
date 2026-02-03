package com.syndo.project.zhzs.gcxmxt.mapper.ywjaqyhck;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.gcxmxt.domain.ywjaqyhck.Ywjaqyhck;

import java.util.List;

public interface YwjaqyhckMapper extends BaseMapper<Ywjaqyhck> {

    /**
     * 域外建安企业核查库列表信息
     * @author zyc
     * @date
     * @param ywjaqyhck
     * @return
     */
    public List<Ywjaqyhck> selectjList(Ywjaqyhck ywjaqyhck);
}
