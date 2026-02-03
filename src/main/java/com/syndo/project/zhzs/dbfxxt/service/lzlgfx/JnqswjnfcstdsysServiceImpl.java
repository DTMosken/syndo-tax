package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Jnqswjnfcstdsys;
import com.syndo.project.zhzs.dbfxxt.mapper.lzlgfx.JnqswjnfcstdsysMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JnqswjnfcstdsysServiceImpl implements IJnqswjnfcstdsysService {
    @Autowired
    private JnqswjnfcstdsysMapper mapper;

    @Override
    public List<Jnqswjnfcstdsys> selectList(Jnqswjnfcstdsys entity) {
        return mapper.selectList(entity);
    }
}
