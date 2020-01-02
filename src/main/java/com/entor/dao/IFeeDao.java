package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.Fee;
import com.entor.entity.view.VFee;

public interface IFeeDao {
	
	public void add(Fee fee);
	
	public void addMore(List<Fee> list);
	
	public void deleteById(Integer id);
	
	public void deleteMore(String[] ids);
	
	public void update(Fee fee);
	
	public int getTotal();
	
	public Fee queryById(Integer id);
	
	public List<VFee> queryByPage(Map<String, Object> map);
	
	public List<Fee> queryByMap(Map<String, Object> map);
	
	public List<Fee> queryAll();
}
