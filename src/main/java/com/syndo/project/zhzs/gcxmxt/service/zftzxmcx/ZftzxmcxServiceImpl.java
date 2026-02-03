package com.syndo.project.zhzs.gcxmxt.service.zftzxmcx;

import com.syndo.project.zhzs.gcxmxt.domain.asgfcx.Asgfcx;
import com.syndo.project.zhzs.gcxmxt.domain.zftzxmcx.Zftzxmcx;
import com.syndo.project.zhzs.gcxmxt.mapper.asgfcx.AsgfcxMapper;
import com.syndo.project.zhzs.gcxmxt.mapper.zftzxmcx.ZftzxmcxMapper;
import com.syndo.project.zhzs.gcxmxt.service.asgfcx.IAsgfcxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZftzxmcxServiceImpl implements IZftzxmcxService {

    @Autowired(required = false)
    private ZftzxmcxMapper zftzxmcxMapper;

    /**
     * 政府投资项目列表查询
     */
    @Override
    public List<Zftzxmcx> selectList(Zftzxmcx cond) {
        List<Zftzxmcx> lists = zftzxmcxMapper.selectList(cond);
        return lists;
    }
}
