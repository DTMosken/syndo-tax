package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Csjcssptffx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.CsjcssptffxMapper;

/**
 * 城市基础设施配套费分析
 */
@Service
public class CsjcssptffxServiceImpl extends BaseService implements ICsjcssptffxService {

    @Autowired
    private CsjcssptffxMapper mapper;
    
    @Override
    public List<Csjcssptffx> selectList(Csjcssptffx entity) {
        return mapper.selectList(entity);
    }

}
