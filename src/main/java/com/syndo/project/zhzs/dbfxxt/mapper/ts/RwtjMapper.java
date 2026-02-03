package com.syndo.project.zhzs.dbfxxt.mapper.ts;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Dbrw;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Rwtj;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RwtjMapper extends BaseMapper<Rwtj> {
    List<Dbrw> selectRws(@Param("fkr") String fkr);

    List<Dbrw> selectDfk2(@Param("lx") String lx, @Param("fkr") String fkr);

    List<Dbrw> selectYfk2(@Param("lx") String lx, @Param("fkr") String fkr);

    List<Dbrw> selectYfk(@Param("lx") String lx, @Param("fkr") String fkr);

    List<Dbrw> selectSplx(@Param("lx") String lx, @Param("fkr") String fkr);
}
