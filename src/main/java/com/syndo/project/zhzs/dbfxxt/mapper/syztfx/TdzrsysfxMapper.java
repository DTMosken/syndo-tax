package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Rkxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdsyxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.TdzrTdxx;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Tdzrsysfx;

/**
 * 土地转让使用税分析
 */
@Repository
public interface TdzrsysfxMapper extends BaseMapper<Tdzrsysfx> {

    List<TdzrTdxx> getTdxxList(Tdzrsysfx entity);

    List<Tdsyxx> getSyxxList(Tdzrsysfx entity);

    List<Rkxx> getRkxxList(Tdzrsysfx entity);

}
