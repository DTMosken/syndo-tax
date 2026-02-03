package com.syndo.project.app.service;

import java.util.List;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.app.domain.AppMessage;
import com.syndo.project.app.mapper.AppMessageMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppMessageService extends BaseService {
    @Autowired
    private AppMessageMapper mapper;
    
    public List<AppMessage> selectList(AppMessage appmessage) {
        return mapper.selectList(appmessage);
    }

    public int insert(AppMessage appmessage) {
        appmessage.setObjId(getUUID());
        appmessage.setCreateBy(ShiroUtils.getLoginName());
        return mapper.insert(appmessage);
    }

    public AppMessage selectById(String objId) {
        return mapper.selectById(objId);
    }

    public int update(AppMessage appmessage) {
        appmessage.setUpdateBy(ShiroUtils.getLoginName());
        return mapper.update(appmessage);
    }

    public int deleteByIds(String ids) {
        return mapper.deleteByIds(Convert.toStrArray(ids));
    }
    
}
