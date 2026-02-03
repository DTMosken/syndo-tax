package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Jyjbxjg;
import com.syndo.project.zhzs.dbfxxt.mapper.lzlgfx.JyjbxjgMapper;

/**
 * 户籍比对 - 教育局办学机构未在税务注册
 */
@Service
public class JyjbxjgServiceImpl extends BaseService implements IJyjbxjgService {

    @Autowired
    private JyjbxjgMapper mapper;
    
    /**
     * 查询列表
     */
    @Override
    public List<Jyjbxjg> selectList(Jyjbxjg entity) {
        return mapper.selectList(entity);
    }

}
