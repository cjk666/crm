package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.Major;

public interface IMajorDao {
	
	public void add(Major major);
	
	public void addMore(List<Major> list);
	
	public void deleteById(Integer id);
	
	public void deleteMore(String[] ids);
	
	public void update(Major major);
	
	public int getTotal();
	
	public Major queryById(Integer id);
	
	public List<Major> queryByPage(Map<String, Object> map);
	
	public List<Major> queryByMap(Map<String, Object> map);
	
	public List<Major> queryAll();
}
