package com.syndo.project.zhzs.dbfxxt.service.ztzhfx;

import com.syndo.project.zhzs.dbfxxt.domain.ztzhfx.Qyydfx;
import com.syndo.project.zhzs.dbfxxt.mapper.ztzhfx.QyydfxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-15 10:23
 * @Description  企业用电分析
 */
@Service
public class QyydfxServiceImpl implements QyydfxService {

    @Autowired
    private QyydfxMapper mapper;
    @Override
    public List<Qyydfx> selectList(Qyydfx qyydfx) {
        return mapper.selectList(qyydfx);
    }
}
