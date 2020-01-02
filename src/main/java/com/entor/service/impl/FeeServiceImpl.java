package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.IFeeDao;
import com.entor.entity.Fee;
import com.entor.entity.view.VFee;
import com.entor.service.IFeeService;

@Service
public class FeeServiceImpl implements IFeeService {

	@Autowired
	private IFeeDao feeDao;
	
	@Override
	public void add(Fee fee) {
		feeDao.add(fee);
	}

	@Override
	public void addMore(List<Fee> list) {
		feeDao.addMore(list);
	}

	@Override
	public void deleteById(int id) {
		feeDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		feeDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(Fee fee) {
		feeDao.update(fee);
	}

	@Override
	public int getTotal() {
		return feeDao.getTotal();
	}

	@Override
	public Fee queryById(int id) {
		return feeDao.queryById(id);
	}

	@Override
	public List<VFee> queryByPage(int currentPage, int pageSize) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return feeDao.queryByPage(map);
	}

	@Override
	public List<Fee> queryByMap(Map<String, Object> map) {
		return feeDao.queryByMap(map);
	}

	@Override
	public List<Fee> queryAll() {
		return feeDao.queryAll();
	}
	
}
