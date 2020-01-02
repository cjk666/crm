package com.entor.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BorrowOrg implements Serializable {
	
	private static final long serialVersionUID = 6278542840437920192L;
	
	private String id;//编号
	private String name;//贷款机构名称
	private String remark;//机构描述
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date beginDate;//合作开始时间
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date endDate;//合作结束时间
	private String manager;//机构负责人
	private String phone;//机构联系电话
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Timestamp createTime;//创建时间
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
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "BorrowOrg [id=" + id + ", name=" + name + ", remark=" + remark + ", beginDate=" + beginDate
				+ ", endDate=" + endDate + ", manager=" + manager + ", phone=" + phone + ", createTime=" + createTime
				+ "]";
	}
	
}
