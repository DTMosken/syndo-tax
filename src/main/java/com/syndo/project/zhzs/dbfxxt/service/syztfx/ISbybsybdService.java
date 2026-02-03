package com.syndo.project.zhzs.dbfxxt.service.syztfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.syztfx.Sbybsybd;

public interface ISbybsybdService {

	public List<Sbybsybd> selectList(Sbybsybd entity);
	public List<Sbybsybd> getTwoList(Sbybsybd entity);
	public List<Sbybsybd> getThreeList(Sbybsybd entity);
}
