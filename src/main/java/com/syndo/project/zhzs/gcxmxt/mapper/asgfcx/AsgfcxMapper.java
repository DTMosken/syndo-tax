package com.syndo.project.zhzs.gcxmxt.mapper.asgfcx;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.gcxmxt.domain.asgfcx.Asgfcx;

import java.util.List;

public interface AsgfcxMapper extends BaseMapper<Asgfcx> {

    /**
     * 按建设方查询列表信息
     * @author zyc
     * @date
     * @param asgfcx
     * @return
     */
    public List<Asgfcx> selectjList(Asgfcx asgfcx);
}
