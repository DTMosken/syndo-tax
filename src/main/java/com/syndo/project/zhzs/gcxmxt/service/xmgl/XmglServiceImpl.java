package com.syndo.project.zhzs.gcxmxt.service.xmgl;

import com.syndo.project.zhzs.gcxmxt.domain.xmgl.Xmgl;
import com.syndo.project.zhzs.gcxmxt.mapper.xmgl.XmglMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XmglServiceImpl implements IXmglService {

    @Autowired(required = false)
    private XmglMapper xmglMapper;

    /**
     * 项目管理列表查询
     */
    @Override
    public List<Xmgl> selectList(Xmgl cond) {
        List<Xmgl> lists = xmglMapper.selectList(cond);
        return lists;
    }
}
