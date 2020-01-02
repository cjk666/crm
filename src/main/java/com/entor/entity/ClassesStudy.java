package com.entor.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClassesStudy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5867863254072352872L;
	private String classesId;//班级编号
	private String classesName;//班级名称
	private String majorId;//所学专业编号
	private String managerId;//班主任编号
	private String teacherId;//代课老师编号
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
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
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
		return "ClassesStudy [classesId=" + classesId + ", classesName=" + classesName + ", majorId=" + majorId
				+ ", managerId=" + managerId + ", teacherId=" + teacherId + ", classesRoom=" + classesRoom
				+ ", beginDate=" + beginDate + ", lastJoinDate=" + lastJoinDate + ", joinCount=" + joinCount
				+ ", endDate=" + endDate + ", lastEndDate=" + lastEndDate + ", createTime=" + createTime + "]";
	}
	
}	
