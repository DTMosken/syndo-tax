package com.syndo.project.zhzs.dbfxxt.domain.lzlgfx;

import com.syndo.common.annotation.Excel;
import com.syndo.common.core.domain.BaseEntity;

/**
 * 户籍比对 - 公安旅馆业备案未在税务注册
 */
@SuppressWarnings("serial")
public class Galg extends BaseEntity {

	private String id;
	@Excel(name = "企业名称")
	private String qymc;// 企业名称
	@Excel(name = "详细地址")
	private String xxdz;// 详细地址
	@Excel(name = "法人名称")
	private String fzr;// 法人名称
	@Excel(name = "联系电话")
	private String dh;// 联系电话
	@Excel(name = "对比类型")
	private String info;// 对比类型
	@Excel(name = "处理单位")
	private String cldw;// 处理单位

	private String type;
	private String lgbm;
	private String xqdw;
	private String flag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQymc() {
		return qymc;
	}

	public void setQymc(String qymc) {
		this.qymc = qymc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCldw() {
		return cldw;
	}

	public void setCldw(String cldw) {
		this.cldw = cldw;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getLgbm() {
		return lgbm;
	}

	public void setLgbm(String lgbm) {
		this.lgbm = lgbm;
	}

	public String getXxdz() {
		return xxdz;
	}

	public void setXxdz(String xxdz) {
		this.xxdz = xxdz;
	}

	public String getFzr() {
		return fzr;
	}

	public void setFzr(String fzr) {
		this.fzr = fzr;
	}

	public String getDh() {
		return dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public String getXqdw() {
		return xqdw;
	}

	public void setXqdw(String xqdw) {
		this.xqdw = xqdw;
	}

}
