package com.entor.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StudentStudy  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2975382266923041139L;
	private String id;//主键编号
	private String name;//姓名
	private int sex;//性别
	private String phone;//电话号码
	private String address;//联系地址
	private String schoolName;//毕业学校名称
	private String schoolMajor;//所学专业
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date beginDate;//开班日期
	private Major major;//实训专业编号
	private String contractId;//合同编号
	private String contractFile;//合同文件名
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date contractDate;//合同签订日期
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
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolMajor() {
		return schoolMajor;
	}
	public void setSchoolMajor(String schoolMajor) {
		this.schoolMajor = schoolMajor;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getContractFile() {
		return contractFile;
	}
	public void setContractFile(String contractFile) {
		this.contractFile = contractFile;
	}
	public Date getContractDate() {
		return contractDate;
	}
	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "StudentStudy [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", address="
				+ address + ", schoolName=" + schoolName + ", schoolMajor=" + schoolMajor + ", beginDate=" + beginDate
				+ ", major=" + major + ", contractId=" + contractId + ", contractFile=" + contractFile
				+ ", contractDate=" + contractDate + ", createTime=" + createTime + "]";
	}
	
}
