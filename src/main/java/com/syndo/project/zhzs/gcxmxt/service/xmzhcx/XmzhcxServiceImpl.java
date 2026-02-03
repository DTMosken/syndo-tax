package com.syndo.project.zhzs.gcxmxt.service.xmzhcx;

import com.syndo.project.zhzs.gcxmxt.domain.xmzhcx.Xmzhcx;
import com.syndo.project.zhzs.gcxmxt.mapper.xmzhcx.XmzhcxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XmzhcxServiceImpl implements IXmzhcxService {

    @Autowired(required = false)
    private XmzhcxMapper xmzhcxMapper;

    /**
     * 项目管理列表查询
     */
    @Override
    public List<Xmzhcx> selectList(Xmzhcx cond) {
        List<Xmzhcx> lists = xmzhcxMapper.selectList(cond);
        return lists;
    }
}
