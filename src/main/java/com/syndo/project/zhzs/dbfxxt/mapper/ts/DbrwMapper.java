package com.syndo.project.zhzs.dbfxxt.mapper.ts;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Dbrw;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Lzxx;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Rwfk;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Rwsh;

import java.util.List;

public interface DbrwMapper extends BaseMapper<Dbrw> {
    int checkIsFkxz(String userId);

    Rwsh selectFkbById(String id);

    int checkFkIsNeeded(String id);
    
    int rwfk(Rwfk rwfk);

    List<Rwfk> selectFkmxByFkid(String id);

	List<String> getRoles(String userId);

	int checkShIsNeeded(String id);

	int rwsh(Rwsh rwsh);

	int checkCancelfkIsNeeded(String id);

	int cancelfk(Rwfk rwfk);

	int rwshGoback(Rwsh rwsh);

	List<Lzxx> selectRwlzList(String id);

	void saveLzxx(Lzxx lzxx);
}
