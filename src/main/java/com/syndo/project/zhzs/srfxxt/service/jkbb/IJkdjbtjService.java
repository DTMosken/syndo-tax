package com.syndo.project.zhzs.srfxxt.service.jkbb;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.jkbb.Jkdjb;

/**
 * 金库多级表统计
 */
public interface IJkdjbtjService {

    public List<Jkdjb> selectList(Jkdjb entity);
}
