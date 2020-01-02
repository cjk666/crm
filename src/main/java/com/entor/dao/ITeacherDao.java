package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.Teacher;

public interface ITeacherDao {
	
	public void add(Teacher teacher);
	
	public void addMore(List<Teacher> list);
	
	public void deleteById(String id);
	
	public void deleteMore(String[] ids);
	
	public void update(Teacher teacher);
	
	public int getTotal(Teacher teacher);
	
	public Teacher queryById(String id);
	
	public List<Teacher> queryByPage(Map<String, Object> map);
	
	public List<Teacher> queryByMap(Map<String, Object> map);
	
	public List<Teacher> queryAll();
}
