package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Tdqlrbd;
import com.syndo.project.zhzs.dbfxxt.mapper.lzlgfx.TdqlrbdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lvd
 * @date 2021-03-31 15:56
 * @Description 土地权利人比对
 */
@Service
public class TdqlrbdServiceImpl extends BaseService implements TdqlrbdService {

    @Autowired
    private TdqlrbdMapper mapper;

    @Override
    public List<Tdqlrbd> selectList(Tdqlrbd entity) {
        return mapper.selectList(entity);
    }
}
