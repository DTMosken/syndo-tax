package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Wblkqy;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-01 10:30
 * @Description 有施工许可未办理跨区域登记
 */
public interface WblkqyService {

    public List<Wblkqy> selectList(Wblkqy entity);
}
