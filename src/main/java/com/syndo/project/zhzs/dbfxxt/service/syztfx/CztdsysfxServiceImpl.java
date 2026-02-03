package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Cztdsysfx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.CztdsysfxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-06 11:19
 * @Description 城镇土地使用税比对分析
 */
@Service
public class CztdsysfxServiceImpl extends BaseService implements CztdsysfxService{

    @Autowired
    private CztdsysfxMapper mapper;

    @Override
    public List<Cztdsysfx> selectList(Cztdsysfx entity) {
        return mapper.selectList(entity);
    }
}
