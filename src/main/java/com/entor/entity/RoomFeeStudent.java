package com.entor.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RoomFeeStudent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6615758362577713327L;
	private String id;//主键编号
	private String roomId;//房间编号
	private String studentId;//学生编号
	private float useWater;//用水费
	private float userElectricity;//用电费
	private float roomFee;//物业费
	private float totalFee;//总费用
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date createDate;//费用产生日期
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Timestamp createTime;//创建时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public float getUseWater() {
		return useWater;
	}
	public void setUseWater(float useWater) {
		this.useWater = useWater;
	}
	public float getUserElectricity() {
		return userElectricity;
	}
	public void setUserElectricity(float userElectricity) {
		this.userElectricity = userElectricity;
	}
	public float getRoomFee() {
		return roomFee;
	}
	public void setRoomFee(float roomFee) {
		this.roomFee = roomFee;
	}
	public float getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(float totalFee) {
		this.totalFee = totalFee;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "RoomFeeStudent [id=" + id + ", roomId=" + roomId + ", studentId=" + studentId + ", useWater=" + useWater
				+ ", userElectricity=" + userElectricity + ", roomFee=" + roomFee + ", totalFee=" + totalFee
				+ ", createDate=" + createDate + ", createTime=" + createTime + "]";
	}
	
}
