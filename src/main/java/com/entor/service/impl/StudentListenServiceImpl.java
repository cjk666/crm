package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.IStudentListenDao;
import com.entor.entity.StudentListen;
import com.entor.service.IStudentListenService;
import com.entor.util.UUIDUtil;

@Service
public class StudentListenServiceImpl implements IStudentListenService {

	@Autowired
	private IStudentListenDao studentListenDao;
	
	@Override
	public void add(StudentListen studentListen) {
		studentListen.setId(UUIDUtil.getUUID());
		studentListenDao.add(studentListen);
	}

	@Override
	public void addMore(List<StudentListen> list) {
		studentListenDao.addMore(list);
	}

	@Override
	public void deleteById(int id) {
		studentListenDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		studentListenDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(StudentListen studentListen) {
		studentListenDao.update(studentListen);
	}

	@Override
	public int getTotal() {
		return studentListenDao.getTotal();
	}

	@Override
	public StudentListen queryById(int id) {
		return studentListenDao.queryById(id);
	}

	@Override
	public List<StudentListen> queryByPage(int currentPage, int pageSize) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return studentListenDao.queryByPage(map);
	}

	@Override
	public List<StudentListen> queryByMap(Map<String, Object> map) {
		return studentListenDao.queryByMap(map);
	}

	@Override
	public List<StudentListen> queryAll() {
		return studentListenDao.queryAll();
	}
	
}
