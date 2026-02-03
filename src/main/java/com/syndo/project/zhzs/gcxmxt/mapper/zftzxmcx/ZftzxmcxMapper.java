package com.syndo.project.zhzs.gcxmxt.mapper.zftzxmcx;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.gcxmxt.domain.asgfcx.Asgfcx;
import com.syndo.project.zhzs.gcxmxt.domain.zftzxmcx.Zftzxmcx;

import java.util.List;

public interface ZftzxmcxMapper extends BaseMapper<Zftzxmcx> {

    /**
     * 政府投资项目查询列表信息
     * @author zyc
     * @date
     * @param zftzxmcx
     * @return
     */
    public List<Zftzxmcx> selectjList(Zftzxmcx zftzxmcx);
}
