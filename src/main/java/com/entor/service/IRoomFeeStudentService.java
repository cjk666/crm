package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.RoomFeeStudent;

public interface IRoomFeeStudentService {
	
	public void add(RoomFeeStudent roomFeeStudent);
	
	public void addMore(List<RoomFeeStudent> list);
	
	public void deleteById(int id);
	
	public void deleteMore(String ids);
	
	public void update(RoomFeeStudent roomFeeStudent);
	
	public int getTotal();
	
	public RoomFeeStudent queryById(int id);
	
	public List<RoomFeeStudent> queryByPage(int currentPage, int pageSize);
	
	public List<RoomFeeStudent> queryByMap(Map<String, Object> map);
	
	public List<RoomFeeStudent> queryAll();
}
