package com.syndo.project.zhzs.gcxmxt.mapper.jzsgqygl;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.gcxmxt.domain.jzsgqygl.Jzsgqygl;
import com.syndo.project.zhzs.gcxmxt.domain.xmgl.Xmgl;

import java.util.List;

public interface JzsgqyglMapper extends BaseMapper<Jzsgqygl> {

    /**
     * 项目管理列表查询
     * @author zyc
     * @date
     * @param jzsgqygl
     * @return
     */
    public List<Jzsgqygl> selectjList(Jzsgqygl jzsgqygl);
}
