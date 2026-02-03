package com.syndo.project.zhzs.dbfxxt.service.xtgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.xtgl.Lgyjgwh;
import com.syndo.project.zhzs.dbfxxt.mapper.xtgl.LgyjgwhMapper;
/**
 * 对比分析系统-系统管理-旅馆业价格维护
 */
@Service
public class LgyjgwhServiceImpl extends BaseService implements ILgyjgwhService {

    @Autowired
    private LgyjgwhMapper mapper;
    
    @Override
    public List<Lgyjgwh> selectList(Lgyjgwh entity) {
        if(null!=entity.getFlagjgwh()){  //如果不是null则进行批量插入
            mapper.insert(entity);
        }
        return mapper.selectList(entity);
    }

    @Override
    public int update(Lgyjgwh entity) {
        return mapper.update(entity);
    }
    
}
