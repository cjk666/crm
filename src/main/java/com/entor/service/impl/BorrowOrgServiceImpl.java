package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entor.dao.IBorrowOrgDao;
import com.entor.entity.BorrowOrg;
import com.entor.service.IBorrowOrgService;
import com.entor.util.UUIDUtil;

@Service
public class BorrowOrgServiceImpl implements IBorrowOrgService {

	@Autowired
	private IBorrowOrgDao borrowOrgDao;
	
	@Override
	public void add(BorrowOrg borrowOrg) {
		borrowOrg.setId(UUIDUtil.getUUID());
		borrowOrgDao.add(borrowOrg);
	}

	@Override
	public void addMore(List<BorrowOrg> list) {
		borrowOrgDao.addMore(list);
	}

	@Override
	public void deleteById(int id) {
		borrowOrgDao.deleteById(id);
	}

	@Override
	public void deleteMore(String ids) {
		borrowOrgDao.deleteMore(ids.split(","));
	}

	@Override
	public void update(BorrowOrg borrowOrg) {
		borrowOrgDao.update(borrowOrg);
	}

	@Override
	public int getTotal() {
		return borrowOrgDao.getTotal();
	}

	@Override
	public BorrowOrg queryById(int id) {
		return borrowOrgDao.queryById(id);
	}

	@Override
	public List<BorrowOrg> queryByPage(int currentPage, int pageSize) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return borrowOrgDao.queryByPage(map);
	}

	@Override
	public List<BorrowOrg> queryByMap(Map<String, Object> map) {
		return borrowOrgDao.queryByMap(map);
	}

	@Override
	public List<BorrowOrg> queryAll() {
		return borrowOrgDao.queryAll();
	}
	
}
