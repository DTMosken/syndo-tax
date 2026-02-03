package com.syndo.project.industry.sjsb.mapper;

import java.util.List;

import com.syndo.common.core.mapper.BaseMapper;
import com.syndo.project.industry.sjsb.domain.QyGyjgtz;

/**
 * 工业技改投资Mapper接口
 * 
 * @author admin
 * @date 2021-01-22
 */
public interface QyGyjgtzMapper extends BaseMapper<QyGyjgtz> {
    /**
     * 查询工业技改投资
     * 
     * @param id 工业技改投资ID
     * @return 工业技改投资
     */
    public QyGyjgtz selectQyGyjgtzById(String id);

    /**
     * 查询工业技改投资列表
     * 
     * @param QyGyjgtz 工业技改投资
     * @return 工业技改投资集合
     */
    public List<QyGyjgtz> selectQyGyjgtzList(QyGyjgtz QyGyjgtz);

    /**
     * 新增工业技改投资
     * 
     * @param QyGyjgtz 工业技改投资
     * @return 结果
     */
    public int insertQyGyjgtz(QyGyjgtz QyGyjgtz);

    /**
     * 修改工业技改投资
     * 
     * @param qyGyjgtz 工业技改投资
     * @return 结果
     */
    public int updateQyGyjgtz(QyGyjgtz qyGyjgtz);

    /**
     * 删除工业技改投资
     * 
     * @param id 工业技改投资ID
     * @return 结果
     */
    public int deleteQyGyjgtzById(String id);

    /**
     * 批量删除工业技改投资
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteQyGyjgtzByIds(String[] ids);
}
