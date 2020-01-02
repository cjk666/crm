package com.entor.entity.view;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VRoomFee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8790408718569875065L;
	private String id;//主键编号
	private String roomName;//房间编号
	private float useWater;//用水费
	private float userElectricity;//用电费
	private float roomFee;//物业费
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
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
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
		return "VRoomFee [id=" + id + ", roomName=" + roomName + ", useWater=" + useWater + ", userElectricity="
				+ userElectricity + ", roomFee=" + roomFee + ", createDate=" + createDate + ", createTime=" + createTime
				+ "]";
	}
}
