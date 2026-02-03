package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Ccsjnqsfx;
import com.syndo.project.zhzs.dbfxxt.mapper.syztfx.CcsjnqsfxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-08 15:34
 * @Description 车船税缴纳趋势分析
 */
@Service
public class CcsjnqsfxServiceImpl extends BaseService implements CcsjnqsfxService {

    @Autowired
    private CcsjnqsfxMapper mapper;

    @Override
    public List<Ccsjnqsfx> selectList(Ccsjnqsfx entity) {
        return mapper.selectList(entity);
    }
}
