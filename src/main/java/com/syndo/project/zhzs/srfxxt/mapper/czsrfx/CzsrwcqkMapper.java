package com.syndo.project.zhzs.srfxxt.mapper.czsrfx;

import java.util.List;
import java.util.Map;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.czsrfx.Czsrwcqk;

/**
 * 财政总收入
 * @author xrc
 *
 */
public interface CzsrwcqkMapper extends BaseMapper<Czsrwcqk> {

    List<Map<String, Object>> selectYskm();
    /** 查询税收快报 */
    List<Map<String, String>> selectList2(Czsrwcqk cond);
    /** 查找计划 */
    List<Czsrwcqk> selectJh(Czsrwcqk cond);

}
