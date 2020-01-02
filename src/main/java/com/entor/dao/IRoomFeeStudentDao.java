package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.RoomFeeStudent;

public interface IRoomFeeStudentDao {
	
	public void add(RoomFeeStudent roomFeeStudent);
	
	public void addMore(List<RoomFeeStudent> list);
	
	public void deleteById(Integer id);
	
	public void deleteMore(String[] ids);
	
	public void update(RoomFeeStudent roomFeeStudent);
	
	public int getTotal();
	
	public RoomFeeStudent queryById(Integer id);
	
	public List<RoomFeeStudent> queryByPage(Map<String, Object> map);
	
	public List<RoomFeeStudent> queryByMap(Map<String, Object> map);
	
	public List<RoomFeeStudent> queryAll();
}
