package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.Teacher;

public interface ITeacherService {
	
	public void add(Teacher teacher);
	
	public void addMore(List<Teacher> list);
	
	public void deleteById(String id);
	
	public void deleteMore(String ids);
	
	public void update(Teacher teacher);
	
	public int getTotal(Teacher teacher);
	
	public Teacher queryById(String id);
	
	public List<Teacher> queryByPage(int currentPage, int pageSize,Teacher teacher);
	
	public List<Teacher> queryByMap(Map<String, Object> map);
	
	public List<Teacher> queryAll();
}
