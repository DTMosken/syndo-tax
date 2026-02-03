package com.syndo.project.zhzs.gcxmxt.mapper.jgxmcx;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.gcxmxt.domain.jgxmcx.Jgxmcx;

import java.util.List;

public interface JgxmcxMapper extends BaseMapper<Jgxmcx> {

    /**
     * 竣工项目查询列表信息
     * @author zyc
     * @date
     * @param jgxmcx
     * @return
     */
    public List<Jgxmcx> selectjList(Jgxmcx jgxmcx);
}
