package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.StudentListen;

public interface IStudentListenDao {
	
	public void add(StudentListen studentListen);
	
	public void addMore(List<StudentListen> list);
	
	public void deleteById(Integer id);
	
	public void deleteMore(String[] ids);
	
	public void update(StudentListen studentListen);
	
	public int getTotal();
	
	public StudentListen queryById(Integer id);
	
	public List<StudentListen> queryByPage(Map<String, Object> map);
	
	public List<StudentListen> queryByMap(Map<String, Object> map);
	
	public List<StudentListen> queryAll();
}
