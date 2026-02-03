package com.syndo.project.zhzs.gcxmxt.mapper.xmzhcx;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.gcxmxt.domain.xmzhcx.Xmzhcx;

import java.util.List;

public interface XmzhcxMapper extends BaseMapper<Xmzhcx> {

    /**
     * 项目管理列表查询
     * @author zyc
     * @date
     * @param entity
     * @return
     */
    public List<Xmzhcx> selectjList(Xmzhcx entity);
}
