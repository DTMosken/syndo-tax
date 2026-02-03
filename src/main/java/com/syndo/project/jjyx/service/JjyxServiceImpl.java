package com.syndo.project.jjyx.service;

import com.syndo.project.jjyx.domain.JjyxData;
import com.syndo.project.jjyx.domain.Rlt;
import com.syndo.project.jjyx.mapper.JjyxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JjyxServiceImpl implements IJjyxService {
    @Autowired
    private JjyxMapper mapper;

    @Override
    public List<Rlt> qyxxRltQy() {
        return mapper.qyxxRltQy();
    }

    @Override
    public List<Rlt> qyxxRltSs() {
        return mapper.qyxxRltSs();
    }

    @Override
    public List<JjyxData> qyxxZzjz() {
        return mapper.selectJjyxData("qy_zzjz");
    }

    @Override
    public List<JjyxData> qyxxXbzxqk() {
        return mapper.selectJjyxData("qy_xbzxqk");
    }
    
    private JjyxData getRkrq() {
    	return mapper.selectJjyxDataByKey("public", "rkrq");
    }

    @Override
    public List<JjyxData> qyxxNszzl() {
        List<JjyxData> list = mapper.selectJjyxData("qy_zzl");
        list.add(getRkrq());
        return list;
    }

    @Override
    public List<JjyxData> qyxxNszje() {
        List<JjyxData> list =  mapper.selectJjyxData("qy_zje");
        list.add(getRkrq());
        return list;
    }

    @Override
    public List<JjyxData> qyxxNs10() {
        List<JjyxData> list =  mapper.selectJjyxData("qy_ns10");
        list.add(getRkrq());
        return list;
    }

    @Override
    public List<JjyxData> nsqkHynsze() {
        List<JjyxData> list =  mapper.selectJjyxData("ns_hynsze");
        list.add(getRkrq());
        return list;
    }

    @Override
    public List<JjyxData> nsqkHysszb() {
        List<JjyxData> list =  mapper.selectJjyxData("ns_hysszb");
        list.add(getRkrq());
        return list;
    }

    @Override
    public List<JjyxData> nsqkZdqynsbh() {
        List<JjyxData> list =  mapper.selectJjyxData("ns_zdqynsbh");
        list.add(getRkrq());
        return list;
    }

    @Override
	public List<JjyxData> nsqkZjssqk() {
    	List<JjyxData> list =  mapper.selectJjyxData("ns_zjssqk");
        list.add(getRkrq());
        return list;
	}

    @Override
    public List<JjyxData> ftBdcdjqk() {
        return mapper.selectJjyxData("ft_bdcdjqk");
    }

    @Override
    public List<JjyxData> ftCsjcssptftj() {
        return mapper.selectJjyxData("ft_csjcssptftj");
    }

    @Override
    public List<JjyxData> ftSpfysqk() {
        return mapper.selectJjyxData("ft_spfysqk");
    }

    @Override
    public List<JjyxData> ftSpfwqqk() {
        return mapper.selectJjyxData("ft_spfwqqk");
    }

    @Override
    public List<JjyxData> ftTdcrqk() {
        return mapper.selectJjyxData("ft_tdcrqk");
    }

    @Override
    public List<JjyxData> ftTdzrqk() {
        return mapper.selectJjyxData("ft_tdzrqk");
    }

    @Override
    public List<JjyxData> ftTddjqk() {
        return mapper.selectJjyxData("ft_tddjqk");
    }

    @Override
    public List<JjyxData> ftJsxmzyldqk() {
        return mapper.selectJjyxData("ft_jsxmzyldqk");
    }
}
