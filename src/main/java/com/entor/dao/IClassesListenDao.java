package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.ClassesListen;
import com.entor.entity.view.VClassesListen;

public interface IClassesListenDao {
	
	public void add(ClassesListen classesListen);
	
	public void addMore(List<ClassesListen> list);
	
	public void deleteById(Integer id);
	
	public void deleteMore(String[] ids);
	
	public void update(ClassesListen classesListen);
	
	public int getTotal();
	
	public ClassesListen queryById(Integer id);
	
	public List<VClassesListen> queryByPage(Map<String, Object> map);
	
	public List<ClassesListen> queryByMap(Map<String, Object> map);
	
	public List<ClassesListen> queryAll();
}
