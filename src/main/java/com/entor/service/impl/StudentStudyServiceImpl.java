package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.IStudentStudyDao;
import com.entor.entity.StudentStudy;
import com.entor.service.IStudentStudyService;
import com.entor.util.UUIDUtil;

@Service
public class StudentStudyServiceImpl implements IStudentStudyService {

	@Autowired
	private IStudentStudyDao studentStudyDao;
	
	@Override
	public void add(StudentStudy studentStudy) {
		studentStudy.setId(UUIDUtil.getUUID());
		studentStudyDao.add(studentStudy);
	}

	@Override
	public void addMore(List<StudentStudy> list) {
		studentStudyDao.addMore(list);
	}

	@Override
	public void deleteById(int id) {
		studentStudyDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		studentStudyDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(StudentStudy studentStudy) {
		studentStudyDao.update(studentStudy);
	}

	@Override
	public int getTotal() {
		return studentStudyDao.getTotal();
	}

	@Override
	public StudentStudy queryById(int id) {
		return studentStudyDao.queryById(id);
	}

	@Override
	public List<StudentStudy> queryByPage(int currentPage, int pageSize) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return studentStudyDao.queryByPage(map);
	}

	@Override
	public List<StudentStudy> queryByMap(Map<String, Object> map) {
		return studentStudyDao.queryByMap(map);
	}

	@Override
	public List<StudentStudy> queryAll() {
		return studentStudyDao.queryAll();
	}
	
}
