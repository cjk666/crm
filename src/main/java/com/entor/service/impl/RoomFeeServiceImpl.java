package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.IRoomFeeDao;
import com.entor.entity.RoomFee;
import com.entor.entity.view.VRoomFee;
import com.entor.service.IRoomFeeService;
import com.entor.util.UUIDUtil;

@Service
public class RoomFeeServiceImpl implements IRoomFeeService {

	@Autowired
	private IRoomFeeDao roomFeeDao;
	
	@Override
	public void add(RoomFee roomFee) {
		roomFee.setId(UUIDUtil.getUUID());
		roomFeeDao.add(roomFee);
	}

	@Override
	public void addMore(List<RoomFee> list) {
		roomFeeDao.addMore(list);
	}

	@Override
	public void deleteById(int id) {
		roomFeeDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		roomFeeDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(RoomFee roomFee) {
		roomFeeDao.update(roomFee);
	}

	@Override
	public int getTotal() {
		return roomFeeDao.getTotal();
	}

	@Override
	public RoomFee queryById(int id) {
		return roomFeeDao.queryById(id);
	}

	@Override
	public List<VRoomFee> queryByPage(int currentPage, int pageSize) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return roomFeeDao.queryByPage(map);
	}

	@Override
	public List<VRoomFee> queryByMap(Map<String, Object> map) {
		return roomFeeDao.queryByMap(map);
	}

	@Override
	public List<RoomFee> queryAll() {
		return roomFeeDao.queryAll();
	}
	
}
