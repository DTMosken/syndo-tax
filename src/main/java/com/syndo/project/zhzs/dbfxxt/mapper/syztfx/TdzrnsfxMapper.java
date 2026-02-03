package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdzrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdzrnsfx;

/**
 * 土地转让契税分析
 */
@Repository
public interface TdzrnsfxMapper extends BaseMapper<Tdzrnsfx> {

    List<TdzrTdxx> getTdxxList(Tdzrnsfx entity);

    List<Rkxx> getRkxxList(Tdzrnsfx entity);

}
