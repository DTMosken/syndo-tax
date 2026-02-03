package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Ccsjnqsfx;

import java.util.List;

/**
 * @author lvd
 * @date 2021-04-08 15:33
 * @Description 车船税缴纳趋势分析
 */
public interface CcsjnqsfxService {
    public List<Ccsjnqsfx> selectList(Ccsjnqsfx entity);
}
