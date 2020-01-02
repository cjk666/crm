package com.entor.entity.view;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VClassesStudy {
	
	private String classesId;//班级编号
	private String classesName;//班级名称
	private String major;//所学专业编号
	private String manager;//班主任
	private String teacher;//代课老师
	private String classesRoom;//教室名称
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date beginDate;//首次开班时间时间
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date lastJoinDate;//最后一次合班时间
	private int joinCount;//合班次数
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date endDate;//结课时间（正常情况下四个月）
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date lastEndDate;//最后结课时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Timestamp createTime;//创建时间
	
	public String getClassesId() {
		return classesId;
	}
	public void setClassesId(String classesId) {
		this.classesId = classesId;
	}
	public String getClassesName() {
		return classesName;
	}
	public void setClassesName(String classesName) {
		this.classesName = classesName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getClassesRoom() {
		return classesRoom;
	}
	public void setClassesRoom(String classesRoom) {
		this.classesRoom = classesRoom;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getLastJoinDate() {
		return lastJoinDate;
	}
	public void setLastJoinDate(Date lastJoinDate) {
		this.lastJoinDate = lastJoinDate;
	}
	public int getJoinCount() {
		return joinCount;
	}
	public void setJoinCount(int joinCount) {
		this.joinCount = joinCount;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getLastEndDate() {
		return lastEndDate;
	}
	public void setLastEndDate(Date lastEndDate) {
		this.lastEndDate = lastEndDate;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "VClassesStudy [classesId=" + classesId + ", classesName=" + classesName + ", major=" + major
				+ ", manager=" + manager + ", teacher=" + teacher + ", classesRoom=" + classesRoom + ", beginDate="
				+ beginDate + ", lastJoinDate=" + lastJoinDate + ", joinCount=" + joinCount + ", endDate=" + endDate
				+ ", lastEndDate=" + lastEndDate + ", createTime=" + createTime + "]";
	}
}
