package com.syndo.project.zhzs.gcxmxt.service.jzsgqygl;

import com.syndo.project.zhzs.gcxmxt.domain.jzsgqygl.Jzsgqygl;
import com.syndo.project.zhzs.gcxmxt.domain.xmgl.Xmgl;
import com.syndo.project.zhzs.gcxmxt.mapper.jzsgqygl.JzsgqyglMapper;
import com.syndo.project.zhzs.gcxmxt.mapper.xmgl.XmglMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JzsgqyglServiceImpl implements IJzsgqyglService {

    @Autowired(required = false)
    private JzsgqyglMapper jzsgqyglMapper;

    /**
     * 项目管理列表查询
     */
    @Override
    public List<Jzsgqygl> selectList(Jzsgqygl cond) {
        List<Jzsgqygl> lists = jzsgqyglMapper.selectList(cond);
        return lists;
    }
}
