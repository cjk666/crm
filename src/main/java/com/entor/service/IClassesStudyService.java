package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.ClassesStudy;
import com.entor.entity.view.VClassesStudy;

public interface IClassesStudyService {
	
	public void add(ClassesStudy classesStudy);
	
	public void addMore(List<ClassesStudy> list);
	
	public void deleteById(int id);
	
	public void deleteMore(String ids);
	
	public void update(ClassesStudy classesStudy);
	
	public int getTotal();
	
	public ClassesStudy queryById(int id);
	
	public List<VClassesStudy> queryByPage(int currentPage, int pageSize);
	
	public List<ClassesStudy> queryByMap(Map<String, Object> map);
	
	public List<ClassesStudy> queryAll();
}
