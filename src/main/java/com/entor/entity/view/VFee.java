package com.entor.entity.view;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VFee {
	private String id;//主键编号
	private String studentName;//学生编号
	private int payMoney;//缴费金额
	private int payType;//缴费方式（1全款2分期）
	private String borrowOrg;//缴费机构编号
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date payDate;//缴费日期
	private int payStatue;//缴费状态
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Timestamp createTime;//创建时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(int payMoney) {
		this.payMoney = payMoney;
	}
	public int getPayType() {
		return payType;
	}
	public void setPayType(int payType) {
		this.payType = payType;
	}
	public String getBorrowOrg() {
		return borrowOrg;
	}
	public void setBorrowOrg(String borrowOrg) {
		this.borrowOrg = borrowOrg;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public int getPayStatue() {
		return payStatue;
	}
	public void setPayStatue(int payStatue) {
		this.payStatue = payStatue;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "VFee [id=" + id + ", studentName=" + studentName + ", payMoney=" + payMoney + ", payType=" + payType
				+ ", borrowOrg=" + borrowOrg + ", payDate=" + payDate + ", payStatue=" + payStatue + ", createTime="
				+ createTime + "]";
	}
}
