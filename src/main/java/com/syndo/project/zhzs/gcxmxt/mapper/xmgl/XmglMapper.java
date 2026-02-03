package com.syndo.project.zhzs.gcxmxt.mapper.xmgl;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.gcxmxt.domain.xmgl.Xmgl;
import com.syndo.project.zhzs.gcxmxt.domain.xmzhcx.Xmzhcx;

import java.util.List;

public interface XmglMapper extends BaseMapper<Xmgl> {

    /**
     * 项目管理列表查询
     * @author zyc
     * @date
     * @param xmgl
     * @return
     */
    public List<Xmgl> selectjList(Xmgl xmgl);
}
