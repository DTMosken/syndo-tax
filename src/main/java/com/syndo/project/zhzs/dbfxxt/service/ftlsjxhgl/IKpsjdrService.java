package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Kpsjdr;

/**
 * 房土两税精细化管理-开票数据导入
 */
public interface IKpsjdrService {
    
    public List<Kpsjdr> selectList(Kpsjdr entity);
    
    public int inster(Kpsjdr entity);
    
    public Kpsjdr selectById(String id);
    
    public int update(Kpsjdr entity);
    
    public int delete(String ids);

}
