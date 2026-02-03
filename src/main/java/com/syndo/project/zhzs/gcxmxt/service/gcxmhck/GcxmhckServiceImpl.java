package com.syndo.project.zhzs.gcxmxt.service.gcxmhck;

import com.syndo.project.zhzs.gcxmxt.domain.gcxmhck.Gcxmhck;
import com.syndo.project.zhzs.gcxmxt.mapper.gcxmhck.GcxmhckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GcxmhckServiceImpl implements IGcxmhckService {

    @Autowired(required = false)
    private GcxmhckMapper gcxmhckMapper;

    /**
     * 工程项目核查库查询
     */
    @Override
    public List<Gcxmhck> selectList(Gcxmhck cond) {
        List<Gcxmhck> lists = gcxmhckMapper.selectList(cond);
        return lists;
    }
}
