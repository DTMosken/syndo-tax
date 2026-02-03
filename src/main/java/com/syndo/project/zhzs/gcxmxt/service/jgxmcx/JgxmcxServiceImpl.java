package com.syndo.project.zhzs.gcxmxt.service.jgxmcx;

import com.syndo.project.zhzs.gcxmxt.domain.asgfcx.Asgfcx;
import com.syndo.project.zhzs.gcxmxt.domain.jgxmcx.Jgxmcx;
import com.syndo.project.zhzs.gcxmxt.mapper.asgfcx.AsgfcxMapper;
import com.syndo.project.zhzs.gcxmxt.mapper.jgxmcx.JgxmcxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JgxmcxServiceImpl implements IJgxmcxService {

    @Autowired(required = false)
    private JgxmcxMapper jgxmcxMapper;

    /**
     * 竣工项目列表查询
     */
    @Override
    public List<Jgxmcx> selectList(Jgxmcx cond) {
        List<Jgxmcx> lists = jgxmcxMapper.selectList(cond);
        return lists;
    }
}
