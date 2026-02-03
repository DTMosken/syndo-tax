package com.syndo.project.industry.zbgzjs.service;

import java.util.List;

import com.syndo.project.industry.zbgzjs.domain.Zbkwh;

/**
 * 指标库维护
 * @author hry
 *
 */
public interface IZbkwhService {
	List<Zbkwh> GetZbkLST(Zbkwh zb);
	void newaddZbk (Zbkwh zb);
	void updateZbk(Zbkwh zb);
	void remove(String [] id);
	Zbkwh GetZbkLSTBYID(String id);
}
