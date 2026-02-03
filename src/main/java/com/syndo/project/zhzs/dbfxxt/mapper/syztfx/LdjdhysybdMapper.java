package com.syndo.project.zhzs.dbfxxt.mapper.syztfx;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Ldjdhy;
/**
 * ***** 对比分析系统-税源比对-旅店酒店行业税源比对 *****
 */
@Repository
public interface LdjdhysybdMapper extends BaseMapper<Ldjdhy>{
    
    public List<Ldjdhy> getTowList(Ldjdhy entity);
    
    public List<Ldjdhy> getThreeList(Ldjdhy entity);
}
