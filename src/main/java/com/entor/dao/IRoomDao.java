package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.Room;

public interface IRoomDao {
	
	public void add(Room room);
	
	public void addMore(List<Room> list);
	
	public void deleteById(Integer id);
	
	public void deleteMore(String[] ids);
	
	public void update(Room room);
	
	public int getTotal();
	
	public Room queryById(Integer id);
	
	public List<Room> queryByPage(Map<String, Object> map);
	
	public List<Room> queryByMap(Map<String, Object> map);
	
	public List<Room> queryAll();
}
