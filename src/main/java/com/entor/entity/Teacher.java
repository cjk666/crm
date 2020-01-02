package com.entor.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Teacher extends BaseRowModel implements Serializable {
	
	private static final long serialVersionUID = 7534308998400212077L;
	
	@ExcelProperty(value = "主键编号",index = 0)
	private String teacherId;//主键编号
	@ExcelProperty(value = "教师姓名",index = 1)
	private String teacherName;//教师姓名
	@ExcelProperty(value = "教师性别(1男 0女)",index = 2)
	private Integer teacherSex;//教师性别(1男 0女)
	@ExcelProperty(value = "教师联系方式",index = 3)
	private String teacherPhone;//教师联系方式
	@ExcelProperty(value = "教师联系地址",index = 4)
	private String teacherAddress;//教师联系地址
	@ExcelProperty(value = "教师学历",index = 5)
	private String teacherEduLevel;//教师学历
	@ExcelProperty(value = "教师职称",index = 6)
	private String teacherSkill;//教师职称
	@ExcelProperty(value = "毕业学校名称",index = 7)
	private String teacherSchoolName;//毕业学校名称
	@ExcelProperty(value = "毕业专业名称",index = 8)
	private String teacherMajorName;//毕业专业名称
	@ExcelProperty(value = "毕业日期",index = 9, format = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date teacherleaveSchoolDate;//毕业日期
	@ExcelProperty(value = "教师工作职位",index = 10)
	private String teacherJob;//教师工作职位
	@ExcelProperty(value = "入职日期",index = 11, format = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date teacherEntryDate;//入职日期
	@ExcelProperty(value = "离职日期",index = 12, format = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date teacherEndDate;//离职日期
	@ExcelProperty(value = "教师状态（1在职0离职）",index = 13)
	private Integer teacherStatue;//教师状态（1在职0离职）
	@ExcelProperty(value = "教师头像地址",index = 14)
	private String teacherPic;//教师头像地址
	@ExcelProperty(value = "创建时间",index = 15, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Timestamp createTime;//创建时间
	
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Integer getTeacherSex() {
		return teacherSex;
	}
	public void setTeacherSex(Integer teacherSex) {
		this.teacherSex = teacherSex;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	public String getTeacherEduLevel() {
		return teacherEduLevel;
	}
	public void setTeacherEduLevel(String teacherEduLevel) {
		this.teacherEduLevel = teacherEduLevel;
	}
	public String getTeacherSkill() {
		return teacherSkill;
	}
	public void setTeacherSkill(String teacherSkill) {
		this.teacherSkill = teacherSkill;
	}
	public String getTeacherSchoolName() {
		return teacherSchoolName;
	}
	public void setTeacherSchoolName(String teacherSchoolName) {
		this.teacherSchoolName = teacherSchoolName;
	}
	public String getTeacherMajorName() {
		return teacherMajorName;
	}
	public void setTeacherMajorName(String teacherMajorName) {
		this.teacherMajorName = teacherMajorName;
	}
	public Date getTeacherleaveSchoolDate() {
		return teacherleaveSchoolDate;
	}
	public void setTeacherleaveSchoolDate(Date teacherleaveSchoolDate) {
		this.teacherleaveSchoolDate = teacherleaveSchoolDate;
	}
	public String getTeacherJob() {
		return teacherJob;
	}
	public void setTeacherJob(String teacherJob) {
		this.teacherJob = teacherJob;
	}
	public Date getTeacherEntryDate() {
		return teacherEntryDate;
	}
	public void setTeacherEntryDate(Date teacherEntryDate) {
		this.teacherEntryDate = teacherEntryDate;
	}
	public Date getTeacherEndDate() {
		return teacherEndDate;
	}
	public void setTeacherEndDate(Date teacherEndDate) {
		this.teacherEndDate = teacherEndDate;
	}
	public Integer getTeacherStatue() {
		return teacherStatue;
	}
	public void setTeacherStatue(Integer teacherStatue) {
		this.teacherStatue = teacherStatue;
	}
	public String getTeacherPic() {
		return teacherPic;
	}
	public void setTeacherPic(String teacherPic) {
		this.teacherPic = teacherPic;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSex=" + teacherSex
				+ ", teacherPhone=" + teacherPhone + ", teacherAddress=" + teacherAddress + ", teacherEduLevel="
				+ teacherEduLevel + ", teacherSkill=" + teacherSkill + ", teacherSchoolName=" + teacherSchoolName
				+ ", teacherMajorName=" + teacherMajorName + ", teacherleaveSchoolDate=" + teacherleaveSchoolDate
				+ ", teacherJob=" + teacherJob + ", teacherEntryDate=" + teacherEntryDate + ", teacherEndDate="
				+ teacherEndDate + ", teacherStatue=" + teacherStatue + ", teacherPic=" + teacherPic + ", createTime="
				+ createTime + "]";
	}
	
}
