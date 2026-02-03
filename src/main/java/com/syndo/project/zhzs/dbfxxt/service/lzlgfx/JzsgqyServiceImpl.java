package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.JzsgqySw;
import com.syndo.project.zhzs.dbfxxt.mapper.lzlgfx.JzsgqyMapper;

@Service
public class JzsgqyServiceImpl extends BaseService implements IJzsgqyService {

    @Autowired
    private JzsgqyMapper mapper;

    @Override
    public List<JzsgqySw> selectList(JzsgqySw entity) {
        return mapper.selectList(entity);
    }
    
    
}
