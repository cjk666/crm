package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.StudentStudy;

public interface IStudentStudyDao {
	
	public void add(StudentStudy studentStudy);
	
	public void addMore(List<StudentStudy> list);
	
	public void deleteById(Integer id);
	
	public void deleteMore(String[] ids);
	
	public void update(StudentStudy studentStudy);
	
	public int getTotal();
	
	public StudentStudy queryById(Integer id);
	
	public List<StudentStudy> queryByPage(Map<String, Object> map);
	
	public List<StudentStudy> queryByMap(Map<String, Object> map);
	
	public List<StudentStudy> queryAll();
}
