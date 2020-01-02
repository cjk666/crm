package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.IClassesListenDao;
import com.entor.entity.ClassesListen;
import com.entor.entity.view.VClassesListen;
import com.entor.service.IClassesListenService;
import com.entor.util.UUIDUtil;

@Service
public class ClassesListenServiceImpl implements IClassesListenService {

	@Autowired
	private IClassesListenDao classesListenDao;
	
	@Override
	public void add(ClassesListen classesListen) {
		classesListen.setClassesId(UUIDUtil.getUUID());
		classesListenDao.add(classesListen);
	}

	@Override
	public void addMore(List<ClassesListen> list) {
		classesListenDao.addMore(list);
	}

	@Override
	public void deleteById(int id) {
		classesListenDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		classesListenDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(ClassesListen classesListen) {
		classesListenDao.update(classesListen);
	}

	@Override
	public int getTotal() {
		return classesListenDao.getTotal();
	}

	@Override
	public ClassesListen queryById(int id) {
		return classesListenDao.queryById(id);
	}

	@Override
	public List<VClassesListen> queryByPage(int currentPage, int pageSize) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return classesListenDao.queryByPage(map);
	}

	@Override
	public List<ClassesListen> queryByMap(Map<String, Object> map) {
		return classesListenDao.queryByMap(map);
	}

	@Override
	public List<ClassesListen> queryAll() {
		return classesListenDao.queryAll();
	}
	
}
