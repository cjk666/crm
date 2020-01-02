package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.IRoomDao;
import com.entor.entity.Room;
import com.entor.service.IRoomService;
import com.entor.util.UUIDUtil;

@Service
public class RoomServiceImpl implements IRoomService {

	@Autowired
	private IRoomDao roomDao;
	
	@Override
	public void add(Room room) {
		room.setRoomId(UUIDUtil.getUUID());
		roomDao.add(room);
	}

	@Override
	public void addMore(List<Room> list) {
		roomDao.addMore(list);
	}

	@Override
	public void deleteById(int id) {
		roomDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		roomDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(Room room) {
		roomDao.update(room);
	}

	@Override
	public int getTotal() {
		return roomDao.getTotal();
	}

	@Override
	public Room queryById(int id) {
		return roomDao.queryById(id);
	}

	@Override
	public List<Room> queryByPage(int currentPage, int pageSize) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return roomDao.queryByPage(map);
	}

	@Override
	public List<Room> queryByMap(Map<String, Object> map) {
		return roomDao.queryByMap(map);
	}

	@Override
	public List<Room> queryAll() {
		return roomDao.queryAll();
	}
	
}
