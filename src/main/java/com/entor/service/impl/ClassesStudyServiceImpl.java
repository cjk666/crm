package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.IClassesStudyDao;
import com.entor.entity.ClassesStudy;
import com.entor.entity.view.VClassesStudy;
import com.entor.service.IClassesStudyService;
import com.entor.util.UUIDUtil;

@Service
public class ClassesStudyServiceImpl implements IClassesStudyService {

	@Autowired
	private IClassesStudyDao classesStudyDao;
	
	@Override
	public void add(ClassesStudy classesStudy) {
		classesStudy.setClassesId(UUIDUtil.getUUID());
		classesStudyDao.add(classesStudy);
	}

	@Override
	public void addMore(List<ClassesStudy> list) {
		classesStudyDao.addMore(list);
	}

	@Override
	public void deleteById(int id) {
		classesStudyDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		classesStudyDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(ClassesStudy classesStudy) {
		classesStudyDao.update(classesStudy);
	}

	@Override
	public int getTotal() {
		return classesStudyDao.getTotal();
	}

	@Override
	public ClassesStudy queryById(int id) {
		return classesStudyDao.queryById(id);
	}
	
	@Override
	public List<VClassesStudy> queryByPage(int currentPage, int pageSize) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return classesStudyDao.queryByPage(map);
	}

	@Override
	public List<ClassesStudy> queryByMap(Map<String, Object> map) {
		return classesStudyDao.queryByMap(map);
	}

	@Override
	public List<ClassesStudy> queryAll() {
		return classesStudyDao.queryAll();
	}
	
}
