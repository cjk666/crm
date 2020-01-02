package com.entor.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClassesListen implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7516299571607098141L;
	private String classesId;//班级编号
	private String classesName;//班级名称
	private String majorId;//试听专业编号
	private String managerId;//班主任编号
	private String teacherId;//代课老师编号
	private String classesRoom;//试听教室名称
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date beginDate;//试听开始时间
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date endDate;//试听结束时间(正常情况下一周)
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
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "ClassesListen [classesId=" + classesId + ", classesName=" + classesName + ", majorId=" + majorId
				+ ", managerId=" + managerId + ", teacherId=" + teacherId + ", classesRoom=" + classesRoom
				+ ", beginDate=" + beginDate + ", endDate=" + endDate + ", createTime=" + createTime + "]";
	}
	
}
