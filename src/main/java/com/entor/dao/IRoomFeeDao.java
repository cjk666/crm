package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.RoomFee;
import com.entor.entity.view.VRoomFee;

public interface IRoomFeeDao {
	
	public void add(RoomFee roomFee);
	
	public void addMore(List<RoomFee> list);
	
	public void deleteById(Integer id);
	
	public void deleteMore(String[] ids);
	
	public void update(RoomFee roomFee);
	
	public int getTotal();
	
	public RoomFee queryById(Integer id);
	
	public List<VRoomFee> queryByPage(Map<String, Object> map);
	
	public List<VRoomFee> queryByMap(Map<String, Object> map);
	
	public List<RoomFee> queryAll();
}
