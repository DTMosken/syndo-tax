package com.syndo.project.zhzs.gcxmxt.service.ajsfcx;

import com.syndo.project.zhzs.gcxmxt.domain.ajsfcx.Ajsfcx;
import com.syndo.project.zhzs.gcxmxt.mapper.ajsfcx.AjsfcxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AjsfcxServiceImpl implements IAjsfcxService {

    @Autowired(required = false)
    private AjsfcxMapper ajsfcxMapper;

    /**
     * 项目管理列表查询
     */
    @Override
    public List<Ajsfcx> selectList(Ajsfcx cond) {
        List<Ajsfcx> lists = ajsfcxMapper.selectList(cond);
        return lists;
    }
}
