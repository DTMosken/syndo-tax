package com.syndo.project.zhzs.srfxxt.service.jkbb;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkdjb;

/**
 * 金库单级表统计
 */
public interface IJkdanjbtjService {

    public List<Jkdjb> selectList(Jkdjb entity);
}
