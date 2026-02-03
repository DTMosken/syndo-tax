package com.syndo.project.zhzs.xxgxxt.mapper;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.etl.meta.domain.MetaData;
import com.syndo.project.zhzs.xxgxxt.domain.Zblog;

public interface ZbLogMapper extends BaseMapper<Zblog> {

	long queryCount(MetaData metadata);

}
