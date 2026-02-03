package com.syndo.project.industry.sjsb.domain;

import com.syndo.common.core.domain.BaseEntity;

/**
 * 政策建议
 *
 * @author ykc
 * @date 2020年7月24日
 */
public class PolicyAdvice extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String fileName; // 文件名称
	private String filePath; // 文件路径
	private String fileSize; // 文件大小
	private String fileType; // 文件
	private String remark; // 备注
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
