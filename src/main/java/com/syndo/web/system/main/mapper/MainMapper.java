package com.syndo.web.system.main.mapper;

import com.syndo.common.core.domain.entity.User;
import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.web.domain.system.*;
import com.syndo.web.system.main.domain.MainEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MainMapper extends BaseMapper<MainEntity> {

	MainEntity getMainInfo(MainEntity vo);

    int getUserLocal(String username);

    void insertIntoUser(@Param("username") String username, @Param("password") String password, @Param("salt") String salt);

    void updateZdqynsfx(Zdqynsfx zdqynsfx);

    List<Zdqynsfx> selectZdqynsfx();

    List<Nsqs> selectNsqs();

    void updateNsqs(Nsqs nsqs);

    User getSysUser(String principal);

    List<Szmap> selectSzmap();

    List<Hymap> selectHymap();

    List<Zysyqyjcxx> getZysyqyjcxx();

    void updateLngLat(@Param("lng") String lng, @Param("lat") String lat, @Param("id") String id);

    List<Nsdhqsqyjcxx> getNsdhqsqyjcxx();

    void updateLngLatNsdh(@Param("lng") String lng, @Param("lat") String lat, @Param("id") String id);

    List<Nsdhqsqynsxxyd> getNsdhqsqynsxxyd(@Param("qymc") String qymc, @Param("nsrsbh") String nsrsbh);

    List<Nsdhqsqynsxxyd> getZysyqynsxxyd(@Param("qymc") String qymc, @Param("nsrsbh") String nsrsbh);
}
