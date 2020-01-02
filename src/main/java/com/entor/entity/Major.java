package com.entor.entity;

import java.io.Serializable;
import java.util.Date;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Major extends BaseRowModel implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5250677961225184884L;
	@ExcelProperty(value = "主键编号",index = 0)
	private String id;//主键编号
	@ExcelProperty(value = "专业名称",index = 1)
	private String name;//专业名称
	@ExcelProperty(value = "专业负责人",index = 2)
	private String manager;//专业负责人
	@ExcelProperty(value = "专业描述",index = 3)
	private String remark;//专业描述
	@ExcelProperty(value = "专业创建时间",index = 4)
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date beginDate;//专业创建时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	@Override
	public String toString() {
		return "Major [id=" + id + ", name=" + name + ", manager=" + manager + ", remark=" + remark + ", beginDate="
				+ beginDate + "]";
	}
	
}
