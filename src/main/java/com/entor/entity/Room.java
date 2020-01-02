package com.entor.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Room  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7583701870469313385L;
	private String roomId;//主键编号
	private String roomName;//房间名称，格式：xx栋xx单元xxx号
	private String roomAddress;//详细地址，格式：xxx路xxx号xxx小区xx栋xx单元xxx号
	private int roomTotalSize;//房间能住总人数
	private int roomEmptySize;//空余床位
	private int roomPersonSex;//房间住宿人性别
	private int roomMoney;//房间每月住宿费
	private int roomDeposit;//房间押金
	private String roomManager;//房东姓名
	private String roomManagerPhone;//房东电话
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Timestamp createTime;//创建时间
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomAddress() {
		return roomAddress;
	}
	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}
	public int getRoomTotalSize() {
		return roomTotalSize;
	}
	public void setRoomTotalSize(int roomTotalSize) {
		this.roomTotalSize = roomTotalSize;
	}
	public int getRoomEmptySize() {
		return roomEmptySize;
	}
	public void setRoomEmptySize(int roomEmptySize) {
		this.roomEmptySize = roomEmptySize;
	}
	public int getRoomPersonSex() {
		return roomPersonSex;
	}
	public void setRoomPersonSex(int roomPersonSex) {
		this.roomPersonSex = roomPersonSex;
	}
	public int getRoomMoney() {
		return roomMoney;
	}
	public void setRoomMoney(int roomMoney) {
		this.roomMoney = roomMoney;
	}
	public int getRoomDeposit() {
		return roomDeposit;
	}
	public void setRoomDeposit(int roomDeposit) {
		this.roomDeposit = roomDeposit;
	}
	public String getRoomManager() {
		return roomManager;
	}
	public void setRoomManager(String roomManager) {
		this.roomManager = roomManager;
	}
	public String getRoomManagerPhone() {
		return roomManagerPhone;
	}
	public void setRoomManagerPhone(String roomManagerPhone) {
		this.roomManagerPhone = roomManagerPhone;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomName=" + roomName + ", roomAddress=" + roomAddress + ", roomTotalSize="
				+ roomTotalSize + ", roomEmptySize=" + roomEmptySize + ", roomPersonSex=" + roomPersonSex
				+ ", roomMoney=" + roomMoney + ", roomDeposit=" + roomDeposit + ", roomManager=" + roomManager
				+ ", roomManagerPhone=" + roomManagerPhone + ", createTime=" + createTime + "]";
	}
	
}	
