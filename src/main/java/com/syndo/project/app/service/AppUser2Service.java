package com.syndo.project.app.service;

import java.util.List;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.app.domain.AppUser;
import com.syndo.project.app.mapper.AppUser2Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUser2Service extends BaseService {
    @Autowired
    private AppUser2Mapper mapper;
    
    public List<AppUser> selectList(AppUser appuser) {
        return mapper.selectList(appuser);
    }

    public int insert(AppUser appuser) {
        appuser.setUserId(getUUID());
        appuser.setCreateTime(DateUtils.getTime());
        return mapper.insert(appuser);
    }

    public AppUser selectById(String objId) {
        return mapper.selectById(objId);
    }

    public int update(AppUser appuser) {
        appuser.setUpdateTime(DateUtils.getTime());
        return mapper.update(appuser);
    }

    public int deleteByIds(String ids) {
        return mapper.deleteByIds(Convert.toStrArray(ids));
    }

    public int resetPwd(String userId) {        
        return mapper.resetPwd(userId);
    }
}
