package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.StudentListen;

public interface IStudentListenService {
	
	public void add(StudentListen studentListen);
	
	public void addMore(List<StudentListen> list);
	
	public void deleteById(int id);
	
	public void deleteMore(String ids);
	
	public void update(StudentListen studentListen);
	
	public int getTotal();
	
	public StudentListen queryById(int id);
	
	public List<StudentListen> queryByPage(int currentPage, int pageSize);
	
	public List<StudentListen> queryByMap(Map<String, Object> map);
	
	public List<StudentListen> queryAll();
}
