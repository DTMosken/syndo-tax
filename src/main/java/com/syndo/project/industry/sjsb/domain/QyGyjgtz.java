package com.syndo.project.industry.sjsb.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 工业技改投资对象 t_qy_gyjgtz
 * 
 * @author admin
 * @date 2021-01-22
 */
public class QyGyjgtz extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String xxmc;

    /** 项目总投资（万元） */
    @Excel(name = "项目总投资", readConverterExp = "万=元")
    private String xmztz;

    /** 列入重点项目 */
    @Excel(name = "列入重点项目")
    private String lrzdxm;

    /** 累积投资额（万元）截止去年底 */
    @Excel(name = "累积投资额", readConverterExp = "万=元")
    private String ljtze;

    /** 今年起到某月份 */
    @Excel(name = "今年起到某月份")
    private String yf;

    /** 实际完成投资额（万元） */
    @Excel(name = "实际完成投资额", readConverterExp = "万=元")
    private String sjwctze;

    /** 本年度计划投资额（万元） */
    @Excel(name = "本年度计划投资额", readConverterExp = "万=元")
    private String bndjhtze;

    /** 完工后计划产值（万元） */
    @Excel(name = "完工后计划产值", readConverterExp = "万=元")
    private String wghyjcz;

    /** 预计开工时间 */
    @Excel(name = "预计开工时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date yjkgsj;

    /** 预计竣工时间 */
    @Excel(name = "预计竣工时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date yjjgsj;

    /** 是否属于竣工改造 */
    @Excel(name = "是否属于竣工改造")
    private String sfjggz;
    /**年份 */
    private String nf ;
    /**操作用户社会信用代码 */
    private String shxydm ;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setXxmc(String xxmc) {
        this.xxmc = xxmc;
    }

    public String getXxmc() {
        return xxmc;
    }
    public void setXmztz(String xmztz) {
        this.xmztz = xmztz;
    }

    public String getXmztz() {
        return xmztz;
    }
    public void setLrzdxm(String lrzdxm) {
        this.lrzdxm = lrzdxm;
    }

    public String getLrzdxm() {
        return lrzdxm;
    }
    public void setLjtze(String ljtze) {
        this.ljtze = ljtze;
    }

    public String getLjtze() {
        return ljtze;
    }
    public void setYf(String yf) {
        this.yf = yf;
    }

    public String getYf() {
        return yf;
    }
    public void setSjwctze(String sjwctze) {
        this.sjwctze = sjwctze;
    }

    public String getSjwctze() {
        return sjwctze;
    }
    public void setBndjhtze(String bndjhtze) {
        this.bndjhtze = bndjhtze;
    }

    public String getBndjhtze() {
        return bndjhtze;
    }
    public void setWghyjcz(String wghyjcz) {
        this.wghyjcz = wghyjcz;
    }

    public String getWghyjcz() {
        return wghyjcz;
    }
    public void setYjkgsj(Date yjkgsj) {
        this.yjkgsj = yjkgsj;
    }

    public Date getYjkgsj() {
        return yjkgsj;
    }
    public void setYjjgsj(Date yjjgsj) {
        this.yjjgsj = yjjgsj;
    }

    public Date getYjjgsj() {
        return yjjgsj;
    }
    public void setSfjggz(String sfjggz) {
        this.sfjggz = sfjggz;
    }

    public String getSfjggz() {
        return sfjggz;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

	public String getShxydm() {
		return shxydm;
	}

	public void setShxydm(String shxydm) {
		this.shxydm = shxydm;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xxmc", getXxmc())
            .append("xmztz", getXmztz())
            .append("lrzdxm", getLrzdxm())
            .append("ljtze", getLjtze())
            .append("yf", getYf())
            .append("sjwctze", getSjwctze())
            .append("bndjhtze", getBndjhtze())
            .append("wghyjcz", getWghyjcz())
            .append("yjkgsj", getYjkgsj())
            .append("yjjgsj", getYjjgsj())
            .append("sfjggz", getSfjggz())
            .append("shxydm", getShxydm())
            .toString();
    }
}
