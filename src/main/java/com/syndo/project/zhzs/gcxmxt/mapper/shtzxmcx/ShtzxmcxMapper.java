package com.syndo.project.zhzs.gcxmxt.mapper.shtzxmcx;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.gcxmxt.domain.shtzxmcx.Shtzxmcx;

import java.util.List;

public interface ShtzxmcxMapper extends BaseMapper<Shtzxmcx> {

    /**
     * 社会投资项目查询列表信息
     * @author zyc
     * @date
     * @param shtzxmcx
     * @return
     */
    public List<Shtzxmcx> selectjList(Shtzxmcx shtzxmcx);
}
