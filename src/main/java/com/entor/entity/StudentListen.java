package com.entor.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StudentListen implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7265453006178120995L;
	private String id; //编号
	private String name;//学生姓名
	private int sex;//学生性别
	private String phone;//学生电话
	private String address;//学生地址
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date listenDate;//试听日期
	private Major major;//试听专业
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getListenDate() {
		return listenDate;
	}
	public void setListenDate(Date listenDate) {
		this.listenDate = listenDate;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "StudentListen [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", address="
				+ address + ", listenDate=" + listenDate + ", major=" + major + ", createTime=" + createTime + "]";
	}
}
