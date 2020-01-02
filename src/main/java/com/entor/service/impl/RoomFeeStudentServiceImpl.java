package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.IRoomFeeStudentDao;
import com.entor.entity.RoomFeeStudent;
import com.entor.service.IRoomFeeStudentService;

@Service
public class RoomFeeStudentServiceImpl implements IRoomFeeStudentService {

	@Autowired
	private IRoomFeeStudentDao roomFeeStudentDao;
	
	@Override
	public void add(RoomFeeStudent roomFeeStudent) {
		roomFeeStudentDao.add(roomFeeStudent);
	}

	@Override
	public void addMore(List<RoomFeeStudent> list) {
		roomFeeStudentDao.addMore(list);
	}

	@Override
	public void deleteById(int id) {
		roomFeeStudentDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		roomFeeStudentDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(RoomFeeStudent roomFeeStudent) {
		roomFeeStudentDao.update(roomFeeStudent);
	}

	@Override
	public int getTotal() {
		return roomFeeStudentDao.getTotal();
	}

	@Override
	public RoomFeeStudent queryById(int id) {
		return roomFeeStudentDao.queryById(id);
	}

	@Override
	public List<RoomFeeStudent> queryByPage(int currentPage, int pageSize) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return roomFeeStudentDao.queryByPage(map);
	}

	@Override
	public List<RoomFeeStudent> queryByMap(Map<String, Object> map) {
		return roomFeeStudentDao.queryByMap(map);
	}

	@Override
	public List<RoomFeeStudent> queryAll() {
		return roomFeeStudentDao.queryAll();
	}
	
}
