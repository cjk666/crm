package com.entor.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entor.entity.Result;
import com.entor.entity.view.VFee;
import com.entor.entity.Fee;
import com.entor.service.IFeeService;

@Controller
@RequestMapping("/fee")
public class FeeController {
	
	@Autowired
	private IFeeService feeService;
	
	@RequestMapping("/add")
	@ResponseBody
	public Result add(Fee fee) {
		feeService.add(fee);
		Result result = new Result();
		result.setMsg("保存数据成功");
		result.setStatue(0);
		return result;
	}
	
	@RequestMapping("/deleteMore")
	@ResponseBody
	public Result deleteMore(String ids) {
		feeService.deleteMore(ids);
		Result result = new Result();
		result.setMsg("删除成功");
		result.setStatue(0);
		return result;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Result update(Fee fee) {
		feeService.update(fee);
		Result result = new Result();
		result.setMsg("修改数据成功");
		result.setStatue(0);
		return result;
	}
	
	@RequestMapping("/queryByPage")
	@ResponseBody
	public Map<String, Object> queryByPage(@RequestParam(value="page",required=false,defaultValue="1") String page,
			@RequestParam(value="rows",required=false,defaultValue="20") String rows){
		List<VFee> list = feeService.queryByPage(Integer.parseInt(page), Integer.parseInt(rows));
		int total = feeService.getTotal();
		Map<String, Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}

	@RequestMapping("/queryAll")
	@ResponseBody
	public List<Fee> queryAll(){
		List<Fee> list = feeService.queryAll();
		return list;
	}
	
	
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		//如果客户端传递yyyy-MM-dd格式的字符串，就当做java.util.Date类型处理
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
}
