package com.syndo.project.industry.sjsb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syndo.common.core.service.BaseService;
import com.syndo.common.utils.text.Convert;
import com.syndo.project.industry.sjsb.domain.QyGyjgtz;
import com.syndo.project.industry.sjsb.mapper.QyGyjgtzMapper;

/**
 * 工业技改投资Service业务层处理
 * 
 * @author admin
 * @date 2021-01-22
 */
@Service
public class QyGyjgtzService extends BaseService {
    @Autowired
    private QyGyjgtzMapper qyGyjgtzMapper;

    /**
     * 查询工业技改投资
     * 
     * @param id 工业技改投资ID
     * @return 工业技改投资
     */
    
    public QyGyjgtz selectQyGyjgtzById(String id) {
        return qyGyjgtzMapper.selectQyGyjgtzById(id);
    }

    /**
     * 查询工业技改投资列表
     * 
     * @param qyGyjgtz 工业技改投资
     * @return 工业技改投资
     */
    
    public List<QyGyjgtz> selectQyGyjgtzList(QyGyjgtz qyGyjgtz) {
        return qyGyjgtzMapper.selectQyGyjgtzList(qyGyjgtz);
    }

    /**
     * 新增工业技改投资
     * 
     * @param qyGyjgtz 工业技改投资
     * @return 结果
     */
    
    public int insertQyGyjgtz(QyGyjgtz qyGyjgtz) {
        return qyGyjgtzMapper.insertQyGyjgtz(qyGyjgtz);
    }

    /**
     * 修改工业技改投资
     * 
     * @param qyGyjgtz 工业技改投资
     * @return 结果
     */
    
    public int updateQyGyjgtz(QyGyjgtz qyGyjgtz) {
        return qyGyjgtzMapper.updateQyGyjgtz(qyGyjgtz);
    }

    /**
     * 删除工业技改投资对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    
    public int deleteQyGyjgtzByIds(String ids) {
        return qyGyjgtzMapper.deleteQyGyjgtzByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工业技改投资信息
     * 
     * @param id 工业技改投资ID
     * @return 结果
     */
    
    public int deleteQyGyjgtzById(String id) {
        return qyGyjgtzMapper.deleteQyGyjgtzById(id);
    }
}
