package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.ITeacherDao;
import com.entor.entity.Teacher;
import com.entor.service.ITeacherService;
import com.entor.util.UUIDUtil;

@Service
public class TeacherServiceImpl implements ITeacherService {

	@Autowired
	private ITeacherDao teacherDao;
	
	@Override
	public void add(Teacher teacher) {
		teacher.setTeacherId(UUIDUtil.getUUID());
		teacherDao.add(teacher);
	}

	@Override
	public void addMore(List<Teacher> list) {
		teacherDao.addMore(list);
	}

	@Override
	public void deleteById(String id) {
		teacherDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		teacherDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(Teacher teacher) {
		teacherDao.update(teacher);
	}

	@Override
	public int getTotal(Teacher teacher) {
		return teacherDao.getTotal(teacher);
	}

	@Override
	public Teacher queryById(String id) {
		return teacherDao.queryById(id);
	}

	@Override
	public List<Teacher> queryByPage(int currentPage, int pageSize,Teacher teacher) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		map.put("teacher", teacher);
		return teacherDao.queryByPage(map);
	}

	@Override
	public List<Teacher> queryByMap(Map<String, Object> map) {
		return teacherDao.queryByMap(map);
	}

	@Override
	public List<Teacher> queryAll() {
		return teacherDao.queryAll();
	}
	
}
