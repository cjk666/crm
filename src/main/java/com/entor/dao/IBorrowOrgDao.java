package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.BorrowOrg;

public interface IBorrowOrgDao {
	
	public void add(BorrowOrg borrowOrg);
	
	public void addMore(List<BorrowOrg> list);
	
	public void deleteById(Integer id);
	
	public void deleteMore(String[] ids);
	
	public void update(BorrowOrg borrowOrg);
	
	public int getTotal();
	
	public BorrowOrg queryById(Integer id);
	
	public List<BorrowOrg> queryByPage(Map<String, Object> map);
	
	public List<BorrowOrg> queryByMap(Map<String, Object> map);
	
	public List<BorrowOrg> queryAll();
}
