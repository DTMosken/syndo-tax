package com.syndo.project.industry.sjsb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.industry.sjsb.domain.TQyJjyxzk;
import com.syndo.project.industry.sjsb.mapper.TQyJjyxzkMapper;

/**
 * 经济运行状况Service业务层处理
 * 
 * @author admin
 * @date 2021-01-22
 */
@Service
public class  ITQyJjyxzkService extends BaseService {
    @Autowired
    private TQyJjyxzkMapper tQyJjyxzkMapper;

    /**
     * 查询经济运行状况
     * 
     * @param id 经济运行状况ID
     * @return 经济运行状况
     */
    public TQyJjyxzk selectTQyJjyxzkById(String id) {
        return tQyJjyxzkMapper.selectTQyJjyxzkById(id);
    }

    /**
     * 查询经济运行状况列表
     * 
     * @param tQyJjyxzk 经济运行状况
     * @return 经济运行状况
     */
    public List<TQyJjyxzk> selectTQyJjyxzkList(TQyJjyxzk tQyJjyxzk) {
        return tQyJjyxzkMapper.selectTQyJjyxzkList(tQyJjyxzk);
    }

    /**
     * 新增经济运行状况
     * 
     * @param tQyJjyxzk 经济运行状况
     * @return 结果
     */
    public int insertTQyJjyxzk(TQyJjyxzk tQyJjyxzk) {
        return tQyJjyxzkMapper.insertTQyJjyxzk(tQyJjyxzk);
    }

    /**
     * 修改经济运行状况
     * 
     * @param tQyJjyxzk 经济运行状况
     * @return 结果
     */
    public int updateTQyJjyxzk(TQyJjyxzk tQyJjyxzk) {
        return tQyJjyxzkMapper.updateTQyJjyxzk(tQyJjyxzk);
    }

    /**
     * 删除经济运行状况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTQyJjyxzkByIds(String ids) {
        return tQyJjyxzkMapper.deleteTQyJjyxzkByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除经济运行状况信息
     * 
     * @param id 经济运行状况ID
     * @return 结果
     */
    public int deleteTQyJjyxzkById(String id) {
        return tQyJjyxzkMapper.deleteTQyJjyxzkById(id);
    }

    public TQyJjyxzk selectLastTQyJjyxzk(String rq,String qymc,String ssyf) {
        return tQyJjyxzkMapper.selectLastTQyJjyxzk(rq,qymc,ssyf);
    }
}
