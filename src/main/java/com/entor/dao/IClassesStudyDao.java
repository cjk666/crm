package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.ClassesStudy;
import com.entor.entity.view.VClassesStudy;

public interface IClassesStudyDao {
	
	public void add(ClassesStudy classesStudy);
	
	public void addMore(List<ClassesStudy> list);
	
	public void deleteById(Integer id);
	
	public void deleteMore(String[] ids);
	
	public void update(ClassesStudy classesStudy);
	
	public int getTotal();
	
	public ClassesStudy queryById(Integer id);
	
	public List<VClassesStudy> queryByPage(Map<String, Object> map);
	
	public List<ClassesStudy> queryByMap(Map<String, Object> map);
	
	public List<ClassesStudy> queryAll();
}
