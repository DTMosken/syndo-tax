package com.syndo.project.industry.zbgzjs.mapper;
import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.industry.zbgzjs.domain.Zbkwh;

/**
 * 指标库维护
 * @author hry
 *
 */
public interface ZbkwhMapper  extends BaseMapper<Zbkwh> {
	List<Zbkwh> GetZbkLST(Zbkwh zb);
	void newaddZbk (Zbkwh zb);
	void updateZbk(Zbkwh zb);
	void remove(String [] id);
	Zbkwh GetZbkLSTBYID(String id);
}
