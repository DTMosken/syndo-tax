package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Kpsjdr;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.KpsjdrMapper;

/**
 * 房土两税精细化管理-开票数据导入
 */
@Service
public class KpsjdrServiceImpl extends BaseService implements IKpsjdrService {

    @Autowired
    private KpsjdrMapper mapper;

    @Override
    public List<Kpsjdr> selectList(Kpsjdr entity) {
        return mapper.selectList(entity);
    }

    @Override
    public int inster(Kpsjdr entity) {
        return mapper.insert(entity);
    }

    @Override
    public Kpsjdr selectById(String id) {
        return mapper.selectById(id);
    }

    @Override
    public int update(Kpsjdr entity) {
        return mapper.update(entity);
    }

    @Override
    public int delete(String ids) {
        return mapper.deleteByIds(Convert.toStrArray(ids));
    }
    
    
}
