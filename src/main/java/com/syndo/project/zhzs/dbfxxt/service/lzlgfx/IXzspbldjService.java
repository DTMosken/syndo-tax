package com.syndo.project.zhzs.dbfxxt.service.lzlgfx;

import java.util.List;

import com.syndo.project.zhzs.dbfxxt.domain.lzlgfx.Xzspbldj;

/**
 * 行政审批办理登记未在税务注册
 * @author mdz
 * @date 2020年4月7日
 */
public interface IXzspbldjService {
	public List<Xzspbldj> selectList(Xzspbldj entity);
}
