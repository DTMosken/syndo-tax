package com.syndo.project.zhzs.gcxmxt.mapper.gcxmhck;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.gcxmxt.domain.gcxmhck.Gcxmhck;

import java.util.List;

public interface GcxmhckMapper extends BaseMapper<Gcxmhck> {

    /**
     * 工程项目核查库列表信息
     * @author zyc
     * @date
     * @param gcxmhck
     * @return
     */
    public List<Gcxmhck> selectjList(Gcxmhck gcxmhck);
}
