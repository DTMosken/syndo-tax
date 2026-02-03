package com.syndo.project.zhzs.srfxxt.service.qysrfx;

import java.util.List;

import com.syndo.project.zhzs.srfxxt.domain.qysrfx.Qynspm;

/**
 * 企业纳税排名
 * 
 */
public interface IQynspmService {

	List<Qynspm> selectList(Qynspm entity);
}
