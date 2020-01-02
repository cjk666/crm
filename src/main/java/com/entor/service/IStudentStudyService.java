package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.StudentStudy;

public interface IStudentStudyService {
	
	public void add(StudentStudy studentStudy);
	
	public void addMore(List<StudentStudy> list);
	
	public void deleteById(int id);
	
	public void deleteMore(String ids);
	
	public void update(StudentStudy studentStudy);
	
	public int getTotal();
	
	public StudentStudy queryById(int id);
	
	public List<StudentStudy> queryByPage(int currentPage, int pageSize);
	
	public List<StudentStudy> queryByMap(Map<String, Object> map);
	
	public List<StudentStudy> queryAll();
}
