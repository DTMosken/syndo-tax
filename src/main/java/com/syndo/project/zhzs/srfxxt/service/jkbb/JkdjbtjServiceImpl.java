package com.syndo.project.zhzs.srfxxt.service.jkbb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkdjb;
import com.syndo.project.zhzs.srfxxt.mapper.jkbb.JkdjbtjMapper;

/**
 * 金库多级表统计
 */
@Service
public class JkdjbtjServiceImpl extends BaseService implements IJkdjbtjService {

    @Autowired
    private JkdjbtjMapper mapper;
    
    @Override
    public List<Jkdjb> selectList(Jkdjb entity) {
        return mapper.selectList(entity);
    }

    
}
