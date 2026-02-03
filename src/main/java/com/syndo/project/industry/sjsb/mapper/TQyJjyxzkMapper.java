package com.syndo.project.industry.sjsb.mapper;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.industry.sjsb.domain.GroupRelationship;
import com.syndo.project.industry.sjsb.domain.TQyJjyxzk;

/**
 * 经济运行状况Mapper接口
 * 
 * @author admin
 * @date 2021-01-22
 */
public interface TQyJjyxzkMapper extends BaseMapper<GroupRelationship> {
    /**
     * 查询经济运行状况
     * 
     * @param id 经济运行状况ID
     * @return 经济运行状况
     */
    public TQyJjyxzk selectTQyJjyxzkById(String id);

    /**
     * 查询经济运行状况列表
     * 
     * @param tQyJjyxzk 经济运行状况
     * @return 经济运行状况集合
     */
    public List<TQyJjyxzk> selectTQyJjyxzkList(TQyJjyxzk tQyJjyxzk);

    /**
     * 新增经济运行状况
     * 
     * @param tQyJjyxzk 经济运行状况
     * @return 结果
     */
    public int insertTQyJjyxzk(TQyJjyxzk tQyJjyxzk);

    /**
     * 修改经济运行状况
     * 
     * @param tQyJjyxzk 经济运行状况
     * @return 结果
     */
    public int updateTQyJjyxzk(TQyJjyxzk tQyJjyxzk);

    /**
     * 删除经济运行状况
     * 
     * @param id 经济运行状况ID
     * @return 结果
     */
    public int deleteTQyJjyxzkById(String id);

    /**
     * 批量删除经济运行状况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTQyJjyxzkByIds(String[] ids);

    /*
    * 根据日期获取
    *
    * */
    TQyJjyxzk selectLastTQyJjyxzk(String rq, String qymc,String ssyf);
}
