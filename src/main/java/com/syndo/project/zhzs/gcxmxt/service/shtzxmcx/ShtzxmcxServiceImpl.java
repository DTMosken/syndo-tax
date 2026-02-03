package com.syndo.project.zhzs.gcxmxt.service.shtzxmcx;

import com.syndo.project.zhzs.gcxmxt.domain.shtzxmcx.Shtzxmcx;
import com.syndo.project.zhzs.gcxmxt.mapper.shtzxmcx.ShtzxmcxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShtzxmcxServiceImpl implements IShtzxmcxService {

    @Autowired(required = false)
    private ShtzxmcxMapper shtzxmcxMapper;

    /**
     * 社会投资项目列表查询
     */
    @Override
    public List<Shtzxmcx> selectList(Shtzxmcx cond) {
        List<Shtzxmcx> lists = shtzxmcxMapper.selectList(cond);
        return lists;
    }
}
