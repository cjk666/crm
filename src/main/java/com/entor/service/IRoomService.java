package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.Room;

public interface IRoomService {
	
	public void add(Room room);
	
	public void addMore(List<Room> list);
	
	public void deleteById(int id);
	
	public void deleteMore(String ids);
	
	public void update(Room room);
	
	public int getTotal();
	
	public Room queryById(int id);
	
	public List<Room> queryByPage(int currentPage, int pageSize);
	
	public List<Room> queryByMap(Map<String, Object> map);
	
	public List<Room> queryAll();
}
