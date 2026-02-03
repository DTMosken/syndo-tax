package com.syndo.project.zhzs.gcxmxt.mapper.ajsfcx;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.gcxmxt.domain.ajsfcx.Ajsfcx;
import com.syndo.project.zhzs.gcxmxt.domain.jzsgqygl.Jzsgqygl;

import java.util.List;

public interface AjsfcxMapper extends BaseMapper<Ajsfcx> {

    /**
     * 按建设方查询列表信息
     * @author zyc
     * @date
     * @param ajsfcx
     * @return
     */
    public List<Ajsfcx> selectjList(Ajsfcx ajsfcx);
}
