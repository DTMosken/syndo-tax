package com.syndo.project.zhzs.dbfxxt.service.ftlsjxhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.syndo.project.zhzs.dbfxxt.domain.ftlsjxhgl.Fcsyztz;
import com.syndo.project.zhzs.dbfxxt.mapper.ftlsjxhgl.FcsyztzMapper;

/**
 * 房土两税精细化管理-房产税应征台账
 */
public interface IFcsyztzService {

   public List<Fcsyztz> selectList(Fcsyztz entity);
}
