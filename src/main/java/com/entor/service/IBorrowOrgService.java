package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.BorrowOrg;

public interface IBorrowOrgService {
	
	public void add(BorrowOrg borrowOrg);
	
	public void addMore(List<BorrowOrg> list);
	
	public void deleteById(int id);
	
	public void deleteMore(String ids);
	
	public void update(BorrowOrg borrowOrg);
	
	public int getTotal();
	
	public BorrowOrg queryById(int id);
	
	public List<BorrowOrg> queryByPage(int currentPage, int pageSize);
	
	public List<BorrowOrg> queryByMap(Map<String, Object> map);
	
	public List<BorrowOrg> queryAll();
}
