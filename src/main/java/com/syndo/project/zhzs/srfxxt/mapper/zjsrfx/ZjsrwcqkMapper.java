package com.syndo.project.zhzs.srfxxt.mapper.zjsrfx;

import java.util.List;
import java.util.Map;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.srfxxt.domain.zjsrfx.Zjsrwcqk;

/**
 * 镇街收入完成情况(全口径)
 */
public interface ZjsrwcqkMapper extends BaseMapper<Zjsrwcqk> {

    List<Map<String, Object>> selectZsxm();

}
