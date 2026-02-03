package com.syndo.project.zhzs.dbfxxt.service.ts;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Bdrz;
import com.syndo.project.zhzs.dbfxxt.mapper.ts.BdrzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BdrzService extends BaseService {
    @Autowired
    private BdrzMapper mapper;

    public List<Bdrz> selectList(Bdrz entity) {
        return mapper.selectList(entity);
    }
}
