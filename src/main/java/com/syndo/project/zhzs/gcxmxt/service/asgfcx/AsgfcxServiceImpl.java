package com.syndo.project.zhzs.gcxmxt.service.asgfcx;

import com.syndo.project.zhzs.gcxmxt.domain.asgfcx.Asgfcx;
import com.syndo.project.zhzs.gcxmxt.mapper.asgfcx.AsgfcxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsgfcxServiceImpl implements IAsgfcxService {

    @Autowired(required = false)
    private AsgfcxMapper asgfcxMapper;

    /**
     * 项目管理列表查询
     */
    @Override
    public List<Asgfcx> selectList(Asgfcx cond) {
        List<Asgfcx> lists = asgfcxMapper.selectList(cond);
        return lists;
    }
}
