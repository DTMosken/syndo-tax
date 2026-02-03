package com.syndo.project.zhzs.dbfxxt.mapper.ts;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Tsyx;

import java.util.Map;

public interface TsyxMapper extends BaseMapper<Tsyx> {
//    void sjbd(Map<String, String> param);
//
//    void fxts(Map<String, String> param);
	Long checkTsyx1(Tsyx vo);
	void tsyx3(String presid);
	void tsyx1(Tsyx param);
	void tsyx2(Tsyx param);
	int tsyx2_pre(Tsyx tsyx);
}
