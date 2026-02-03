package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Wblkqy;
import com.syndo.project.zhzs.dbfxxt.mapper.lzlgfx.WblkqyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-01 10:31
 * @Description 有施工许可未办理跨区域登记
 */
@Service
public class WblkqyServiceImpl extends BaseService implements WblkqyService {

    @Autowired
    private WblkqyMapper mapper;

    @Override
    public List<Wblkqy> selectList(Wblkqy entity) {
        return mapper.selectList(entity);
    }
}
