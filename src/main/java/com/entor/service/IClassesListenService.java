package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.ClassesListen;
import com.entor.entity.view.VClassesListen;

public interface IClassesListenService {
	
	public void add(ClassesListen classesListen);
	
	public void addMore(List<ClassesListen> list);
	
	public void deleteById(int id);
	
	public void deleteMore(String ids);
	
	public void update(ClassesListen classesListen);
	
	public int getTotal();
	
	public ClassesListen queryById(int id);
	
	public List<VClassesListen> queryByPage(int currentPage, int pageSize);
	
	public List<ClassesListen> queryByMap(Map<String, Object> map);
	
	public List<ClassesListen> queryAll();
}
