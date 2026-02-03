package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Rsjjnsb;
import com.syndo.project.zhzs.dbfxxt.mapper.lzlgfx.RsjjnsbMapper;

@Service
public class RsjjnsbServiceImpl extends BaseService implements IRsjjnsbService {

    @Autowired
    private RsjjnsbMapper mapper;

    @Override
    public List<Rsjjnsb> selectList(Rsjjnsb entity) {
        return mapper.selectList(entity);
    }
    
    
}
