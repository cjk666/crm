package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.Major;

public interface IMajorService {
	
	public void add(Major major);
	
	public void addMore(List<Major> list);
	
	public void deleteById(int id);
	
	public void deleteMore(String ids);
	
	public void update(Major major);
	
	public int getTotal();
	
	public Major queryById(int id);
	
	public List<Major> queryByPage(int currentPage, int pageSize);
	
	public List<Major> queryByMap(Map<String, Object> map);
	
	public List<Major> queryAll();
}
