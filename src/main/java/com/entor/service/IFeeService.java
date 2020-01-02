package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.Fee;
import com.entor.entity.view.VFee;

public interface IFeeService {
	
	public void add(Fee fee);
	
	public void addMore(List<Fee> list);
	
	public void deleteById(int id);
	
	public void deleteMore(String ids);
	
	public void update(Fee fee);
	
	public int getTotal();
	
	public Fee queryById(int id);
	
	public List<VFee> queryByPage(int currentPage, int pageSize);
	
	public List<Fee> queryByMap(Map<String, Object> map);
	
	public List<Fee> queryAll();
}
