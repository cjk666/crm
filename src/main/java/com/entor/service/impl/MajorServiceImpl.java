package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.IMajorDao;
import com.entor.entity.Major;
import com.entor.service.IMajorService;
import com.entor.util.UUIDUtil;

@Service
public class MajorServiceImpl implements IMajorService {

	@Autowired
	private IMajorDao majorDao;
	
	@Override
	public void add(Major major) {
		major.setId(UUIDUtil.getUUID());
		majorDao.add(major);
	}

	@Override
	public void addMore(List<Major> list) {
		majorDao.addMore(list);
	}

	@Override
	public void deleteById(int id) {
		majorDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		majorDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(Major major) {
		majorDao.update(major);
	}

	@Override
	public int getTotal() {
		return majorDao.getTotal();
	}

	@Override
	public Major queryById(int id) {
		return majorDao.queryById(id);
	}

	@Override
	public List<Major> queryByPage(int currentPage, int pageSize) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return majorDao.queryByPage(map);
	}

	@Override
	public List<Major> queryByMap(Map<String, Object> map) {
		return majorDao.queryByMap(map);
	}

	@Override
	public List<Major> queryAll() {
		return majorDao.queryAll();
	}
	
}
