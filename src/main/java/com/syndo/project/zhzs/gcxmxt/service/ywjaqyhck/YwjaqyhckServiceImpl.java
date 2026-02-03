package com.syndo.project.zhzs.gcxmxt.service.ywjaqyhck;

import com.syndo.project.zhzs.gcxmxt.domain.ywjaqyhck.Ywjaqyhck;
import com.syndo.project.zhzs.gcxmxt.mapper.ywjaqyhck.YwjaqyhckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YwjaqyhckServiceImpl implements IYwjaqyhckService {

    @Autowired(required = false)
    private YwjaqyhckMapper ywjaqyhckMapper;

    /**
     * 工程项目核查库查询
     */
    @Override
    public List<Ywjaqyhck> selectList(Ywjaqyhck cond) {
        List<Ywjaqyhck> lists = ywjaqyhckMapper.selectList(cond);
        return lists;
    }
}
