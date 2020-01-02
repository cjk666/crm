package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.RoomFee;
import com.entor.entity.view.VRoomFee;

public interface IRoomFeeService {
	
	public void add(RoomFee roomFee);
	
	public void addMore(List<RoomFee> list);
	
	public void deleteById(int id);
	
	public void deleteMore(String ids);
	
	public void update(RoomFee roomFee);
	
	public int getTotal();
	
	public RoomFee queryById(int id);
	
	public List<VRoomFee> queryByPage(int currentPage, int pageSize);
	
	public List<VRoomFee> queryByMap(Map<String, Object> map);
	
	public List<RoomFee> queryAll();
}
