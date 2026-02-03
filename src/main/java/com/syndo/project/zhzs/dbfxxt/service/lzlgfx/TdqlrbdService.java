package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Tdqlrbd;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lvd
 * @date 2021-03-31 15:55
 * @Description 土地权利人比对
 */
public interface TdqlrbdService {

    public List<Tdqlrbd> selectList(Tdqlrbd entity);
}
