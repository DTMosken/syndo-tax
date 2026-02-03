package com.syndo.project.zhzs.dbfxxt.mapper.ts;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.zhzs.dbfxxt.domain.ts.Fkxz;
import com.syndo.project.zhzs.dbfxxt.domain.ts.FkxzFz;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FkxzMapper extends BaseMapper<Fkxz> {

    int checkFkxzByUserName(String userName);

    int checkSysuserByLoginName(String userName);

    int insertFkxz(Fkxz fkxz);

    int insertSysuser(Fkxz fkxz);

    String selectRoleIdByKey(String key);

    int hasRole(@Param("userId") String userId, @Param("roleId") String roleId);

    int insertRole(@Param("userId")String userId, @Param("roleId") String roleId);

    List<Fkxz> selectSysuserByLoginName(String userName);

    int removeRole(@Param("userId") String userId, @Param("roleId") String roleId);

    Fkxz selectFkxzById(String id);

    int updateFkxz(Fkxz fkxz);

    int updateSysuser(Fkxz fkxz);

    List<Fkxz> selectFkxzWithoutId(@Param("id") String id,@Param("isRand") String isRand);

    Fkxz selectFkxzByUsername(String userName);

    int deleteUserRoleByIds(String[] var1);

    List<FkxzFz> selectFkxzFzList();

    int insertFkxzFz(FkxzFz fz);

    int updateFkxzFz(FkxzFz fz);

    FkxzFz selectFkxzFzByFzid(String fzid);

    int checkDeleteFz(String fzid);

    int deleteFzByFzid(String fzid);

    FkxzFz selectFkxzFzByFzmc(String fzmc);

    FkxzFz selectFkxzFzByUserid(String userId);
}
