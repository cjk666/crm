package com.entor.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RoomFee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8790408718569875065L;
	private String id;//主键编号
	private String roomId;//房间编号
	private float useWater;//用水费
	private float useElectricity;//用电费
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
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public float getUseWater() {
		return useWater;
	}
	public void setUseWater(float useWater) {
		this.useWater = useWater;
	}
	public float getUseElectricity() {
		return useElectricity;
	}
	public void setUseElectricity(float useElectricity) {
		this.useElectricity = useElectricity;
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
		return "RoomFee [id=" + id + ", roomId=" + roomId + ", useWater=" + useWater + ", useElectricity="
				+ useElectricity + ", roomFee=" + roomFee + ", createDate=" + createDate + ", createTime=" + createTime
				+ "]";
	}
	
}
